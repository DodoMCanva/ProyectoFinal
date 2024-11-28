package DAO;

import Conexion.ConexionDB;
import Exceptions.ExceptionDAO;
import IDAO.IUsuarioDAO;
import POJO.UsuarioPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
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
                    .append("imagen", usuarioPOJO.getImagen());

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
                return new UsuarioPOJO(
                        doc.getObjectId("_id"),
                        doc.getString("nombre"),
                        doc.getString("email"),
                        doc.getString("password"),
                        doc.getString("imagen"),
                        doc.getList("generos", String.class)//corregir
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
    public void agregarArtistaFavorito(UsuarioPOJO usuario, ObjectId artista) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");

            Bson filtro = Filters.eq("nombre", usuario.getNombre());
            Bson actualizacion = Updates.addToSet("artistasFavoritos", artista);

            coleccionUsuarios.updateOne(filtro, actualizacion);
        } catch (Exception e) {
            throw new ExceptionDAO("Error al agregar el artista favorito", e);
        }
    }

    @Override
    public void eliminarFavoritoArtista(UsuarioPOJO usuario, ObjectId artista) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");

            Bson filtro = Filters.eq("nombre", usuario.getNombre());
            Bson actualizacion = Updates.pull("artistasFavoritos", artista);

            coleccionUsuarios.updateOne(filtro, actualizacion);
        } catch (Exception e) {
            throw new ExceptionDAO("Error al eliminar el artista favorito", e);
        }
    }

    @Override
    public void agregarCancionFavorito(UsuarioPOJO usuario, ObjectId cancion) throws ExceptionDAO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarFavoritoCancion(UsuarioPOJO usuario, ObjectId cancion) throws ExceptionDAO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarAlbumFavorito(UsuarioPOJO usuario, ObjectId album) throws ExceptionDAO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarFavoritoAlbum(UsuarioPOJO usuario, ObjectId album) throws ExceptionDAO {

    }

    @Override
    public UsuarioPOJO buscar(ObjectId id) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            Document doc = coleccionUsuarios.find(Filters.eq("_id", id)).first();

            if (doc != null) {
                return new UsuarioPOJO(
                        id,
                        doc.getString("nombre"),
                        doc.getString("email"),
                        doc.getString("password"),
                        doc.getString("imagen"),
                        doc.getList("generos", String.class)//corregir
                );
            }
            return null;
        } catch (Exception e) {
            throw new ExceptionDAO("Error al buscar el usuario por ID en la base de datos", e);
        }
    }
}
