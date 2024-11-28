/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.ConexionDB;
import Exceptions.ExceptionDAO;
import IDAO.IAlbumDAO;
import POJO.AlbumPOJO;
import POJO.CancionPOJO;
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
 *
 * @author equipo 2
 */
public class AlbumDAO implements IAlbumDAO {

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

}