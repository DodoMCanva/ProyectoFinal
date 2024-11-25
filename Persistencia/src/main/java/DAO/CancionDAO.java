/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.ConexionDB;
import IDAO.ICancionDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author cesar
 */
public class CancionDAO implements ICancionDAO {

    private MongoDatabase database;

    public CancionDAO() {
        ConexionDB conexionDB = new ConexionDB();
        this.database = conexionDB.conexion(); // Obtener la conexión a la base de datos
    }

    @Override
    public void insertarCanciones() {
        MongoCollection<Document> collection = database.getCollection("canciones");

        List<Document> canciones = List.of(
                // Canciones de Adele (Solista)
                new Document("nombre", "Someone Like You").append("duracion", "04:45"),
                new Document("nombre", "Rolling in the Deep").append("duracion", "03:48"),
                new Document("nombre", "Set Fire to the Rain").append("duracion", "04:02"),
                // Canciones de Ed Sheeran (Solista)
                new Document("nombre", "Shape of You").append("duracion", "03:53"),
                new Document("nombre", "Castle on the Hill").append("duracion", "04:21"),
                new Document("nombre", "Thinking Out Loud").append("duracion", "04:41"),
                // Canciones de Shakira (Solista)
                new Document("nombre", "Hips Don't Lie").append("duracion", "03:38"),
                new Document("nombre", "La Tortura").append("duracion", "03:33"),
                new Document("nombre", "Waka Waka (This Time for Africa)").append("duracion", "03:22"),
                // Canciones de Justin Bieber (Solista)
                new Document("nombre", "Sorry").append("duracion", "03:20"),
                new Document("nombre", "Love Yourself").append("duracion", "03:54"),
                new Document("nombre", "Baby").append("duracion", "03:36"),
                // Canciones de Rihanna (Solista)
                new Document("nombre", "Umbrella").append("duracion", "04:36"),
                new Document("nombre", "Diamonds").append("duracion", "03:45"),
                new Document("nombre", "Work").append("duracion", "03:39"),
                // Canciones de Lady Gaga (Solista)
                new Document("nombre", "Bad Romance").append("duracion", "04:54"),
                new Document("nombre", "Poker Face").append("duracion", "03:57"),
                new Document("nombre", "Shallow").append("duracion", "03:35"),
                // Canciones de Kanye West (Solista)
                new Document("nombre", "Stronger").append("duracion", "05:12"),
                new Document("nombre", "Gold Digger").append("duracion", "03:27"),
                new Document("nombre", "Heartless").append("duracion", "03:31"),
                // Canciones de Taylor Swift (Solista)
                new Document("nombre", "Shake It Off").append("duracion", "03:39"),
                new Document("nombre", "Blank Space").append("duracion", "03:51"),
                new Document("nombre", "Love Story").append("duracion", "03:55"),
                // Canciones de Bruno Mars (Solista)
                new Document("nombre", "Uptown Funk").append("duracion", "04:30"),
                new Document("nombre", "Just the Way You Are").append("duracion", "03:40"),
                new Document("nombre", "Grenade").append("duracion", "03:42"),
                // Canciones de The Weeknd (Solista)
                new Document("nombre", "Blinding Lights").append("duracion", "03:20"),
                new Document("nombre", "Can't Feel My Face").append("duracion", "03:35"),
                new Document("nombre", "Starboy").append("duracion", "03:50"),
                // Canciones de Drake (Solista)
                new Document("nombre", "Hotline Bling").append("duracion", "04:27"),
                new Document("nombre", "God's Plan").append("duracion", "03:18"),
                new Document("nombre", "In My Feelings").append("duracion", "03:37"),
                // Canciones de Billie Eilish (Solista)
                new Document("nombre", "Bad Guy").append("duracion", "03:14"),
                new Document("nombre", "Everything I Wanted").append("duracion", "04:05"),
                new Document("nombre", "Ocean Eyes").append("duracion", "03:20"),
                // Canciones de Post Malone (Solista)
                new Document("nombre", "Rockstar").append("duracion", "03:38"),
                new Document("nombre", "Circles").append("duracion", "03:35"),
                new Document("nombre", "Sunflower").append("duracion", "02:38"),
                // Canciones de Sia (Solista)
                new Document("nombre", "Chandelier").append("duracion", "03:36"),
                new Document("nombre", "Elastic Heart").append("duracion", "04:17"),
                new Document("nombre", "Cheap Thrills").append("duracion", "03:31"),
                // Canciones de Lizzo (Solista)
                new Document("nombre", "Truth Hurts").append("duracion", "02:53"),
                new Document("nombre", "Good as Hell").append("duracion", "02:39"),
                new Document("nombre", "Juice").append("duracion", "03:15"),
                // Canciones de Beyoncé (Solista)
                new Document("nombre", "Halo").append("duracion", "04:21"),
                new Document("nombre", "Single Ladies").append("duracion", "03:13"),
                new Document("nombre", "Formation").append("duracion", "03:26"),
                // Canciones de Lil Nas X (Solista)
                new Document("nombre", "Old Town Road").append("duracion", "02:37"),
                new Document("nombre", "Panini").append("duracion", "01:55"),
                new Document("nombre", "Montero (Call Me By Your Name)").append("duracion", "02:18"),
                // Canciones de Ariana Grande (Solista)
                new Document("nombre", "Thank U, Next").append("duracion", "03:27"),
                new Document("nombre", "7 Rings").append("duracion", "02:58"),
                new Document("nombre", "Side to Side").append("duracion", "03:46"),
                // Canciones de Travis Scott (Solista)
                new Document("nombre", "Sicko Mode").append("duracion", "05:12"),
                new Document("nombre", "Goosebumps").append("duracion", "04:03"),
                new Document("nombre", "Highest in the Room").append("duracion", "02:56"),
                // Canciones de Miley Cyrus (Solista)
                new Document("nombre", "Wrecking Ball").append("duracion", "03:41"),
                new Document("nombre", "Party in the U.S.A.").append("duracion", "03:22"),
                new Document("nombre", "Malibu").append("duracion", "03:51"),
                // Canciones de Zayn Malik (Solista)
                new Document("nombre", "Pillowtalk").append("duracion", "03:23"),
                new Document("nombre", "Dusk Till Dawn").append("duracion", "04:27"),
                new Document("nombre", "Let Me").append("duracion", "03:05"),
                // Canciones de Coldplay (Banda)
                new Document("nombre", "Yellow").append("duracion", "04:29"),
                new Document("nombre", "Fix You").append("duracion", "04:55"),
                new Document("nombre", "Viva La Vida").append("duracion", "04:04"),
                // Canciones de The Beatles (Banda)
                new Document("nombre", "Hey Jude").append("duracion", "07:08"),
                new Document("nombre", "Come Together").append("duracion", "04:20"),
                new Document("nombre", "Let It Be").append("duracion", "04:03"),
                // Canciones de Queen (Banda)
                new Document("nombre", "Bohemian Rhapsody").append("duracion", "05:55"),
                new Document("nombre", "We Will Rock You").append("duracion", "02:02"),
                new Document("nombre", "Another One Bites the Dust").append("duracion", "03:35"),
                // Canciones de Imagine Dragons (Banda)
                new Document("nombre", "Radioactive").append("duracion", "03:06"),
                new Document("nombre", "Demons").append("duracion", "02:57"),
                new Document("nombre", "Believer").append("duracion", "03:24"),
                // Canciones de Maroon 5 (Banda)
                new Document("nombre", "Sugar").append("duracion", "05:02"),
                new Document("nombre", "She Will Be Loved").append("duracion", "04:17"),
                new Document("nombre", "Girls Like You").append("duracion", "03:55"),
                // Canciones de The Rolling Stones (Banda)
                new Document("nombre", "Paint It Black").append("duracion", "03:45"),
                new Document("nombre", "Sympathy for the Devil").append("duracion", "06:27"),
                new Document("nombre", "Gimme Shelter").append("duracion", "04:30"),
                // Canciones de Pink Floyd (Banda)
                new Document("nombre", "Wish You Were Here").append("duracion", "05:35"),
                new Document("nombre", "Comfortably Numb").append("duracion", "06:22"),
                new Document("nombre", "Another Brick in the Wall").append("duracion", "05:38"),
                // Canciones de U2 (Banda)
                new Document("nombre", "With or Without You").append("duracion", "04:56"),
                new Document("nombre", "One").append("duracion", "04:36"),
                new Document("nombre", "Beautiful Day").append("duracion", "04:08"),
                // Canciones de Metallica (Banda)
                new Document("nombre", "Enter Sandman").append("duracion", "05:32"),
                new Document("nombre", "Nothing Else Matters").append("duracion", "06:28"),
                new Document("nombre", "Master of Puppets").append("duracion", "08:36"),
                // Canciones de Nirvana (Banda)
                new Document("nombre", "Smells Like Teen Spirit").append("duracion", "05:01"),
                new Document("nombre", "Come As You Are").append("duracion", "03:39"),
                new Document("nombre", "Lithium").append("duracion", "04:17"),
                // Canciones de Green Day (Banda)
                new Document("nombre", "Basket Case").append("duracion", "03:01"),
                new Document("nombre", "American Idiot").append("duracion", "02:54"),
                new Document("nombre", "Boulevard of Broken Dreams").append("duracion", "04:20"),
                // Canciones de The Who (Banda)
                new Document("nombre", "Baba O'Riley").append("duracion", "05:00"),
                new Document("nombre", "My Generation").append("duracion", "03:18"),
                new Document("nombre", "Behind Blue Eyes").append("duracion", "03:42"),
                // Canciones de The Doors (Banda)
                new Document("nombre", "Light My Fire").append("duracion", "07:08"),
                new Document("nombre", "Riders on the Storm").append("duracion", "07:10"),
                new Document("nombre", "Break on Through").append("duracion", "02:29"),
                // Canciones de Fleetwood Mac (Banda)
                new Document("nombre", "Go Your Own Way").append("duracion", "03:38"),
                new Document("nombre", "Dreams").append("duracion", "04:14"),
                new Document("nombre", "The Chain").append("duracion", "04:28")
        );
        collection.insertMany(canciones);
    }

}
