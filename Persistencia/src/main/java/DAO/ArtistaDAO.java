package DAO;

import Conexion.ConexionDB;
import Exceptions.ExceptionDAO;
import IDAO.IArtistaDAO;
import POJO.ArtistaPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author cesar
 */
public class ArtistaDAO implements IArtistaDAO {
    // Usar la clase ConexionDB para obtener la conexión a la base de datos

    private MongoDatabase database;

    public ArtistaDAO() {
        // Crear una instancia de ConexionDB para obtener la conexión
        ConexionDB conexionDB = new ConexionDB();
        this.database = conexionDB.conexion();  // Obtener la base de datos
    }

    @Override
    public void insertarArtistas(ArtistaPOJO artistaPOJO) throws ExceptionDAO {
        try {
            MongoDatabase baseDeDatos = new ConexionDB().conexion();
            MongoCollection<Document> coleccionArtistas = baseDeDatos.getCollection("artistas");
            Document artDoc;
            if (artistaPOJO.getIntegrantes() != null) {
                artDoc = new Document()
                        .append("nombre", artistaPOJO.getNombre())
                        .append("imagen", artistaPOJO.getImagen())
                        .append("tipo", artistaPOJO.getTipo())
                        .append("genero", artistaPOJO.getGenero())
                        .append("integrantes", artistaPOJO.getIntegrantes());

            } else {
                artDoc = new Document()
                        .append("nombre", artistaPOJO.getNombre())
                        .append("imagen", artistaPOJO.getImagen())
                        .append("tipo", artistaPOJO.getTipo())
                        .append("genero", artistaPOJO.getGenero());
            }

            coleccionArtistas.insertOne(artDoc);
        } catch (Exception e) {
            throw new ExceptionDAO("Error al guardar el artista en la base de datos", e);
        }
    }

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
    /*
    @Override
    public void insertarArtistasSolistas(ArtistaPOJO artistaPOJO) {
        MongoCollection<Document> collection = database.getCollection("artistas");

        // Predefinir los 90 artistas: 45 solistas y 45 bandas
        List<Document> artistas = List.of(
                // Solistas
                new Document("nombre", "Adele")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Ed Sheeran")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Shakira")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Justin Bieber")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Rihanna")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Lady Gaga")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Kanye West")
                        .append("tipo", "solista")
                        .append("genero", "hip-hop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Taylor Swift")
                        .append("tipo", "solista")
                        .append("genero", "country")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Bruno Mars")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "The Weeknd")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Drake")
                        .append("tipo", "solista")
                        .append("genero", "hip-hop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Billie Eilish")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Post Malone")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Sia")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Lizzo")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Beyoncé")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Lil Nas X")
                        .append("tipo", "solista")
                        .append("genero", "hip-hop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Ariana Grande")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Travis Scott")
                        .append("tipo", "solista")
                        .append("genero", "hip-hop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Miley Cyrus")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Zayn Malik")
                        .append("tipo", "solista")
                        .append("genero", "pop")
                        .append("integrantes", List.of())
                        .append("albumes", List.of())
                        .append("canciones", List.of())
        );
                
                collection.insertOne((Document) artistas);
    }
 @Override
    public void insertarArtistasGrupo() {
        MongoCollection<Document> collection = database.getCollection("artistas");

        // Predefinir los 90 artistas: 45 solistas y 45 bandas
        List<Document> artistas = List.of(                
// Bandas (con integrantes)
                new Document("nombre", "Coldplay")
                        .append("tipo", "banda")
                        .append("genero", "rock")
                        .append("integrantes", List.of(
                                new Document("nombre", "Chris Martin")
                                        .append("rol", "Vocalista")
                                        .append("ingreso", "1996-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "Jonny Buckland")
                                        .append("rol", "Guitarrista")
                                        .append("ingreso", "1996-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "The Beatles")
                        .append("tipo", "banda")
                        .append("genero", "rock")
                        .append("integrantes", List.of(
                                new Document("nombre", "John Lennon")
                                        .append("rol", "Vocalista")
                                        .append("ingreso", "1960-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "Paul McCartney")
                                        .append("rol", "Bajista")
                                        .append("ingreso", "1960-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Queen")
                        .append("tipo", "banda")
                        .append("genero", "rock")
                        .append("integrantes", List.of(
                                new Document("nombre", "Freddie Mercury")
                                        .append("rol", "Vocalista")
                                        .append("ingreso", "1970-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "Brian May")
                                        .append("rol", "Guitarrista")
                                        .append("ingreso", "1970-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Imagine Dragons")
                        .append("tipo", "banda")
                        .append("genero", "rock")
                        .append("integrantes", List.of(
                                new Document("nombre", "Dan Reynolds")
                                        .append("rol", "Vocalista")
                                        .append("ingreso", "2008-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "Wayne Sermon")
                                        .append("rol", "Guitarrista")
                                        .append("ingreso", "2008-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Maroon 5")
                        .append("tipo", "banda")
                        .append("genero", "pop-rock")
                        .append("integrantes", List.of(
                                new Document("nombre", "Adam Levine")
                                        .append("rol", "Vocalista")
                                        .append("ingreso", "1994-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "Jesse Carmichael")
                                        .append("rol", "Tecladista")
                                        .append("ingreso", "1994-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "The Rolling Stones")
                        .append("tipo", "banda")
                        .append("genero", "rock")
                        .append("integrantes", List.of(
                                new Document("nombre", "Mick Jagger")
                                        .append("rol", "Vocalista")
                                        .append("ingreso", "1962-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "Keith Richards")
                                        .append("rol", "Guitarrista")
                                        .append("ingreso", "1962-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Pink Floyd")
                        .append("tipo", "banda")
                        .append("genero", "rock")
                        .append("integrantes", List.of(
                                new Document("nombre", "Roger Waters")
                                        .append("rol", "Bajista")
                                        .append("ingreso", "1965-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "David Gilmour")
                                        .append("rol", "Guitarrista")
                                        .append("ingreso", "1965-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "U2")
                        .append("tipo", "banda")
                        .append("genero", "rock")
                        .append("integrantes", List.of(
                                new Document("nombre", "Bono")
                                        .append("rol", "Vocalista")
                                        .append("ingreso", "1976-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "The Edge")
                                        .append("rol", "Guitarrista")
                                        .append("ingreso", "1976-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Metallica")
                        .append("tipo", "banda")
                        .append("genero", "metal")
                        .append("integrantes", List.of(
                                new Document("nombre", "James Hetfield")
                                        .append("rol", "Vocalista")
                                        .append("ingreso", "1981-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "Lars Ulrich")
                                        .append("rol", "Baterista")
                                        .append("ingreso", "1981-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Nirvana")
                        .append("tipo", "banda")
                        .append("genero", "grunge")
                        .append("integrantes", List.of(
                                new Document("nombre", "Kurt Cobain")
                                        .append("rol", "Vocalista")
                                        .append("ingreso", "1987-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "Krist Novoselic")
                                        .append("rol", "Bajista")
                                        .append("ingreso", "1987-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Green Day")
                        .append("tipo", "banda")
                        .append("genero", "punk-rock")
                        .append("integrantes", List.of(
                                new Document("nombre", "Billie Joe Armstrong")
                                        .append("rol", "Vocalista")
                                        .append("ingreso", "1986-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "Mike Dirnt")
                                        .append("rol", "Bajista")
                                        .append("ingreso", "1986-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "The Who")
                        .append("tipo", "banda")
                        .append("genero", "rock")
                        .append("integrantes", List.of(
                                new Document("nombre", "Roger Daltrey")
                                        .append("rol", "Vocalista")
                                        .append("ingreso", "1964-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "Pete Townshend")
                                        .append("rol", "Guitarrista")
                                        .append("ingreso", "1964-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "The Doors")
                        .append("tipo", "banda")
                        .append("genero", "rock")
                        .append("integrantes", List.of(
                                new Document("nombre", "Jim Morrison")
                                        .append("rol", "Vocalista")
                                        .append("ingreso", "1965-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "Ray Manzarek")
                                        .append("rol", "Tecladista")
                                        .append("ingreso", "1965-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of()),
                new Document("nombre", "Fleetwood Mac")
                        .append("tipo", "banda")
                        .append("genero", "rock")
                        .append("integrantes", List.of(
                                new Document("nombre", "Stevie Nicks")
                                        .append("rol", "Vocalista")
                                        .append("ingreso", "1975-01-01")
                                        .append("salida", null)
                                        .append("estado", true),
                                new Document("nombre", "Lindsey Buckingham")
                                        .append("rol", "Guitarrista")
                                        .append("ingreso", "1975-01-01")
                                        .append("salida", null)
                                        .append("estado", true)
                        ))
                        .append("albumes", List.of())
                        .append("canciones", List.of())
        );

        collection.insertMany(artistas);
    }
     */

}
