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
                new Document("nombre", "Someone Like You").append("duracion", "04:45").append("album", "21"),
                new Document("nombre", "Rolling in the Deep").append("duracion", "03:48").append("album", "21"),
                new Document("nombre", "Set Fire to the Rain").append("duracion", "04:02").append("album", "21"),
                // Canciones de Ed Sheeran (Solista)
                new Document("nombre", "Shape of You").append("duracion", "03:53").append("album", "Divide"),
                new Document("nombre", "Perfect").append("duracion", "04:23").append("album", "Divide"),
                new Document("nombre", "Castle on the Hill").append("duracion", "04:21").append("album", "Divide"),
                // Canciones de Shakira (Solista)
                new Document("nombre", "Hips Don't Lie").append("duracion", "03:38").append("album", "Oral Fixation, Vol. 2"),
                new Document("nombre", "Whenever, Wherever").append("duracion", "03:18").append("album", "Laundry Service"),
                new Document("nombre", "Underneath Your Clothes").append("duracion", "03:39").append("album", "Laundry Service"),
                // Canciones de Justin Bieber (Solista)
                new Document("nombre", "Sorry").append("duracion", "03:20").append("album", "Purpose"),
                new Document("nombre", "What Do You Mean?").append("duracion", "03:26").append("album", "Purpose"),
                new Document("nombre", "Love Yourself").append("duracion", "04:03").append("album", "Purpose"),
                // Canciones de Rihanna (Solista)
                new Document("nombre", "Umbrella").append("duracion", "04:35").append("album", "Good Girl Gone Bad"),
                new Document("nombre", "Diamonds").append("duracion", "03:45").append("album", "Unapologetic"),
                new Document("nombre", "Work").append("duracion", "03:39").append("album", "Anti"),
                // Canciones de Lady Gaga (Solista)
                new Document("nombre", "Bad Romance").append("duracion", "04:54").append("album", "The Fame Monster"),
                new Document("nombre", "Poker Face").append("duracion", "03:57").append("album", "The Fame"),
                new Document("nombre", "Just Dance").append("duracion", "04:02").append("album", "The Fame"),
                // Canciones de Kanye West (Solista)
                new Document("nombre", "Stronger").append("duracion", "05:11").append("album", "Graduation"),
                new Document("nombre", "Gold Digger").append("duracion", "03:28").append("album", "Late Registration"),
                new Document("nombre", "Heartless").append("duracion", "03:31").append("album", "808s & Heartbreak"),
                // Canciones de Taylor Swift (Solista)
                new Document("nombre", "Love Story").append("duracion", "03:55").append("album", "Fearless"),
                new Document("nombre", "Shake It Off").append("duracion", "03:39").append("album", "1989"),
                new Document("nombre", "You Belong with Me").append("duracion", "03:52").append("album", "Fearless"),
                // Canciones de Bruno Mars (Solista)
                new Document("nombre", "Uptown Funk").append("duracion", "04:30").append("album", "Uptown Special"),
                new Document("nombre", "Just the Way You Are").append("duracion", "03:40").append("album", "Doo-Wops & Hooligans"),
                new Document("nombre", "Locked Out of Heaven").append("duracion", "03:53").append("album", "Unorthodox Jukebox"),
                // Canciones de Coldplay (Banda)
                new Document("nombre", "Fix You").append("duracion", "04:55").append("album", "X&Y"),
                new Document("nombre", "Yellow").append("duracion", "04:30").append("album", "Parachutes"),
                new Document("nombre", "Viva La Vida").append("duracion", "04:02").append("album", "Viva la Vida or Death and All His Friends"),
                // Canciones de Imagine Dragons (Banda)
                new Document("nombre", "Believer").append("duracion", "03:37").append("album", "Evolve"),
                new Document("nombre", "Radioactive").append("duracion", "03:06").append("album", "Night Visions"),
                new Document("nombre", "Thunder").append("duracion", "03:07").append("album", "Evolve"),
                // Canciones de Maroon 5 (Banda)
                new Document("nombre", "Sugar").append("duracion", "03:55").append("album", "V"),
                new Document("nombre", "Moves Like Jagger").append("duracion", "03:21").append("album", "Hands All Over"),
                new Document("nombre", "She Will Be Loved").append("duracion", "04:18").append("album", "Songs About Jane"),
                // Canciones de One Direction (Banda)
                new Document("nombre", "What Makes You Beautiful").append("duracion", "03:19").append("album", "Up All Night"),
                new Document("nombre", "Story of My Life").append("duracion", "04:05").append("album", "Midnight Memories"),
                new Document("nombre", "Drag Me Down").append("duracion", "03:10").append("album", "Made in the A.M."),
                // Canciones de The Beatles (Banda)
                new Document("nombre", "Hey Jude").append("duracion", "07:11").append("album", "Hey Jude"),
                new Document("nombre", "Let It Be").append("duracion", "04:03").append("album", "Let It Be"),
                new Document("nombre", "Come Together").append("duracion", "04:20").append("album", "Abbey Road"),
                // Canciones de The Rolling Stones (Banda)
                new Document("nombre", "Paint It Black").append("duracion", "03:45").append("album", "Aftermath"),
                new Document("nombre", "Angie").append("duracion", "04:30").append("album", "Goats Head Soup"),
                new Document("nombre", "Start Me Up").append("duracion", "03:33").append("album", "Tattoo You"),
                // Canciones de Queen (Banda)
                new Document("nombre", "Bohemian Rhapsody").append("duracion", "05:55").append("album", "A Night at the Opera"),
                new Document("nombre", "We Are the Champions").append("duracion", "04:20").append("album", "News of the World"),
                new Document("nombre", "We Will Rock You").append("duracion", "02:02").append("album", "News of the World"),
                // Canciones de Linkin Park (Banda)
                new Document("nombre", "In the End").append("duracion", "03:36").append("album", "Hybrid Theory"),
                new Document("nombre", "Numb").append("duracion", "03:05").append("album", "Meteora"),
                new Document("nombre", "Crawling").append("duracion", "03:29").append("album", "Hybrid Theory"),
                // Canciones de Green Day (Banda)
                new Document("nombre", "Boulevard of Broken Dreams").append("duracion", "04:20").append("album", "American Idiot"),
                new Document("nombre", "Wake Me Up When September Ends").append("duracion", "04:45").append("album", "American Idiot"),
                new Document("nombre", "21 Guns").append("duracion", "05:21").append("album", "21st Century Breakdown"),
                // Canciones de U2 (Banda)
                new Document("nombre", "With or Without You").append("duracion", "04:56").append("album", "The Joshua Tree"),
                new Document("nombre", "I Still Haven't Found What I'm Looking For").append("duracion", "04:38").append("album", "The Joshua Tree"),
                new Document("nombre", "One").append("duracion", "04:36").append("album", "Achtung Baby"),
                // Canciones de Foo Fighters (Banda)
                new Document("nombre", "Everlong").append("duracion", "04:10").append("album", "The Colour and the Shape"),
                new Document("nombre", "The Pretender").append("duracion", "04:29").append("album", "Echoes, Silence, Patience & Grace"),
                new Document("nombre", "Best of You").append("duracion", "04:16").append("album", "In Your Honor"),
                // Canciones de The Killers (Banda)
                new Document("nombre", "Mr. Brightside").append("duracion", "03:42").append("album", "Hot Fuss"),
                new Document("nombre", "When You Were Young").append("duracion", "03:40").append("album", "Sam's Town"),
                new Document("nombre", "Human").append("duracion", "04:05").append("album", "Day & Age"),
                // Canciones de Red Hot Chili Peppers (Banda)
                new Document("nombre", "Californication").append("duracion", "05:21").append("album", "Californication"),
                new Document("nombre", "Under the Bridge").append("duracion", "04:24").append("album", "Blood Sugar Sex Magik"),
                new Document("nombre", "Give It Away").append("duracion", "04:43").append("album", "Blood Sugar Sex Magik"),
                // Canciones de AC/DC (Banda)
                new Document("nombre", "Back in Black").append("duracion", "04:15").append("album", "Back in Black"),
                new Document("nombre", "Highway to Hell").append("duracion", "03:28").append("album", "Highway to Hell"),
                new Document("nombre", "Thunderstruck").append("duracion", "04:30").append("album", "The Razors Edge"),
                // Canciones de Muse (Banda)
                new Document("nombre", "Starlight").append("duracion", "04:00").append("album", "Black Holes and Revelations"),
                new Document("nombre", "Supermassive Black Hole").append("duracion", "03:32").append("album", "Black Holes and Revelations"),
                new Document("nombre", "Uprising").append("duracion", "05:00").append("album", "The Resistance"),
                // Canciones de Arctic Monkeys (Banda)
                new Document("nombre", "Do I Wanna Know?").append("duracion", "04:32").append("album", "AM"),
                new Document("nombre", "I Bet You Look Good on the Dancefloor").append("duracion", "02:53").append("album", "Whatever People Say I Am, That's What I'm Not"),
                new Document("nombre", "R U Mine?").append("duracion", "04:30").append("album", "AM")
        );

        // Insertar las canciones en la base de datos
        collection.insertMany(canciones);
    }

}
