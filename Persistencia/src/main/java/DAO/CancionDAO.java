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
 * Clase que implementa la interfaz ICancionDAO para gestionar las operaciones
 * CRUD sobre una base de datos MongoDB relacionada con canciones.
 *
 * @author equipo 2
 */
public class CancionDAO implements ICancionDAO {

    private MongoDatabase database;

    /**
     * Constructor de la clase CancionDAO. Inicializa la conexión a la base de
     * datos utilizando la clase ConexionDB.
     */
    public CancionDAO() {
        ConexionDB conexionDB = new ConexionDB();
        this.database = conexionDB.conexion();
    }

    /**
     * Inserta una nueva canción en la base de datos.
     *
     * @param cancion el objeto CancionPOJO que contiene los datos de la
     * canción.
     * @throws ExceptionDAO si ocurre un error al guardar la canción.
     */
    @Override
    public void insertarCancion(CancionPOJO cancion) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionCanciones = baseDeDatos.getCollection("canciones");

            Document Doc = new Document()
                    .append("nombre", cancion.getNombre())
                    .append("duracion", cancion.getDuracion())
                    .append("genero", cancion.getGenero());

            coleccionCanciones.insertOne(Doc);
        } catch (Exception e) {
            throw new ExceptionDAO("Error al guardar la cancion en la base de datos", e);
        }
    }

    /**
     * Obtiene el ID de una canción por su nombre.
     *
     * @param nombreCancion el nombre de la canción.
     * @return el ID de la canción, null si no se encuentra.
     */
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

    /**
     * Consulta todas las canciones cuya categoria no este en la lista de
     * géneros restringidos.
     *
     * @param generosRestringidos la lista de géneros que no deben incluirse en
     * la consulta.
     * @return una lista de objetos CancionPOJO que cumplen con el criterio.
     * @throws ExceptionDAO si ocurre un error al realizar la consulta.
     */
    @Override
    public List<CancionPOJO> consultaGeneralCancion(List<String> generosRestringidos) throws ExceptionDAO {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionCanciones = baseDeDatos.getCollection("canciones");
        List<CancionPOJO> listaCanciones = new ArrayList<>();

        try {
            Bson filtroGeneros = Filters.nin("genero", generosRestringidos);
            FindIterable<Document> canciones = coleccionCanciones.find(filtroGeneros);

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
            throw new ExceptionDAO("Error al consultar las canciones", e);
        }
    }

    /**
     * Realiza una busqueda general de canciones segun los géneros restringidos
     * y un termino de busqueda.
     *
     * @param generosRestringidos la lista de géneros que no deben incluirse en
     * la consulta.
     * @param Busqueda el termino de busqueda que debe coincidir con el nombre
     * de la canción.
     * @return una lista de objetos CancionPOJO que cumplen con los criterios.
     * @throws ExceptionDAO si ocurre un error al realizar la busqueda.
     */
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

    /**
     * Consulta los detalles de una canción especifica basada en su ID.
     *
     * @param id el ObjectId de la canción a consultar.
     * @return un objeto CancionPOJO con los detalles de la canción.
     * @throws ExceptionDAO si ocurre un error al realizar la consulta o si no
     * se encuentra la canción.
     */
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
