package DAO;

import Conexion.ConexionDB;
import Exceptions.ExceptionDAO;
import IDAO.IUsuarioDAO;
import POJO.FavoritosPOJO;
import POJO.UsuarioPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 * Clase que implementa la interfaz IUsuarioDAO y gestiona las operaciones de
 * persistencia relacionadas con los usuarios en la base de datos MongoDB.
 *
 * @author equipo 2
 */
public class UsuarioDAO implements IUsuarioDAO {

    /**
     * Guarda un nuevo usuario en la base de datos.
     *
     * @param usuarioPOJO el objeto que contiene los datos del usuario a
     * guardar.
     * @throws ExceptionDAO si ocurre un error al guardar el usuario.
     */
    @Override
    public void guardarUsuario(UsuarioPOJO usuarioPOJO) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Document usuarioDoc = new Document()
                    .append("nombre", usuarioPOJO.getNombre())
                    .append("email", usuarioPOJO.getEmail())
                    .append("password", usuarioPOJO.getPassword()) // Usamos la contraseña hasheada del POJO
                    .append("imagen", usuarioPOJO.getImagen())
                    .append("favoritos", new Document()
                            .append("artistas", new ArrayList<>())
                            .append("albums", new ArrayList<>())
                            .append("canciones", new ArrayList<>()))
                    .append(" restringidosgeneros", new ArrayList<>());

            coleccionUsuarios.insertOne(usuarioDoc);
        } catch (Exception e) {
            throw new ExceptionDAO("Error al guardar el usuario en la base de datos", e);
        }
    }

    /**
     * Busca un usuario por su nombre en la base de datos.
     *
     * @param nombre el nombre del usuario a buscar.
     * @return un objeto UsuarioPOJO si se encuentra el usuario, null si no se
     * encuentra.
     * @throws ExceptionDAO si ocurre un error durante la busqueda.
     */
    @Override
    public UsuarioPOJO buscarPorNombre(String nombre) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");

            Document doc = coleccionUsuarios.find(Filters.eq("nombre", nombre)).first();
            if (doc != null) {
                List<ObjectId> favoritosArtistas = doc.get("favoritos.artistas", List.class);
                List<ObjectId> favoritosAlbums = doc.get("favoritos.albums", List.class);
                List<ObjectId> favoritosCanciones = doc.get("favoritos.canciones", List.class);
                List<String> restringidosgeneros = doc.getList(" restringidosgeneros", String.class);

                return new UsuarioPOJO(
                        doc.getObjectId("_id"),
                        doc.getString("nombre"),
                        doc.getString("email"),
                        doc.getString("password"),
                        doc.getString("imagen"),
                        restringidosgeneros,
                        new FavoritosPOJO(favoritosArtistas, favoritosAlbums, favoritosCanciones)
                );

            }

            return null;
        } catch (Exception e) {
            throw new ExceptionDAO("Error al buscar el usuario por nombre en la base de datos", e);
        }
    }

    /**
     * Actualiza los datos de un usuario en la base de datos.
     *
     * @param usuario el objeto UsuarioPOJO que contiene los datos actualizados
     * del usuario.
     * @throws ExceptionDAO si ocurre un error al actualizar el usuario.
     */
    @Override
    public void editarUsuario(UsuarioPOJO usuario) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Bson filtro = Filters.eq("_id", usuario.getId());
            Bson actualizacion = Updates.combine(
                    Updates.set("nombre", usuario.getNombre()),
                    Updates.set("email", usuario.getEmail()),
                    Updates.set("password", usuario.getPassword()),
                    Updates.set("imagen", usuario.getImagen())
            );
            UpdateResult resultado = coleccionUsuarios.updateOne(filtro, actualizacion);
            if (resultado.getMatchedCount() == 0) {
                throw new ExceptionDAO("No se encontró ningún usuario con el ID proporcionado.");
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al editar el usuario", e);
        }

    }

    /**
     * Agrega un género a la lista de géneros restringidos de un usuario.
     *
     * @param sesion el ID del usuario en sesión.
     * @param genero el género a restringir.
     * @throws ExceptionDAO si ocurre un error al agregar el género restringido.
     */
    @Override
    public void restringirGenero(String sesion, String genero) throws ExceptionDAO {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
        try {
            Bson filtro = Filters.eq("_id", new ObjectId(sesion));
            Bson actualizacion = Updates.addToSet(" restringidosgeneros", genero);

            UpdateResult resultado = coleccionUsuarios.updateOne(filtro, actualizacion);
            if (resultado.getMatchedCount() == 0) {
                throw new ExceptionDAO("No se encontró el usuario con el ID proporcionado.");
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al restringir el género", e);
        }
    }

    /**
     * Elimina un género de la lista de géneros restringidos de un usuario.
     *
     * @param sesion el ID del usuario en sesión.
     * @param genero el género a permitir nuevamente.
     * @throws ExceptionDAO si ocurre un error al eliminar el género
     * restringido.
     */
    @Override
    public void regresaGenero(String sesion, String genero) throws ExceptionDAO {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
        try {
            Bson filtro = Filters.eq("_id", new ObjectId(sesion));
            Bson actualizacion = Updates.pull(" restringidosgeneros", genero);
            UpdateResult resultado = coleccionUsuarios.updateOne(filtro, actualizacion);
            if (resultado.getMatchedCount() == 0) {
                throw new ExceptionDAO("No se encontró el usuario con el ID proporcionado.");
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al regresar el género a la lista permitida", e);
        }
    }

    /**
     * Consulta la lista de géneros restringidos de un usuario.
     *
     * @param sesion el ID del usuario en sesión.
     * @return una lista de géneros restringidos.
     * @throws ExceptionDAO si ocurre un error durante la consulta.
     */
    @Override
    public List<String> consultaRestringidos(String sesion) throws ExceptionDAO {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");

        try {
            Bson filtro = Filters.eq("_id", new ObjectId(sesion));
            Document usuario = coleccionUsuarios.find(filtro)
                    .projection(Projections.include(" restringidosgeneros"))
                    .first();

            if (usuario == null) {
                throw new ExceptionDAO("No se encontró un usuario con la sesión proporcionada.");
            }
            List<String> generosRestringidos = usuario.getList(" restringidosgeneros", String.class);

            return generosRestringidos != null ? generosRestringidos : new ArrayList<>();
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al consultar los géneros restringidos", e);
        }
    }

    /**
     * Agrega un artista a la lista de favoritos de un usuario.
     *
     * @param usuario el objeto UsuarioPOJO que representa al usuario.
     * @param artista el ID del artista a agregar.
     * @throws ExceptionDAO si ocurre un error al agregar el artista favorito.
     */
    @Override
    public void agregarArtistaFavorito(UsuarioPOJO usuario, ObjectId artista) throws ExceptionDAO {
        if (usuario == null || usuario.getId() == null || artista == null) {
            throw new IllegalArgumentException("El usuario o el ID del artista no pueden ser nulos o vacíos.");
        }

        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Bson filtro = Filters.eq("_id", usuario.getId());
            Bson actualizacion = Updates.addToSet("favoritos.artistas", artista);

            UpdateResult resultado = coleccionUsuarios.updateOne(filtro, actualizacion);

            if (resultado.getMatchedCount() == 0) {
                throw new ExceptionDAO("No se encontró un usuario con el ID: " + usuario.getId());
            }
            if (resultado.getModifiedCount() == 0) {
                JOptionPane.showMessageDialog(null, "El artista ya estaba en la lista de favoritos.");
            } else {
                System.out.println("Artista agregado a la lista de favoritos exitosamente.");
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al agregar el artista favorito. Filtro: " + usuario.getId(), e);
        }
    }

    /**
     * Elimina un artista de la lista de favoritos de un usuario.
     *
     * @param usuario el objeto UsuarioPOJO que representa al usuario.
     * @param artista el ID del artista a eliminar.
     * @return true si el artista fue eliminado, false si no estaba en la lista.
     * @throws ExceptionDAO si ocurre un error al eliminar el artista favorito.
     */
    @Override
    public boolean eliminarFavoritoArtista(UsuarioPOJO usuario, ObjectId artista) throws ExceptionDAO {
        if (usuario == null || usuario.getId() == null || artista == null) {
            throw new IllegalArgumentException("El usuario o el ID del artista no pueden ser nulos o vacíos.");
        }

        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Bson filtro = Filters.eq("_id", usuario.getId());
            Bson actualizacion = Updates.pull("favoritos.artistas", artista);
            UpdateResult resultado = coleccionUsuarios.updateOne(filtro, actualizacion);
            if (resultado.getMatchedCount() == 0) {
                throw new ExceptionDAO("No se encontró un usuario con el ID: " + usuario.getId());
            }
            if (resultado.getModifiedCount() == 0) {
                return true;
            } else {
                return false;
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al eliminar el artista favorito. Filtro: " + usuario.getId(), e);
        }
    }

    /**
     * Consulta la lista de artistas favoritos de un usuario.
     *
     * @param sesion el ID del usuario en sesión.
     * @return una lista de IDs de artistas favoritos.
     * @throws ExceptionDAO si ocurre un error durante la consulta.
     */
    @Override
    public List<ObjectId> consultarArtistasFavorito(ObjectId sesion) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Bson filtro = Filters.eq("_id", sesion);
            Document resultado = coleccionUsuarios.find(filtro).first();
            if (resultado == null) {
                throw new ExceptionDAO("No se encontró un usuario con el ID: " + sesion);
            }
            List<ObjectId> artistasFavoritos = resultado.getList("favoritos.artistas", ObjectId.class);
            if (artistasFavoritos == null) {
                return new ArrayList<>();
            }
            return artistasFavoritos;
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al consultar los artistas favoritos del usuario con ID: " + sesion, e);
        }
    }

    @Override
    public void agregarCancionFavorito(UsuarioPOJO usuario, ObjectId cancion) throws ExceptionDAO {
        if (usuario == null || usuario.getNombre() == null || cancion == null) {
            throw new IllegalArgumentException("El usuario o el ID de la    cancion no pueden ser nulos o vacíos.");

        }

        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Bson filtro = Filters.eq("_id", usuario.getId());
            Bson actualizacion = Updates.addToSet("favoritos.canciones", cancion);
            UpdateResult resultado = coleccionUsuarios.updateOne(filtro, actualizacion);
            if (resultado.getMatchedCount() == 0) {
                throw new ExceptionDAO("No se encontró: " + usuario.getNombre());
            }
            if (resultado.getModifiedCount() == 0) {
                System.out.println("La cancion ya estaba en la lista de favoritos.");
            } else {
                System.out.println("Cancion agregada a la lista de favoritos exitosamente.");
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al agregar la Cancion favorito. Filtro: " + usuario.getNombre(), e);
        }
    }

    @Override
    public boolean eliminarFavoritoCancion(UsuarioPOJO usuario, ObjectId cancion) throws ExceptionDAO {
        if (usuario == null || usuario.getId() == null || cancion == null) {
            throw new IllegalArgumentException("El usuario o el ID del artista no pueden ser nulos o vacíos.");
        }

        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Bson filtro = Filters.eq("_id", usuario.getId());
            Bson actualizacion = Updates.pull("favoritos.canciones", cancion);
            UpdateResult resultado = coleccionUsuarios.updateOne(filtro, actualizacion);
            if (resultado.getMatchedCount() == 0) {
                throw new ExceptionDAO("No se encontró un usuario con el ID: " + usuario.getId());
            }
            if (resultado.getModifiedCount() == 0) {
                return true;
            } else {
                return false;
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al eliminar la cancion favorito. Filtro: " + usuario.getId(), e);
        }
    }

    @Override
    public List<ObjectId> consultarCancionesFavorito(ObjectId sesion) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Bson filtro = Filters.eq("_id", sesion);
            Document resultado = coleccionUsuarios.find(filtro).first();
            if (resultado == null) {
                throw new ExceptionDAO("No se encontró un usuario con el ID: " + sesion);
            }
            List<ObjectId> artistasFavoritos = resultado.getList("favoritos.canciones", ObjectId.class);
            if (artistasFavoritos == null) {
                return new ArrayList<>();
            }
            return artistasFavoritos;
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al consultar canciones favoritas del usuario con ID: " + sesion, e);
        }
    }

    /**
     * Agrega un álbum a la lista de favoritos del usuario.
     *
     * @param usuario el objeto UsuarioPOJO que representa al usuario.
     * @param album el ObjectId del álbum que se desea agregar a favoritos.
     * @throws ExceptionDAO si ocurre un error al interactuar con la base de
     * datos.
     */
    @Override
    public void agregarAlbumFavorito(UsuarioPOJO usuario, ObjectId album) throws ExceptionDAO {
        if (usuario == null || usuario.getNombre() == null || album == null) {
            throw new IllegalArgumentException("El usuario o el ID del Album no pueden ser nulos o vacíos.");
        }

        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Bson filtro = Filters.eq("_id", usuario.getId());
            Bson actualizacion = Updates.addToSet("favoritos.albums", album);
            UpdateResult resultado = coleccionUsuarios.updateOne(filtro, actualizacion);

            if (resultado.getMatchedCount() == 0) {
                throw new ExceptionDAO("No se encontró: " + usuario.getNombre());
            }
            if (resultado.getModifiedCount() == 0) {
                System.out.println("El Album ya estaba en la lista de favoritos.");
            } else {
                System.out.println("Album agregado a la lista de favoritos exitosamente.");
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al agregar el Album favorito. Filtro: " + usuario.getNombre(), e);
        }
    }

    /**
     * Elimina un álbum de la lista de favoritos del usuario.
     *
     * @param usuario el objeto UsuarioPOJO que representa al usuario.
     * @param album el ObjectId del álbum que se desea eliminar de favoritos.
     * @return true si el álbum fue eliminado exitosamente, false si el álbum no
     * estaba en la lista.
     * @throws ExceptionDAO si ocurre un error al interactuar con la base de
     * datos.
     */
    @Override
    public boolean eliminarFavoritoAlbum(UsuarioPOJO usuario, ObjectId album) throws ExceptionDAO {
        if (usuario == null || usuario.getId() == null || album == null) {
            throw new IllegalArgumentException("El usuario o el ID del artista no pueden ser nulos o vacíos.");
        }

        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Bson filtro = Filters.eq("_id", usuario.getId());
            Bson actualizacion = Updates.pull("favoritos.albums", album);
            UpdateResult resultado = coleccionUsuarios.updateOne(filtro, actualizacion);
            if (resultado.getMatchedCount() == 0) {
                throw new ExceptionDAO("No se encontró un usuario con el ID: " + usuario.getId());
            }
            if (resultado.getModifiedCount() == 0) {
                return true;
            } else {
                return false;
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al eliminar el Album favorito. Filtro: " + usuario.getId(), e);
        }
    }

    /**
     * Consulta la lista de álbumes favoritos del usuario.
     *
     * @param sesion el ObjectId del usuario cuya lista de álbumes favoritos se
     * desea consultar.
     * @return una lista de ObjectId que representa los álbumes favoritos del
     * usuario.
     * @throws ExceptionDAO si ocurre un error al interactuar con la base de
     * datos.
     */
    @Override
    public List<ObjectId> consultarAlbumsFavorito(ObjectId sesion) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Bson filtro = Filters.eq("_id", sesion);
            Document resultado = coleccionUsuarios.find(filtro).first();
            if (resultado == null) {
                throw new ExceptionDAO("No se encontró un usuario con el ID: " + sesion);
            }
            List<ObjectId> artistasFavoritos = resultado.getList("favoritos.artistas", ObjectId.class);
            if (artistasFavoritos == null) {
                return new ArrayList<>();
            }
            return artistasFavoritos;
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al consultar los artistas favoritos del usuario con ID: " + sesion, e);
        }
    }

    /**
     * * Busca un usuario por su ID.
     *
     * @param id el ObjectId del usuario que se desea buscar.
     * @return un objeto UsuarioPOJO con la información del usuario encontrado,
     * null si no se encuentra un usuario con el ID especificado.
     * @throws ExceptionDAO si ocurre un error al interactuar con la base de
     * datos.
     *
     */
    @Override
    public UsuarioPOJO buscar(ObjectId id) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Document doc = coleccionUsuarios.find(Filters.eq("_id", id)).first();

            if (doc != null) {
                // Recuperar el subdocumento de favoritos
                Document favoritosDoc = (Document) doc.get("favoritos");

                // Asegurarse de que los subdocumentos y listas no sean nulos
                List<ObjectId> favoritosArtistas = favoritosDoc != null ? favoritosDoc.getList("artistas", ObjectId.class) : new ArrayList<>();
                List<ObjectId> favoritosAlbums = favoritosDoc != null ? favoritosDoc.getList("albums", ObjectId.class) : new ArrayList<>();
                List<ObjectId> favoritosCanciones = favoritosDoc != null ? favoritosDoc.getList("canciones", ObjectId.class) : new ArrayList<>();
                List<String> restringidosGeneros = doc.getList("restringidosgeneros", String.class);

                if (favoritosArtistas == null) {
                    System.out.println("Lista de artistas nula");
                    favoritosArtistas = new ArrayList<>();
                }
                if (favoritosAlbums == null) {
                    System.out.println("Lista de albums es nula");
                    favoritosAlbums = new ArrayList<>();
                }
                if (favoritosCanciones == null) {
                    System.out.println("Lista de canciones nula");
                    favoritosCanciones = new ArrayList<>();
                }
                if (restringidosGeneros == null) {
                    restringidosGeneros = new ArrayList<>();
                }

                return new UsuarioPOJO(
                        id,
                        doc.getString("nombre"),
                        doc.getString("email"),
                        doc.getString("password"),
                        doc.getString("imagen"),
                        restringidosGeneros,
                        new FavoritosPOJO(favoritosArtistas, favoritosAlbums, favoritosCanciones)
                );
            }
            return null;
        } catch (Exception e) {
            throw new ExceptionDAO("Error al buscar el usuario por ID en la base de datos", e);
        }
    }

}
