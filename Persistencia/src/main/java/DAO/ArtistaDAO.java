package DAO;

import Conexion.ConexionDB;
import Exceptions.ExceptionDAO;
import IDAO.IArtistaDAO;
import POJO.ArtistaPOJO;
import POJO.IntegrantesPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 * Clase que implementa la interfaz IArtistaDAO para realizar operaciones CRUD
 * relacionadas con artistas en la base de datos MongoDB.
 *
 * @author equipo 2
 */
public class ArtistaDAO implements IArtistaDAO {

    private MongoDatabase database;

    /**
     * Constructor de la clase ArtistaDAO. Inicializa la conexión con la base de
     * datos MongoDB.
     */
    public ArtistaDAO() {
        ConexionDB conexionDB = new ConexionDB();
        this.database = conexionDB.conexion();
    }

    /**
     * Inserta un nuevo artista en la colección "artistas" de la base de datos.
     *
     * @param artistaPOJO Objeto que contiene la información del artista a
     * insertar.
     * @throws ExceptionDAO Si ocurre un error durante la inserción en la base
     * de datos.
     */
    @Override
    public void insertarArtistas(ArtistaPOJO artistaPOJO) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionArtistas = baseDeDatos.getCollection("artistas");
            Document artDoc;
            artDoc = new Document()
                    .append("nombre", artistaPOJO.getNombre())
                    .append("imagen", artistaPOJO.getImagen())
                    .append("tipo", artistaPOJO.getTipo())
                    .append("genero", artistaPOJO.getGenero());
            if (artistaPOJO.getIntegrantes() != null) {
                artDoc.append("integrantes", artistaPOJO.getIntegrantes());
            }
            coleccionArtistas.insertOne(artDoc);
        } catch (Exception e) {
            throw new ExceptionDAO("Error al guardar el artista en la base de datos", e);
        }
    }

    /**
     * Obtiene el ID de un artista a partir de su nombre.
     *
     * @param nombreArtista Nombre del artista cuyo ID se desea obtener.
     * @return ID del artista, o null si no se encuentra.
     */
    @Override
    public String obtenerIdPorNombre(String nombreArtista) {
        try {
            MongoCollection<Document> collection = database.getCollection("artistas");
            Document artista = collection.find(Filters.eq("nombre", nombreArtista)).first();

            if (artista != null) {
                ObjectId id = artista.getObjectId("_id");
                return id.toHexString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Consulta una lista de artistas excluyendo los géneros restringidos.
     *
     * @param generosRestringidos Lista de géneros que se deben excluir.
     * @return Lista de objetos ArtistaPOJO que cumplen con el filtro.
     * @throws ExceptionDAO Si ocurre un error durante la consulta.
     */
    @Override
    public List<ArtistaPOJO> consultaGeneralArtista(List<String> generosRestringidos) throws ExceptionDAO {
        List<ArtistaPOJO> listaArtistas = new ArrayList<>();
        try {
            MongoCollection<Document> coleccionArtistas = database.getCollection("artistas");
            Bson filtro = Filters.nin("genero", generosRestringidos);
            for (Document doc : coleccionArtistas.find(filtro)) {
                List<Document> integrantesDocs = doc.getList("integrantes", Document.class);
                List<IntegrantesPOJO> integrantes = new ArrayList<>();
                if (integrantesDocs != null) {
                    for (Document integranteDoc : integrantesDocs) {
                        //posible error en el nombre de las columnas
                        IntegrantesPOJO integrante = new IntegrantesPOJO(
                                integranteDoc.getString("nombre"),
                                integranteDoc.getString("rol"),
                                integranteDoc.getString("imagen"),
                                integranteDoc.getDate("ingreso") != null
                                ? integranteDoc.getDate("ingreso").toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                                : null,
                                integranteDoc.getDate("salida") != null
                                ? integranteDoc.getDate("salida").toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                                : null,
                                integranteDoc.getBoolean("estado", false)
                        );
                        integrantes.add(integrante);
                    }
                }
                ArtistaPOJO artista = new ArtistaPOJO(
                        doc.getObjectId("_id"),
                        doc.getString("nombre"),
                        doc.getString("imagen"),
                        doc.getString("tipo"),
                        doc.getString("genero"),
                        integrantes
                );

                listaArtistas.add(artista);
            }
            return listaArtistas;
        } catch (Exception e) {
            throw new ExceptionDAO("Error al consultar los artistas", e);
        }
    }

    /**
     * Busca artistas excluyendo géneros restringidos y filtrando por un termino
     * de busqueda.
     *
     * @param generosRestringidos Lista de géneros a excluir.
     * @param busqueda Termino de busqueda a aplicar en los campos de nombre y
     * tipo.
     * @return Lista de objetos ArtistaPOJO que cumplen con los filtros.
     * @throws ExceptionDAO Si ocurre un error durante la busqueda.
     */
    @Override
    public List<ArtistaPOJO> busquedaGeneralArtista(List<String> generosRestringidos, String busqueda) throws ExceptionDAO {
        List<ArtistaPOJO> listaArtistas = new ArrayList<>();
        try {
            MongoCollection<Document> coleccionArtistas = database.getCollection("artistas");
            Bson filtroGeneros = Filters.nin("genero", generosRestringidos);
            String busquedaAjustada = ".*" + busqueda + ".*";
            Bson filtroBusqueda = Filters.or(
                    Filters.regex("nombre", busquedaAjustada, "i"),
                    Filters.regex("tipo", busquedaAjustada, "i")
            );
            Bson filtroCombinado = Filters.and(filtroGeneros, filtroBusqueda);
            for (Document doc : coleccionArtistas.find(filtroCombinado)) {
                List<Document> integrantesDocs = doc.getList("integrantes", Document.class);
                List<IntegrantesPOJO> integrantes = new ArrayList<>();
                if (integrantesDocs != null) {
                    for (Document integranteDoc : integrantesDocs) {
                        IntegrantesPOJO integrante = new IntegrantesPOJO(
                                integranteDoc.getString("nombre"),
                                integranteDoc.getString("rol"),
                                integranteDoc.getString("imagen"),
                                integranteDoc.getDate("ingreso") != null
                                ? integranteDoc.getDate("ingreso").toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                                : null,
                                integranteDoc.getDate("salida") != null
                                ? integranteDoc.getDate("salida").toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                                : null,
                                integranteDoc.getBoolean("estado", false)
                        );
                        integrantes.add(integrante);
                    }
                }
                ArtistaPOJO artista = new ArtistaPOJO(
                        doc.getObjectId("_id"),
                        doc.getString("nombre"),
                        doc.getString("imagen"),
                        doc.getString("tipo"),
                        doc.getString("genero"),
                        integrantes
                );
                listaArtistas.add(artista);
            }
            return listaArtistas;
        } catch (Exception e) {
            throw new ExceptionDAO("Error al realizar la búsqueda de artistas", e);
        }
    }

    /**
     * Consulta un artista por su ID unico.
     *
     * @param id ID del artista a consultar.
     * @return Objeto ArtistaPOJO que representa al artista consultado.
     * @throws ExceptionDAO Si no se encuentra el artista o ocurre un error
     * durante la consulta.
     */
    @Override
    public ArtistaPOJO consulta(ObjectId id) throws ExceptionDAO {
        try {
            MongoCollection<Document> coleccionArtistas = database.getCollection("artistas");
            Bson filtroId = Filters.eq("_id", id);
            Document doc = coleccionArtistas.find(filtroId).first();
            if (doc == null) {
                throw new ExceptionDAO("No se encontró el artista con el ID especificado.");
            }
            List<Document> integrantesDocs = doc.getList("integrantes", Document.class);
            List<IntegrantesPOJO> integrantes = new ArrayList<>();
            if (integrantesDocs != null) {
                for (Document integranteDoc : integrantesDocs) {
                    IntegrantesPOJO integrante = new IntegrantesPOJO(
                            integranteDoc.getString("nombre"),
                            integranteDoc.getString("rol"),
                            integranteDoc.getString("imagen"),
                            integranteDoc.getDate("ingreso") != null
                            ? integranteDoc.getDate("ingreso").toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                            : null,
                            integranteDoc.getDate("salida") != null
                            ? integranteDoc.getDate("salida").toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                            : null,
                            integranteDoc.getBoolean("estado", false)
                    );
                    integrantes.add(integrante);
                }
            }
            ArtistaPOJO artista = new ArtistaPOJO(
                    doc.getObjectId("_id"),
                    doc.getString("nombre"),
                    doc.getString("imagen"),
                    doc.getString("tipo"),
                    doc.getString("genero"),
                    integrantes
            );

            return artista;
        } catch (ExceptionDAO e) {
            throw new ExceptionDAO("Error al consultar el artista por ID", e);
        }
    }
}
