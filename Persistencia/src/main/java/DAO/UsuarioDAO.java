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
 *
 * @author equipo 2
 */
public class UsuarioDAO implements IUsuarioDAO {

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
                    .append("restringidosgeneros", new ArrayList<>());

            coleccionUsuarios.insertOne(usuarioDoc);
        } catch (Exception e) {
            throw new ExceptionDAO("Error al guardar el usuario en la base de datos", e);
        }
    }

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
                List<String> restringidosGeneros = doc.getList("restringidosgeneros", String.class);

                return new UsuarioPOJO(
                        doc.getObjectId("_id"),
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
            throw new ExceptionDAO("Error al buscar el usuario por nombre en la base de datos", e);
        }
    }

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
        } catch (Exception e) {
            throw new ExceptionDAO("Error al editar el usuario", e);
        }

    }

    @Override
    public void restringirGenero(UsuarioPOJO usuario, String genero) throws ExceptionDAO {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
        try {
            Bson filtro = Filters.eq("_id", usuario.getId());
            Bson actualizacion = Updates.addToSet("restringidosGeneros", genero);

            UpdateResult resultado = coleccionUsuarios.updateOne(filtro, actualizacion);
            if (resultado.getMatchedCount() == 0) {
                throw new ExceptionDAO("No se encontró el usuario con el ID proporcionado.");
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al restringir el género", e);
        }
    }

    @Override
    public void regresaGenero(UsuarioPOJO usuario, String genero) throws ExceptionDAO {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
        try {
            Bson filtro = Filters.eq("_id", usuario.getId());
            Bson actualizacion = Updates.pull("restringidosGeneros", genero);
            UpdateResult resultado = coleccionUsuarios.updateOne(filtro, actualizacion);
            if (resultado.getMatchedCount() == 0) {
                throw new ExceptionDAO("No se encontró el usuario con el ID proporcionado.");
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al regresar el género a la lista permitida", e);
        }
    }

    @Override
    public List<String> consultaRestringidos(String sesion) throws ExceptionDAO {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");

        try {
            Bson filtro = Filters.eq("_id", new ObjectId(sesion));
            Document usuario = coleccionUsuarios.find(filtro)
                    .projection(Projections.include("restringidosGeneros"))
                    .first();

            if (usuario == null) {
                throw new ExceptionDAO("No se encontró un usuario con la sesión proporcionada.");
            }

            List<String> generosRestringidos = usuario.getList("restringidosGeneros", String.class);

            return generosRestringidos != null ? generosRestringidos : new ArrayList<>();
        } catch (Exception e) {
            throw new ExceptionDAO("Error al consultar los géneros restringidos", e);
        }
    }

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

    @Override
    public void eliminarFavoritoArtista(UsuarioPOJO usuario, ObjectId artista) throws ExceptionDAO {
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
                System.out.println("El artista no estaba en la lista de favoritos.");
            } else {
                System.out.println("Artista eliminado de la lista de favoritos exitosamente.");
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al eliminar el artista favorito. Filtro: " + usuario.getId(), e);
        }
    }

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
            throw new IllegalArgumentException("El usuario o el ID del cancion no pueden ser nulos o vacíos.");
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
                System.out.println("El artista ya estaba en la lista de favoritos.");
            } else {
                System.out.println("Artista agregado a la lista de favoritos exitosamente.");
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al agregar el artista favorito. Filtro: " + usuario.getNombre(), e);
        }
    }

    @Override
    public void eliminarFavoritoCancion(UsuarioPOJO usuario, ObjectId cancion) throws ExceptionDAO {
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
                System.out.println("El artista no estaba en la lista de favoritos.");
            } else {
                System.out.println("Artista eliminado de la lista de favoritos exitosamente.");
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al eliminar el artista favorito. Filtro: " + usuario.getId(), e);
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

    @Override
    public void agregarAlbumFavorito(UsuarioPOJO usuario, ObjectId album) throws ExceptionDAO {
        if (usuario == null || usuario.getNombre() == null || album == null) {
            throw new IllegalArgumentException("El usuario o el ID del artista no pueden ser nulos o vacíos.");
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
                System.out.println("El artista ya estaba en la lista de favoritos.");
            } else {
                System.out.println("Artista agregado a la lista de favoritos exitosamente.");
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al agregar el artista favorito. Filtro: " + usuario.getNombre(), e);
        }
    }

    @Override
    public void eliminarFavoritoAlbum(UsuarioPOJO usuario, ObjectId album) throws ExceptionDAO {
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
                System.out.println("El artista no estaba en la lista de favoritos.");
            } else {
                System.out.println("Artista eliminado de la lista de favoritos exitosamente.");
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al eliminar el artista favorito. Filtro: " + usuario.getId(), e);
        }
    }

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

    @Override
    public UsuarioPOJO buscar(ObjectId id) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Document doc = coleccionUsuarios.find(Filters.eq("_id", id)).first();

            if (doc != null) {
                List<ObjectId> favoritosArtistas = doc.get("favoritos.artistas", List.class);
                List<ObjectId> favoritosAlbums = doc.get("favoritos.albums", List.class);
                List<ObjectId> favoritosCanciones = doc.get("favoritos.canciones", List.class);
                List<String> restringidosGeneros = doc.getList("restringidosgeneros", String.class);

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
