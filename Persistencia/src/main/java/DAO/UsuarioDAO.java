package DAO;

import Conexion.ConexionDB;
import Exceptions.ExceptionDAO;
import IDAO.IUsuarioDAO;
import POJO.UsuarioPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

/**
 *
 * @author equipo 2
 */
public class UsuarioDAO implements IUsuarioDAO {

    @Override
    public void guardarUsuario(UsuarioPOJO usuarioPOJO) throws ExceptionDAO {
      try{
        // Inicializa la conexión y obtiene la colección
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");

        // Convertimos el UsuarioPOJO a Document antes de insertarlo
        Document usuarioDoc = new Document()
                .append("nombre", usuarioPOJO.getNombre())
                .append("email", usuarioPOJO.getEmail())
                .append("password", usuarioPOJO.getPassword()) // Usamos la contraseña hasheada del POJO
                .append("imagen", usuarioPOJO.getImagen());

        // Insertamos el documento en MongoDB
        coleccionUsuarios.insertOne(usuarioDoc);
      }catch(Exception e){
          throw new ExceptionDAO("Error al guardar el usuario en la base de datos", e);
      }
    }

    @Override
    public UsuarioPOJO buscarPorNombre(String nombre) throws ExceptionDAO {
        try{
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");

        Document doc = coleccionUsuarios.find(Filters.eq("nombre", nombre)).first();

        if (doc != null) {
            return new UsuarioPOJO(
                    doc.getString("nombre"),
                    doc.getString("email"),
                    doc.getString("password"),
                    doc.getString("imagen")
            );
        }

        return null;
        } catch (Exception e) {
            throw new ExceptionDAO("Error al buscar el usuario por nombre en la base de datos", e);
    }
}
}
