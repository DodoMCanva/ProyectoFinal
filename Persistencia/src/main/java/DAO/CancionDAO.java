package DAO;

import Conexion.ConexionDB;
import Exceptions.ExceptionDAO;
import IDAO.ICancionDAO;
import POJO.CancionPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author equipo 2
 */
public class CancionDAO implements ICancionDAO {

    private MongoDatabase database;

    public CancionDAO() {
        ConexionDB conexionDB = new ConexionDB();
        this.database = conexionDB.conexion(); 
    }

    @Override
    public void insertarCancion(CancionPOJO cancion) throws ExceptionDAO {
        try{
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionCanciones = baseDeDatos.getCollection("canciones");

        Document Doc = new Document()
                .append("nombre", cancion.getNombre())
                .append("duracion", cancion.getDuracion());

        coleccionCanciones.insertOne(Doc);
      }catch(Exception e){
          throw new ExceptionDAO("Error al guardar la cancion en la base de datos", e);
      }
    }
    @Override
    public String obtenerIdPorNombre(String nombreCancion){
        try{
        MongoCollection<Document> collection = database.getCollection("canciones");
            Document canciones = collection.find(Filters.eq("nombre", nombreCancion)).first();

            if (canciones != null) {
                ObjectId id = canciones.getObjectId("_id");
                return id.toHexString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
