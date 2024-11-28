package BO;

import DTO.AlbumDTO;
import DTO.ArtistasDTO;
import DTO.CancionDTO;
import DTO.IntegranteDTO;
import Exceptions.ExceptionBO;
import IBO.IAlbumBO;
import IBO.IArranqueInicio;
import IBO.IArtistasBO;
import IBO.ICancionBO;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author equipo 2
 */
public class ArranqueInicioBO implements IArranqueInicio {

    IArtistasBO artistaBO = new ArtistaBO();
    ICancionBO cancionBO = new CancionBO();
    IAlbumBO albumBO = new AlbumBO();

    public void iniciar() {
        crearArtistas();
        crearCanciones();
        crearAlbums();
    }

    public void crearArtistas() {

        //Crear Solistas
        ArtistasDTO ArtistaSolista[] = new ArtistasDTO[45];

// Creación de 45 solistas
        ArtistaSolista[0] = new ArtistasDTO("Taylor Swift", "/ImagenesArtistas/Taylor.jpeg", "solista", "Pop");
        ArtistaSolista[1] = new ArtistasDTO("Ed Sheeran", "/ImagenesArtistas/Ed Cheran.jpeg", "solista", "Pop");
        ArtistaSolista[2] = new ArtistasDTO("Adele", "/ImagenesArtistas/Adele.jpeg", "solista", "Soul");
        ArtistaSolista[3] = new ArtistasDTO("Bruno Mars", "/ImagenesArtistas/BrunoMars.jpeg", "solista", "Funk");
        ArtistaSolista[4] = new ArtistasDTO("Billie Eilish", "/ImagenesArtistas/BillieEilish.jpeg", "solista", "Electropop");
        ArtistaSolista[5] = new ArtistasDTO("Shawn Mendes", "/ImagenesArtistas/Shawmendez.jpeg", "solista", "Pop");
        ArtistaSolista[6] = new ArtistasDTO("Lady Gaga", "/ImagenesArtistas/LadyGafa.jpeg", "solista", "Pop");
        ArtistaSolista[7] = new ArtistasDTO("Justin Bieber", "/ImagenesArtistas/JustinBEBEr.jpeg", "solista", "Pop");
        ArtistaSolista[8] = new ArtistasDTO("Rihanna", "/ImagenesArtistas/RHianna.jpeg", "solista", "R&B");
        ArtistaSolista[9] = new ArtistasDTO("Sam Smith", "/ImagenesArtistas/SamSmith.jpeg", "solista", "Soul");
        ArtistaSolista[10] = new ArtistasDTO("Ariana Grande", "/ImagenesArtistas/AriannaGrandre.jpeg", "solista", "Pop");
        ArtistaSolista[11] = new ArtistasDTO("Dua Lipa", "/ImagenesArtistas/DuaLipa.jpeg", "solista", "Pop");
        ArtistaSolista[12] = new ArtistasDTO("The Weeknd", "/ImagenesArtistas/TheWeekend.jpeg", "solista", "R&B");
        ArtistaSolista[13] = new ArtistasDTO("Harry Styles", "/ImagenesArtistas/Harrystyles.jpeg", "solista", "Pop");
        ArtistaSolista[14] = new ArtistasDTO("Selena Gomez", "/ImagenesArtistas/SelenaGomcez.jpeg", "solista", "Pop");
        ArtistaSolista[15] = new ArtistasDTO("Post Malone", "/ImagenesArtistas/PostMalone.jpeg", "solista", "Rap");
        ArtistaSolista[16] = new ArtistasDTO("Drake", "/ImagenesArtistas/Drake.jpeg", "solista", "Rap");
        ArtistaSolista[17] = new ArtistasDTO("Miley Cyrus", "/ImagenesArtistas/MileyCyrus.jpeg", "solista", "Pop");
        ArtistaSolista[18] = new ArtistasDTO("Katy Perry", "/ImagenesArtistas/KatyPerry.jpeg", "solista", "Pop");
        ArtistaSolista[19] = new ArtistasDTO("Beyoncé", "Beyonce", "solista", "R&B");
        ArtistaSolista[20] = new ArtistasDTO("Lana Del Rey", "/ImagenesArtistas/LanaDelrey.jpeg", "solista", "Indie");
        ArtistaSolista[21] = new ArtistasDTO("Halsey", "/ImagenesArtistas/Halsey.jpeg", "solista", "Electropop");
        ArtistaSolista[22] = new ArtistasDTO("Charlie Puth", "/ImagenesArtistas/charliePuth.jpeg", "solista", "Pop");
        ArtistaSolista[23] = new ArtistasDTO("Camila Cabello", "/ImagenesArtistas/CamilaCabello.jpeg", "solista", "Pop");
        ArtistaSolista[24] = new ArtistasDTO("Lil Nas X", "/ImagenesArtistas/LilNanX.jpeg", "solista", "Rap");
        ArtistaSolista[25] = new ArtistasDTO("Doja Cat", "/ImagenesArtistas/DojaCat.jpeg", "solista", "Rap");
        ArtistaSolista[26] = new ArtistasDTO("Lizzo", "/ImagenesArtistas/Lizzo.jpeg", "solista", "R&B");
        ArtistaSolista[27] = new ArtistasDTO("Shakira", "/ImagenesArtistas/Shakira.jpeg", "solista", "Pop");
        ArtistaSolista[28] = new ArtistasDTO("Jennifer Lopez", "/ImagenesArtistas/JenniferLopez.jpeg", "solista", "Pop");
        ArtistaSolista[29] = new ArtistasDTO("Nicki Minaj", "/ImagenesArtistas/NikyMinja.jpeg", "solista", "Rap");
        ArtistaSolista[30] = new ArtistasDTO("Kendrick Lamar", "/ImagenesArtistas/KendrickLamar.jpeg", "solista", "Rap");
        ArtistaSolista[31] = new ArtistasDTO("Sia", "/ImagenesArtistas/sia.jpeg", "solista", "Pop");
        ArtistaSolista[32] = new ArtistasDTO("John Legend", "/ImagenesArtistas/JohnLegend.jpeg", "solista", "R&B");
        ArtistaSolista[33] = new ArtistasDTO("Ellie Goulding", "/ImagenesArtistas/ElliGoulding.jpeg", "solista", "Electropop");
        ArtistaSolista[34] = new ArtistasDTO("Avril Lavigne", "/ImagenesArtistas/AvrilLavrag.jpeg", "solista", "Rock");
        ArtistaSolista[35] = new ArtistasDTO("Amy Winehouse", "/ImagenesArtistas/AmyWineHouse.jpeg", "solista", "Pop");
        ArtistaSolista[36] = new ArtistasDTO("Bad Bunny", "/ImagenesArtistas/BadBuny.jpeg", "solista", "Pop");
        ArtistaSolista[37] = new ArtistasDTO("ROSALIA", "/ImagenesArtistas/Rosalia.jpeg", "solista", "Flamenco-pop");
        ArtistaSolista[38] = new ArtistasDTO("Miguel Bose", "MiguelBose", "solista", "Pop");
        ArtistaSolista[39] = new ArtistasDTO("Cazzu", "/ImagenesArtistas/Cazzu.jpeg", "solista", "Pop");
        ArtistaSolista[40] = new ArtistasDTO("Natalia Lafourcade", "/ImagenesArtistas/NataliaLafor.jpeg", "solista", "Pop");
        ArtistaSolista[41] = new ArtistasDTO("Carla Morrison", "/ImagenesArtistas/CarlaMorrison.jpeg", "solista", "Pop");
        ArtistaSolista[42] = new ArtistasDTO("Angela Aguilar", "/ImagenesArtistas/AngelaAguilar.jpeg", "solista", "Regional");
        ArtistaSolista[43] = new ArtistasDTO("Jose Jose", "/ImagenesArtistas/JoseJose.jpeg", "solista", "Regional");
        ArtistaSolista[44] = new ArtistasDTO("Rosio Durcal", "/ImagenesArtistas/RocioDurcal.jpeg", "solista", "Romantica");

        //Insertar solistas
        for (int i = 0; i < 45; i++) {
            artistaBO.insertarArtista(ArtistaSolista[i]);

        }

        //Crear Grupos
        ArtistasDTO ListaArtistasGrupo[] = new ArtistasDTO[45];
        List<IntegranteDTO> ListaIntegrantes = new ArrayList<>();
        //Creacion manual de grupos
        // Grupo 1: The Beatles
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("John Lennon", "Vocalista", "/ImagenesArtistas/JohnLennon.jpeg", LocalDate.of(1960, 1, 1), LocalDate.of(1980, 12, 8), true));
        ListaIntegrantes.add(new IntegranteDTO("Paul McCartney", "Bajista", "/ImagenesArtistas/PaulMcCartney.jpeg", LocalDate.of(1960, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("George Harrison", "Guitarrista", "/ImagenesArtistas/GeorgeHarrison.jpeg", LocalDate.of(1960, 1, 1), LocalDate.of(2001, 11, 29), true));
        ListaIntegrantes.add(new IntegranteDTO("Ringo Starr", "Baterista", "/ImagenesArtistas/RingoStarr.jpeg", LocalDate.of(1962, 1, 1), null, true));
        ListaArtistasGrupo[0] = new ArtistasDTO("The Beatles", "/ImagenesArtistas/TheBeatles.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 2: The Rolling Stones
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Mick Jagger", "Vocalista", "/ImagenesArtistas/MickJagger.jpeg", LocalDate.of(1962, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Keith Richards", "Guitarrista", "/ImagenesArtistas/KeithRichards.jpeg", LocalDate.of(1962, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Charlie Watts", "Baterista", "/ImagenesArtistas/CharlieWatts.jpeg", LocalDate.of(1963, 1, 1), LocalDate.of(2021, 8, 24), true));
        ListaIntegrantes.add(new IntegranteDTO("Ronnie Wood", "Guitarrista", "/ImagenesArtistas/RonnieWood.jpeg", LocalDate.of(1975, 1, 1), null, true));
        ListaArtistasGrupo[1] = new ArtistasDTO("The Rolling Stones", "/ImagenesArtistas/TheRollingStones.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 3: Queen
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Freddie Mercury", "Vocalista", "/ImagenesArtistas/FreddieMercury.jpeg", LocalDate.of(1970, 1, 1), LocalDate.of(1991, 11, 24), true));
        ListaIntegrantes.add(new IntegranteDTO("Brian May", "Guitarrista", "/ImagenesArtistas/BrianMay.jpeg", LocalDate.of(1970, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("John Deacon", "Bajista", "/ImagenesArtistas/JohnDeacon.jpeg", LocalDate.of(1971, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Roger Taylor", "Baterista", "/ImagenesArtistas/RogerTaylor.jpeg", LocalDate.of(1970, 1, 1), null, true));
        ListaArtistasGrupo[2] = new ArtistasDTO("Queen", "/ImagenesArtistas/Queen.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 4: Pink Floyd
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("David Gilmour", "Guitarrista", "/ImagenesArtistas/DavidGilmour.jpeg", LocalDate.of(1968, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Roger Waters", "Bajista", "/ImagenesArtistas/RogerWaters.jpeg", LocalDate.of(1965, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Richard Wright", "Tecladista", "/ImagenesArtistas/RichardWright.jpeg", LocalDate.of(1965, 1, 1), LocalDate.of(2008, 9, 15), true));
        ListaIntegrantes.add(new IntegranteDTO("Nick Mason", "Baterista", "/ImagenesArtistas/NickMason.jpeg", LocalDate.of(1965, 1, 1), null, true));
        ListaArtistasGrupo[3] = new ArtistasDTO("Pink Floyd", "/ImagenesArtistas/PinkFloyd.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 5: Nirvana
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Kurt Cobain", "Vocalista", "/ImagenesArtistas/KurtCobain.jpeg", LocalDate.of(1987, 1, 1), LocalDate.of(1994, 4, 5), true));
        ListaIntegrantes.add(new IntegranteDTO("Krist Novoselic", "Bajista", "/ImagenesArtistas/KristNovoselic.jpeg", LocalDate.of(1987, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Dave Grohl", "Baterista", "/ImagenesArtistas/DaveGrohl.jpeg", LocalDate.of(1990, 1, 1), null, true));
        ListaArtistasGrupo[4] = new ArtistasDTO("Nirvana", "/ImagenesArtistas/Nirvana.jpeg", "Grupo", "Grunge", ListaIntegrantes);

        // Grupo 6: The Eagles
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Don Henley", "Vocalista", "/ImagenesArtistas/DonHenley.jpeg", LocalDate.of(1971, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Glenn Frey", "Guitarrista", "/ImagenesArtistas/GlennFrey.jpeg", LocalDate.of(1971, 1, 1), LocalDate.of(2016, 1, 18), true));
        ListaIntegrantes.add(new IntegranteDTO("Joe Walsh", "Guitarrista", "/ImagenesArtistas/JoeWalsh.jpeg", LocalDate.of(1975, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Timothy B. Schmit", "Bajista", "/ImagenesArtistas/TimothySchmit.jpeg", LocalDate.of(1977, 1, 1), null, true));
        ListaArtistasGrupo[5] = new ArtistasDTO("The Eagles", "/ImagenesArtistas/TheEagles.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 7: Metallica
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("James Hetfield", "Vocalista", "/ImagenesArtistas/JamesHetfield.jpeg", LocalDate.of(1981, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Kirk Hammett", "Guitarrista", "/ImagenesArtistas/KirkHammett.jpeg", LocalDate.of(1983, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Lars Ulrich", "Baterista", "/ImagenesArtistas/LarsUlrich.jpeg", LocalDate.of(1981, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Robert Trujillo", "Bajista", "/ImagenesArtistas/RobertTrujillo.jpeg", LocalDate.of(2003, 1, 1), null, true));
        ListaArtistasGrupo[6] = new ArtistasDTO("Metallica", "/ImagenesArtistas/Metallica.jpeg", "Grupo", "Metal", ListaIntegrantes);

        // Grupo 8: Led Zeppelin
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Robert Plant", "Vocalista", "/ImagenesArtistas/RobertPlant.jpeg", LocalDate.of(1968, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Jimmy Page", "Guitarrista", "/ImagenesArtistas/JimmyPage.jpeg", LocalDate.of(1968, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("John Paul Jones", "Bajista", "/ImagenesArtistas/JohnPaulJones.jpeg", LocalDate.of(1968, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("John Bonham", "Baterista", "/ImagenesArtistas/JohnBonham.jpeg", LocalDate.of(1968, 1, 1), LocalDate.of(1980, 9, 25), true));
        ListaArtistasGrupo[7] = new ArtistasDTO("Led Zeppelin", "/ImagenesArtistas/LedZeppelin.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 9: Coldplay
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Chris Martin", "Vocalista", "/ImagenesArtistas/ChrisMartin.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Jonny Buckland", "Guitarrista", "/ImagenesArtistas/JonnyBuckland.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Guy Berryman", "Bajista", "/ImagenesArtistas/GuyBerryman.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Will Champion", "Baterista", "/ImagenesArtistas/WillChampion.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaArtistasGrupo[8] = new ArtistasDTO("Coldplay", "/ImagenesArtistas/Coldplay.jpeg", "Grupo", "Pop Rock", ListaIntegrantes);

        // Grupo 10: Imagine Dragons
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Dan Reynolds", "Vocalista", "/ImagenesArtistas/DanReynolds.jpeg", LocalDate.of(2008, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Wayne Sermon", "Guitarrista", "/ImagenesArtistas/WayneSermon.jpeg", LocalDate.of(2009, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Ben McKee", "Bajista", "/ImagenesArtistas/BenMcKee.jpeg", LocalDate.of(2009, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Daniel Platzman", "Baterista", "/ImagenesArtistas/DanielPlatzman.jpeg", LocalDate.of(2011, 1, 1), null, true));
        ListaArtistasGrupo[9] = new ArtistasDTO("Imagine Dragons", "/ImagenesArtistas/ImagineDragons.jpeg", "Grupo", "Pop Rock", ListaIntegrantes);

        // Grupo 11: Maroon 5
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Adam Levine", "Vocalista", "/ImagenesArtistas/AdamLevine.jpeg", LocalDate.of(2001, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("James Valentine", "Guitarrista", "/ImagenesArtistas/JamesValentine.jpeg", LocalDate.of(2001, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Mickey Madden", "Bajista", "/ImagenesArtistas/MickeyMadden.jpeg", LocalDate.of(2001, 1, 1), LocalDate.of(2020, 1, 1), true));
        ListaIntegrantes.add(new IntegranteDTO("Matt Flynn", "Baterista", "/ImagenesArtistas/MattFlynn.jpeg", LocalDate.of(2006, 1, 1), null, true));
        ListaArtistasGrupo[10] = new ArtistasDTO("Maroon 5", "/ImagenesArtistas/Maroon5.jpeg", "Grupo", "Pop Rock", ListaIntegrantes);
        // Grupo 12: Queen
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Freddie Mercury", "Vocalista", "/ImagenesArtistas/FreddieMercury.jpeg", LocalDate.of(1970, 1, 1), LocalDate.of(1991, 11, 24), true));
        ListaIntegrantes.add(new IntegranteDTO("Brian May", "Guitarrista", "/ImagenesArtistas/BrianMay.jpeg", LocalDate.of(1970, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("John Deacon", "Bajista", "/ImagenesArtistas/JohnDeacon.jpeg", LocalDate.of(1971, 1, 1), LocalDate.of(1997, 1, 1), true));
        ListaIntegrantes.add(new IntegranteDTO("Roger Taylor", "Baterista", "/ImagenesArtistas/RogerTaylor.jpeg", LocalDate.of(1970, 1, 1), null, true));
        ListaArtistasGrupo[11] = new ArtistasDTO("Queen", "/ImagenesArtistas/Queen.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 13: The Rolling Stones
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Mick Jagger", "Vocalista", "/ImagenesArtistas/MickJagger.jpeg", LocalDate.of(1962, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Keith Richards", "Guitarrista", "/ImagenesArtistas/KeithRichards.jpeg", LocalDate.of(1962, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Charlie Watts", "Baterista", "/ImagenesArtistas/CharlieWatts.jpeg", LocalDate.of(1963, 1, 1), LocalDate.of(2021, 8, 24), true));
        ListaIntegrantes.add(new IntegranteDTO("Ronnie Wood", "Guitarrista", "/ImagenesArtistas/RonnieWood.jpeg", LocalDate.of(1975, 1, 1), null, true));
        ListaArtistasGrupo[12] = new ArtistasDTO("The Rolling Stones", "/ImagenesArtistas/TheRollingStones.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 14: Nirvana
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Kurt Cobain", "Vocalista", "/ImagenesArtistas/KurtCobain.jpeg", LocalDate.of(1987, 1, 1), LocalDate.of(1994, 4, 5), true));
        ListaIntegrantes.add(new IntegranteDTO("Krist Novoselic", "Bajista", "/ImagenesArtistas/KristNovoselic.jpeg", LocalDate.of(1987, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Dave Grohl", "Baterista", "/ImagenesArtistas/DaveGrohl.jpeg", LocalDate.of(1990, 1, 1), null, true));
        ListaArtistasGrupo[13] = new ArtistasDTO("Nirvana", "/ImagenesArtistas/Nirvana.jpeg", "Grupo", "Grunge", ListaIntegrantes);

        // Grupo 15: Pink Floyd
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("David Gilmour", "Guitarrista", "/ImagenesArtistas/DavidGilmour.jpeg", LocalDate.of(1967, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Roger Waters", "Bajista", "/ImagenesArtistas/RogerWaters.jpeg", LocalDate.of(1965, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Richard Wright", "Tecladista", "/ImagenesArtistas/RichardWright.jpeg", LocalDate.of(1965, 1, 1), LocalDate.of(2008, 9, 15), true));
        ListaIntegrantes.add(new IntegranteDTO("Nick Mason", "Baterista", "/ImagenesArtistas/NickMason.jpeg", LocalDate.of(1965, 1, 1), null, true));
        ListaArtistasGrupo[14] = new ArtistasDTO("Pink Floyd", "/ImagenesArtistas/PinkFloyd.jpeg", "Grupo", "Rock Progresivo", ListaIntegrantes);

        // Grupo 16: AC/DC
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Brian Johnson", "Vocalista", "/ImagenesArtistas/BrianJohnson.jpeg", LocalDate.of(1980, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Angus Young", "Guitarrista", "/ImagenesArtistas/AngusYoung.jpeg", LocalDate.of(1973, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Malcolm Young", "Guitarrista", "/ImagenesArtistas/MalcolmYoung.jpeg", LocalDate.of(1973, 1, 1), LocalDate.of(2017, 11, 18), true));
        ListaIntegrantes.add(new IntegranteDTO("Cliff Williams", "Bajista", "/ImagenesArtistas/CliffWilliams.jpeg", LocalDate.of(1977, 1, 1), null, true));
        ListaArtistasGrupo[15] = new ArtistasDTO("AC/DC", "/ImagenesArtistas/ACDC.jpeg", "Grupo", "Hard Rock", ListaIntegrantes);

        // Grupo 17: Guns N' Roses
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Axl Rose", "Vocalista", "/ImagenesArtistas/AxlRose.jpeg", LocalDate.of(1985, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Slash", "Guitarrista", "/ImagenesArtistas/Slash.jpeg", LocalDate.of(1985, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Duff McKagan", "Bajista", "/ImagenesArtistas/DuffMcKagan.jpeg", LocalDate.of(1985, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Steven Adler", "Baterista", "/ImagenesArtistas/StevenAdler.jpeg", LocalDate.of(1985, 1, 1), LocalDate.of(1990, 1, 1), true));
        ListaArtistasGrupo[16] = new ArtistasDTO("Guns N' Roses", "/ImagenesArtistas/GunsNRoses.jpeg", "Grupo", "Hard Rock", ListaIntegrantes);

        // Grupo 18: U2
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Bono", "Vocalista", "/ImagenesArtistas/Bono.jpeg", LocalDate.of(1976, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("The Edge", "Guitarrista", "/ImagenesArtistas/TheEdge.jpeg", LocalDate.of(1976, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Adam Clayton", "Bajista", "/ImagenesArtistas/AdamClayton.jpeg", LocalDate.of(1976, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Larry Mullen Jr.", "Baterista", "/ImagenesArtistas/LarryMullenJr.jpeg", LocalDate.of(1976, 1, 1), null, true));
        ListaArtistasGrupo[17] = new ArtistasDTO("U2", "/ImagenesArtistas/U2.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 19: The Beatles
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("John Lennon", "Vocalista", "/ImagenesArtistas/JohnLennon.jpeg", LocalDate.of(1960, 1, 1), LocalDate.of(1980, 12, 8), true));
        ListaIntegrantes.add(new IntegranteDTO("Paul McCartney", "Bajista", "/ImagenesArtistas/PaulMcCartney.jpeg", LocalDate.of(1960, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("George Harrison", "Guitarrista", "/ImagenesArtistas/GeorgeHarrison.jpeg", LocalDate.of(1960, 1, 1), LocalDate.of(2001, 11, 29), true));
        ListaIntegrantes.add(new IntegranteDTO("Ringo Starr", "Baterista", "/ImagenesArtistas/RingoStarr.jpeg", LocalDate.of(1962, 1, 1), null, true));
        ListaArtistasGrupo[18] = new ArtistasDTO("The Beatles", "/ImagenesArtistas/TheBeatles.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 20: The Who
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Roger Daltrey", "Vocalista", "/ImagenesArtistas/RogerDaltrey.jpeg", LocalDate.of(1964, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Pete Townshend", "Guitarrista", "/ImagenesArtistas/PeteTownshend.jpeg", LocalDate.of(1964, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("John Entwistle", "Bajista", "/ImagenesArtistas/JohnEntwistle.jpeg", LocalDate.of(1964, 1, 1), LocalDate.of(2002, 6, 27), true));
        ListaIntegrantes.add(new IntegranteDTO("Keith Moon", "Baterista", "/ImagenesArtistas/KeithMoon.jpeg", LocalDate.of(1964, 1, 1), LocalDate.of(1978, 9, 7), true));
        ListaArtistasGrupo[19] = new ArtistasDTO("The Who", "/ImagenesArtistas/TheWho.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 21: Linkin Park
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Chester Bennington", "Vocalista", "/ImagenesArtistas/ChesterBennington.jpeg", LocalDate.of(1999, 1, 1), LocalDate.of(2017, 7, 20), true));
        ListaIntegrantes.add(new IntegranteDTO("Mike Shinoda", "Vocalista", "/ImagenesArtistas/MikeShinoda.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Brad Delson", "Guitarrista", "/ImagenesArtistas/BradDelson.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Rob Bourdon", "Baterista", "/ImagenesArtistas/RobBourdon.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaArtistasGrupo[20] = new ArtistasDTO("Linkin Park", "/ImagenesArtistas/LinkinPark.jpeg", "Grupo", "Nu Metal", ListaIntegrantes);

        // Grupo 22: Metallica
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("James Hetfield", "Vocalista", "/ImagenesArtistas/JamesHetfield.jpeg", LocalDate.of(1981, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Kirk Hammett", "Guitarrista", "/ImagenesArtistas/KirkHammett.jpeg", LocalDate.of(1983, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Lars Ulrich", "Baterista", "/ImagenesArtistas/LarsUlrich.jpeg", LocalDate.of(1981, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Robert Trujillo", "Bajista", "/ImagenesArtistas/RobertTrujillo.jpeg", LocalDate.of(2003, 1, 1), null, true));
        ListaArtistasGrupo[21] = new ArtistasDTO("Metallica", "/ImagenesArtistas/Metallica.jpeg", "Grupo", "Metal", ListaIntegrantes);

        // Grupo 23: Red Hot Chili Peppers
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Anthony Kiedis", "Vocalista", "/ImagenesArtistas/AnthonyKiedis.jpeg", LocalDate.of(1983, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Flea", "Bajista", "/ImagenesArtistas/Flea.jpeg", LocalDate.of(1983, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Chad Smith", "Baterista", "/ImagenesArtistas/ChadSmith.jpeg", LocalDate.of(1988, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("John Frusciante", "Guitarrista", "/ImagenesArtistas/JohnFrusciante.jpeg", LocalDate.of(1988, 1, 1), null, true));
        ListaArtistasGrupo[22] = new ArtistasDTO("Red Hot Chili Peppers", "/ImagenesArtistas/RHCP.jpeg", "Grupo", "Funk Rock", ListaIntegrantes);

        // Grupo 24: Coldplay
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Chris Martin", "Vocalista", "/ImagenesArtistas/ChrisMartin.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Jonny Buckland", "Guitarrista", "/ImagenesArtistas/JonnyBuckland.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Guy Berryman", "Bajista", "/ImagenesArtistas/GuyBerryman.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Will Champion", "Baterista", "/ImagenesArtistas/WillChampion.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaArtistasGrupo[23] = new ArtistasDTO("Coldplay", "/ImagenesArtistas/Coldplay.jpeg", "Grupo", "Rock Alternativo", ListaIntegrantes);

        // Grupo 25: Green Day
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Billie Joe Armstrong", "Vocalista", "/ImagenesArtistas/BillieJoeArmstrong.jpeg", LocalDate.of(1987, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Mike Dirnt", "Bajista", "/ImagenesArtistas/MikeDirnt.jpeg", LocalDate.of(1987, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Tré Cool", "Baterista", "/ImagenesArtistas/TreCool.jpeg", LocalDate.of(1990, 1, 1), null, true));
        ListaArtistasGrupo[24] = new ArtistasDTO("Green Day", "/ImagenesArtistas/GreenDay.jpeg", "Grupo", "Punk Rock", ListaIntegrantes);

        // Grupo 26: Pearl Jam
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Eddie Vedder", "Vocalista", "/ImagenesArtistas/EddieVedder.jpeg", LocalDate.of(1990, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Mike McCready", "Guitarrista", "/ImagenesArtistas/MikeMcCready.jpeg", LocalDate.of(1990, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Stone Gossard", "Guitarrista", "/ImagenesArtistas/StoneGossard.jpeg", LocalDate.of(1990, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Jeff Ament", "Bajista", "/ImagenesArtistas/JeffAment.jpeg", LocalDate.of(1990, 1, 1), null, true));
        ListaArtistasGrupo[25] = new ArtistasDTO("Pearl Jam", "/ImagenesArtistas/PearlJam.jpeg", "Grupo", "Grunge", ListaIntegrantes);

        // Grupo 27: Nirvana
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Kurt Cobain", "Vocalista", "/ImagenesArtistas/KurtCobain.jpeg", LocalDate.of(1987, 1, 1), LocalDate.of(1994, 4, 5), true));
        ListaIntegrantes.add(new IntegranteDTO("Krist Novoselic", "Bajista", "/ImagenesArtistas/KristNovoselic.jpeg", LocalDate.of(1987, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Dave Grohl", "Baterista", "/ImagenesArtistas/DaveGrohl.jpeg", LocalDate.of(1990, 1, 1), null, true));
        ListaArtistasGrupo[26] = new ArtistasDTO("Nirvana", "/ImagenesArtistas/Nirvana.jpeg", "Grupo", "Grunge", ListaIntegrantes);

        // Grupo 28: The Rolling Stones
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Mick Jagger", "Vocalista", "/ImagenesArtistas/MickJagger.jpeg", LocalDate.of(1962, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Keith Richards", "Guitarrista", "/ImagenesArtistas/KeithRichards.jpeg", LocalDate.of(1962, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Charlie Watts", "Baterista", "/ImagenesArtistas/CharlieWatts.jpeg", LocalDate.of(1963, 1, 1), LocalDate.of(2021, 8, 24), true));
        ListaIntegrantes.add(new IntegranteDTO("Ronnie Wood", "Guitarrista", "/ImagenesArtistas/RonnieWood.jpeg", LocalDate.of(1975, 1, 1), null, true));
        ListaArtistasGrupo[27] = new ArtistasDTO("The Rolling Stones", "/ImagenesArtistas/RollingStones.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 29: Queen
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Freddie Mercury", "Vocalista", "/ImagenesArtistas/FreddieMercury.jpeg", LocalDate.of(1970, 1, 1), LocalDate.of(1991, 11, 24), true));
        ListaIntegrantes.add(new IntegranteDTO("Brian May", "Guitarrista", "/ImagenesArtistas/BrianMay.jpeg", LocalDate.of(1970, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Roger Taylor", "Baterista", "/ImagenesArtistas/RogerTaylor.jpeg", LocalDate.of(1970, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("John Deacon", "Bajista", "/ImagenesArtistas/JohnDeacon.jpeg", LocalDate.of(1970, 1, 1), LocalDate.of(1997, 1, 1), true));
        ListaArtistasGrupo[28] = new ArtistasDTO("Queen", "/ImagenesArtistas/Queen.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 30: Foo Fighters
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Dave Grohl", "Vocalista", "/ImagenesArtistas/DaveGrohl_FF.jpeg", LocalDate.of(1994, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Nate Mendel", "Bajista", "/ImagenesArtistas/NateMendel.jpeg", LocalDate.of(1995, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Pat Smear", "Guitarrista", "/ImagenesArtistas/PatSmear.jpeg", LocalDate.of(1995, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Taylor Hawkins", "Baterista", "/ImagenesArtistas/TaylorHawkins.jpeg", LocalDate.of(1997, 1, 1), LocalDate.of(2022, 3, 25), true));
        ListaArtistasGrupo[29] = new ArtistasDTO("Foo Fighters", "/ImagenesArtistas/FooFighters.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 31: The Clash
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Joe Strummer", "Vocalista", "/ImagenesArtistas/JoeStrummer.jpeg", LocalDate.of(1976, 1, 1), LocalDate.of(2002, 12, 22), true));
        ListaIntegrantes.add(new IntegranteDTO("Mick Jones", "Guitarrista", "/ImagenesArtistas/MickJones.jpeg", LocalDate.of(1976, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Paul Simonon", "Bajista", "/ImagenesArtistas/PaulSimonon.jpeg", LocalDate.of(1976, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Topper Headon", "Baterista", "/ImagenesArtistas/TopperHeadon.jpeg", LocalDate.of(1977, 1, 1), LocalDate.of(1982, 1, 1), true));
        ListaArtistasGrupo[30] = new ArtistasDTO("The Clash", "/ImagenesArtistas/TheClash.jpeg", "Grupo", "Punk Rock", ListaIntegrantes);

        // Grupo 32: Linkin Park
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Chester Bennington", "Vocalista", "/ImagenesArtistas/ChesterBennington.jpeg", LocalDate.of(1999, 1, 1), LocalDate.of(2017, 7, 20), true));
        ListaIntegrantes.add(new IntegranteDTO("Mike Shinoda", "Vocalista/Guitarrista", "/ImagenesArtistas/MikeShinoda.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Brad Delson", "Guitarrista", "/ImagenesArtistas/BradDelson.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Dave Farrell", "Bajista", "/ImagenesArtistas/DaveFarrell.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Rob Bourdon", "Baterista", "/ImagenesArtistas/RobBourdon.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaArtistasGrupo[31] = new ArtistasDTO("Linkin Park", "/ImagenesArtistas/LinkinPark.jpeg", "Grupo", "Nu Metal", ListaIntegrantes);

        // Grupo 33: Guns N' Roses
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Axl Rose", "Vocalista", "/ImagenesArtistas/AxlRose.jpeg", LocalDate.of(1985, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Slash", "Guitarrista", "/ImagenesArtistas/Slash.jpeg", LocalDate.of(1985, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Duff McKagan", "Bajista", "/ImagenesArtistas/DuffMcKagan.jpeg", LocalDate.of(1985, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Steven Adler", "Baterista", "/ImagenesArtistas/StevenAdler.jpeg", LocalDate.of(1985, 1, 1), LocalDate.of(1990, 1, 1), true));
        ListaArtistasGrupo[32] = new ArtistasDTO("Guns N' Roses", "/ImagenesArtistas/GunsNRoses.jpeg", "Grupo", "Hard Rock", ListaIntegrantes);

        // Grupo 34: The Police
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Sting", "Vocalista/Bajista", "/ImagenesArtistas/Sting.jpeg", LocalDate.of(1977, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Andy Summers", "Guitarrista", "/ImagenesArtistas/AndySummers.jpeg", LocalDate.of(1977, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Stewart Copeland", "Baterista", "/ImagenesArtistas/StewartCopeland.jpeg", LocalDate.of(1977, 1, 1), null, true));
        ListaArtistasGrupo[33] = new ArtistasDTO("The Police", "/ImagenesArtistas/ThePolice.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 35: Imagine Dragons
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Dan Reynolds", "Vocalista", "/ImagenesArtistas/DanReynolds.jpeg", LocalDate.of(2008, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Wayne Sermon", "Guitarrista", "/ImagenesArtistas/WayneSermon.jpeg", LocalDate.of(2009, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Ben McKee", "Bajista", "/ImagenesArtistas/BenMcKee.jpeg", LocalDate.of(2009, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Daniel Platzman", "Baterista", "/ImagenesArtistas/DanielPlatzman.jpeg", LocalDate.of(2011, 1, 1), null, true));
        ListaArtistasGrupo[34] = new ArtistasDTO("Imagine Dragons", "/ImagenesArtistas/ImagineDragons.jpeg", "Grupo", "Pop Rock", ListaIntegrantes);

        // Grupo 36: Arctic Monkeys
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Alex Turner", "Vocalista/Guitarrista", "/ImagenesArtistas/AlexTurner.jpeg", LocalDate.of(2002, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Jamie Cook", "Guitarrista", "/ImagenesArtistas/JamieCook.jpeg", LocalDate.of(2002, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Nick O'Malley", "Bajista", "/ImagenesArtistas/NickOMalley.jpeg", LocalDate.of(2006, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Matt Helders", "Baterista", "/ImagenesArtistas/MattHelders.jpeg", LocalDate.of(2002, 1, 1), null, true));
        ListaArtistasGrupo[35] = new ArtistasDTO("Arctic Monkeys", "/ImagenesArtistas/ArcticMonkeys.jpeg", "Grupo", "Indie Rock", ListaIntegrantes);

        // Grupo 37: Muse
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Matt Bellamy", "Vocalista/Guitarrista", "/ImagenesArtistas/MattBellamy.jpeg", LocalDate.of(1994, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Chris Wolstenholme", "Bajista", "/ImagenesArtistas/ChrisWolstenholme.jpeg", LocalDate.of(1994, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Dominic Howard", "Baterista", "/ImagenesArtistas/DominicHoward.jpeg", LocalDate.of(1994, 1, 1), null, true));
        ListaArtistasGrupo[36] = new ArtistasDTO("Muse", "/ImagenesArtistas/Muse.jpeg", "Grupo", "Rock Alternativo", ListaIntegrantes);

        // Grupo 38: Coldplay
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Chris Martin", "Vocalista", "/ImagenesArtistas/ChrisMartin.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Jonny Buckland", "Guitarrista", "/ImagenesArtistas/JonnyBuckland.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Guy Berryman", "Bajista", "/ImagenesArtistas/GuyBerryman.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Will Champion", "Baterista", "/ImagenesArtistas/WillChampion.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaArtistasGrupo[37] = new ArtistasDTO("Coldplay", "/ImagenesArtistas/Coldplay.jpeg", "Grupo", "Rock Alternativo", ListaIntegrantes);

        // Grupo 39: Twenty One Pilots
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Tyler Joseph", "Vocalista", "/ImagenesArtistas/TylerJoseph.jpeg", LocalDate.of(2009, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Josh Dun", "Baterista", "/ImagenesArtistas/JoshDun.jpeg", LocalDate.of(2011, 1, 1), null, true));
        ListaArtistasGrupo[38] = new ArtistasDTO("Twenty One Pilots", "/ImagenesArtistas/TwentyOnePilots.jpeg", "Grupo", "Electropop", ListaIntegrantes);

        // Grupo 40: Paramore
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Hayley Williams", "Vocalista", "/ImagenesArtistas/HayleyWilliams.jpeg", LocalDate.of(2004, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Taylor York", "Guitarrista", "/ImagenesArtistas/TaylorYork.jpeg", LocalDate.of(2007, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Zac Farro", "Baterista", "/ImagenesArtistas/ZacFarro.jpeg", LocalDate.of(2004, 1, 1), null, true));
        ListaArtistasGrupo[39] = new ArtistasDTO("Paramore", "/ImagenesArtistas/Paramore.jpeg", "Grupo", "Pop Punk", ListaIntegrantes);

        // Grupo 41: Maroon 5
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Adam Levine", "Vocalista", "/ImagenesArtistas/AdamLevine.jpeg", LocalDate.of(1994, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("James Valentine", "Guitarrista", "/ImagenesArtistas/JamesValentine.jpeg", LocalDate.of(2001, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Mickey Madden", "Bajista", "/ImagenesArtistas/MickeyMadden.jpeg", LocalDate.of(1994, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Matt Flynn", "Baterista", "/ImagenesArtistas/MattFlynn.jpeg", LocalDate.of(2006, 1, 1), null, true));
        ListaArtistasGrupo[40] = new ArtistasDTO("Maroon 5", "/ImagenesArtistas/Maroon5.jpeg", "Grupo", "Pop Rock", ListaIntegrantes);

        // Grupo 42: Red Hot Chili Peppers
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Anthony Kiedis", "Vocalista", "/ImagenesArtistas/AnthonyKiedis.jpeg", LocalDate.of(1983, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Flea", "Bajista", "/ImagenesArtistas/Flea.jpeg", LocalDate.of(1983, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Chad Smith", "Baterista", "/ImagenesArtistas/ChadSmith.jpeg", LocalDate.of(1988, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("John Frusciante", "Guitarrista", "/ImagenesArtistas/JohnFrusciante.jpeg", LocalDate.of(1988, 1, 1), LocalDate.of(1992, 1, 1), true));
        ListaArtistasGrupo[41] = new ArtistasDTO("Red Hot Chili Peppers", "/ImagenesArtistas/RedHotChiliPeppers.jpeg", "Grupo", "Funk Rock", ListaIntegrantes);

        // Grupo 43: Green Day
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Billie Joe Armstrong", "Vocalista/Guitarrista", "/ImagenesArtistas/BillieJoeArmstrong.jpeg", LocalDate.of(1987, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Mike Dirnt", "Bajista", "/ImagenesArtistas/MikeDirnt.jpeg", LocalDate.of(1987, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Tré Cool", "Baterista", "/ImagenesArtistas/TreCool.jpeg", LocalDate.of(1990, 1, 1), null, true));
        ListaArtistasGrupo[42] = new ArtistasDTO("Green Day", "/ImagenesArtistas/GreenDay.jpeg", "Grupo", "Punk Rock", ListaIntegrantes);

        // Grupo 44: My Chemical Romance
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Gerard Way", "Vocalista", "/ImagenesArtistas/GerardWay.jpeg", LocalDate.of(2001, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Ray Toro", "Guitarrista", "/ImagenesArtistas/RayToro.jpeg", LocalDate.of(2001, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Frank Iero", "Guitarrista", "/ImagenesArtistas/FrankIero.jpeg", LocalDate.of(2001, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Mikey Way", "Bajista", "/ImagenesArtistas/MikeyWay.jpeg", LocalDate.of(2001, 1, 1), null, true));
        ListaArtistasGrupo[43] = new ArtistasDTO("My Chemical Romance", "/ImagenesArtistas/MyChemicalRomance.jpeg", "Grupo", "Emo Rock", ListaIntegrantes);

        // Grupo 45: Pearl Jam
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Eddie Vedder", "Vocalista", "/ImagenesArtistas/EddieVedder.jpeg", LocalDate.of(1990, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Stone Gossard", "Guitarrista", "/ImagenesArtistas/StoneGossard.jpeg", LocalDate.of(1990, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Jeff Ament", "Bajista", "/ImagenesArtistas/JeffAment.jpeg", LocalDate.of(1990, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Mike McCready", "Guitarrista", "/ImagenesArtistas/MikeMcCready.jpeg", LocalDate.of(1990, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Matt Cameron", "Baterista", "/ImagenesArtistas/MattCameron.jpeg", LocalDate.of(1998, 1, 1), null, true));
        ListaArtistasGrupo[44] = new ArtistasDTO("Pearl Jam", "/ImagenesArtistas/PearlJam.jpeg", "Grupo", "Grunge", ListaIntegrantes);

        //Insertar grupos
        for (int i = 0; i < 45; i++) {
            artistaBO.insertarArtista(ListaArtistasGrupo[i]);

        }
    }

    public void crearCanciones() {
        try {
            List<CancionDTO> canciones = List.of(
                    // Canciones de Taylor Swift
                    new CancionDTO("Love Story", "3:55"),
                    new CancionDTO("You Belong With Me", "3:52"),
                    new CancionDTO("Fearless", "4:01"),
                    new CancionDTO("Shake It Off", "3:39"),
                    new CancionDTO("Blank Space", "3:51"),
                    new CancionDTO("Style", "3:51"),
                    // Canciones de Ed Sheeran
                    new CancionDTO("Shape of You", "3:53"),
                    new CancionDTO("Castle on the Hill", "4:21"),
                    new CancionDTO("Perfect", "4:23"),
                    new CancionDTO("Thinking Out Loud", "4:41"),
                    new CancionDTO("Photograph", "4:18"),
                    new CancionDTO("Sing", "3:55"),
                    // Canciones de Adele
                    new CancionDTO("Hello", "4:55"),
                    new CancionDTO("When We Were Young", "4:51"),
                    new CancionDTO("Water Under the Bridge", "4:00"),
                    new CancionDTO("Rolling in the Deep", "3:48"),
                    new CancionDTO("Someone Like You", "4:45"),
                    new CancionDTO("Set Fire to the Rain", "4:02"),
                    // Canciones de Bruno Mars
                    new CancionDTO("Just the Way You Are", "3:40"),
                    new CancionDTO("Grenade", "3:42"),
                    new CancionDTO("The Lazy Song", "3:10"),
                    new CancionDTO("Uptown Funk", "4:30"),
                    new CancionDTO("24K Magic", "3:46"),
                    new CancionDTO("Versace on the Floor", "4:21"),
                    // Canciones de Billie Eilish
                    new CancionDTO("Bad Guy", "3:14"),
                    new CancionDTO("When the Party's Over", "3:16"),
                    new CancionDTO("Bury a Friend", "3:13"),
                    new CancionDTO("Ocean Eyes", "3:20"),
                    new CancionDTO("Bellyache", "2:59"),
                    new CancionDTO("Copycat", "3:14"),
                    // Canciones de Shawn Mendes
                    new CancionDTO("Stitches", "3:27"),
                    new CancionDTO("Life of the Party", "3:34"),
                    new CancionDTO("Never Be Alone", "3:36"),
                    new CancionDTO("Treat You Better", "3:08"),
                    new CancionDTO("Mercy", "3:28"),
                    new CancionDTO("There's Nothing Holdin' Me Back", "3:19"),
                    // Canciones de Lady Gaga
                    new CancionDTO("Bad Romance", "4:54"),
                    new CancionDTO("Alejandro", "4:34"),
                    new CancionDTO("Telephone", "3:40"),
                    new CancionDTO("Poker Face", "3:57"),
                    new CancionDTO("Just Dance", "4:01"),
                    new CancionDTO("LoveGame", "3:36"),
                    // Canciones de Justin Bieber
                    new CancionDTO("Sorry", "3:20"),
                    new CancionDTO("What Do You Mean?", "3:25"),
                    new CancionDTO("Love Yourself", "3:54"),
                    new CancionDTO("Baby", "3:36"),
                    new CancionDTO("One Time", "3:35"),
                    new CancionDTO("One Less Lonely Girl", "3:48"),
                    // Canciones de Rihanna
                    new CancionDTO("Umbrella", "4:36"),
                    new CancionDTO("Don't Stop the Music", "4:27"),
                    new CancionDTO("Take a Bow", "3:49"),
                    new CancionDTO("Diamonds", "3:45"),
                    new CancionDTO("Stay", "4:00"),
                    new CancionDTO("Work", "3:39"),
                    // Canciones de Sam Smith
                    new CancionDTO("Stay With Me", "2:52"),
                    new CancionDTO("I'm Not the Only One", "3:59"),
                    new CancionDTO("Like I Can", "2:47"),
                    new CancionDTO("Too Good at Goodbyes", "3:21"),
                    new CancionDTO("Pray", "3:41"),
                    new CancionDTO("Burning", "3:23"),
                    // Canciones de Ariana Grande
                    new CancionDTO("Thank U, Next", "3:27"),
                    new CancionDTO("7 Rings", "2:58"),
                    new CancionDTO("Break Up with Your Girlfriend, I'm Bored", "3:10"),
                    new CancionDTO("Side to Side", "3:46"),
                    new CancionDTO("Dangerous Woman", "3:55"),
                    new CancionDTO("Into You", "4:04"),
                    // Canciones de Dua Lipa
                    new CancionDTO("Don't Start Now", "3:03"),
                    new CancionDTO("Physical", "3:14"),
                    new CancionDTO("Levitating", "3:23"),
                    new CancionDTO("New Rules", "3:29"),
                    new CancionDTO("IDGAF", "3:37"),
                    new CancionDTO("One Kiss", "3:34"),
                    // Canciones de The Weeknd
                    new CancionDTO("Blinding Lights", "3:20"),
                    new CancionDTO("Heartless", "3:18"),
                    new CancionDTO("Save Your Tears", "3:36"),
                    new CancionDTO("Can't Feel My Face", "3:35"),
                    new CancionDTO("The Hills", "4:02"),
                    new CancionDTO("In the Night", "3:55"),
                    // Canciones de Harry Styles
                    new CancionDTO("Watermelon Sugar", "2:54"),
                    new CancionDTO("Adore You", "3:27"),
                    new CancionDTO("Falling", "4:00"),
                    new CancionDTO("Sign of the Times", "5:40"),
                    new CancionDTO("Sweet Creature", "3:44"),
                    new CancionDTO("Kiwi", "2:56"),
                    // Canciones de Selena Gomez
                    new CancionDTO("Lose You to Love Me", "3:27"),
                    new CancionDTO("Look At Her Now", "2:44"),
                    new CancionDTO("Rare", "3:40"),
                    new CancionDTO("Bad Liar", "3:34"),
                    new CancionDTO("Fetish", "3:06"),
                    new CancionDTO("Wolves", "3:17"),
                    // Canciones de Post Malone
                    new CancionDTO("Rockstar", "3:38"),
                    new CancionDTO("Psycho", "3:41"),
                    new CancionDTO("Better Now", "3:52"),
                    new CancionDTO("Circles", "3:35"),
                    new CancionDTO("Wow.", "2:29"),
                    new CancionDTO("Goodbyes", "2:55"),
                    // Canciones de Drake
                    new CancionDTO("Hotline Bling", "4:27"),
                    new CancionDTO("One Dance", "2:54"),
                    new CancionDTO("Controlla", "4:06"),
                    new CancionDTO("God's Plan", "3:18"),
                    new CancionDTO("In My Feelings", "3:37"),
                    new CancionDTO("Nice For What", "3:30"),
                    // Canciones de Miley Cyrus
                    new CancionDTO("Wrecking Ball", "3:41"),
                    new CancionDTO("Adore You", "4:38"),
                    new CancionDTO("We Can't Stop", "3:52"),
                    new CancionDTO("Party in the U.S.A.", "3:22"),
                    new CancionDTO("The Climb", "3:55"),
                    new CancionDTO("Malibu", "3:51"),
                    // Canciones de Katy Perry
                    new CancionDTO("Roar", "3:42"),
                    new CancionDTO("Dark Horse", "3:35"),
                    new CancionDTO("Unconditionally", "3:48"),
                    new CancionDTO("Teenage Dream", "3:47"),
                    new CancionDTO("Firework", "3:48"),
                    new CancionDTO("California Gurls", "3:56"),
                    // Canciones de Beyoncé
                    new CancionDTO("Halo", "4:21"),
                    new CancionDTO("Single Ladies", "3:13"),
                    new CancionDTO("If I Were a Boy", "4:10"),
                    new CancionDTO("Formation", "3:26"),
                    new CancionDTO("Sorry", "3:52"),
                    new CancionDTO("Hold Up", "3:41"),
                    // Canciones de Lana Del Rey
                    new CancionDTO("Summertime Sadness", "4:25"),
                    new CancionDTO("Young and Beautiful", "3:56"),
                    new CancionDTO("West Coast", "4:17"),
                    new CancionDTO("Video Games", "4:42"),
                    new CancionDTO("Blue Jeans", "3:31"),
                    new CancionDTO("Born to Die", "4:46"),
                    // Canciones de Halsey
                    new CancionDTO("Without Me", "3:21"),
                    new CancionDTO("Graveyard", "3:01"),
                    new CancionDTO("You Should Be Sad", "3:25"),
                    new CancionDTO("Bad at Love", "3:01"),
                    new CancionDTO("Now or Never", "3:34"),
                    new CancionDTO("Colors", "4:09"),
                    // Canciones de Charlie Puth
                    new CancionDTO("Attention", "3:31"),
                    new CancionDTO("How Long", "3:18"),
                    new CancionDTO("Done for Me", "3:00"),
                    new CancionDTO("See You Again", "3:49"),
                    new CancionDTO("We Don't Talk Anymore", "3:37"),
                    new CancionDTO("One Call Away", "3:14"),
                    // Canciones de Camila Cabello
                    new CancionDTO("Havana", "3:37"),
                    new CancionDTO("Never Be the Same", "3:47"),
                    new CancionDTO("She Loves Control", "2:57"),
                    new CancionDTO("Señorita", "3:11"),
                    new CancionDTO("Liar", "3:29"),
                    new CancionDTO("Shameless", "3:39"),
                    // Canciones de Lil Nas X
                    new CancionDTO("Old Town Road", "2:37"),
                    new CancionDTO("Panini", "1:55"),
                    new CancionDTO("Rodeo", "2:38"),
                    new CancionDTO("Montero (Call Me By Your Name)", "2:18"),
                    new CancionDTO("Industry Baby", "3:32"),
                    new CancionDTO("That's What I Want", "2:23"),
                    // Canciones de Doja Cat
                    new CancionDTO("Say So", "3:57"),
                    new CancionDTO("Streets", "2:53"),
                    new CancionDTO("Boss Bitch", "2:14"),
                    new CancionDTO("Juicy", "3:18"),
                    new CancionDTO("Tia Tamera", "3:31"),
                    new CancionDTO("Mooo!", "4:46"),
                    // Canciones de Lizzo
                    new CancionDTO("Truth Hurts", "2:53"),
                    new CancionDTO("Good as Hell", "2:39"),
                    new CancionDTO("Tempo", "2:55"),
                    new CancionDTO("Juice", "3:15"),
                    new CancionDTO("Like a Girl", "3:05"),
                    new CancionDTO("Cuz I Love You", "2:58"),
                    // Canciones de Shakira
                    new CancionDTO("Hips Don't Lie", "3:38"),
                    new CancionDTO("La Tortura", "3:33"),
                    new CancionDTO("Don't Bother", "4:17"),
                    new CancionDTO("Waka Waka (This Time for Africa)", "3:22"),
                    new CancionDTO("Loca", "3:03"),
                    new CancionDTO("Rabiosa", "2:50"),
                    // Canciones de Jennifer Lopez
                    new CancionDTO("On The Floor", "4:44"),
                    new CancionDTO("Papi", "3:40"),
                    new CancionDTO("Dance Again", "3:57"),
                    new CancionDTO("Ain't Your Mama", "3:38"),
                    new CancionDTO("El Anillo", "2:53"),
                    new CancionDTO("Dinero", "3:25"),
                    // Canciones de Nicki Minaj
                    new CancionDTO("Super Bass", "3:20"),
                    new CancionDTO("Moment 4 Life", "4:39"),
                    new CancionDTO("Fly", "3:30"),
                    new CancionDTO("Starships", "3:30"),
                    new CancionDTO("Pound the Alarm", "3:25"),
                    new CancionDTO("Beez in the Trap", "4:28"),
                    // Canciones de Kendrick Lamar
                    new CancionDTO("HUMBLE.", "2:57"),
                    new CancionDTO("DNA.", "3:06"),
                    new CancionDTO("LOYALTY.", "3:48"),
                    new CancionDTO("Alright", "3:39"),
                    new CancionDTO("King Kunta", "3:54"),
                    new CancionDTO("The Blacker the Berry", "5:28"),
                    // Canciones de Sia
                    new CancionDTO("Chandelier", "3:36"),
                    new CancionDTO("Elastic Heart", "4:17"),
                    new CancionDTO("Big Girls Cry", "3:31"),
                    new CancionDTO("Cheap Thrills", "3:31"),
                    new CancionDTO("The Greatest", "3:30"),
                    new CancionDTO("Alive", "4:23"),
                    // Canciones de John Legend
                    new CancionDTO("All of Me", "4:29"),
                    new CancionDTO("You & I (Nobody in the World)", "4:12"),
                    new CancionDTO("Made to Love", "4:00"),
                    new CancionDTO("Ordinary People", "4:41"),
                    new CancionDTO("So High", "5:00"),
                    new CancionDTO("Used to Love U", "3:31"),
                    // Canciones de Ellie Goulding
                    new CancionDTO("Love Me Like You Do", "4:12"),
                    new CancionDTO("On My Mind", "3:33"),
                    new CancionDTO("Something in the Way You Move", "3:47"),
                    new CancionDTO("Lights", "3:30"),
                    new CancionDTO("Starry Eyed", "2:57"),
                    new CancionDTO("Guns and Horses", "3:35"),
                    // Canciones de Avril Lavigne
                    new CancionDTO("Complicated", "4:05"),
                    new CancionDTO("Sk8er Boi", "3:24"),
                    new CancionDTO("I'm with You", "3:44"),
                    new CancionDTO("Girlfriend", "3:37"),
                    new CancionDTO("When You're Gone", "4:00"),
                    new CancionDTO("Hot", "3:23"),
                    // Canciones de Amy Winehouse
                    new CancionDTO("Rehab", "3:35"),
                    new CancionDTO("You Know I'm No Good", "4:17"),
                    new CancionDTO("Back to Black", "4:01"),
                    new CancionDTO("Valerie", "3:53"),
                    new CancionDTO("Tears Dry on Their Own", "3:06"),
                    new CancionDTO("Love Is a Losing Game", "2:35"),
                    // Canciones de Bad Bunny
                    new CancionDTO("MIA", "3:31"),
                    new CancionDTO("Estamos Bien", "3:29"),
                    new CancionDTO("Ni Bien Ni Mal", "4:15"),
                    new CancionDTO("Safaera", "4:55"),
                    new CancionDTO("Yo Perreo Sola", "2:52"),
                    new CancionDTO("Vete", "3:13"),
                    // Canciones de ROSALÍA
                    new CancionDTO("Malamente", "2:48"),
                    new CancionDTO("Pienso en tu mirá", "3:13"),
                    new CancionDTO("Di mi nombre", "2:42"),
                    new CancionDTO("Con Altura", "2:42"),
                    new CancionDTO("Yo x Ti, Tu x Mi", "3:26"),
                    new CancionDTO("Juro Que", "2:39"),
                    // Canciones de Miguel Bosé
                    new CancionDTO("Amante Bandido", "4:25"),
                    new CancionDTO("Nena", "3:43"),
                    new CancionDTO("Salamandra", "3:18"),
                    new CancionDTO("Morena Mía", "4:01"),
                    new CancionDTO("Si Tú No Vuelves", "4:47"),
                    new CancionDTO("Te Amaré", "4:28"),
                    // Canciones de Cazzu
                    new CancionDTO("Nada", "3:20"),
                    new CancionDTO("Mucha Data", "3:24"),
                    new CancionDTO("Mentiste", "3:18"),
                    new CancionDTO("Visto a las 00:00", "2:47"),
                    new CancionDTO("Bounce", "3:02"),
                    new CancionDTO("Me Prefieres A Mi", "2:52"),
                    // Canciones de Natalia Lafourcade
                    new CancionDTO("Hasta la Raíz", "3:41"),
                    new CancionDTO("Lo Que Construimos", "4:11"),
                    new CancionDTO("Nunca es Suficiente", "3:56"),
                    new CancionDTO("Tú Sí Sabes Quererme", "3:34"),
                    new CancionDTO("Danza de Gardenias", "3:20"),
                    new CancionDTO("Soledad y el Mar", "3:45"),
                    new CancionDTO("Mexicana Hermosa", "3:23"),
                    // Canciones de Carla Morrison
                    new CancionDTO("Disfruto", "4:41"),
                    new CancionDTO("Hasta la Piel", "3:53"),
                    new CancionDTO("Déjenme Llorar", "4:15"),
                    new CancionDTO("Eres Tú", "3:35"),
                    new CancionDTO("Te Regalo", "4:08"),
                    new CancionDTO("Azúcar Morena", "3:23"),
                    // Canciones de Ángela Aguilar
                    new CancionDTO("La Llorona", "3:44"),
                    new CancionDTO("Bésame Mucho", "4:11"),
                    new CancionDTO("Paloma Negra", "4:03"),
                    new CancionDTO("Dime Cómo Quieres", "3:13"),
                    new CancionDTO("En Realidad", "3:12"),
                    new CancionDTO("Ahí Donde Me Ven", "3:14"),
                    // Canciones de José José
                    new CancionDTO("El Triste", "4:03"),
                    new CancionDTO("La Nave del Olvido", "3:24"),
                    new CancionDTO("Amar y Querer", "3:15"),
                    new CancionDTO("Gavilán o Paloma", "3:24"),
                    new CancionDTO("Volcán", "3:30"),
                    new CancionDTO("Lo Pasado, Pasado", "3:17"),
                    // Canciones de Rocío Dúrcal
                    new CancionDTO("Amor Eterno", "5:05"),
                    new CancionDTO("Costumbres", "4:05"),
                    new CancionDTO("La Gata Bajo la Lluvia", "3:42"),
                    new CancionDTO("Como Tu Mujer", "3:54"),
                    new CancionDTO("Tarde", "3:57"),
                    new CancionDTO("Jamás Te Prometí un Jardín de Rosas", "3:00"),
                    // Canciones de The Beatles
                    new CancionDTO("Come Together", "4:20"),
                    new CancionDTO("Something", "3:03"),
                    new CancionDTO("Here Comes the Sun", "3:05"),
                    new CancionDTO("Lucy in the Sky with Diamonds", "3:28"),
                    new CancionDTO("A Day in the Life", "5:38"),
                    new CancionDTO("Sgt. Pepper's Lonely Hearts Club Band", "2:02"),
                    // Canciones de The Rolling Stones
                    new CancionDTO("Tumbling Dice", "3:45"),
                    new CancionDTO("Rocks Off", "4:32"),
                    new CancionDTO("Happy", "3:04"),
                    new CancionDTO("Brown Sugar", "3:49"),
                    new CancionDTO("Wild Horses", "5:43"),
                    new CancionDTO("Can't You Hear Me Knocking", "7:15"),
                    // Canciones de Queen
                    new CancionDTO("Bohemian Rhapsody", "5:55"),
                    new CancionDTO("Somebody to Love", "4:56"),
                    new CancionDTO("You're My Best Friend", "2:52"),
                    new CancionDTO("We Will Rock You", "2:02"),
                    new CancionDTO("We Are the Champions", "3:00"),
                    new CancionDTO("Don't Stop Me Now", "3:29"),
                    // Canciones de Pink Floyd
                    new CancionDTO("Time", "6:53"),
                    new CancionDTO("Money", "6:22"),
                    new CancionDTO("Us and Them", "7:49"),
                    new CancionDTO("Another Brick in the Wall (Part 2)", "3:59"),
                    new CancionDTO("Comfortably Numb", "6:22"),
                    new CancionDTO("Hey You", "4:41"),
                    // Canciones de Nirvana
                    new CancionDTO("Smells Like Teen Spirit", "5:01"),
                    new CancionDTO("Come as You Are", "3:38"),
                    new CancionDTO("Lithium", "4:17"),
                    new CancionDTO("Heart-Shaped Box", "4:41"),
                    new CancionDTO("Rape Me", "2:49"),
                    new CancionDTO("All Apologies", "3:52"),
                    // Canciones de The Eagles
                    new CancionDTO("Hotel California", "6:30"),
                    new CancionDTO("New Kid in Town", "5:03"),
                    new CancionDTO("Life in the Fast Lane", "4:46"),
                    new CancionDTO("Tequila Sunrise", "2:52"),
                    new CancionDTO("Desperado", "3:33"),
                    new CancionDTO("Doolin' Dalton", "3:26"),
                    // Canciones de Metallica
                    new CancionDTO("Battery", "5:12"),
                    new CancionDTO("Welcome Home (Sanitarium)", "6:27"),
                    new CancionDTO("Master of Puppets", "8:35"),
                    new CancionDTO("For Whom the Bell Tolls", "5:10"),
                    new CancionDTO("Fade to Black", "6:57"),
                    new CancionDTO("One", "7:24"),
                    // Canciones de Led Zeppelin
                    new CancionDTO("Stairway to Heaven", "8:02"),
                    new CancionDTO("Black Dog", "4:55"),
                    new CancionDTO("Rock and Roll", "3:41"),
                    new CancionDTO("Kashmir", "8:31"),
                    new CancionDTO("Trampled Under Foot", "5:35"),
                    new CancionDTO("Houses of the Holy", "4:01"),
                    // Canciones de Coldplay
                    new CancionDTO("Clocks", "5:07"),
                    new CancionDTO("The Scientist", "5:09"),
                    new CancionDTO("In My Place", "3:48"),
                    new CancionDTO("Viva la Vida", "4:02"),
                    new CancionDTO("Yellow", "4:29"),
                    new CancionDTO("Fix You", "4:55"),
                    // Canciones de Imagine Dragons
                    new CancionDTO("Radioactive", "3:07"),
                    new CancionDTO("Demons", "2:57"),
                    new CancionDTO("It's Time", "4:00"),
                    new CancionDTO("Believer", "3:24"),
                    new CancionDTO("Thunder", "3:07"),
                    new CancionDTO("Whatever It Takes", "3:21")
            );

            for (CancionDTO cancion : canciones) {
                cancionBO.insertarCancion(cancion);
            }
        } catch (ExceptionBO ex) {
            Logger.getLogger(ArranqueInicioBO.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void crearAlbums() {
        List<String> listaCanciones = new ArrayList<>();
        try {
            // Álbumes de Taylor Swift
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Love Story"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("You Belong With Me"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Fearless"));
            AlbumDTO album1 = new AlbumDTO("Fearless", LocalDate.of(2008, Month.NOVEMBER, 11), "Pop", "/ImagenesAlbumes/Fearless.jpeg", artistaBO.obtenerIdPorNombre("Taylor Swift"), listaCanciones);
            albumBO.insertarAlbum(album1);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Shake It Off"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Blank Space"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Style"));
            AlbumDTO album2 = new AlbumDTO("1989", LocalDate.of(2014, Month.OCTOBER, 27), "Pop", "/ImagenesAlbumes/1989.jpeg", artistaBO.obtenerIdPorNombre("Taylor Swift"), listaCanciones);
            albumBO.insertarAlbum(album2);

            // Álbumes de Ed Sheeran
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Shape of You"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Castle on the Hill"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Perfect"));
            AlbumDTO album3 = new AlbumDTO("÷ (Divide)", LocalDate.of(2017, Month.MARCH, 3), "Pop", "/ImagenesAlbumes/Divide.jpeg", artistaBO.obtenerIdPorNombre("Ed Sheeran"), listaCanciones);
            albumBO.insertarAlbum(album3);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Thinking Out Loud"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Photograph"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Sing"));
            AlbumDTO album4 = new AlbumDTO("x (Multiply)", LocalDate.of(2014, Month.JUNE, 23), "Pop", "/ImagenesAlbumes/Multiply.jpeg", artistaBO.obtenerIdPorNombre("Ed Sheeran"), listaCanciones);
            albumBO.insertarAlbum(album4);

            // Álbumes de Adele
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Hello"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("When We Were Young"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Water Under the Bridge"));
            AlbumDTO album5 = new AlbumDTO("25", LocalDate.of(2015, Month.NOVEMBER, 20), "Pop", "/ImagenesAlbumes/25.jpeg", artistaBO.obtenerIdPorNombre("Adele"), listaCanciones);
            albumBO.insertarAlbum(album5);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Rolling in the Deep"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Someone Like You"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Set Fire to the Rain"));
            AlbumDTO album6 = new AlbumDTO("21", LocalDate.of(2011, Month.JANUARY, 24), "Pop", "/ImagenesAlbumes/21.jpeg", artistaBO.obtenerIdPorNombre("Adele"), listaCanciones);
            albumBO.insertarAlbum(album6);

            // Álbumes de Bruno Mars
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Just the Way You Are"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Grenade"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("The Lazy Song"));
            AlbumDTO album7 = new AlbumDTO("Doo-Wops & Hooligans", LocalDate.of(2010, Month.OCTOBER, 5), "Pop", "/ImagenesAlbumes/DooWopsHooligans.jpeg", artistaBO.obtenerIdPorNombre("Bruno Mars"), listaCanciones);
            albumBO.insertarAlbum(album7);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Uptown Funk"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("24K Magic"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Versace on the Floor"));
            AlbumDTO album8 = new AlbumDTO("24K Magic", LocalDate.of(2016, Month.NOVEMBER, 18), "Pop", "/ImagenesAlbumes/24KMagic.jpeg", artistaBO.obtenerIdPorNombre("Bruno Mars"), listaCanciones);
            albumBO.insertarAlbum(album8);

            // Álbumes de Billie Eilish
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Bad Guy"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("When the Party's Over"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Bury a Friend"));
            AlbumDTO album9 = new AlbumDTO("When We All Fall Asleep, Where Do We Go?", LocalDate.of(2019, Month.MARCH, 29), "Pop", "/ImagenesAlbumes/WhenWeAllFallAsleep.jpeg", artistaBO.obtenerIdPorNombre("Billie Eilish"), listaCanciones);
            albumBO.insertarAlbum(album9);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Ocean Eyes"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Bellyache"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Copycat"));
            AlbumDTO album10 = new AlbumDTO("Don't Smile at Me", LocalDate.of(2017, Month.AUGUST, 11), "Pop", "/ImagenesAlbumes/DontSmileAtMe.jpeg", artistaBO.obtenerIdPorNombre("Billie Eilish"), listaCanciones);
            albumBO.insertarAlbum(album10);

            // Álbumes de Shawn Mendes
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Stitches"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Life of the Party"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Never Be Alone"));
            AlbumDTO album11 = new AlbumDTO("Handwritten", LocalDate.of(2015, Month.APRIL, 14), "Pop", "/ImagenesAlbumes/Handwritten.jpeg", artistaBO.obtenerIdPorNombre("Shawn Mendes"), listaCanciones);
            albumBO.insertarAlbum(album11);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Treat You Better"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Mercy"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("There's Nothing Holdin' Me Back"));
            AlbumDTO album12 = new AlbumDTO("Illuminate", LocalDate.of(2016, Month.SEPTEMBER, 23), "Pop", "/ImagenesAlbumes/Illuminate.jpeg", artistaBO.obtenerIdPorNombre("Shawn Mendes"), listaCanciones);
            albumBO.insertarAlbum(album12);

            // Álbumes de Lady Gaga
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Bad Romance"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Alejandro"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Telephone"));
            AlbumDTO album13 = new AlbumDTO("The Fame Monster", LocalDate.of(2009, Month.NOVEMBER, 18), "Pop", "/ImagenesAlbumes/TheFameMonster.jpeg", artistaBO.obtenerIdPorNombre("Lady Gaga"), listaCanciones);
            albumBO.insertarAlbum(album13);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Poker Face"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Just Dance"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("LoveGame"));
            AlbumDTO album14 = new AlbumDTO("The Fame", LocalDate.of(2008, Month.AUGUST, 19), "Pop", "/ImagenesAlbumes/TheFame.jpeg", artistaBO.obtenerIdPorNombre("Lady Gaga"), listaCanciones);
            albumBO.insertarAlbum(album14);

            // Álbumes de Justin Bieber
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Sorry"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("What Do You Mean?"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Love Yourself"));
            AlbumDTO album15 = new AlbumDTO("Purpose", LocalDate.of(2015, Month.NOVEMBER, 13), "Pop", "/ImagenesAlbumes/Purpose.jpeg", artistaBO.obtenerIdPorNombre("Justin Bieber"), listaCanciones);
            albumBO.insertarAlbum(album15);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Baby"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("One Time"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("One Less Lonely Girl"));
            AlbumDTO album16 = new AlbumDTO("My World 2.0", LocalDate.of(2010, Month.MARCH, 19), "Pop", "/ImagenesAlbumes/MyWorld2.jpeg", artistaBO.obtenerIdPorNombre("Justin Bieber"), listaCanciones);
            albumBO.insertarAlbum(album16);
            // Álbumes de Rihanna 
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Umbrella"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Don't Stop the Music"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Take a Bow"));
            AlbumDTO album17 = new AlbumDTO("Good Girl Gone Bad", LocalDate.of(2007, Month.MAY, 30), "Pop", "/ImagenesAlbumes/GoodGirlGoneBad.jpeg", artistaBO.obtenerIdPorNombre("Rihanna"), listaCanciones);
            albumBO.insertarAlbum(album17);
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Diamonds"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Stay"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Work"));
            AlbumDTO album18 = new AlbumDTO("Unapologetic", LocalDate.of(2012, Month.NOVEMBER, 19), "Pop", "/ImagenesAlbumes/Unapologetic.jpeg", artistaBO.obtenerIdPorNombre("Rihanna"), listaCanciones);
            albumBO.insertarAlbum(album18);
// Álbumes de Sam Smith
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Stay With Me"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("I'm Not the Only One"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Like I Can"));
            AlbumDTO album19 = new AlbumDTO("In the Lonely Hour", LocalDate.of(2014, Month.MAY, 26), "Pop", "/ImagenesAlbumes/InTheLonelyHour.jpeg", artistaBO.obtenerIdPorNombre("Sam Smith"), listaCanciones);
            albumBO.insertarAlbum(album19);
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Too Good at Goodbyes"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Pray"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Burning"));
            AlbumDTO album20 = new AlbumDTO("The Thrill of It All", LocalDate.of(2017, Month.NOVEMBER, 3), "Pop", "/ImagenesAlbumes/TheThrillOfItAll.jpeg", artistaBO.obtenerIdPorNombre("Sam Smith"), listaCanciones);
            albumBO.insertarAlbum(album20);
// Álbumes de Ariana Grande
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Thank U, Next"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("7 Rings"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Break Up with Your Girlfriend, I'm Bored"));
            AlbumDTO album21 = new AlbumDTO("Thank U, Next", LocalDate.of(2019, Month.FEBRUARY, 8), "Pop", "/ImagenesAlbumes/ThankUNext.jpeg", artistaBO.obtenerIdPorNombre("Ariana Grande"), listaCanciones);
            albumBO.insertarAlbum(album21);
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Side to Side"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Dangerous Woman"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Into You"));
            AlbumDTO album22 = new AlbumDTO("Dangerous Woman", LocalDate.of(2016, Month.MAY, 20), "Pop", "/ImagenesAlbumes/DangerousWoman.jpeg", artistaBO.obtenerIdPorNombre("Ariana Grande"), listaCanciones);
            albumBO.insertarAlbum(album22);
// Álbumes de Dua Lipa 
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Don't Start Now"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Physical"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Levitating"));
            AlbumDTO album23 = new AlbumDTO("Future Nostalgia", LocalDate.of(2020, Month.MARCH, 27), "Pop", "/ImagenesAlbumes/FutureNostalgia.jpeg", artistaBO.obtenerIdPorNombre("Dua Lipa"), listaCanciones);
            albumBO.insertarAlbum(album23);
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("New Rules"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("IDGAF"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("One Kiss"));
            AlbumDTO album24 = new AlbumDTO("Dua Lipa", LocalDate.of(2017, Month.JUNE, 2), "Pop", "/ImagenesAlbumes/DuaLipa.jpeg", artistaBO.obtenerIdPorNombre("Dua Lipa"), listaCanciones);
            albumBO.insertarAlbum(album24);
// Álbumes de The Weeknd
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Blinding Lights"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Heartless"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Save Your Tears"));
            AlbumDTO album25 = new AlbumDTO("After Hours", LocalDate.of(2020, Month.MARCH, 20), "Pop", "/ImagenesAlbumes/AfterHours.jpeg", artistaBO.obtenerIdPorNombre("The Weeknd"), listaCanciones);
            albumBO.insertarAlbum(album25);
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Can't Feel My Face"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("The Hills"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("In the Night"));
            AlbumDTO album26 = new AlbumDTO("Beauty Behind the Madness", LocalDate.of(2015, Month.AUGUST, 28), "Pop", "/ImagenesAlbumes/BeautyBehindTheMadness.jpeg", artistaBO.obtenerIdPorNombre("The Weeknd"), listaCanciones);
            albumBO.insertarAlbum(album26);
// Álbumes de Harry Styles 
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Watermelon Sugar"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Adore You"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Falling"));
            AlbumDTO album27 = new AlbumDTO("Fine Line", LocalDate.of(2019, Month.DECEMBER, 13), "Pop", "/ImagenesAlbumes/FineLine.jpeg", artistaBO.obtenerIdPorNombre("Harry Styles"), listaCanciones);
            albumBO.insertarAlbum(album27);
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Sign of the Times"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Sweet Creature"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Kiwi"));
            AlbumDTO album28 = new AlbumDTO("Harry Styles", LocalDate.of(2017, Month.MAY, 12), "Pop", "/ImagenesAlbumes/HarryStyles.jpeg", artistaBO.obtenerIdPorNombre("Harry Styles"), listaCanciones);
            albumBO.insertarAlbum(album28);
// Álbumes de Selena Gomez
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Lose You to Love Me"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Look At Her Now"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Rare"));
            AlbumDTO album29 = new AlbumDTO("Rare", LocalDate.of(2020, Month.JANUARY, 10), "Pop", "/ImagenesAlbumes/Rare.jpeg", artistaBO.obtenerIdPorNombre("Selena Gomez"), listaCanciones);
            albumBO.insertarAlbum(album29);
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Bad Liar"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Fetish"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Wolves"));
            AlbumDTO album30 = new AlbumDTO("Revival", LocalDate.of(2015, Month.OCTOBER, 9), "Pop", "/ImagenesAlbumes/Revival.jpeg", artistaBO.obtenerIdPorNombre("Selena Gomez"), listaCanciones);
            albumBO.insertarAlbum(album30);
// Álbumes de Post Malone 
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Rockstar"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Psycho"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Better Now"));
            AlbumDTO album31 = new AlbumDTO("Beerbongs & Bentleys", LocalDate.of(2018, Month.APRIL, 27), "Rap", "/ImagenesAlbumes/BeerbongsBentleys.jpeg", artistaBO.obtenerIdPorNombre("Post Malone"), listaCanciones);
            albumBO.insertarAlbum(album31);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Circles"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Wow."));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Goodbyes"));
            AlbumDTO album32 = new AlbumDTO("Hollywood's Bleeding", LocalDate.of(2019, Month.SEPTEMBER, 6), "Rap", "/ImagenesAlbumes/HollywoodsBleeding.jpeg", artistaBO.obtenerIdPorNombre("Post Malone"), listaCanciones);
            albumBO.insertarAlbum(album32);

            // Álbumes de Drake
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Hotline Bling"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("One Dance"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Controlla"));
            AlbumDTO album33 = new AlbumDTO("Views", LocalDate.of(2016, Month.APRIL, 29), "Rap", "/ImagenesAlbumes/Views.jpeg", artistaBO.obtenerIdPorNombre("Drake"), listaCanciones);
            albumBO.insertarAlbum(album33);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("God's Plan"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("In My Feelings"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Nice For What"));
            AlbumDTO album34 = new AlbumDTO("Scorpion", LocalDate.of(2018, Month.JUNE, 29), "Rap", "/ImagenesAlbumes/Scorpion.jpeg", artistaBO.obtenerIdPorNombre("Drake"), listaCanciones);
            albumBO.insertarAlbum(album34);

            // Álbumes de Miley Cyrus
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Wrecking Ball"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Adore You"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("We Can't Stop"));
            AlbumDTO album35 = new AlbumDTO("Bangerz", LocalDate.of(2013, Month.OCTOBER, 4), "Pop", "/ImagenesAlbumes/Bangerz.jpeg", artistaBO.obtenerIdPorNombre("Miley Cyrus"), listaCanciones);
            albumBO.insertarAlbum(album35);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Party in the U.S.A."));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("The Climb"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Malibu"));
            AlbumDTO album36 = new AlbumDTO("Younger Now", LocalDate.of(2017, Month.SEPTEMBER, 29), "Pop", "/ImagenesAlbumes/YoungerNow.jpeg", artistaBO.obtenerIdPorNombre("Miley Cyrus"), listaCanciones);
            albumBO.insertarAlbum(album36);

            // Álbumes de Katy Perry
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Roar"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Dark Horse"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Unconditionally"));
            AlbumDTO album37 = new AlbumDTO("Prism", LocalDate.of(2013, Month.OCTOBER, 18), "Pop", "/ImagenesAlbumes/Prism.jpeg", artistaBO.obtenerIdPorNombre("Katy Perry"), listaCanciones);
            albumBO.insertarAlbum(album37);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Teenage Dream"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Firework"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("California Gurls"));
            AlbumDTO album38 = new AlbumDTO("Teenage Dream", LocalDate.of(2010, Month.AUGUST, 24), "Pop", "/ImagenesAlbumes/TeenageDream.jpeg", artistaBO.obtenerIdPorNombre("Katy Perry"), listaCanciones);
            albumBO.insertarAlbum(album38);

            // Álbumes de Beyoncé
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Halo"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Single Ladies"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("If I Were a Boy"));
            AlbumDTO album39 = new AlbumDTO("I Am... Sasha Fierce", LocalDate.of(2008, Month.NOVEMBER, 18), "R&B", "/ImagenesAlbumes/IAmSashaFierce.jpeg", artistaBO.obtenerIdPorNombre("Beyoncé"), listaCanciones);
            albumBO.insertarAlbum(album39);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Formation"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Sorry"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Hold Up"));
            AlbumDTO album40 = new AlbumDTO("Lemonade", LocalDate.of(2016, Month.APRIL, 23), "R&B", "/ImagenesAlbumes/Lemonade.jpeg", artistaBO.obtenerIdPorNombre("Beyoncé"), listaCanciones);
            albumBO.insertarAlbum(album40);

            // Álbumes de Lana Del Rey
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Summertime Sadness"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Video Games"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Blue Jeans"));
            AlbumDTO album41 = new AlbumDTO("Born to Die", LocalDate.of(2012, Month.JANUARY, 27), "Indie", "/ImagenesAlbumes/BornToDie.jpeg", artistaBO.obtenerIdPorNombre("Lana Del Rey"), listaCanciones);
            albumBO.insertarAlbum(album41);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Young and Beautiful"));
            AlbumDTO album42 = new AlbumDTO("The Great Gatsby Soundtrack", LocalDate.of(2013, Month.MAY, 6), "Indie", "/ImagenesAlbumes/TheGreatGatsby.jpeg", artistaBO.obtenerIdPorNombre("Lana Del Rey"), listaCanciones);
            albumBO.insertarAlbum(album42);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("West Coast"));
            AlbumDTO album43 = new AlbumDTO("Ultraviolence", LocalDate.of(2014, Month.JUNE, 13), "Indie", "/ImagenesAlbumes/Ultraviolence.jpeg", artistaBO.obtenerIdPorNombre("Lana Del Rey"), listaCanciones);
            albumBO.insertarAlbum(album43);

            // Álbumes de Halsey
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Without Me"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Graveyard"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("You Should Be Sad"));
            AlbumDTO album44 = new AlbumDTO("Manic", LocalDate.of(2020, Month.JANUARY, 17), "Pop", "/ImagenesAlbumes/Manic.jpeg", artistaBO.obtenerIdPorNombre("Halsey"), listaCanciones);
            albumBO.insertarAlbum(album44);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Bad at Love"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Now or Never"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Colors"));
            AlbumDTO album45 = new AlbumDTO("Hopeless Fountain Kingdom", LocalDate.of(2017, Month.JUNE, 2), "Pop", "/ImagenesAlbumes/HopelessFountainKingdom.jpeg", artistaBO.obtenerIdPorNombre("Halsey"), listaCanciones);
            albumBO.insertarAlbum(album45);

            // Álbumes de Charlie Puth
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Attention"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("How Long"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Done for Me"));
            AlbumDTO album46 = new AlbumDTO("Voicenotes", LocalDate.of(2018, Month.MAY, 11), "Pop", "/ImagenesAlbumes/Voicenotes.jpeg", artistaBO.obtenerIdPorNombre("Charlie Puth"), listaCanciones);
            albumBO.insertarAlbum(album46);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("See You Again"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("We Don't Talk Anymore"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("One Call Away"));
            AlbumDTO album47 = new AlbumDTO("Nine Track Mind", LocalDate.of(2016, Month.JANUARY, 29), "Pop", "/ImagenesAlbumes/NineTrackMind.jpeg", artistaBO.obtenerIdPorNombre("Charlie Puth"), listaCanciones);
            albumBO.insertarAlbum(album47);

            // Álbumes de Camila Cabello
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Havana"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Never Be the Same"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("She Loves Control"));
            AlbumDTO album48 = new AlbumDTO("Camila", LocalDate.of(2018, Month.JANUARY, 12), "Pop", "/ImagenesAlbumes/Camila.jpeg", artistaBO.obtenerIdPorNombre("Camila Cabello"), listaCanciones);
            albumBO.insertarAlbum(album48);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Señorita"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Liar"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Shameless"));
            AlbumDTO album49 = new AlbumDTO("Romance", LocalDate.of(2019, Month.DECEMBER, 6), "Pop", "/ImagenesAlbumes/Romance.jpeg", artistaBO.obtenerIdPorNombre("Camila Cabello"), listaCanciones);
            albumBO.insertarAlbum(album49);

            // Álbumes de Lil Nas X
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Old Town Road"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Panini"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Rodeo"));
            AlbumDTO album50 = new AlbumDTO("7 EP", LocalDate.of(2019, Month.JUNE, 21), "Rap", "/ImagenesAlbumes/7EP.jpeg", artistaBO.obtenerIdPorNombre("Lil Nas X"), listaCanciones);
            albumBO.insertarAlbum(album50);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Montero (Call Me By Your Name)"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Industry Baby"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("That's What I Want"));
            AlbumDTO album51 = new AlbumDTO("Montero", LocalDate.of(2021, Month.SEPTEMBER, 17), "Rap", "/ImagenesAlbumes/Montero.jpeg", artistaBO.obtenerIdPorNombre("Lil Nas X"), listaCanciones);
            albumBO.insertarAlbum(album51);

            // Álbumes de Doja Cat
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Say So"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Streets"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Boss Bitch"));
            AlbumDTO album52 = new AlbumDTO("Hot Pink", LocalDate.of(2019, Month.NOVEMBER, 7), "Rap", "/ImagenesAlbumes/HotPink.jpeg", artistaBO.obtenerIdPorNombre("Doja Cat"), listaCanciones);
            albumBO.insertarAlbum(album52);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Juicy"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Tia Tamera"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Mooo!"));
            AlbumDTO album53 = new AlbumDTO("Amala", LocalDate.of(2018, Month.MARCH, 30), "Rap", "/ImagenesAlbumes/Amala.jpeg", artistaBO.obtenerIdPorNombre("Doja Cat"), listaCanciones);
            albumBO.insertarAlbum(album53);

            // Álbumes de Lizzo
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Truth Hurts"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Tempo"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Juice"));
            AlbumDTO album54 = new AlbumDTO("Cuz I Love You", LocalDate.of(2019, Month.APRIL, 19), "R&B", "/ImagenesAlbumes/CuzILoveYou.jpeg", artistaBO.obtenerIdPorNombre("Lizzo"), listaCanciones);
            albumBO.insertarAlbum(album54);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Good as Hell"));
            AlbumDTO album55 = new AlbumDTO("Coconut Oil", LocalDate.of(2016, Month.OCTOBER, 7), "R&B", "/ImagenesAlbumes/CoconutOil.jpeg", artistaBO.obtenerIdPorNombre("Lizzo"), listaCanciones);
            albumBO.insertarAlbum(album55);

            // Álbumes de Shakira
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Hips Don't Lie"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Don't Bother"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("La Tortura"));
            AlbumDTO album56 = new AlbumDTO("Oral Fixation, Vol. 2", LocalDate.of(2005, Month.NOVEMBER, 28), "Pop", "/ImagenesAlbumes/OralFixation2.jpeg", artistaBO.obtenerIdPorNombre("Shakira"), listaCanciones);
            albumBO.insertarAlbum(album56);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Waka Waka (This Time for Africa)"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Loca"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Rabiosa"));
            AlbumDTO album57 = new AlbumDTO("Sale el Sol", LocalDate.of(2010, Month.OCTOBER, 19), "Pop", "/ImagenesAlbumes/SaleElSol.jpeg", artistaBO.obtenerIdPorNombre("Shakira"), listaCanciones);
            albumBO.insertarAlbum(album57);

            // Álbumes de Jennifer Lopez
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("On The Floor"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Papi"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Dance Again"));
            AlbumDTO album58 = new AlbumDTO("Love?", LocalDate.of(2011, Month.APRIL, 29), "Pop", "/ImagenesAlbumes/Love.jpeg", artistaBO.obtenerIdPorNombre("Jennifer Lopez"), listaCanciones);
            albumBO.insertarAlbum(album58);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Ain't Your Mama"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("El Anillo"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Dinero"));
            AlbumDTO album59 = new AlbumDTO("A.K.A.", LocalDate.of(2014, Month.JUNE, 13), "Pop", "/ImagenesAlbumes/AKA.jpeg", artistaBO.obtenerIdPorNombre("Jennifer Lopez"), listaCanciones);
            albumBO.insertarAlbum(album59);

            // Álbumes de Nicki Minaj
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Super Bass"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Moment 4 Life"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Fly"));
            AlbumDTO album60 = new AlbumDTO("Pink Friday", LocalDate.of(2010, Month.NOVEMBER, 22), "Rap", "/ImagenesAlbumes/PinkFriday.jpeg", artistaBO.obtenerIdPorNombre("Nicki Minaj"), listaCanciones);
            albumBO.insertarAlbum(album60);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Starships"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Pound the Alarm"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Beez in the Trap"));
            AlbumDTO album61 = new AlbumDTO("Pink Friday: Roman Reloaded", LocalDate.of(2012, Month.APRIL, 2), "Rap", "/ImagenesAlbumes/RomanReloaded.jpeg", artistaBO.obtenerIdPorNombre("Nicki Minaj"), listaCanciones);
            albumBO.insertarAlbum(album61);

            // Álbumes de Kendrick Lamar
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("LOYALTY."));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("HUMBLE."));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("DNA."));
            AlbumDTO album62 = new AlbumDTO("DAMN.", LocalDate.of(2017, Month.APRIL, 14), "Rap", "/ImagenesAlbumes/DAMN.jpeg", artistaBO.obtenerIdPorNombre("Kendrick Lamar"), listaCanciones);
            albumBO.insertarAlbum(album62);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Alright"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("King Kunta"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("The Blacker the Berry"));
            AlbumDTO album63 = new AlbumDTO("To Pimp a Butterfly", LocalDate.of(2015, Month.MARCH, 15), "Rap", "/ImagenesAlbumes/ToPimpAButterfly.jpeg", artistaBO.obtenerIdPorNombre("Kendrick Lamar"), listaCanciones);
            albumBO.insertarAlbum(album63);

            // Álbumes de Sia
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Chandelier"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Elastic Heart"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Big Girls Cry"));
            AlbumDTO album64 = new AlbumDTO("1000 Forms of Fear", LocalDate.of(2014, Month.JULY, 4), "Pop", "/ImagenesAlbumes/1000FormsOfFear.jpeg", artistaBO.obtenerIdPorNombre("Sia"), listaCanciones);
            albumBO.insertarAlbum(album64);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Cheap Thrills"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("The Greatest"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Alive"));
            AlbumDTO album65 = new AlbumDTO("This Is Acting", LocalDate.of(2016, Month.JANUARY, 29), "Pop", "/ImagenesAlbumes/ThisIsActing.jpeg", artistaBO.obtenerIdPorNombre("Sia"), listaCanciones);
            albumBO.insertarAlbum(album65);

            // Álbumes de John Legend
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("All of Me"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("You & I (Nobody in the World)"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Made to Love"));
            AlbumDTO album66 = new AlbumDTO("Love in the Future", LocalDate.of(2013, Month.SEPTEMBER, 3), "R&B", "/ImagenesAlbumes/LoveInTheFuture.jpeg", artistaBO.obtenerIdPorNombre("John Legend"), listaCanciones);
            albumBO.insertarAlbum(album66);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Ordinary People"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("So High"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Used to Love U"));
            AlbumDTO album67 = new AlbumDTO("Get Lifted", LocalDate.of(2004, Month.DECEMBER, 28), "R&B", "/ImagenesAlbumes/GetLifted.jpeg", artistaBO.obtenerIdPorNombre("John Legend"), listaCanciones);
            albumBO.insertarAlbum(album67);

            // Álbumes de Ellie Goulding
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Love Me Like You Do"));
            AlbumDTO album68 = new AlbumDTO("Fifty Shades of Grey Soundtrack", LocalDate.of(2015, Month.FEBRUARY, 10), "Pop", "/ImagenesAlbumes/FiftyShadesOfGrey.jpeg", artistaBO.obtenerIdPorNombre("Ellie Goulding"), listaCanciones);
            albumBO.insertarAlbum(album68);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Lights"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Starry Eyed"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Guns and Horses"));
            AlbumDTO album69 = new AlbumDTO("Lights", LocalDate.of(2010, Month.MARCH, 1), "Pop", "/ImagenesAlbumes/Lights.jpeg", artistaBO.obtenerIdPorNombre("Ellie Goulding"), listaCanciones);
            albumBO.insertarAlbum(album69);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("On My Mind"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Something in the Way You Move"));
            AlbumDTO album70 = new AlbumDTO("Halcyon", LocalDate.of(2012, Month.OCTOBER, 5), "Pop", "/ImagenesAlbumes/Halcyon.jpeg", artistaBO.obtenerIdPorNombre("Ellie Goulding"), listaCanciones);
            albumBO.insertarAlbum(album70);

            // Álbumes de Avril Lavigne
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Complicated"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Sk8er Boi"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("I'm with You"));
            AlbumDTO album71 = new AlbumDTO("Let Go", LocalDate.of(2002, Month.JUNE, 4), "Rock", "/ImagenesAlbumes/LetGo.jpeg", artistaBO.obtenerIdPorNombre("Avril Lavigne"), listaCanciones);
            albumBO.insertarAlbum(album71);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Girlfriend"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("When You're Gone"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Hot"));
            AlbumDTO album72 = new AlbumDTO("The Best Damn Thing", LocalDate.of(2007, Month.APRIL, 17), "Rock", "/ImagenesAlbumes/TheBestDamnThing.jpeg", artistaBO.obtenerIdPorNombre("Avril Lavigne"), listaCanciones);
            albumBO.insertarAlbum(album72);

            // Álbumes de Amy Winehouse
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Rehab"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("You Know I'm No Good"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Back to Black"));
            AlbumDTO album73 = new AlbumDTO("Back to Black", LocalDate.of(2006, Month.OCTOBER, 27), "Pop", "/ImagenesAlbumes/BackToBlack.jpeg", artistaBO.obtenerIdPorNombre("Amy Winehouse"), listaCanciones);
            albumBO.insertarAlbum(album73);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Valerie"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Tears Dry on Their Own"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Love Is a Losing Game"));
            AlbumDTO album74 = new AlbumDTO("Frank", LocalDate.of(2003, Month.OCTOBER, 20), "Pop", "/ImagenesAlbumes/Frank.jpeg", artistaBO.obtenerIdPorNombre("Amy Winehouse"), listaCanciones);
            albumBO.insertarAlbum(album74);

            // Álbumes de Bad Bunny
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("MIA"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Estamos Bien"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Ni Bien Ni Mal"));
            AlbumDTO album75 = new AlbumDTO("X 100PRE", LocalDate.of(2018, Month.DECEMBER, 24), "Rap", "/ImagenesAlbumes/X100PRE.jpeg", artistaBO.obtenerIdPorNombre("Bad Bunny"), listaCanciones);
            albumBO.insertarAlbum(album75);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Safaera"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Yo Perreo Sola"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Vete"));
            AlbumDTO album76 = new AlbumDTO("YHLQMDLG", LocalDate.of(2020, Month.FEBRUARY, 29), "Rap", "/ImagenesAlbumes/YHLQMDLG.jpeg", artistaBO.obtenerIdPorNombre("Bad Bunny"), listaCanciones);
            albumBO.insertarAlbum(album76);
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Di mi nombre"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Pienso en tu mirá"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Malamente"));
            AlbumDTO album77 = new AlbumDTO("El Mal Querer", LocalDate.of(2018, Month.NOVEMBER, 2), "Flamenco-pop", "/ImagenesAlbumes/ElMalQuerer.jpeg", artistaBO.obtenerIdPorNombre("ROSALIA"), listaCanciones);
            albumBO.insertarAlbum(album77);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Con Altura"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Yo x Ti, Tu x Mi"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Juro Que"));
            AlbumDTO album78 = new AlbumDTO("Singles", LocalDate.of(2019, Month.MARCH, 28), "Flamenco-pop", "/ImagenesAlbumes/Singles.jpeg", artistaBO.obtenerIdPorNombre("ROSALIA"), listaCanciones);
            albumBO.insertarAlbum(album78);

            // Álbumes de Miguel Bosé
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Amante Bandido"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Nena"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Salamandra"));
            AlbumDTO album79 = new AlbumDTO("Bandido", LocalDate.of(1984, Month.MAY, 30), "Pop", "/ImagenesAlbumes/Bandido.jpeg", artistaBO.obtenerIdPorNombre("Miguel Bose"), listaCanciones);
            albumBO.insertarAlbum(album79);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Morena Mía"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Si Tú No Vuelves"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Te Amaré"));
            AlbumDTO album80 = new AlbumDTO("Papito", LocalDate.of(2007, Month.MARCH, 20), "Pop", "/ImagenesAlbumes/Papito.jpeg", artistaBO.obtenerIdPorNombre("Miguel Bose"), listaCanciones);
            albumBO.insertarAlbum(album80);

            // Álbumes de Cazzu
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Nada"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Mucha Data"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Mentiste"));
            AlbumDTO album81 = new AlbumDTO("Error 93", LocalDate.of(2019, Month.MAY, 17), "Rap", "/ImagenesAlbumes/Error93.jpeg", artistaBO.obtenerIdPorNombre("Cazzu"), listaCanciones);
            albumBO.insertarAlbum(album81);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Visto a las 00:00"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Bounce"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Me Prefieres A Mi"));
            AlbumDTO album82 = new AlbumDTO("Nena Trampa", LocalDate.of(2022, Month.MAY, 12), "Rap", "/ImagenesAlbumes/NenaTrampa.jpeg", artistaBO.obtenerIdPorNombre("Cazzu"), listaCanciones);
            albumBO.insertarAlbum(album82);

            // Álbumes de Natalia Lafourcade
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Hasta la Raíz"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Lo Que Construimos"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Nunca es Suficiente"));
            AlbumDTO album83 = new AlbumDTO("Hasta la Raíz", LocalDate.of(2015, Month.MARCH, 17), "Pop", "/ImagenesAlbumes/HastaLaRaiz.jpeg", artistaBO.obtenerIdPorNombre("Natalia Lafourcade"), listaCanciones);
            albumBO.insertarAlbum(album83);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Tú Sí Sabes Quererme"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Danza de Gardenias"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Soledad y el Mar"));
            AlbumDTO album84 = new AlbumDTO("Musas Vol. 1", LocalDate.of(2017, Month.MAY, 5), "Pop", "/ImagenesAlbumes/MusasVol1.jpeg", artistaBO.obtenerIdPorNombre("Natalia Lafourcade"), listaCanciones);
            albumBO.insertarAlbum(album84);

            // Álbumes de Carla Morrison
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Disfruto"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Hasta la Piel"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Déjenme Llorar"));
            AlbumDTO album85 = new AlbumDTO("Déjenme Llorar", LocalDate.of(2012, Month.MARCH, 27), "Pop", "/ImagenesAlbumes/DejenmeLlorar.jpeg", artistaBO.obtenerIdPorNombre("Carla Morrison"), listaCanciones);
            albumBO.insertarAlbum(album85);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Eres Tú"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Te Regalo"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Azúcar Morena"));
            AlbumDTO album86 = new AlbumDTO("Amor Supremo", LocalDate.of(2015, Month.OCTOBER, 9), "Pop", "/ImagenesAlbumes/AmorSupremo.jpeg", artistaBO.obtenerIdPorNombre("Carla Morrison"), listaCanciones);
            albumBO.insertarAlbum(album86);

            // Álbumes de Ángela Aguilar
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("La Llorona"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Bésame Mucho"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Paloma Negra"));
            AlbumDTO album87 = new AlbumDTO("Primero Soy Mexicana", LocalDate.of(2018, Month.MARCH, 2), "Regional", "/ImagenesAlbumes/PrimeroSoyMexicana.jpeg", artistaBO.obtenerIdPorNombre("Angela Aguilar"), listaCanciones);
            albumBO.insertarAlbum(album87);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Dime Cómo Quieres"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("En Realidad"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Ahí Donde Me Ven"));
            AlbumDTO album88 = new AlbumDTO("Mexicana Enamorada", LocalDate.of(2021, Month.SEPTEMBER, 24), "Regional", "/ImagenesAlbumes/MexicanaEnamorada.jpeg", artistaBO.obtenerIdPorNombre("Angela Aguilar"), listaCanciones);
            albumBO.insertarAlbum(album88);

            // Álbumes de José José
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("El Triste"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("La Nave del Olvido"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Amar y Querer"));
            AlbumDTO album89 = new AlbumDTO("El Triste", LocalDate.of(1970, Month.MARCH, 15), "Regional", "/ImagenesAlbumes/ElTriste.jpeg", artistaBO.obtenerIdPorNombre("Jose Jose"), listaCanciones);
            albumBO.insertarAlbum(album89);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Gavilán o Paloma"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Volcán"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Lo Pasado, Pasado"));
            AlbumDTO album90 = new AlbumDTO("Gavilán o Paloma", LocalDate.of(1977, Month.OCTOBER, 15), "Regional", "/ImagenesAlbumes/GavilanOPaloma.jpeg", artistaBO.obtenerIdPorNombre("Jose Jose"), listaCanciones);
            albumBO.insertarAlbum(album90);

            // Álbumes de Rocío Dúrcal
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Amor Eterno"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Costumbres"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("La Gata Bajo la Lluvia"));
            AlbumDTO album91 = new AlbumDTO("Canta a Juan Gabriel", LocalDate.of(1977, Month.JUNE, 30), "Ranchera", "/ImagenesAlbumes/CantaAJuanGabriel.jpeg", artistaBO.obtenerIdPorNombre("Rosio Durcal"), listaCanciones);
            albumBO.insertarAlbum(album91);
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Como Tu Mujer"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Tarde"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Jamás Te Prometí un Jardín de Rosas"));
            AlbumDTO album92 = new AlbumDTO("Canta a Juan Gabriel Vol. 6", LocalDate.of(1988, Month.JUNE, 21), "Ranchera", "/ImagenesAlbumes/CantaAJuanGabrielVol6.jpeg", artistaBO.obtenerIdPorNombre("Rosio Durcal"), listaCanciones);
            albumBO.insertarAlbum(album92);

            //AQUI TERMINAN ALBUMS SOLISTAS, COMIENZAN EN GRUPO
            // Álbumes de The Beatles
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Come Together"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Something"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Here Comes the Sun"));
            AlbumDTO album93 = new AlbumDTO("Abbey Road", LocalDate.of(1969, Month.SEPTEMBER, 26), "Rock", "/ImagenesAlbumes/AbbeyRoad.jpeg", artistaBO.obtenerIdPorNombre("The Beatles"), listaCanciones);
            albumBO.insertarAlbum(album93);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Lucy in the Sky with Diamonds"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("A Day in the Life"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Sgt. Pepper's Lonely Hearts Club Band"));
            AlbumDTO album94 = new AlbumDTO("Sgt. Pepper's Lonely Hearts Club Band", LocalDate.of(1967, Month.JUNE, 1), "Rock", "/ImagenesAlbumes/SgtPepper.jpeg", artistaBO.obtenerIdPorNombre("The Beatles"), listaCanciones);
            albumBO.insertarAlbum(album94);

            // Álbumes de The Rolling Stones
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Tumbling Dice"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Rocks Off"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Happy"));
            AlbumDTO album95 = new AlbumDTO("Exile on Main St.", LocalDate.of(1972, Month.MAY, 12), "Rock", "/ImagenesAlbumes/ExileOnMainSt.jpeg", artistaBO.obtenerIdPorNombre("The Rolling Stones"), listaCanciones);
            albumBO.insertarAlbum(album95);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Brown Sugar"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Wild Horses"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Can't You Hear Me Knocking"));
            AlbumDTO album96 = new AlbumDTO("Sticky Fingers", LocalDate.of(1971, Month.APRIL, 23), "Rock", "/ImagenesAlbumes/StickyFingers.jpeg", artistaBO.obtenerIdPorNombre("The Rolling Stones"), listaCanciones);
            albumBO.insertarAlbum(album96);

            // Álbumes de Queen
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Bohemian Rhapsody"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Somebody to Love"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("You're My Best Friend"));
            AlbumDTO album97 = new AlbumDTO("A Night at the Opera", LocalDate.of(1975, Month.NOVEMBER, 21), "Rock", "/ImagenesAlbumes/ANightAtTheOpera.jpeg", artistaBO.obtenerIdPorNombre("Queen"), listaCanciones);
            albumBO.insertarAlbum(album97);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("We Will Rock You"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("We Are the Champions"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Don't Stop Me Now"));
            AlbumDTO album98 = new AlbumDTO("News of the World", LocalDate.of(1977, Month.OCTOBER, 28), "Rock", "/ImagenesAlbumes/NewsOfTheWorld.jpeg", artistaBO.obtenerIdPorNombre("Queen"), listaCanciones);
            albumBO.insertarAlbum(album98);

            // Álbumes de Pink Floyd
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Time"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Money"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Us and Them"));
            AlbumDTO album99 = new AlbumDTO("The Dark Side of the Moon", LocalDate.of(1973, Month.MARCH, 1), "Rock", "/ImagenesAlbumes/TheDarkSideOfTheMoon.jpeg", artistaBO.obtenerIdPorNombre("Pink Floyd"), listaCanciones);
            albumBO.insertarAlbum(album99);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Another Brick in the Wall (Part 2)"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Comfortably Numb"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Hey You"));
            AlbumDTO album100 = new AlbumDTO("The Wall", LocalDate.of(1979, Month.NOVEMBER, 30), "Rock", "/ImagenesAlbumes/TheWall.jpeg", artistaBO.obtenerIdPorNombre("Pink Floyd"), listaCanciones);
            albumBO.insertarAlbum(album100);

            // Álbumes de Nirvana
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Smells Like Teen Spirit"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Come as You Are"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Lithium"));
            AlbumDTO album101 = new AlbumDTO("Nevermind", LocalDate.of(1991, Month.SEPTEMBER, 24), "Grunge", "/ImagenesAlbumes/Nevermind.jpeg", artistaBO.obtenerIdPorNombre("Nirvana"), listaCanciones);
            albumBO.insertarAlbum(album101);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Heart-Shaped Box"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Rape Me"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("All Apologies"));
            AlbumDTO album102 = new AlbumDTO("In Utero", LocalDate.of(1993, Month.SEPTEMBER, 21), "Grunge", "/ImagenesAlbumes/InUtero.jpeg", artistaBO.obtenerIdPorNombre("Nirvana"), listaCanciones);
            albumBO.insertarAlbum(album102);

            // Álbumes de The Eagles
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Hotel California"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("New Kid in Town"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Life in the Fast Lane"));
            AlbumDTO album103 = new AlbumDTO("Hotel California", LocalDate.of(1976, Month.DECEMBER, 8), "Rock", "/ImagenesAlbumes/HotelCalifornia.jpeg", artistaBO.obtenerIdPorNombre("The Eagles"), listaCanciones);
            albumBO.insertarAlbum(album103);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Tequila Sunrise"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Desperado"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Doolin' Dalton"));
            AlbumDTO album104 = new AlbumDTO("Desperado", LocalDate.of(1973, Month.APRIL, 17), "Rock", "/ImagenesAlbumes/Desperado.jpeg", artistaBO.obtenerIdPorNombre("The Eagles"), listaCanciones);
            albumBO.insertarAlbum(album104);

            // Álbumes de Metallica
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Battery"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Welcome Home (Sanitarium)"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Master of Puppets"));
            AlbumDTO album105 = new AlbumDTO("Master of Puppets", LocalDate.of(1986, Month.MARCH, 3), "Metal", "/ImagenesAlbumes/MasterOfPuppets.jpeg", artistaBO.obtenerIdPorNombre("Metallica"), listaCanciones);
            albumBO.insertarAlbum(album105);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("For Whom the Bell Tolls"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Fade to Black"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("One"));
            AlbumDTO album106 = new AlbumDTO("Ride the Lightning", LocalDate.of(1984, Month.JULY, 27), "Metal", "/ImagenesAlbumes/RideTheLightning.jpeg", artistaBO.obtenerIdPorNombre("Metallica"), listaCanciones);
            albumBO.insertarAlbum(album106);

            // Álbumes de Led Zeppelin
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Stairway to Heaven"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Black Dog"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Rock and Roll"));
            AlbumDTO album107 = new AlbumDTO("IV (Four Symbols)", LocalDate.of(1971, Month.NOVEMBER, 8), "Rock", "/ImagenesAlbumes/IV.jpeg", artistaBO.obtenerIdPorNombre("Led Zeppelin"), listaCanciones);
            albumBO.insertarAlbum(album107);
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Kashmir"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Trampled Under Foot"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Houses of the Holy"));
            AlbumDTO album108 = new AlbumDTO("Physical Graffiti", LocalDate.of(1975, Month.FEBRUARY, 24), "Rock", "/ImagenesAlbumes/PhysicalGraffiti.jpeg", artistaBO.obtenerIdPorNombre("Led Zeppelin"), listaCanciones);
            albumBO.insertarAlbum(album108);

            // Álbumes de Coldplay
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Clocks"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("The Scientist"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("In My Place"));
            AlbumDTO album109 = new AlbumDTO("A Rush of Blood to the Head", LocalDate.of(2002, Month.AUGUST, 26), "Rock", "/ImagenesAlbumes/ARushOfBloodToTheHead.jpeg", artistaBO.obtenerIdPorNombre("Coldplay"), listaCanciones);
            albumBO.insertarAlbum(album109);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Viva la Vida"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Yellow"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Fix You"));
            AlbumDTO album110 = new AlbumDTO("Viva la Vida or Death and All His Friends", LocalDate.of(2008, Month.JUNE, 12), "Rock", "/ImagenesAlbumes/VivaLaVida.jpeg", artistaBO.obtenerIdPorNombre("Coldplay"), listaCanciones);
            albumBO.insertarAlbum(album110);

            // Álbumes de Imagine Dragons
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Radioactive"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Demons"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("It's Time"));
            AlbumDTO album111 = new AlbumDTO("Night Visions", LocalDate.of(2012, Month.SEPTEMBER, 4), "Rock", "/ImagenesAlbumes/NightVisions.jpeg", artistaBO.obtenerIdPorNombre("Imagine Dragons"), listaCanciones);
            albumBO.insertarAlbum(album111);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Believer"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Thunder"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Whatever It Takes"));
            AlbumDTO album112 = new AlbumDTO("Evolve", LocalDate.of(2017, Month.JUNE, 23), "Rock", "/ImagenesAlbumes/Evolve.jpeg", artistaBO.obtenerIdPorNombre("Imagine Dragons"), listaCanciones);
            albumBO.insertarAlbum(album112);

        } catch (ExceptionBO ex) {
            Logger.getLogger(ArranqueInicioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
