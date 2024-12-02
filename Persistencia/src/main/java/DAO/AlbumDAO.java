package DAO;

import Conexion.ConexionDB;
import Exceptions.ExceptionDAO;
import IDAO.IAlbumDAO;
import POJO.AlbumPOJO;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 * Clase DAO para gestionar operaciones relacionadas con álbumes en una base de
 * datos MongoDB.
 *
 * Esta clase se encarga de realizar operaciones CRUD y consultas avanzadas
 * sobre la colección "albums".
 *
 * @author equipo 2
 */
public class AlbumDAO implements IAlbumDAO {

    /**
     * Inserta un álbum en la colección "albums" de la base de datos.
     *
     * @param album el objeto {@link AlbumPOJO} que contiene la información del
     * álbum a insertar.
     * @throws ExceptionDAO si ocurre un error al guardar el álbum en la base de
     * datos.
     */
    @Override
    public void InsertarAlbum(AlbumPOJO album) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionAlbums = baseDeDatos.getCollection("albums");

            Document Doc = new Document()
                    .append("artistaId", album.getArtistaId())
                    .append("nombre", album.getNombre())
                    .append("fechaLanzamiento", album.getFechaLanzamiento())
                    .append("genero", album.getGenero())
                    .append("portada", album.getPortada())
                    .append("canciones", album.getCanciones());

            coleccionAlbums.insertOne(Doc);
        } catch (Exception e) {
            throw new ExceptionDAO("Error al guardar el Album en la base de datos", e);
        }
    }

    /**
     * Consulta todos los álbumes en la colección, excluyendo los de géneros
     * restringidos.
     *
     * @param generosRestringidos una lista de géneros que no deben incluirse en
     * el resultado.
     * @return una lista de objetos AlbumPOJO que representan los álbumes
     * encontrados.
     * @throws ExceptionDAO si ocurre un error al consultar los álbumes.
     */
    @Override
    public List<AlbumPOJO> consultaGeneralAlbums(List<String> generosRestringidos) throws ExceptionDAO {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionAlbums = baseDeDatos.getCollection("albums");
        List<AlbumPOJO> listaAlbums = new ArrayList<>();
        try {
            Bson filtroGeneros = Filters.nin("genero", generosRestringidos);
            FindIterable<Document> albums = coleccionAlbums.find(filtroGeneros);

            for (Document doc : albums) {
                List<ObjectId> cancionesIds = doc.getList("canciones", ObjectId.class);
                ObjectId artistaId = doc.getObjectId("artistaId");
                LocalDate fechaLanzamiento = null;
                if (doc.getDate("fechaLanzamiento") != null) {
                    fechaLanzamiento = doc.getDate("fechaLanzamiento")
                            .toInstant()
                            .atZone(ZoneId.systemDefault())
                            .toLocalDate();
                }
                AlbumPOJO album = new AlbumPOJO(
                        doc.getObjectId("_id"),
                        doc.getString("nombre"),
                        fechaLanzamiento,
                        doc.getString("genero"),
                        doc.getString("portada"),
                        artistaId,
                        cancionesIds
                );
                listaAlbums.add(album);
            }

            return listaAlbums;
        } catch (Exception e) {
            throw new ExceptionDAO("Error al consultar los álbumes", e);
        }
    }

    /**
     * Busca álbumes en la colección que coincidan con un término de busqueda y
     * excluyendo géneros restringidos.
     *
     * @param generosRestringidos lista de géneros que no deben incluirse en el
     * resultado.
     * @param Busqueda el termino de busqueda para coincidir con los nombres de
     * los álbumes.
     * @return una lista de objetos AlbumPOJO que representan los álbumes
     * encontrados.
     * @throws ExceptionDAO si ocurre un error durante la busqueda.
     */
    @Override
    public List<AlbumPOJO> busquedaGeneralAlbum(List<String> generosRestringidos, String Busqueda) throws ExceptionDAO {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionAlbums = baseDeDatos.getCollection("albums");
        List<AlbumPOJO> listaAlbums = new ArrayList<>();

        try {
            Bson filtroGeneros = Filters.nin("genero", generosRestringidos);
            Bson filtroBusqueda = Filters.regex("nombre", Busqueda, "i");
            FindIterable<Document> albums = coleccionAlbums.find(Filters.and(filtroGeneros, filtroBusqueda));
            for (Document doc : albums) {
                List<ObjectId> cancionesIds = doc.getList("canciones", ObjectId.class);
                ObjectId artistaId = doc.getObjectId("artistaId");
                LocalDate fechaLanzamiento = null;
                if (doc.getDate("fechaLanzamiento") != null) {
                    fechaLanzamiento = doc.getDate("fechaLanzamiento")
                            .toInstant()
                            .atZone(ZoneId.systemDefault())
                            .toLocalDate();
                }
                AlbumPOJO album = new AlbumPOJO(
                        doc.getObjectId("_id"),
                        doc.getString("nombre"),
                        fechaLanzamiento,
                        doc.getString("genero"),
                        doc.getString("portada"),
                        artistaId,
                        cancionesIds
                );
                listaAlbums.add(album);
            }

            return listaAlbums;
        } catch (Exception e) {
            throw new ExceptionDAO("Error al realizar la búsqueda de álbumes", e);
        }
    }

    @Override
    public String obtenerIdPorNombre(String nombreAlbum) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Consulta un álbum en la base de datos por su ID.
     *
     * @param id el ID del álbum a buscar.
     * @return un objeto AlbumPOJO que representa el álbum encontrado.
     * @throws ExceptionDAO si ocurre un error al consultar el álbum por ID.
     */
    @Override
    public AlbumPOJO consulta(ObjectId id) throws ExceptionDAO {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionAlbums = baseDeDatos.getCollection("albums");

        try {
            Bson filtro = Filters.eq("_id", id);
            Document resultado = coleccionAlbums.find(filtro).first();

            if (resultado != null) {
                List<ObjectId> cancionesIds = resultado.getList("canciones", ObjectId.class);
                ObjectId artistaId = resultado.getObjectId("artistaId");
                LocalDate fechaLanzamiento = null;
                if (resultado.getDate("fechaLanzamiento") != null) {
                    fechaLanzamiento = resultado.getDate("fechaLanzamiento")
                            .toInstant()
                            .atZone(ZoneId.systemDefault())
                            .toLocalDate();
                }

                return new AlbumPOJO(
                        resultado.getObjectId("_id"),
                        resultado.getString("nombre"),
                        fechaLanzamiento,
                        resultado.getString("genero"),
                        resultado.getString("portada"),
                        artistaId,
                        cancionesIds
                );
            } else {
                throw new ExceptionDAO("No se encontró ningún álbum con el ID: " + id);
            }
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al consultar el álbum por ID: " + e.getMessage(), e);
        }
    }

}
