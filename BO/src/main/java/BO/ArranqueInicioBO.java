package BO;

import DTO.ArtistasDTO;
import DTO.IntegranteDTO;
import IBO.IArranqueInicio;
import IBO.IArtistasBO;
import IBO.ICancionBO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class ArranqueInicioBO implements IArranqueInicio {

    IArtistasBO artistaBO = new ArtistaBO();
    ICancionBO cancionBO;

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
        ArtistaSolista[36] = new ArtistasDTO("BadBunny", "/ImagenesArtistas/BadBuny.jpeg", "solista", "Pop");
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

    }

    public void crearAlbums() {

    }

}
