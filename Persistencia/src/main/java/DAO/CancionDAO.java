package DAO;

import Conexion.ConexionDB;
import Exceptions.ExceptionDAO;
import IDAO.ICancionDAO;
import POJO.CancionPOJO;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;
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
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionCanciones = baseDeDatos.getCollection("canciones");

            Document Doc = new Document()
                    .append("nombre", cancion.getNombre())
                    .append("duracion", cancion.getDuracion())
                    .append("genero",cancion.getGenero())
                    ;
            

            coleccionCanciones.insertOne(Doc);
        } catch (Exception e) {
            throw new ExceptionDAO("Error al guardar la cancion en la base de datos", e);
        }
    }

    @Override
    public String obtenerIdPorNombre(String nombreCancion) {
        try {
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

    @Override
    public List<CancionPOJO> consultaGeneralCancion(List<String> generosRestringidos) throws ExceptionDAO {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionCanciones = baseDeDatos.getCollection("canciones");
        List<CancionPOJO> listaCanciones = new ArrayList<>();

        try {
            Bson filtroGeneros = Filters.nin("genero", generosRestringidos);
            FindIterable<Document> canciones = coleccionCanciones.find(filtroGeneros);

            for (Document doc : canciones) {
                CancionPOJO cancion = new CancionPOJO  (
                        doc.getObjectId("_id"),
                        doc.getString("nombre"),
                        doc.getString("duracion"),
                        doc.getString("genero")
                );
                listaCanciones.add(cancion);
            }
            return listaCanciones;
        } catch (Exception e) {
            throw new ExceptionDAO("Error al consultar las canciones", e);
        }
    }

    @Override
    public List<CancionPOJO> busquedaGeneralCancion(List<String> generosRestringidos, String Busqueda) throws ExceptionDAO {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionCanciones = baseDeDatos.getCollection("canciones");
        List<CancionPOJO> listaCanciones = new ArrayList<>();
        try {
            Bson filtroGeneros = Filters.nin("genero", generosRestringidos);
            String busquedaAjustada = ".*" + Busqueda + ".*";
            Bson filtroBusqueda = Filters.or(
                    Filters.regex("nombre", busquedaAjustada, "i"));
            FindIterable<Document> canciones = coleccionCanciones.find(Filters.and(filtroGeneros, filtroBusqueda));
            for (Document doc : canciones) {
                CancionPOJO cancion = new CancionPOJO(
                        doc.getObjectId("_id"),
                        doc.getString("nombre"),
                        doc.getString("duracion"),
                        doc.getString("genero")
                );
                listaCanciones.add(cancion);
            }
            return listaCanciones;
        } catch (Exception e) {
            throw new ExceptionDAO("Error al realizar la búsqueda de canciones", e);
        }
    }

    @Override
    public CancionPOJO consulta(ObjectId id) throws ExceptionDAO {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionCanciones = baseDeDatos.getCollection("canciones");
        try {
            Bson filtroId = Filters.eq("_id", id);
            Document doc = coleccionCanciones.find(filtroId).first();
            if (doc == null) {
                throw new ExceptionDAO("No se encontró la canción con el ID especificado.");
            }
            CancionPOJO cancion = new CancionPOJO(
                    doc.getObjectId("_id"),
                    doc.getString("nombre"),
                    doc.getString("duracion"),
                    doc.getString("genero")
            );

            return cancion;
        } catch (Exception e) {
            throw new ExceptionDAO("Error al consultar la canción por ID", e);
        }
    }

}
