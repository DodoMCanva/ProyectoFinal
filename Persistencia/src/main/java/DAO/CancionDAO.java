package DAO;

import Conexion.ConexionDB;
import Exceptions.ExceptionDAO;
import IDAO.ICancionDAO;
import POJO.CancionPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import org.bson.Document;

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

}
