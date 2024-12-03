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
        ArtistaSolista[6] = new ArtistasDTO("Lady Gaga", "/ImagenesArtistas/LadyGaga.jpeg", "solista", "Pop");
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
        ArtistaSolista[19] = new ArtistasDTO("Beyoncé", "/ImagenesArtistas/Beyonce.jpeg", "solista", "R&B");
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
        ArtistaSolista[36] = new ArtistasDTO("Bad Bunny", "/ImagenesArtistas/BadBunny.jpeg", "solista", "Pop");
        ArtistaSolista[37] = new ArtistasDTO("ROSALIA", "/ImagenesArtistas/Rosalia.jpeg", "solista", "Flamenco");
        ArtistaSolista[38] = new ArtistasDTO("Miguel Bose", "/ImagenesArtistas/MiguelBose.jpeg", "solista", "Pop");
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
        ListaIntegrantes.add(new IntegranteDTO("John Lennon", "Vocalista", "/ImagenesArtistas/JohnLennon.jpeg", LocalDate.of(1960, 7, 6), LocalDate.of(1969, 4, 10), false)); // Fecha de ingreso y salida actualizada
        ListaIntegrantes.add(new IntegranteDTO("Paul McCartney", "Bajista", "/ImagenesArtistas/PaulMcCartney.jpeg", LocalDate.of(1960, 7, 6), LocalDate.of(1970, 4, 10), false)); // Fecha de ingreso y salida actualizada
        ListaIntegrantes.add(new IntegranteDTO("George Harrison", "Guitarrista", "/ImagenesArtistas/GeorgeHarrison.jpeg", LocalDate.of(1960, 2, 1), LocalDate.of(1970, 4, 10), false)); // Fecha de ingreso actualizada
        ListaIntegrantes.add(new IntegranteDTO("Ringo Starr", "Baterista", "/ImagenesArtistas/RingoStarr.jpeg", LocalDate.of(1962, 8, 18), LocalDate.of(1970, 4, 10), false)); // Fecha de ingreso y salida actualizada
        ListaArtistasGrupo[0] = new ArtistasDTO("The Beatles", "/ImagenesArtistas/TheBeatles.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 2: The Rolling Stones
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Mick Jagger", "Vocalista", "/ImagenesArtistas/MickJagger.jpeg", LocalDate.of(1962, 5, 25), null, true)); // Fecha de ingreso exacta
        ListaIntegrantes.add(new IntegranteDTO("Keith Richards", "Guitarrista", "/ImagenesArtistas/KeithRichards.jpeg", LocalDate.of(1962, 5, 25), null, true)); // Fecha de ingreso exacta
        ListaIntegrantes.add(new IntegranteDTO("Charlie Watts", "Baterista", "/ImagenesArtistas/CharlieWatts.jpeg", LocalDate.of(1963, 1, 1), LocalDate.of(2021, 8, 24), false)); // Fecha de fallecimiento incluida
        ListaIntegrantes.add(new IntegranteDTO("Ronnie Wood", "Guitarrista", "/ImagenesArtistas/RonnieWood.jpeg", LocalDate.of(1975, 1, 1), null, true)); // Ingreso actualizado
        ListaIntegrantes.add(new IntegranteDTO("Bill Wyman", "Bajista", "/ImagenesArtistas/BillWyman.jpeg", LocalDate.of(1962, 12, 7), LocalDate.of(1993, 1, 1), false)); // Nuevo integrante añadido, con fechas de ingreso y salida
        ListaIntegrantes.add(new IntegranteDTO("Darryl Jones", "Bajista", "/ImagenesArtistas/DarrylJones.jpeg", LocalDate.of(1993, 1, 1), null, true)); // Nuevo integrante añadido
        ListaArtistasGrupo[1] = new ArtistasDTO("The Rolling Stones", "/ImagenesArtistas/TheRollingStones.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 3: Queen
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Freddie Mercury", "Vocalista", "/ImagenesArtistas/FreddieMercury.jpeg", LocalDate.of(1971, 2, 1), LocalDate.of(1991, 11, 24), false)); // Fecha de fallecimiento añadida
        ListaIntegrantes.add(new IntegranteDTO("Brian May", "Guitarrista", "/ImagenesArtistas/BrianMay.jpeg", LocalDate.of(1971, 2, 1), null, true)); // Fecha de ingreso actualizada
        ListaIntegrantes.add(new IntegranteDTO("Roger Taylor", "Baterista", "/ImagenesArtistas/RogerTaylor.jpeg", LocalDate.of(1971, 2, 1), null, true)); // Fecha de ingreso actualizada
        ListaIntegrantes.add(new IntegranteDTO("John Deacon", "Bajista", "/ImagenesArtistas/JohnDeacon.jpeg", LocalDate.of(1971, 2, 1), LocalDate.of(1997, 1, 17), false)); // Fecha de retiro incluida  
        ListaArtistasGrupo[2] = new ArtistasDTO("Queen", "/ImagenesArtistas/Queen.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 4: Pink Floyd
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("David Gilmour", "Guitarrista", "/ImagenesArtistas/DavidGilmour.jpeg", LocalDate.of(1968, 1, 18), null, true)); // Fecha de ingreso exacta
        ListaIntegrantes.add(new IntegranteDTO("Roger Waters", "Bajista", "/ImagenesArtistas/RogerWaters.jpeg", LocalDate.of(1965, 9, 1), LocalDate.of(1985, 12, 1), false)); // Fecha de salida incluida
        ListaIntegrantes.add(new IntegranteDTO("Richard Wright", "Tecladista", "/ImagenesArtistas/RichardWright.jpeg", LocalDate.of(1965, 9, 1), LocalDate.of(2008, 9, 15), false)); // Fallecimiento indicado
        ListaIntegrantes.add(new IntegranteDTO("Nick Mason", "Baterista", "/ImagenesArtistas/NickMason.jpeg", LocalDate.of(1965, 9, 1), null, true)); // Fecha de ingreso exacta
        ListaArtistasGrupo[3] = new ArtistasDTO("Pink Floyd", "/ImagenesArtistas/PinkFloyd.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 5: Nirvana
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Kurt Cobain", "Vocalista", "/ImagenesArtistas/KurtCobain.jpeg", LocalDate.of(1987, 1, 1), LocalDate.of(1994, 4, 5), false)); // Fallecimiento indicado
        ListaIntegrantes.add(new IntegranteDTO("Krist Novoselic", "Bajista", "/ImagenesArtistas/KristNovoselic.jpeg", LocalDate.of(1987, 1, 1), LocalDate.of(1994, 4, 8), false)); // Fecha de disolución del grupo
        ListaIntegrantes.add(new IntegranteDTO("Dave Grohl", "Baterista", "/ImagenesArtistas/DaveGrohl.jpeg", LocalDate.of(1990, 9, 25), LocalDate.of(1994, 4, 8), false)); // Fecha de disolución del grupo
        ListaArtistasGrupo[4] = new ArtistasDTO("Nirvana", "/ImagenesArtistas/Nirvana.jpeg", "Grupo", "Grunge", ListaIntegrantes);

        // Grupo 6: The Eagles
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Don Henley", "Vocalista", "/ImagenesArtistas/DonHenley.jpeg", LocalDate.of(1971, 9, 1), null, true)); // Fecha de inicio oficial
        ListaIntegrantes.add(new IntegranteDTO("Glenn Frey", "Guitarrista", "/ImagenesArtistas/GlennFrey.jpeg", LocalDate.of(1971, 9, 1), LocalDate.of(2016, 1, 18), false)); // Fallecimiento indicado
        ListaIntegrantes.add(new IntegranteDTO("Joe Walsh", "Guitarrista", "/ImagenesArtistas/JoeWalsh.jpeg", LocalDate.of(1975, 12, 20), null, true)); // Fecha exacta de ingreso
        ListaIntegrantes.add(new IntegranteDTO("Timothy B. Schmit", "Bajista", "/ImagenesArtistas/TimothySchmit.jpeg", LocalDate.of(1977, 11, 1), null, true)); // Fecha de ingreso ajustada
        ListaArtistasGrupo[5] = new ArtistasDTO("The Eagles", "/ImagenesArtistas/TheEagles.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 7: Metallica
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("James Hetfield", "Vocalista", "/ImagenesArtistas/JamesHetfield.jpeg", LocalDate.of(1981, 10, 28), null, true)); // Fecha de fundación de Metallica
        ListaIntegrantes.add(new IntegranteDTO("Kirk Hammett", "Guitarrista", "/ImagenesArtistas/KirkHammett.jpeg", LocalDate.of(1983, 4, 1), null, true)); // Fecha de ingreso tras reemplazar a Dave Mustaine
        ListaIntegrantes.add(new IntegranteDTO("Lars Ulrich", "Baterista", "/ImagenesArtistas/LarsUlrich.jpeg", LocalDate.of(1981, 10, 28), null, true)); // Fundador del grupo
        ListaIntegrantes.add(new IntegranteDTO("Robert Trujillo", "Bajista", "/ImagenesArtistas/RobertTrujillo.jpeg", LocalDate.of(2003, 2, 24), null, true)); // Fecha exacta de ingreso
        ListaArtistasGrupo[6] = new ArtistasDTO("Metallica", "/ImagenesArtistas/Metallica.jpeg", "Grupo", "Metal", ListaIntegrantes);

        // Grupo 8: Led Zeppelin
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Robert Plant", "Vocalista", "/ImagenesArtistas/RobertPlant.jpeg", LocalDate.of(1968, 8, 12), null, true)); // Fecha exacta de ingreso
        ListaIntegrantes.add(new IntegranteDTO("Jimmy Page", "Guitarrista", "/ImagenesArtistas/JimmyPage.jpeg", LocalDate.of(1968, 8, 12), null, true)); // Fecha de fundación del grupo
        ListaIntegrantes.add(new IntegranteDTO("John Paul Jones", "Bajista", "/ImagenesArtistas/JohnPaulJones.jpeg", LocalDate.of(1968, 8, 12), null, true)); // Fecha de ingreso inicial
        ListaIntegrantes.add(new IntegranteDTO("John Bonham", "Baterista", "/ImagenesArtistas/JohnBonham.jpeg", LocalDate.of(1968, 8, 12), LocalDate.of(1980, 9, 25), false)); // Fecha de fallecimiento incluida
        ListaArtistasGrupo[7] = new ArtistasDTO("Led Zeppelin", "/ImagenesArtistas/LedZeppelin.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 9: Coldplay
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Chris Martin", "Vocalista", "/ImagenesArtistas/ChrisMartin.jpeg", LocalDate.of(1996, 9, 1), null, true)); // Fecha de fundación oficial
        ListaIntegrantes.add(new IntegranteDTO("Jonny Buckland", "Guitarrista", "/ImagenesArtistas/JonnyBuckland.jpeg", LocalDate.of(1996, 9, 1), null, true)); // Fecha inicial del grupo
        ListaIntegrantes.add(new IntegranteDTO("Guy Berryman", "Bajista", "/ImagenesArtistas/GuyBerryman.jpeg", LocalDate.of(1996, 9, 1), null, true)); // Inicio del proyecto musical
        ListaIntegrantes.add(new IntegranteDTO("Will Champion", "Baterista", "/ImagenesArtistas/WillChampion.jpeg", LocalDate.of(1998, 7, 31), null, true)); // Fecha de ingreso oficial
        ListaArtistasGrupo[8] = new ArtistasDTO("Coldplay", "/ImagenesArtistas/Coldplay.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 10: Imagine Dragons
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Dan Reynolds", "Vocalista", "/ImagenesArtistas/DanReynolds.jpeg", LocalDate.of(2008, 1, 1), null, true)); // Fundador de la banda
        ListaIntegrantes.add(new IntegranteDTO("Wayne Sermon", "Guitarrista", "/ImagenesArtistas/WayneSermon.jpeg", LocalDate.of(2009, 3, 1), null, true)); // Fecha aproximada de ingreso
        ListaIntegrantes.add(new IntegranteDTO("Ben McKee", "Bajista", "/ImagenesArtistas/BenMcKee.jpeg", LocalDate.of(2009, 3, 1), null, true)); // Se unió junto con Wayne Sermon
        ListaIntegrantes.add(new IntegranteDTO("Daniel Platzman", "Baterista", "/ImagenesArtistas/DanielPlatzman.jpeg", LocalDate.of(2011, 7, 1), LocalDate.of(2023, 8, 1), true)); // Se unió justo antes del álbum debut
        ListaArtistasGrupo[9] = new ArtistasDTO("Imagine Dragons", "/ImagenesArtistas/ImagineDragons.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 11: Maroon 5
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Adam Levine", "Vocalista", "/ImagenesArtistas/AdamLevine.jpeg", LocalDate.of(1994, 1, 1), null, true)); // Desde Kara's Flowers
        ListaIntegrantes.add(new IntegranteDTO("Jesse Carmichael", "Tecladista", "/ImagenesArtistas/JesseCarmichael.jpeg", LocalDate.of(1994, 1, 1), null, true)); // Fundador, tomó un descanso en 2012 y regresó en 2014
        ListaIntegrantes.add(new IntegranteDTO("James Valentine", "Guitarrista", "/ImagenesArtistas/JamesValentine.jpeg", LocalDate.of(2001, 1, 1), null, true)); // Se unió al renombrarse Maroon 5
        ListaIntegrantes.add(new IntegranteDTO("Mickey Madden", "Bajista", "/ImagenesArtistas/MickeyMadden.jpeg", LocalDate.of(1994, 1, 1), LocalDate.of(2020, 6, 30), false)); // Salida oficial en 2020
        ListaIntegrantes.add(new IntegranteDTO("Matt Flynn", "Baterista", "/ImagenesArtistas/MattFlynn.jpeg", LocalDate.of(2006, 9, 1), null, true)); // Reemplazó a Ryan Dusick
        ListaIntegrantes.add(new IntegranteDTO("P. J. Morton", "Tecladista", "/ImagenesArtistas/PJMorton.jpeg", LocalDate.of(2012, 1, 1), null, true)); // Miembro oficial desde 2012
        ListaIntegrantes.add(new IntegranteDTO("Sam Farrar", "Multiinstrumentista", "/ImagenesArtistas/SamFarrar.jpeg", LocalDate.of(2012, 1, 1), null, true)); // Colaborador desde 2008, miembro oficial desde 2016
        ListaArtistasGrupo[10] = new ArtistasDTO("Maroon 5", "/ImagenesArtistas/Maroon5.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 12: AC/DC
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Brian Johnson", "Vocalista", "/ImagenesArtistas/BrianJohnson.jpeg", LocalDate.of(1980, 4, 1), null, true)); // Se unió tras la muerte de Bon Scott
        ListaIntegrantes.add(new IntegranteDTO("Angus Young", "Guitarrista", "/ImagenesArtistas/AngusYoung.jpeg", LocalDate.of(1973, 11, 1), null, true)); // Miembro fundador
        ListaIntegrantes.add(new IntegranteDTO("Malcolm Young", "Guitarrista", "/ImagenesArtistas/MalcolmYoung.jpeg", LocalDate.of(1973, 11, 1), LocalDate.of(2017, 11, 18), false)); // Fallecimiento en 2017
        ListaIntegrantes.add(new IntegranteDTO("Cliff Williams", "Bajista", "/ImagenesArtistas/CliffWilliams.jpeg", LocalDate.of(1977, 6, 27), null, true)); // Ingreso para reemplazar a Mark Evans
        ListaIntegrantes.add(new IntegranteDTO("Phil Rudd", "Baterista", "/ImagenesArtistas/PhilRudd.jpeg", LocalDate.of(1975, 1, 1), null, true)); // Miembro desde 1975 con pausas en algunos periodos
        ListaArtistasGrupo[11] = new ArtistasDTO("AC/DC", "/ImagenesArtistas/ACDC.jpeg", "Grupo", "Hard Rock", ListaIntegrantes);

        // Grupo 13: Linkin Park
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Chester Bennington", "Vocalista", "/ImagenesArtistas/ChesterBennington.jpeg", LocalDate.of(1999, 3, 1), LocalDate.of(2017, 7, 20), true));
        ListaIntegrantes.add(new IntegranteDTO("Mike Shinoda", "Vocalista/Guitarrista", "/ImagenesArtistas/MikeShinoda.jpeg", LocalDate.of(1996, 11, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Brad Delson", "Guitarrista", "/ImagenesArtistas/BradDelson.jpeg", LocalDate.of(1996, 11, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Dave Farrell", "Bajista", "/ImagenesArtistas/DaveFarrell.jpeg", LocalDate.of(2000, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Rob Bourdon", "Baterista", "/ImagenesArtistas/RobBourdon.jpeg", LocalDate.of(1996, 11, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Joe Hahn", "DJ/Tecladista", "/ImagenesArtistas/JoeHahn.jpeg", LocalDate.of(1996, 11, 1), null, true));
        ListaArtistasGrupo[12] = new ArtistasDTO("Linkin Park", "/ImagenesArtistas/LinkinPark.jpeg", "Grupo", "Metal", ListaIntegrantes);

        // Grupo 14: Arctic Monkeys
        ListaIntegrantes.add(new IntegranteDTO("Alex Turner", "Vocalista/Guitarrista", "/ImagenesArtistas/AlexTurner.jpeg", LocalDate.of(2002, 6, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Jamie Cook", "Guitarrista", "/ImagenesArtistas/JamieCook.jpeg", LocalDate.of(2002, 6, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Andy Nicholson", "Bajista", "/ImagenesArtistas/AndyNicholson.jpeg", LocalDate.of(2002, 6, 1), LocalDate.of(2006, 1, 1), true));
        ListaIntegrantes.add(new IntegranteDTO("Nick O'Malley", "Bajista", "/ImagenesArtistas/NickOMalley.jpeg", LocalDate.of(2006, 5, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Matt Helders", "Baterista", "/ImagenesArtistas/MattHelders.jpeg", LocalDate.of(2002, 6, 1), null, true));
        ListaArtistasGrupo[13] = new ArtistasDTO("Arctic Monkeys", "/ImagenesArtistas/ArcticMonkeys.jpeg", "Grupo", "Indie", ListaIntegrantes);

        // Grupo 15: Twenty One Pilots
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Tyler Joseph", "Vocalista", "/ImagenesArtistas/TylerJoseph.jpeg", LocalDate.of(2009, 3, 29), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Josh Dun", "Baterista", "/ImagenesArtistas/JoshDun.jpeg", LocalDate.of(2011, 5, 1), null, true));
        ListaArtistasGrupo[14] = new ArtistasDTO("Twenty One Pilots", "/ImagenesArtistas/TwentyOnePilots.jpeg", "Grupo", "Electropop", ListaIntegrantes);

        // Grupo 16: Paramore
        ListaIntegrantes.add(new IntegranteDTO("Hayley Williams", "Vocalista", "/ImagenesArtistas/HayleyWilliams.jpeg", LocalDate.of(2004, 7, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Taylor York", "Guitarrista", "/ImagenesArtistas/TaylorYork.jpeg", LocalDate.of(2007, 6, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Zac Farro", "Baterista", "/ImagenesArtistas/ZacFarro.jpeg", LocalDate.of(2004, 7, 1), null, true));
        ListaArtistasGrupo[15] = new ArtistasDTO("Paramore", "/ImagenesArtistas/Paramore.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 17: BTS
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("RM", "Rapper Principal", "/ImagenesArtistas/RM.jpeg", LocalDate.of(2013, 6, 13), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Jin", "Vocalista", "/ImagenesArtistas/Jin.jpeg", LocalDate.of(2013, 6, 13), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Suga", "Rapper", "/ImagenesArtistas/Suga.jpeg", LocalDate.of(2013, 6, 13), null, true));
        ListaIntegrantes.add(new IntegranteDTO("J-Hope", "Rapper", "/ImagenesArtistas/JHope.jpeg", LocalDate.of(2013, 6, 13), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Jimin", "Vocalista", "/ImagenesArtistas/Jimin.jpeg", LocalDate.of(2013, 6, 13), null, true));
        ListaIntegrantes.add(new IntegranteDTO("V", "Vocalista", "/ImagenesArtistas/V.jpeg", LocalDate.of(2013, 6, 13), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Jungkook", "Vocalista", "/ImagenesArtistas/Jungkook.jpeg", LocalDate.of(2013, 6, 13), null, true));
        ListaArtistasGrupo[16] = new ArtistasDTO("BTS", "/ImagenesArtistas/BTS.jpeg", "Grupo", "K-pop", ListaIntegrantes);

        // Grupo 18: ABBA
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Agnetha Fältskog", "Vocalista", "/ImagenesArtistas/AgnethaFaltskog.jpeg", LocalDate.of(1972, 4, 6), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Björn Ulvaeus", "Vocalista/Guitarrista", "/ImagenesArtistas/BjornUlvaeus.jpeg", LocalDate.of(1972, 4, 6), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Benny Andersson", "Tecladista", "/ImagenesArtistas/BennyAndersson.jpeg", LocalDate.of(1972, 4, 6), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Anni-Frid Lyngstad", "Vocalista", "/ImagenesArtistas/AnniFridLyngstad.jpeg", LocalDate.of(1972, 4, 6), null, true));
        ListaArtistasGrupo[17] = new ArtistasDTO("ABBA", "/ImagenesArtistas/ABBA.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 19: BLACKPINK
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Jisoo", "Vocalista", "/ImagenesArtistas/Jisoo.jpeg", LocalDate.of(2016, 8, 8), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Jennie", "Rapera/Vocalista", "/ImagenesArtistas/Jennie.jpeg", LocalDate.of(2016, 8, 8), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Rosé", "Vocalista", "/ImagenesArtistas/Rose.jpeg", LocalDate.of(2016, 8, 8), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Lisa", "Rapera", "/ImagenesArtistas/Lisa.jpeg", LocalDate.of(2016, 8, 8), null, true));
        ListaArtistasGrupo[18] = new ArtistasDTO("BLACKPINK", "/ImagenesArtistas/BLACKPINK.jpeg", "Grupo", "K-pop", ListaIntegrantes);

        // Grupo 20: The Piano Guys
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Jon Schmidt", "Pianista", "/ImagenesArtistas/JonSchmidt.jpeg", LocalDate.of(2010, 3, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Steven Sharp Nelson", "Cellista", "/ImagenesArtistas/StevenNelson.jpeg", LocalDate.of(2010, 3, 1), null, true));
        ListaArtistasGrupo[19] = new ArtistasDTO("The Piano Guys", "/ImagenesArtistas/ThePianoGuys.jpeg", "Grupo", "Soul", ListaIntegrantes);

        // Grupo 21: Daft Punk
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Thomas Bangalter", "Productor/Músico", "/ImagenesArtistas/ThomasBangalter.jpeg", LocalDate.of(1993, 1, 12), LocalDate.of(2021, 2, 22), true));  // Daft Punk se separó en 2021
        ListaIntegrantes.add(new IntegranteDTO("Guy-Manuel de Homem-Christo", "Productor/Músico", "/ImagenesArtistas/GuyManuel.jpeg", LocalDate.of(1993, 1, 12), LocalDate.of(2021, 2, 22), true));  // Daft Punk se separó en 2021
        ListaArtistasGrupo[20] = new ArtistasDTO("Daft Punk", "/ImagenesArtistas/DaftPunk.jpeg", "Grupo", "Electronica", ListaIntegrantes);

        // Grupo 22: Camila
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Samoh", "Vocalista", "/ImagenesArtistas/SamohCamila.jpeg", LocalDate.of(2005, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Mario Domm", "Vocalista", "/ImagenesArtistas/MarioDomm.jpeg", LocalDate.of(2005, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Pablo Hurtado", "Guitarrista", "/ImagenesArtistas/PabloHurtado.jpeg", LocalDate.of(2005, 1, 1), null, true));
        ListaArtistasGrupo[21] = new ArtistasDTO("Camila", "/ImagenesArtistas/Camila.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 23: Måneskin
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Damiano David", "Vocalista", "/ImagenesArtistas/DamianoDavid.jpeg", LocalDate.of(2016, 1, 1), null, true));  // Fecha de inicio en la banda
        ListaIntegrantes.add(new IntegranteDTO("Victoria De Angelis", "Bajista", "/ImagenesArtistas/VictoriaDeAngelis.jpeg", LocalDate.of(2016, 1, 1), null, true)); // Fecha de inicio en la banda
        ListaIntegrantes.add(new IntegranteDTO("Thomas Raggi", "Guitarrista", "/ImagenesArtistas/ThomasRaggi.jpeg", LocalDate.of(2016, 1, 1), null, true)); // Fecha de inicio en la banda
        ListaIntegrantes.add(new IntegranteDTO("Ethan Torchio", "Baterista", "/ImagenesArtistas/EthanTorchio.jpeg", LocalDate.of(2016, 1, 1), null, true));  // Fecha de inicio en la banda
        ListaArtistasGrupo[22] = new ArtistasDTO("Måneskin", "/ImagenesArtistas/Maneskin.jpeg", "Grupo", "Rock", ListaIntegrantes);

        // Grupo 24: Grupo Frontera
        ListaIntegrantes.add(new IntegranteDTO("Adelaido Solís", "Vocalista", "/ImagenesArtistas/AdelaidoSolis.jpeg", LocalDate.of(2022, 1, 1), null, true)); // Miembro desde la formación
        ListaIntegrantes.add(new IntegranteDTO("Juan Javier Cantú", "Acordeonista", "/ImagenesArtistas/JuanJavierCantu.jpeg", LocalDate.of(2022, 1, 1), null, true)); // Miembro desde la formación
        ListaIntegrantes.add(new IntegranteDTO("Julián Peña Jr.", "Percusionista", "/ImagenesArtistas/JulianPeñaJr.jpeg", LocalDate.of(2022, 1, 1), null, true)); // Miembro desde la formación
        ListaIntegrantes.add(new IntegranteDTO("Alberto Acosta", "Bajista", "/ImagenesArtistas/AlbertoAcosta.jpeg", LocalDate.of(2022, 1, 1), null, true)); // Miembro desde la formación
        ListaIntegrantes.add(new IntegranteDTO("Carlos Guerrero", "Baterista", "/ImagenesArtistas/CarlosGuerrero.jpeg", LocalDate.of(2022, 1, 1), null, true)); // Miembro desde la formación
        ListaIntegrantes.add(new IntegranteDTO("Carlos Zamora", "Bajista", "/ImagenesArtistas/CarlosZamora.jpeg", LocalDate.of(2022, 1, 1), LocalDate.of(2022, 11, 1), false)); // Miembro hasta junio 2023
        ListaIntegrantes.add(new IntegranteDTO("Brian Ortega", "Bajista", "/ImagenesArtistas/BrianOrtega.jpeg", LocalDate.of(2023, 6, 1), null, true)); // Miembro desde junio 2023
        ListaArtistasGrupo[23] = new ArtistasDTO("Grupo Frontera", "/ImagenesArtistas/GrupoFrontera.jpeg", "Grupo", "Banda", ListaIntegrantes);

        // Grupo 25: One Direction
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Harry Styles", "Vocalista", "/ImagenesArtistas/HarryStyles.jpeg", LocalDate.of(2010, 7, 23), LocalDate.of(2016, 1, 1), false));
        ListaIntegrantes.add(new IntegranteDTO("Liam Payne", "Vocalista", "/ImagenesArtistas/LiamPayne.jpeg", LocalDate.of(2010, 7, 23), LocalDate.of(2016, 1, 1), false));
        ListaIntegrantes.add(new IntegranteDTO("Louis Tomlinson", "Vocalista", "/ImagenesArtistas/LouisTomlinson.jpeg", LocalDate.of(2010, 7, 23), LocalDate.of(2016, 1, 1), false));
        ListaIntegrantes.add(new IntegranteDTO("Niall Horan", "Vocalista", "/ImagenesArtistas/NiallHoran.jpeg", LocalDate.of(2010, 7, 23), LocalDate.of(2016, 1, 1), false));
        ListaIntegrantes.add(new IntegranteDTO("Zayn Malik", "Vocalista", "/ImagenesArtistas/ZaynMalik.jpeg", LocalDate.of(2010, 7, 23), LocalDate.of(2015, 3, 25), false));
        ListaArtistasGrupo[24] = new ArtistasDTO("One Direction", "/ImagenesArtistas/OneDirection.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 26: Le Sserafim
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Sakura", "Vocalista", "/ImagenesArtistas/Sakura.jpeg", LocalDate.of(2022, 5, 2), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Kim Chae-won", "Vocalista", "/ImagenesArtistas/KimChaewon.jpeg", LocalDate.of(2022, 5, 2), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Huh Yun-jin", "Vocalista", "/ImagenesArtistas/HuhYunjin.jpeg", LocalDate.of(2022, 5, 2), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Kazuha", "Danzarina", "/ImagenesArtistas/Kazuha.jpeg", LocalDate.of(2022, 5, 2), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Hong Eun-chae", "Vocalista", "/ImagenesArtistas/HongEunchae.jpeg", LocalDate.of(2022, 5, 2), null, true));
        ListaArtistasGrupo[25] = new ArtistasDTO("Le Sserafim", "/ImagenesArtistas/LeSserafim.jpeg", "Grupo", "K-pop", ListaIntegrantes);

        // Grupo 27: Intocable
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Ricardo Muñoz", "Vocalista/Guitarrista", "/ImagenesArtistas/RicardoMunoz.jpeg", LocalDate.of(1993, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("René Martínez", "Percusionista/Baterista", "/ImagenesArtistas/ReneMartinez.jpeg", LocalDate.of(1993, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Johnny Lee Rosas", "Acordeonista", "/ImagenesArtistas/JohnnyLeeRosas.jpeg", LocalDate.of(1998, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Félix Salinas", "Bajista", "/ImagenesArtistas/FelixSalinas.jpeg", LocalDate.of(1993, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Daniel Sánchez", "Percusionista", "/ImagenesArtistas/DanielSanchez.jpeg", LocalDate.of(1993, 1, 1), null, true));
        ListaArtistasGrupo[26] = new ArtistasDTO("Intocable", "/ImagenesArtistas/Intocable.jpeg", "Grupo", "Banda", ListaIntegrantes);

        // Grupo 28: Banda MS
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Oswaldo Silvas Carreón", "Vocalista", "/ImagenesArtistas/OswaldoSilvas.jpeg", LocalDate.of(2003, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Alan Ramírez", "Vocalista", "/ImagenesArtistas/AlanRamirez.jpeg", LocalDate.of(2006, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Sergio Lizárraga", "Director Musical/Tuba", "/ImagenesArtistas/SergioLizarraga.jpeg", LocalDate.of(2003, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Julión Álvarez", "Vocalista", "/ImagenesArtistas/JulionAlvarez.jpeg", LocalDate.of(2003, 1, 1), LocalDate.of(2006, 1, 1), false));
        ListaArtistasGrupo[27] = new ArtistasDTO("Banda MS", "/ImagenesArtistas/BandaMS.jpeg", "Grupo", "Banda", ListaIntegrantes);

        // Grupo 29:  Timbiriche
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Thalía", "Vocalista", "/ImagenesArtistas/Thalia.jpeg", LocalDate.of(1986, 1, 1), LocalDate.of(1989, 1, 1), false));
        ListaIntegrantes.add(new IntegranteDTO("Paulina Rubio", "Vocalista", "/ImagenesArtistas/PaulinaRubio.jpeg", LocalDate.of(1982, 1, 1), LocalDate.of(1991, 1, 1), false));
        ListaIntegrantes.add(new IntegranteDTO("Erik Rubín", "Vocalista", "/ImagenesArtistas/ErikRubin.jpeg", LocalDate.of(1983, 1, 1), LocalDate.of(1994, 1, 1), false));
        ListaIntegrantes.add(new IntegranteDTO("Benny Ibarra", "Vocalista", "/ImagenesArtistas/BennyIbarra.jpeg", LocalDate.of(1982, 1, 1), LocalDate.of(1985, 1, 1), false));
        ListaIntegrantes.add(new IntegranteDTO("Alix Bauer", "Vocalista", "/ImagenesArtistas/AlixBauer.jpeg", LocalDate.of(1982, 1, 1), LocalDate.of(1991, 1, 1), false));
        ListaIntegrantes.add(new IntegranteDTO("Diego Schoening", "Vocalista", "/ImagenesArtistas/DiegoSchoening.jpeg", LocalDate.of(1982, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Sasha Sokol", "Vocalista", "/ImagenesArtistas/SashaSokol.jpeg", LocalDate.of(1982, 1, 1), LocalDate.of(1986, 1, 1), false));
        ListaArtistasGrupo[28] = new ArtistasDTO("Timbiriche", "/ImagenesArtistas/Timbiriche.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 30: RBD
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Anahí", "Vocalista", "/ImagenesArtistas/Anahi.jpeg", LocalDate.of(2004, 1, 1), null, false));
        ListaIntegrantes.add(new IntegranteDTO("Dulce María", "Vocalista", "/ImagenesArtistas/DulceMaria.jpeg", LocalDate.of(2004, 1, 1), null, false));
        ListaIntegrantes.add(new IntegranteDTO("Maite Perroni", "Vocalista", "/ImagenesArtistas/MaitePerroni.jpeg", LocalDate.of(2004, 1, 1), null, false));
        ListaIntegrantes.add(new IntegranteDTO("Christian Chávez", "Vocalista", "/ImagenesArtistas/ChristianChavez.jpeg", LocalDate.of(2004, 1, 1), null, false));
        ListaIntegrantes.add(new IntegranteDTO("Christopher Uckermann", "Vocalista", "/ImagenesArtistas/ChristopherUckermann.jpeg", LocalDate.of(2004, 1, 1), null, false));
        ListaIntegrantes.add(new IntegranteDTO("Alfonso Herrera", "Vocalista", "/ImagenesArtistas/AlfonsoHerrera.jpeg", LocalDate.of(2004, 1, 1), LocalDate.of(2009, 12, 21), false));
        ListaArtistasGrupo[29] = new ArtistasDTO("RBD", "/ImagenesArtistas/RBD.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 31: Mecano
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Ana Torroja", "Vocalista", "/ImagenesArtistas/AnaTorroja.jpeg", LocalDate.of(1982, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("José María Cano", "Compositor/Guitarrista", "/ImagenesArtistas/JoseMariaCano.jpeg", LocalDate.of(1982, 1, 1), LocalDate.of(1998, 1, 1), false));
        ListaIntegrantes.add(new IntegranteDTO("Nacho Cano", "Compositor/Guitarrista", "/ImagenesArtistas/NachoCano.jpeg", LocalDate.of(1982, 1, 1), null, true));
        ListaArtistasGrupo[30] = new ArtistasDTO("Mecano", "/ImagenesArtistas/Mecano.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 32: OV7
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Ari Borovoy", "Vocalista", "/ImagenesArtistas/AriBorovoy.jpeg", LocalDate.of(1989, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Mariana Ochoa", "Vocalista", "/ImagenesArtistas/MarianaOchoa.jpeg", LocalDate.of(1989, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Lidia Ávila", "Vocalista", "/ImagenesArtistas/LidiaAvila.jpeg", LocalDate.of(1989, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("M'balia Marichal", "Vocalista", "/ImagenesArtistas/Mbalia.jpeg", LocalDate.of(1989, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Erika Zaba", "Vocalista", "/ImagenesArtistas/ErikaZaba.jpeg", LocalDate.of(1989, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Oscar Schwebel", "Vocalista", "/ImagenesArtistas/OscarSchwebel.jpeg", LocalDate.of(1989, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Kalimba", "Vocalista", "/ImagenesArtistas/Kalimba.jpeg", LocalDate.of(1993, 1, 1), LocalDate.of(1997, 1, 1), false));
        ListaArtistasGrupo[31] = new ArtistasDTO("OV7", "/ImagenesArtistas/OV7.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 33: Ha-Ash
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Hanna", "Vocalista", "/ImagenesArtistas/Hanna.jpeg", LocalDate.of(2002, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Ashley", "Vocalista", "/ImagenesArtistas/Ashley.jpeg", LocalDate.of(2002, 1, 1), null, true));
        ListaArtistasGrupo[32] = new ArtistasDTO("Ha-Ash", "/ImagenesArtistas/HaAsh.jpeg", "Dúo", "Pop", ListaIntegrantes);

        // Grupo 34: Los Tigres del Norte
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Jorge Hernández", "Vocalista", "/ImagenesArtistas/JorgeHernandez.jpeg", LocalDate.of(1968, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Hernán Hernández", "Bajista", "/ImagenesArtistas/HernanHernandez.jpeg", LocalDate.of(1968, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Raúl Hernández", "Bajo Sexto", "/ImagenesArtistas/RaulHernandez.jpeg", LocalDate.of(1968, 1, 1), LocalDate.of(1996, 1, 1), false));
        ListaIntegrantes.add(new IntegranteDTO("Eduardo Hernández", "Acordeonista", "/ImagenesArtistas/EduardoHernandez.jpeg", LocalDate.of(1988, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Luis Hernández", "Baterista", "/ImagenesArtistas/LuisHernandez.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Óscar Lara", "Baterista", "/ImagenesArtistas/OscarLara.jpeg", LocalDate.of(1968, 1, 1), LocalDate.of(2022, 1, 1), false));
        ListaArtistasGrupo[33] = new ArtistasDTO("Los Tigres del Norte", "/ImagenesArtistas/LosTigresDelNorte.jpeg", "Grupo", "Banda", ListaIntegrantes);

        // Grupo 35: Pandora
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Isabel Lascuráin", "Vocalista", "/ImagenesArtistas/IsabelLascurain.jpeg", LocalDate.of(1985, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Mayté Lascuráin", "Vocalista", "/ImagenesArtistas/MayteLascurain.jpeg", LocalDate.of(1985, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Fernanda Meade", "Vocalista", "/ImagenesArtistas/FernandaMeade.jpeg", LocalDate.of(1985, 1, 1), null, false));
        ListaArtistasGrupo[34] = new ArtistasDTO("Pandora", "/ImagenesArtistas/Pandora.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 36: Spice Girls
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Mel B", "Vocalista", "/ImagenesArtistas/MelB.jpeg", LocalDate.of(1994, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Mel C", "Vocalista", "/ImagenesArtistas/MelC.jpeg", LocalDate.of(1994, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Emma Bunton", "Vocalista", "/ImagenesArtistas/EmmaBunton.jpeg", LocalDate.of(1994, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Geri Halliwell", "Vocalista", "/ImagenesArtistas/GeriHalliwell.jpeg", LocalDate.of(1994, 1, 1), LocalDate.of(1998, 5, 1), false));
        ListaIntegrantes.add(new IntegranteDTO("Victoria Beckham", "Vocalista", "/ImagenesArtistas/VictoriaBeckham.jpeg", LocalDate.of(1994, 1, 1), null, true));
        ListaArtistasGrupo[35] = new ArtistasDTO("Spice Girls", "/ImagenesArtistas/SpiceGirls.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 37: TXT
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Soobin", "Líder/Vocalista", "/ImagenesArtistas/Soobin.jpeg", LocalDate.of(2019, 3, 4), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Yeonjun", "Vocalista", "/ImagenesArtistas/Yeonjun.jpeg", LocalDate.of(2019, 3, 4), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Beomgyu", "Vocalista", "/ImagenesArtistas/Beomgyu.jpeg", LocalDate.of(2019, 3, 4), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Taehyun", "Vocalista", "/ImagenesArtistas/Taehyun.jpeg", LocalDate.of(2019, 3, 4), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Huening Kai", "Vocalista", "/ImagenesArtistas/HueningKai.jpeg", LocalDate.of(2019, 3, 4), null, true));
        ListaArtistasGrupo[36] = new ArtistasDTO("TXT", "/ImagenesArtistas/TXT.jpeg", "Grupo", "K-pop", ListaIntegrantes);

        // Grupo 38: Morat
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Juan Pablo Isaza", "Vocalista/Guitarrista", "/ImagenesArtistas/JuanPabloIsaza.jpeg", LocalDate.of(2015, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Simón Vargas", "Bajista", "/ImagenesArtistas/SimonVargas.jpeg", LocalDate.of(2015, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Martin Vargas", "Guitarrista", "/ImagenesArtistas/MartinVargas.jpeg", LocalDate.of(2015, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Juan Pablo Villamil", "Bajista/Corista", "/ImagenesArtistas/JuanPabloVillamil.jpeg", LocalDate.of(2015, 1, 1), null, true));
        ListaArtistasGrupo[37] = new ArtistasDTO("Morat", "/ImagenesArtistas/Morat.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 39: Jesse & Joy
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Jesse Huerta", "Vocalista/Guitarrista", "/ImagenesArtistas/JesseHuerta.jpeg", LocalDate.of(2005, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Joy Huerta", "Vocalista", "/ImagenesArtistas/JoyHuerta.jpeg", LocalDate.of(2005, 1, 1), null, true));
        ListaArtistasGrupo[38] = new ArtistasDTO("Jesse & Joy", "/ImagenesArtistas/JesseJoy.jpeg", "Dúo", "Pop", ListaIntegrantes);

        // Grupo 40: La Oreja de Van Gogh
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Amaia Montero", "Vocalista", "/ImagenesArtistas/AmaiaMontero.jpeg", LocalDate.of(1996, 1, 1), LocalDate.of(2007, 1, 1), false));
        ListaIntegrantes.add(new IntegranteDTO("Xabi San Martín", "Tecladista", "/ImagenesArtistas/XabiSanMartin.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Pablo Benegas", "Guitarrista", "/ImagenesArtistas/PabloBenegas.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Alvaro Fuentes", "Bajista", "/ImagenesArtistas/AlvaroFuentes.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Haritz Garde", "Baterista", "/ImagenesArtistas/HaritzGarde.jpeg", LocalDate.of(1996, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Leire Martínez", "Vocalista", "/ImagenesArtistas/LeireMartinez.jpeg", LocalDate.of(2008, 1, 1), null, true));
        ListaArtistasGrupo[39] = new ArtistasDTO("La Oreja de Van Gogh", "/ImagenesArtistas/OrejaDeVanGogh.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 41: DVICIO
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Andrés Ceballos", "Vocalista", "/ImagenesArtistas/AndresCeballos.jpeg", LocalDate.of(2013, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Martín Ceballos", "Vocalista", "/ImagenesArtistas/MartinCeballos.jpeg", LocalDate.of(2013, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Alberto González", "Guitarrista", "/ImagenesArtistas/AlbertoGonzalez.jpeg", LocalDate.of(2013, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Nacho Gotor", "Bajista", "/ImagenesArtistas/NachoGotor.jpeg", LocalDate.of(2013, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Luis Gonzalvo", "Baterista", "/ImagenesArtistas/LuisGonzalvo.jpeg", LocalDate.of(2013, 1, 1), null, true));
        ListaArtistasGrupo[40] = new ArtistasDTO("DVICIO", "/ImagenesArtistas/DVICIO.jpeg", "Grupo", "Pop", ListaIntegrantes);

        // Grupo 42: Little Mix
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Jesy Nelson", "Vocalista", "/ImagenesArtistas/JesyNelson.jpeg", LocalDate.of(2011, 8, 1), LocalDate.of(2020, 12, 14), false));
        ListaIntegrantes.add(new IntegranteDTO("Perrie Edwards", "Vocalista", "/ImagenesArtistas/PerrieEdwards.jpeg", LocalDate.of(2011, 8, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Leigh-Anne Pinnock", "Vocalista", "/ImagenesArtistas/LeighAnnePinnock.jpeg", LocalDate.of(2011, 8, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Jade Thirlwall", "Vocalista", "/ImagenesArtistas/JadeThirlwall.jpeg", LocalDate.of(2011, 8, 1), null, true));
        ListaArtistasGrupo[41] = new ArtistasDTO("Little Mix", "/ImagenesArtistas/LittleMix.jpeg", "Grupo", "R&B", ListaIntegrantes);

        // Grupo 43: Reik
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Jesus Alberto Navarro", "Vocalista", "/ImagenesArtistas/JesusNavarro.jpeg", LocalDate.of(2003, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Julio Ramirez Eguia", "Bajista", "/ImagenesArtistas/JulioRamirezEguia.jpeg", LocalDate.of(2003, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Gilbert Velázquez", "Guitarrista", "/ImagenesArtistas/GilbertVelazquez.jpeg", LocalDate.of(2003, 1, 1), null, true));
        ListaArtistasGrupo[42] = new ArtistasDTO("Reik", "/ImagenesArtistas/Reik.jpeg", "Grupo", "Balada", ListaIntegrantes);

        // Grupo 44: Río Roma
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Raúl Ornelas", "Vocalista/Guitarrista", "/ImagenesArtistas/RaulOrnelas.jpeg", LocalDate.of(2004, 1, 1), null, true));
        ListaIntegrantes.add(new IntegranteDTO("José Luis Ortega", "Vocalista/Guitarrista", "/ImagenesArtistas/JoseLuisOrtega.jpeg", LocalDate.of(2004, 1, 1), null, true));
        ListaArtistasGrupo[43] = new ArtistasDTO("Río Roma", "/ImagenesArtistas/Rioroma.jpeg", "Dúo", "Pop", ListaIntegrantes);

        // Grupo 45: Fifth Harmony
        ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(new IntegranteDTO("Ally Brooke", "Vocalista", "/ImagenesArtistas/AllyBrooke.jpeg", LocalDate.of(2012, 7, 27), LocalDate.of(2018, 5, 19), false));
        ListaIntegrantes.add(new IntegranteDTO("Normani Kordei", "Vocalista", "/ImagenesArtistas/NormaniKordei.jpeg", LocalDate.of(2012, 7, 27), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Dinah Jane", "Vocalista", "/ImagenesArtistas/DinahJane.jpeg", LocalDate.of(2012, 7, 27), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Lauren Jauregui", "Vocalista", "/ImagenesArtistas/LaurenJauregui.jpeg", LocalDate.of(2012, 7, 27), null, true));
        ListaIntegrantes.add(new IntegranteDTO("Camila Cabello", "Vocalista", "/ImagenesArtistas/CamilaCabello.jpeg", LocalDate.of(2012, 7, 27), LocalDate.of(2016, 12, 18), false));
        ListaArtistasGrupo[44] = new ArtistasDTO("Fifth Harmony", "/ImagenesArtistas/FifthHarmony.jpeg", "Grupo", "Pop", ListaIntegrantes);

        //Insertar grupos
        for (int i = 0; i < 45; i++) {
            artistaBO.insertarArtista(ListaArtistasGrupo[i]);

        }
    }

    public void crearCanciones() {
        try {
            List<CancionDTO> canciones = List.of(
                    // Canciones de Taylor Swift
                    new CancionDTO("Love Story", "3:55", "Pop"),
                    new CancionDTO("You Belong With Me", "3:52", "Pop"),
                    new CancionDTO("Fearless", "4:01", "Pop"),
                    new CancionDTO("Shake It Off", "3:39", "Pop"),
                    new CancionDTO("Blank Space", "3:51", "Pop"),
                    new CancionDTO("Style", "3:51", "Pop"),
                    // Canciones de Ed Sheeran
                    new CancionDTO("Shape of You", "3:53", "Pop"),
                    new CancionDTO("Castle on the Hill", "4:21", "Hard Rock"),
                    new CancionDTO("Perfect", "4:23", "Balada"),
                    new CancionDTO("Thinking Out Loud", "4:41", "Soul"),
                    new CancionDTO("Photograph", "4:18", "Pop"),
                    new CancionDTO("Sing", "3:55", "Funk"),
                    // Canciones de Adele
                    new CancionDTO("Hello", "4:55", "Soul"),
                    new CancionDTO("When We Were Young", "4:51", "Soul"),
                    new CancionDTO("Water Under the Bridge", "4:00", "Pop"),
                    new CancionDTO("Rolling in the Deep", "3:48", "Soul"),
                    new CancionDTO("Someone Like You", "4:45", "Balada"),
                    new CancionDTO("Set Fire to the Rain", "4:02", "Pop"),
                    // Canciones de Bruno Mars
                    new CancionDTO("Just the Way You Are", "3:40", "Pop"),
                    new CancionDTO("Grenade", "3:42", "Pop"),
                    new CancionDTO("The Lazy Song", "3:10", "Pop"),
                    new CancionDTO("Uptown Funk", "4:30", "Funk"),
                    new CancionDTO("24K Magic", "3:46", "Funk"),
                    new CancionDTO("Versace on the Floor", "4:21", "R&B"),
                    // Canciones de Billie Eilish
                    new CancionDTO("Bad Guy", "3:14", "Electropop"),
                    new CancionDTO("When the Party's Over", "3:16", "Balada"),
                    new CancionDTO("Bury a Friend", "3:13", "Pop"),
                    new CancionDTO("Ocean Eyes", "3:20", "Pop"),
                    new CancionDTO("Bellyache", "2:59", "Indie"),
                    new CancionDTO("Copycat", "3:14", "Pop"),
                    // Canciones de Shawn Mendes
                    new CancionDTO("Stitches", "3:27", "Pop"),
                    new CancionDTO("Life of the Party", "3:34", "Pop"),
                    new CancionDTO("Never Be Alone", "3:36", "Pop"),
                    new CancionDTO("Treat You Better", "3:08", "Pop"),
                    new CancionDTO("Mercy", "3:28", "Pop"),
                    new CancionDTO("There's Nothing Holdin' Me Back", "3:19", "Pop"),
                    // Canciones de Lady Gaga
                    new CancionDTO("Bad Romance", "4:54", "Electropop"),
                    new CancionDTO("Alejandro", "4:34", "Pop"),
                    new CancionDTO("Telephone", "3:40", "Pop"),
                    new CancionDTO("Poker Face", "3:57", "Electropop"),
                    new CancionDTO("Just Dance", "4:01", "Pop"),
                    new CancionDTO("LoveGame", "3:36", "Pop"),
                    // Canciones de Justin Bieber
                    new CancionDTO("Sorry", "3:20", "Pop"),
                    new CancionDTO("What Do You Mean?", "3:25", "Pop"),
                    new CancionDTO("Love Yourself", "3:54", "Pop"),
                    new CancionDTO("Baby", "3:36", "Pop"),
                    new CancionDTO("One Time", "3:35", "Pop"),
                    new CancionDTO("One Less Lonely Girl", "3:48", "Pop"),
                    // Canciones de Rihanna
                    new CancionDTO("Umbrella", "4:36", "R&B"),
                    new CancionDTO("Don't Stop the Music", "4:27", "Pop"),
                    new CancionDTO("Take a Bow", "3:49", "Balada"),
                    new CancionDTO("Diamonds", "3:45", "Pop"),
                    new CancionDTO("Stay", "4:00", "Balada"),
                    new CancionDTO("Work", "3:39", "Pop"),
                    // Canciones de Sam Smith
                    new CancionDTO("Stay With Me", "2:52", "Soul"),
                    new CancionDTO("I'm Not the Only One", "3:59", "Soul"),
                    new CancionDTO("Like I Can", "2:47", "Soul"),
                    new CancionDTO("Too Good at Goodbyes", "3:21", "Soul"),
                    new CancionDTO("Pray", "3:41", "Pop"),
                    new CancionDTO("Burning", "3:23", "Balada"),
                    // Canciones de Ariana Grande
                    new CancionDTO("Thank U, Next", "3:27", "R&B"),
                    new CancionDTO("7 Rings", "2:58", "Pop"),
                    new CancionDTO("Break Up with Your Girlfriend, I'm Bored", "3:10", "Pop"),
                    new CancionDTO("Side to Side", "3:46", "Pop"),
                    new CancionDTO("Dangerous Woman", "3:55", "Pop"),
                    new CancionDTO("Into You", "4:04", "Pop"),
                    // Canciones de Dua Lipa
                    new CancionDTO("Don't Start Now", "3:03", "Pop"),
                    new CancionDTO("Physical", "3:14", "Pop"),
                    new CancionDTO("Levitating", "3:23", "Pop"),
                    new CancionDTO("New Rules", "3:29", "Pop"),
                    new CancionDTO("IDGAF", "3:37", "Electropop"),
                    new CancionDTO("One Kiss", "3:34", "Pop"),
                    // Canciones de The Weeknd
                    new CancionDTO("Blinding Lights", "3:20", "Pop"),
                    new CancionDTO("Heartless", "3:18", "Funk"),
                    new CancionDTO("Save Your Tears", "3:36", "Pop"),
                    new CancionDTO("Can't Feel My Face", "3:35", "Funk"),
                    new CancionDTO("The Hills", "4:02", "R&B"),
                    new CancionDTO("In the Night", "3:55", "Pop"),
                    // Canciones de Harry Styles
                    new CancionDTO("Watermelon Sugar", "2:54", "Pop"),
                    new CancionDTO("Adore You", "3:27", "Pop"),
                    new CancionDTO("Falling", "4:00", "Balada"),
                    new CancionDTO("Sign of the Times", "5:40", "Rock"),
                    new CancionDTO("Sweet Creature", "3:44", "Pop"),
                    new CancionDTO("Kiwi", "2:56", "Rock"),
                    // Canciones de Selena Gomez
                    new CancionDTO("Lose You to Love Me", "3:27", "Balada"),
                    new CancionDTO("Look At Her Now", "2:44", "Electropop"),
                    new CancionDTO("Rare", "3:40", "Electropop"),
                    new CancionDTO("Bad Liar", "3:34", "Indie"),
                    new CancionDTO("Fetish", "3:06", "Electropop"),
                    new CancionDTO("Wolves", "3:17", "Electropop"),
                    // Canciones de Post Malone
                    new CancionDTO("Rockstar", "3:38", "Rap"),
                    new CancionDTO("Psycho", "3:41", "Rap"),
                    new CancionDTO("Better Now", "3:52", "Rap"),
                    new CancionDTO("Circles", "3:35", "Rock"),
                    new CancionDTO("Wow.", "2:29", "Rap"),
                    new CancionDTO("Goodbyes", "2:55", "Rap"),
                    // Canciones de Drake
                    new CancionDTO("Hotline Bling", "4:27", "Rap"),
                    new CancionDTO("One Dance", "2:54", "Rap"),
                    new CancionDTO("Controlla", "4:06", "Pop"),
                    new CancionDTO("God's Plan", "3:18", "Rap"),
                    new CancionDTO("In My Feelings", "3:37", "Rap"),
                    new CancionDTO("Nice For What", "3:30", "Rap"),
                    // Canciones de Miley Cyrus
                    new CancionDTO("Wrecking Ball", "3:41", "Balada"),
                    new CancionDTO("Adore You", "4:38", "Pop"),
                    new CancionDTO("We Can't Stop", "3:52", "Electropop"),
                    new CancionDTO("Party in the U.S.A.", "3:22", "Pop"),
                    new CancionDTO("The Climb", "3:55", "Pop"),
                    new CancionDTO("Malibu", "3:51", "Rock"),
                    // Canciones de Katy Perry
                    new CancionDTO("Roar", "3:42", "Pop"),
                    new CancionDTO("Dark Horse", "3:35", "Pop"),
                    new CancionDTO("Unconditionally", "3:48", "Balada"),
                    new CancionDTO("Teenage Dream", "3:47", "Pop"),
                    new CancionDTO("Firework", "3:48", "Pop"),
                    new CancionDTO("California Gurls", "3:56", "Electropop"),
                    // Canciones de Beyoncé
                    new CancionDTO("Halo", "4:21", "Balada"),
                    new CancionDTO("Single Ladies", "3:13", "R&B"),
                    new CancionDTO("If I Were a Boy", "4:10", "Pop"),
                    new CancionDTO("Formation", "3:26", "Rap"),
                    new CancionDTO("Sorry", "3:52", "R&B"),
                    new CancionDTO("Hold Up", "3:41", "Pop"),
                    // Canciones de Lana Del Rey
                    new CancionDTO("Summertime Sadness", "4:25", "Indie"),
                    new CancionDTO("Video Games", "4:42", "Indie"),
                    new CancionDTO("Blue Jeans", "3:30", "Indie"),
                    new CancionDTO("Young and Beautiful", "3:56", "Indie"),
                    new CancionDTO("West Coast", "4:16", "Indie"),
                    // Canciones de Halsey
                    new CancionDTO("Without Me", "3:22", "Pop"),
                    new CancionDTO("Graveyard", "3:02", "Pop"),
                    new CancionDTO("You Should Be Sad", "3:25", "Pop"),
                    new CancionDTO("Bad at Love", "3:01", "Pop"),
                    new CancionDTO("Now or Never", "3:34", "Pop"),
                    new CancionDTO("Colors", "4:09", "Pop"),
                    // Canciones de Charlie Puth
                    new CancionDTO("Attention", "3:31", "Pop"),
                    new CancionDTO("How Long", "3:18", "Pop"),
                    new CancionDTO("Done for Me", "3:00", "Pop"),
                    new CancionDTO("See You Again", "3:49", "Pop"),
                    new CancionDTO("We Don't Talk Anymore", "3:37", "Pop"),
                    new CancionDTO("One Call Away", "3:13", "Pop"),
                    // Canciones de Camila Cabello
                    new CancionDTO("Havana", "3:37", "Pop"),
                    new CancionDTO("Never Be the Same", "3:47", "Pop"),
                    new CancionDTO("She Loves Control", "2:57", "Pop"),
                    new CancionDTO("Señorita", "3:10", "Pop"),
                    new CancionDTO("Liar", "3:29", "Pop"),
                    new CancionDTO("Shameless", "3:40", "Pop"),
                    // Canciones de Lil Nas X
                    new CancionDTO("Old Town Road", "2:37", "Rap"),
                    new CancionDTO("Panini", "1:55", "Rap"),
                    new CancionDTO("Rodeo", "2:38", "Rap"),
                    new CancionDTO("Montero (Call Me By Your Name)", "2:17", "Rap"),
                    new CancionDTO("Industry Baby", "3:32", "Rap"),
                    new CancionDTO("That's What I Want", "2:23", "Rap"),
                    // Canciones de Doja Cat
                    new CancionDTO("Say So", "3:57", "Rap"),
                    new CancionDTO("Streets", "3:46", "Rap"),
                    new CancionDTO("Boss Bitch", "2:14", "Rap"),
                    new CancionDTO("Juicy", "3:23", "Rap"),
                    new CancionDTO("Tia Tamera", "3:31", "Rap"),
                    new CancionDTO("Mooo!", "4:01", "Rap"),
                    // Canciones de Lizzo
                    new CancionDTO("Truth Hurts", "2:53", "R&B"),
                    new CancionDTO("Tempo", "2:57", "R&B"),
                    new CancionDTO("Juice", "3:15", "R&B"),
                    new CancionDTO("Good as Hell", "2:39", "R&B"),
                    // Canciones de Shakira
                    new CancionDTO("Hips Don't Lie", "3:38", "Pop"),
                    new CancionDTO("Don't Bother", "4:17", "Pop"),
                    new CancionDTO("La Tortura", "3:36", "Pop"),
                    new CancionDTO("Waka Waka (This Time for Africa)", "3:22", "Pop"),
                    new CancionDTO("Loca", "3:04", "Pop"),
                    new CancionDTO("Rabiosa", "2:51", "Pop"),
                    // Canciones de Jennifer Lopez
                    new CancionDTO("On The Floor", "3:50", "Pop"),
                    new CancionDTO("Papi", "3:40", "Pop"),
                    new CancionDTO("Dance Again", "4:08", "Pop"),
                    new CancionDTO("Ain't Your Mama", "3:39", "Pop"),
                    new CancionDTO("El Anillo", "2:59", "Pop"),
                    new CancionDTO("Dinero", "3:33", "Pop"),
                    // Canciones de Nicki Minaj
                    new CancionDTO("Super Bass", "3:20", "Rap"),
                    new CancionDTO("Moment 4 Life", "4:39", "Rap"),
                    new CancionDTO("Fly", "3:32", "Rap"),
                    new CancionDTO("Starships", "3:30", "Rap"),
                    new CancionDTO("Pound the Alarm", "3:25", "Rap"),
                    new CancionDTO("Beez in the Trap", "4:28", "Rap"),
                    // Canciones de Kendrick Lamar
                    new CancionDTO("HUMBLE.", "2:57", "Rap"),
                    new CancionDTO("DNA.", "3:06", "Rap"),
                    new CancionDTO("LOYALTY.", "3:48", "Rap"),
                    new CancionDTO("Alright", "3:39", "Rap"),
                    new CancionDTO("King Kunta", "3:54", "Rap"),
                    new CancionDTO("The Blacker the Berry", "5:28", "Rap"),
                    // Canciones de Sia
                    new CancionDTO("Chandelier", "3:36", "Pop"),
                    new CancionDTO("Elastic Heart", "4:17", "Electropop"),
                    new CancionDTO("Big Girls Cry", "3:31", "Pop"),
                    new CancionDTO("Cheap Thrills", "3:31", "Pop"),
                    new CancionDTO("The Greatest", "3:30", "Electropop"),
                    new CancionDTO("Alive", "4:23", "Pop"),
                    // Canciones de John Legend
                    new CancionDTO("All of Me", "4:29", "R&B"),
                    new CancionDTO("You & I (Nobody in the World)", "4:12", "Soul"),
                    new CancionDTO("Made to Love", "4:00", "R&B"),
                    new CancionDTO("Ordinary People", "4:41", "Soul"),
                    new CancionDTO("So High", "5:00", "R&B"),
                    new CancionDTO("Used to Love U", "3:31", "Soul"),
                    // Canciones de Ellie Goulding
                    new CancionDTO("Love Me Like You Do", "4:12", "Electropop"),
                    new CancionDTO("On My Mind", "3:33", "Electropop"),
                    new CancionDTO("Something in the Way You Move", "3:47", "Pop"),
                    new CancionDTO("Lights", "3:30", "Electropop"),
                    new CancionDTO("Starry Eyed", "2:57", "Electropop"),
                    new CancionDTO("Guns and Horses", "3:35", "Indie"),
                    // Canciones de Avril Lavigne
                    new CancionDTO("Complicated", "4:05", "Pop"),
                    new CancionDTO("Sk8er Boi", "3:24", "Pop"),
                    new CancionDTO("I'm with You", "3:44", "Rock"),
                    new CancionDTO("Girlfriend", "3:37", "Pop"),
                    new CancionDTO("When You're Gone", "4:00", "Rock"),
                    new CancionDTO("Hot", "3:23", "Pop"),
                    // Canciones de Amy Winehouse
                    new CancionDTO("Rehab", "3:35", "Soul"),
                    new CancionDTO("You Know I'm No Good", "4:17", "Soul"),
                    new CancionDTO("Back to Black", "4:01", "Soul"),
                    new CancionDTO("Valerie", "3:53", "Soul"),
                    new CancionDTO("Tears Dry on Their Own", "3:06", "Soul"),
                    new CancionDTO("Love Is a Losing Game", "2:35", "Soul"),
                    // Canciones de Bad Bunny
                    new CancionDTO("MIA", "3:31", "Pop"),
                    new CancionDTO("Estamos Bien", "3:29", "Rap"),
                    new CancionDTO("Ni Bien Ni Mal", "4:15", "Rap"),
                    new CancionDTO("Safaera", "4:55", "Pop"),
                    new CancionDTO("Yo Perreo Sola", "2:52", "Pop"),
                    new CancionDTO("Vete", "3:13", "Rap"),
                    // Canciones de ROSALÍA
                    new CancionDTO("Malamente", "2:48", "Flamenco"),
                    new CancionDTO("Pienso en tu mirá", "3:13", "Flamenco"),
                    new CancionDTO("Di mi nombre", "2:42", "Flamenco"),
                    new CancionDTO("Con Altura", "2:42", "Pop"),
                    new CancionDTO("Yo x Ti, Tu x Mi", "3:26", "Pop"),
                    new CancionDTO("Juro Que", "2:39", "Flamenco"),
                    // Canciones de Miguel Bosé
                    new CancionDTO("Amante Bandido", "4:25", "Pop"),
                    new CancionDTO("Nena", "3:43", "Pop"),
                    new CancionDTO("Salamandra", "3:18", "Pop"),
                    new CancionDTO("Morena Mía", "4:01", "Pop"),
                    new CancionDTO("Si Tú No Vuelves", "4:47", "Balada"),
                    new CancionDTO("Te Amaré", "4:28", "Pop"),
                    // Canciones de Cazzu
                    new CancionDTO("Nada", "3:20", "Rap"),
                    new CancionDTO("Mucha Data", "3:24", "Rap"),
                    new CancionDTO("Mentiste", "3:18", "Rap"),
                    new CancionDTO("Visto a las 00:00", "2:47", "Rap"),
                    new CancionDTO("Bounce", "3:02", "Rap"),
                    new CancionDTO("Me Prefieres A Mi", "2:52", "Rap"),
                    // Canciones de Natalia Lafourcade
                    new CancionDTO("Hasta la Raíz", "3:41", "Pop"),
                    new CancionDTO("Lo Que Construimos", "4:11", "Pop"),
                    new CancionDTO("Nunca es Suficiente", "3:56", "Pop"),
                    new CancionDTO("Tú Sí Sabes Quererme", "3:34", "Balada"),
                    new CancionDTO("Danza de Gardenias", "3:20", "Pop"),
                    new CancionDTO("Soledad y el Mar", "3:45", "Pop"),
                    new CancionDTO("Mexicana Hermosa", "3:23", "Pop"),
                    // Canciones de Carla Morrison
                    new CancionDTO("Disfruto", "4:41", "Indie"),
                    new CancionDTO("Hasta la Piel", "3:53", "Balada"),
                    new CancionDTO("Déjenme Llorar", "4:15", "Balada"),
                    new CancionDTO("Eres Tú", "3:35", "Indie"),
                    new CancionDTO("Te Regalo", "4:08", "Indie"),
                    new CancionDTO("Azúcar Morena", "3:23", "Indie"),
                    // Canciones de Ángela Aguilar
                    new CancionDTO("La Llorona", "3:44", "Regional"),
                    new CancionDTO("Bésame Mucho", "4:11", "Balada"),
                    new CancionDTO("Paloma Negra", "4:03", "Regional"),
                    new CancionDTO("Dime Cómo Quieres", "3:13", "Regional"),
                    new CancionDTO("En Realidad", "3:12", "Regional"),
                    new CancionDTO("Ahí Donde Me Ven", "3:14", "Regional"),
                    // Canciones de José José
                    new CancionDTO("El Triste", "4:03", "Balada"),
                    new CancionDTO("La Nave del Olvido", "3:24", "Balada"),
                    new CancionDTO("Amar y Querer", "3:15", "Balada"),
                    new CancionDTO("Gavilán o Paloma", "3:24", "Balada"),
                    new CancionDTO("Volcán", "3:30", "Balada"),
                    new CancionDTO("Lo Pasado, Pasado", "3:17", "Balada"),
                    // Canciones de Rocío Dúrcal
                    new CancionDTO("Amor Eterno", "5:05", "Romantica"),
                    new CancionDTO("Costumbres", "4:05", "Regional"),
                    new CancionDTO("La Gata Bajo la Lluvia", "3:42", "Regional"),
                    new CancionDTO("Como Tu Mujer", "3:54", "Regional"),
                    new CancionDTO("Tarde", "3:57", "Regional"),
                    new CancionDTO("Jamás Te Prometí un Jardín de Rosas", "3:00", "Regional"),
                    // Canciones de The Beatles
                    new CancionDTO("Come Together", "4:20", "Rock"),
                    new CancionDTO("Something", "3:03", "Rock"),
                    new CancionDTO("Here Comes the Sun", "3:05", "Rock"),
                    new CancionDTO("Lucy in the Sky with Diamonds", "3:28", "Rock"),
                    new CancionDTO("A Day in the Life", "5:38", "Rock"),
                    new CancionDTO("Sgt. Pepper's Lonely Hearts Club Band", "2:02", "Rock"),
                    // Canciones de The Rolling Stones
                    new CancionDTO("Tumbling Dice", "3:45", "Rock"),
                    new CancionDTO("Rocks Off", "4:32", "Rock"),
                    new CancionDTO("Happy", "3:04", "Rock"),
                    new CancionDTO("Brown Sugar", "3:49", "Rock"),
                    new CancionDTO("Wild Horses", "5:43", "Rock"),
                    new CancionDTO("Can't You Hear Me Knocking", "7:15", "Rock"),
                    // Canciones de Queen
                    new CancionDTO("Bohemian Rhapsody", "5:55", "Rock"),
                    new CancionDTO("Somebody to Love", "4:56", "Rock"),
                    new CancionDTO("You're My Best Friend", "2:52", "Rock"),
                    new CancionDTO("We Will Rock You", "2:02", "Rock"),
                    new CancionDTO("We Are the Champions", "3:00", "Rock"),
                    new CancionDTO("Don't Stop Me Now", "3:29", "Rock"),
                    // Canciones de Pink Floyd
                    new CancionDTO("Time", "6:53", "Rock"),
                    new CancionDTO("Money", "6:22", "Rock"),
                    new CancionDTO("Us and Them", "7:49", "Rock"),
                    new CancionDTO("Another Brick in the Wall (Part 2)", "3:59", "Rock"),
                    new CancionDTO("Comfortably Numb", "6:22", "Rock"),
                    new CancionDTO("Hey You", "4:41", "Rock"),
                    // Canciones de Nirvana
                    new CancionDTO("Smells Like Teen Spirit", "5:01", "Grunge"),
                    new CancionDTO("Come as You Are", "3:38", "Grunge"),
                    new CancionDTO("Lithium", "4:17", "Grunge"),
                    new CancionDTO("Heart-Shaped Box", "4:41", "Grunge"),
                    new CancionDTO("Rape Me", "2:49", "Grunge"),
                    new CancionDTO("All Apologies", "3:52", "Grunge"),
                    // Canciones de The Eagles
                    new CancionDTO("Hotel California", "6:30", "Rock"),
                    new CancionDTO("New Kid in Town", "5:03", "Rock"),
                    new CancionDTO("Life in the Fast Lane", "4:46", "Rock"),
                    new CancionDTO("Tequila Sunrise", "2:52", "Rock"),
                    new CancionDTO("Desperado", "3:33", "Rock"),
                    new CancionDTO("Doolin' Dalton", "3:26", "Rock"),
                    // Canciones de Metallica
                    new CancionDTO("Battery", "5:12", "Metal"),
                    new CancionDTO("Welcome Home (Sanitarium)", "6:27", "Metal"),
                    new CancionDTO("Master of Puppets", "8:35", "Metal"),
                    new CancionDTO("For Whom the Bell Tolls", "5:10", "Metal"),
                    new CancionDTO("Fade to Black", "6:57", "Metal"),
                    new CancionDTO("One", "7:24", "Metal"),
                    // Canciones de Led Zeppelin
                    new CancionDTO("Stairway to Heaven", "8:02", "Hard Rock"),
                    new CancionDTO("Black Dog", "4:55", "Hard Rock"),
                    new CancionDTO("Rock and Roll", "3:41", "Hard Rock"),
                    new CancionDTO("Kashmir", "8:31", "Hard Rock"),
                    new CancionDTO("Trampled Under Foot", "5:35", "Hard Rock"),
                    new CancionDTO("Houses of the Holy", "4:01", "Hard Rock"),
                    // Canciones de Coldplay
                    new CancionDTO("Clocks", "5:07", "Rock"),
                    new CancionDTO("The Scientist", "5:09", "Rock"),
                    new CancionDTO("In My Place", "3:48", "Rock"),
                    new CancionDTO("Viva la Vida", "4:02", "Pop"),
                    new CancionDTO("Yellow", "4:29", "Rock"),
                    new CancionDTO("Fix You", "4:55", "Rock"),
                    // Canciones de Imagine Dragons
                    new CancionDTO("Radioactive", "3:07", "Rock"),
                    new CancionDTO("Demons", "2:57", "Pop"),
                    new CancionDTO("It's Time", "4:00", "Pop"),
                    new CancionDTO("Believer", "3:24", "Rock"),
                    new CancionDTO("Thunder", "3:07", "Pop"),
                    new CancionDTO("Whatever It Takes", "3:21", "Rock"),
                    // Canciones de Maroon 5
                    new CancionDTO("She Will Be Loved", "4:19", "Pop"),
                    new CancionDTO("This Love", "3:25", "Funk"),
                    new CancionDTO("Sunday Morning", "4:04", "Rock"),
                    new CancionDTO("Sugar", "3:55", "Pop"),
                    new CancionDTO("Animals", "3:51", "Rock"),
                    new CancionDTO("Maps", "3:09", "Pop"),
                    // Canciones de AC/DC
                    new CancionDTO("Highway to Hell", "3:28", "Hard Rock"),
                    new CancionDTO("Girls Got Rhythm", "3:24", "Rock"),
                    new CancionDTO("If You Want Blood (You've Got It)", "4:36", "Hard Rock"),
                    new CancionDTO("Back in Black", "4:15", "Hard Rock"),
                    new CancionDTO("Hells Bells", "5:12", "Hard Rock"),
                    new CancionDTO("You Shook Me All Night Long", "3:30", "Rock"),
                    // Canciones de Linkin Park
                    new CancionDTO("In the End", "3:36", "Metal"),
                    new CancionDTO("Crawling", "3:29", "Metal"),
                    new CancionDTO("One Step Closer", "2:36", "Metal"),
                    new CancionDTO("Numb", "3:07", "Rock"),
                    new CancionDTO("Faint", "2:42", "Metal"),
                    new CancionDTO("Somewhere I Belong", "3:33", "Rock"),
                    // Canciones de Arctic Monkeys
                    new CancionDTO("I Bet You Look Good on the Dancefloor", "2:53", "Indie"),
                    new CancionDTO("Fake Tales of San Francisco", "2:56", "Indie"),
                    new CancionDTO("Mardy Bum", "2:55", "Indie"),
                    new CancionDTO("Do I Wanna Know?", "4:32", "Indie"),
                    new CancionDTO("R U Mine?", "3:21", "Indie"),
                    new CancionDTO("Arabella", "3:27", "Indie"),
                    // Canciones de Twenty One Pilots
                    new CancionDTO("Stressed Out", "3:22", "Electropop"),
                    new CancionDTO("Ride", "3:34", "Rock"),
                    new CancionDTO("Tear in My Heart", "3:08", "Rock"),
                    new CancionDTO("Heathens", "3:15", "Electropop"),
                    new CancionDTO("Lane Boy", "4:13", "Rock"),
                    new CancionDTO("Polarize", "3:46", "Electropop"),
                    // Canciones de Paramore
                    new CancionDTO("Misery Business", "3:36", "Pop"),
                    new CancionDTO("Crushcrushcrush", "3:32", "Pop"),
                    new CancionDTO("That's What You Get", "3:40", "Pop"),
                    new CancionDTO("Still Into You", "3:36", "Rock"),
                    new CancionDTO("Ain't It Fun", "4:57", "Rock"),
                    new CancionDTO("Daydreaming", "4:31", "Rock"),
                    // Canciones de BTS
                    new CancionDTO("DNA", "3:43", "Pop"),
                    new CancionDTO("Mic Drop", "3:58", "Rap"),
                    new CancionDTO("Fake Love", "4:02", "K-pop"),
                    new CancionDTO("Yet To Come", "3:35", "K-pop"),
                    new CancionDTO("Run BTS", "3:25", "K-pop"),
                    new CancionDTO("For Youth", "4:42", "K-pop"),
                    // Canciones de ABBA
                    new CancionDTO("Dancing Queen", "3:52", "Funk"),
                    new CancionDTO("Mamma Mia", "3:32", "Pop"),
                    new CancionDTO("Take a Chance on Me", "4:06", "Pop"),
                    new CancionDTO("Waterloo", "2:46", "Pop"),
                    new CancionDTO("Honey, Honey", "2:55", "Pop"),
                    new CancionDTO("I Do, I Do, I Do, I Do, I Do", "3:16", "Pop"),
                    // Canciones de BLACKPINK
                    new CancionDTO("DDU-DU DDU-DU", "3:29", "K-pop"),
                    new CancionDTO("Kill This Love", "3:13", "K-pop"),
                    new CancionDTO("As If It's Your Last", "3:32", "K-pop"),
                    new CancionDTO("How You Like That", "3:01", "K-pop"),
                    new CancionDTO("Lovesick Girls", "3:14", "K-pop"),
                    new CancionDTO("Ice Cream", "2:56", "Pop"),
                    // Canciones de The Piano Guys
                    new CancionDTO("A Thousand Years", "4:38", "Balada"),
                    new CancionDTO("Beethoven's 5 Secrets", "5:11", "Balada"),
                    new CancionDTO("All of Me", "3:59", "Balada"),
                    new CancionDTO("Fight Song", "4:05", "Balada"),
                    new CancionDTO("What Makes You Beautiful", "3:42", "Balada"),
                    new CancionDTO("Let It Go", "3:39", "Balada"),
                    // Canciones de Daft Punk
                    new CancionDTO("One More Time", "5:20", "Electronica"),
                    new CancionDTO("Digital Love", "4:58", "Electronica"),
                    new CancionDTO("Harder, Better, Faster, Stronger", "3:45", "Electronica"),
                    new CancionDTO("Get Lucky", "6:07", "Electronica"),
                    new CancionDTO("Lose Yourself to Dance", "5:53", "Electronica"),
                    new CancionDTO("Give Life Back to Music", "4:34", "Electronica"),
                    // Canciones de Camila (banda)
                    new CancionDTO("Elypse", "4:03", "Pop"),
                    new CancionDTO("No Es Así", "4:10", "Pop"),
                    new CancionDTO("Quiero Verte", "4:20", "Pop"),
                    new CancionDTO("Regresa", "3:55", "Pop"),
                    new CancionDTO("Te Extraño", "3:48", "Pop"),
                    new CancionDTO("Por Un Segundo", "4:12", "Pop"),
                    // Canciones de Måneskin
                    new CancionDTO("Zitti E Buoni", "3:15", "Rock"),
                    new CancionDTO("I Wanna Be Your Slave", "2:53", "Rock"),
                    new CancionDTO("Coraline", "5:00", "Rock"),
                    new CancionDTO("The Loneliest", "4:07", "Rock"),
                    new CancionDTO("Mammamia", "3:07", "Rock"),
                    new CancionDTO("Gossip", "2:48", "Rock"),
                    // Canciones de Grupo Frontera
                    new CancionDTO("Baila Conmigo", "3:34", "Regional"),
                    new CancionDTO("No Me Tienes Que Decir", "3:42", "Regional"),
                    new CancionDTO("En Mi Corazón", "3:58", "Regional"),
                    new CancionDTO("Amigos No", "3:29", "Regional"),
                    new CancionDTO("Mi Última Carta", "4:05", "Regional"),
                    new CancionDTO("A Tu Lado", "3:47", "Regional"),
                    // Canciones de One Direction
                    new CancionDTO("What Makes You Beautiful", "3:18", "Pop"),
                    new CancionDTO("Gotta Be You", "4:04", "Pop"),
                    new CancionDTO("One Thing", "3:17", "Pop"),
                    new CancionDTO("Live While We're Young", "3:20", "Pop"),
                    new CancionDTO("Little Things", "3:39", "Pop"),
                    new CancionDTO("Kiss You", "3:04", "Pop"),
                    // Canciones de Le Sserafim
                    new CancionDTO("Fearless", "2:48", "K-pop"),
                    new CancionDTO("Blue Flame", "3:30", "K-pop"),
                    new CancionDTO("The World is My Oyster", "1:30", "K-pop"),
                    new CancionDTO("Pierrot", "3:13", "K-pop"),
                    new CancionDTO("CRAZY", "2:58", "K-pop"),
                    new CancionDTO("1-800-hot-n-fun", "3:15", "Pop"),
                    // Canciones de Intocable
                    new CancionDTO("¿Y Todo Lo Demás?", "3:45", "Regional"),
                    new CancionDTO("Te Amo", "3:48", "Regional"),
                    new CancionDTO("Enséñame a Olvidar", "3:53", "Regional"),
                    new CancionDTO("Fuerte No Soy", "3:54", "Regional"),
                    new CancionDTO("Dímelo", "3:47", "Regional"),
                    new CancionDTO("Te Va A Doler", "4:11", "Regional"),
                    // Canciones de Banda MS
                    new CancionDTO("Mi Razón de Ser", "3:38", "Banda"),
                    new CancionDTO("Hermosa Experiencia", "3:57", "Banda"),
                    new CancionDTO("Por Siempre", "3:48", "Banda"),
                    new CancionDTO("El Color de Tus Ojos", "3:38", "Banda"),
                    new CancionDTO("Qué Bendición", "3:23", "Banda"),
                    new CancionDTO("La Mejor de Todas", "3:29", "Banda"),
                    // Canciones de Timbiriche
                    new CancionDTO("Soy un desastre", "3:27", "Pop"),
                    new CancionDTO("México", "3:41", "Pop"),
                    new CancionDTO("Ojos de Miel", "3:32", "Pop"),
                    new CancionDTO("Soy el mismo", "4:03", "Pop"),
                    new CancionDTO("La Vida No Es Igual", "3:36", "Pop"),
                    new CancionDTO("Me Puedo Matar", "3:45", "Pop"),
                    // Canciones de RBD
                    new CancionDTO("Rebelde", "3:32", "Pop"),
                    new CancionDTO("Sálvame", "3:43", "Balada"),
                    new CancionDTO("Solo Quédate en Silencio", "3:37", "Rock"),
                    new CancionDTO("Nuestro Amor", "3:32", "Rock"),
                    new CancionDTO("Aún Hay Algo", "3:30", "Pop"),
                    new CancionDTO("Tras de Mí", "3:18", "Pop"),
                    // Canciones de Mecano
                    new CancionDTO("Hoy No Me Puedo Levantar", "3:12", "Rock"),
                    new CancionDTO("Me Cuesta Tanto Olvidarte", "3:54", "Pop"),
                    new CancionDTO("Perdido en Mi Habitación", "3:10", "Pop"),
                    new CancionDTO("Mujer Contra Mujer", "4:06", "Balada"),
                    new CancionDTO("Un Año Más", "4:31", "Pop"),
                    new CancionDTO("Cruz de Navajas", "4:35", "Pop"),
                    // Canciones de OV7
                    new CancionDTO("Tus Besos", "3:23", "Pop"),
                    new CancionDTO("Te Quiero Tanto, Tanto", "4:01", "Balada"),
                    new CancionDTO("Enloquéceme", "3:25", "Pop"),
                    new CancionDTO("Jam", "3:36", "Pop"),
                    new CancionDTO("No Es Obsesión", "3:19", "Pop"),
                    new CancionDTO("Volveras", "3:39", "Pop"),
                    // Canciones de Ha-Ash
                    new CancionDTO("Lo Aprendí de Ti", "3:56", "Pop"),
                    new CancionDTO("Te Dejo en Libertad", "3:42", "Pop"),
                    new CancionDTO("Qué Hago Yo", "3:46", "Balada"),
                    new CancionDTO("Te acuerdas", "3:33", "Pop"),
                    new CancionDTO("Todavía No", "3:35", "Pop"),
                    new CancionDTO("Te Apuesto", "3:51", "Pop"),
                    // Canciones de Los Tigres del Norte
                    new CancionDTO("La Puerta Negra", "4:04", "Regional"),
                    new CancionDTO("Golpes en el Corazón", "3:41", "Regional"),
                    new CancionDTO("Jefe de Jefes", "3:53", "Regional"),
                    new CancionDTO("Ni Parientes Somos", "3:23", "Regional"),
                    new CancionDTO("La Mesa del Rincón", "3:54", "Regional"),
                    new CancionDTO("Pacas de a Kilo", "3:46", "Regional"),
                    // Canciones de Pandora
                    new CancionDTO("Como te va mi amor", "3:49", "Balada"),
                    new CancionDTO("Solo él y yo", "3:36", "Balada"),
                    new CancionDTO("Todo tiene su tiempo", "4:00", "Balada"),
                    new CancionDTO("Con tu amor", "3:45", "Balada"),
                    new CancionDTO("En carne viva", "3:47", "Balada"),
                    new CancionDTO("Popurrí: Éxitos de Juan Gabriel", "4:25", "Balada"),
                    // Canciones de Spice Girls
                    new CancionDTO("Wannabe", "2:52", "Pop"),
                    new CancionDTO("Say You'll Be There", "4:00", "Pop"),
                    new CancionDTO("2 Become 1", "4:06", "Pop"),
                    new CancionDTO("Spice Up Your Life", "2:56", "Pop"),
                    new CancionDTO("Stop", "3:27", "Pop"),
                    new CancionDTO("Too Much", "4:00", "Balada"),
                    // Canciones de TXT
                    new CancionDTO("Crown", "3:31", "K-pop"),
                    new CancionDTO("Blue Orangeade", "3:46", "Pop"),
                    new CancionDTO("Cat & Dog", "3:42", "K-pop"),
                    new CancionDTO("9 and Three Quarters (Run Away)", "3:23", "Pop"),
                    new CancionDTO("Angel Or Devil", "3:48", "Pop"),
                    new CancionDTO("New Rules", "3:20", "Pop"),
                    // Canciones de Morat
                    new CancionDTO("Cómo Te Atreves", "3:39", "Pop"),
                    new CancionDTO("Amor Con Hielo", "3:26", "Pop"),
                    new CancionDTO("Yo Contigo, Tú Conmigo", "3:17", "Pop"),
                    new CancionDTO("Besos en Guerra", "3:42", "Pop"),
                    new CancionDTO("Cuando Nadie Ve", "3:23", "Pop"),
                    new CancionDTO("Punto y Aparte", "3:30", "Pop"),
                    // Canciones de Jesse & Joy
                    new CancionDTO("Espacio Sideral", "3:22", "Pop"),
                    new CancionDTO("Ya No Quiero", "3:41", "Pop"),
                    new CancionDTO("Volveré", "3:47", "Pop"),
                    new CancionDTO("Corre!", "3:10", "Pop"),
                    new CancionDTO("La De La Mala Suerte", "3:29", "Pop"),
                    new CancionDTO("Me Voy", "3:12", "Pop"),
                    // Canciones de La Oreja de Van Gogh
                    new CancionDTO("Cuídate", "3:28", "Pop"),
                    new CancionDTO("La Playa", "3:55", "Pop"),
                    new CancionDTO("París", "4:02", "Pop"),
                    new CancionDTO("Jueves", "3:41", "Pop"),
                    new CancionDTO("El Último Vals", "4:13", "Pop"),
                    new CancionDTO("Inmortal", "4:20", "Pop"),
                    // Canciones de DVICIO
                    new CancionDTO("Paraíso", "3:40", "Pop"),
                    new CancionDTO("Nada", "3:12", "Pop"),
                    new CancionDTO("Justo Ahora", "3:29", "Pop"),
                    new CancionDTO("Qué Tienes Tú", "3:05", "Pop"),
                    new CancionDTO("5 Sentidos", "3:21", "Pop"),
                    new CancionDTO("Valeria", "3:47", "Pop"),
                    // Canciones de Little Mix
                    new CancionDTO("Wings", "3:44", "Pop"),
                    new CancionDTO("DNA", "3:36", "Pop"),
                    new CancionDTO("Change Your Life", "3:45", "Pop"),
                    new CancionDTO("Shout Out to My Ex", "4:00", "Pop"),
                    new CancionDTO("Touch", "3:44", "Pop"),
                    new CancionDTO("Power", "3:21", "Pop"),
                    // Canciones de Reik
                    new CancionDTO("Yo Quisiera", "3:34", "Balada"),
                    new CancionDTO("Que Vida La Mía", "3:45", "Balada"),
                    new CancionDTO("Noviembre Sin Ti", "4:05", "Balada"),
                    new CancionDTO("Me Niego", "3:28", "Balada"),
                    new CancionDTO("Amigos con Derechos", "3:31", "Balada"),
                    new CancionDTO("Aleluya", "3:40", "Balada"),
                    // Canciones de Río Roma
                    new CancionDTO("Al Fin Te Encontré", "3:51", "Balada"),
                    new CancionDTO("Me Cambiaste la Vida", "3:47", "Balada"),
                    new CancionDTO("Por Eso Te Amo", "3:30", "Balada"),
                    new CancionDTO("Caminar de Tu Mano", "3:22", "Balada"),
                    new CancionDTO("Contigo", "3:15", "Balada"),
                    new CancionDTO("Te Quiero Mucho Mucho", "3:40", "Balada"),
                    // Canciones de Fifth Harmony
                    new CancionDTO("Worth It", "3:44", "Pop"),
                    new CancionDTO("Sledgehammer", "3:11", "Pop"),
                    new CancionDTO("Bo$$", "3:30", "Pop"),
                    new CancionDTO("Work from Home", "3:36", "Pop"),
                    new CancionDTO("That's My Girl", "3:13", "Pop"),
                    new CancionDTO("All in My Head", "3:15", "Pop")
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
            AlbumDTO album1 = new AlbumDTO("Fearless", LocalDate.of(2008, Month.NOVEMBER, 11), "Pop", "/ImagenesAlbumes/FearlessT.jpeg", artistaBO.obtenerIdPorNombre("Taylor Swift"), listaCanciones);
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
            AlbumDTO album77 = new AlbumDTO("El Mal Querer", LocalDate.of(2018, Month.NOVEMBER, 2), "Flamenco", "/ImagenesAlbumes/ElMalQuerer.jpeg", artistaBO.obtenerIdPorNombre("ROSALIA"), listaCanciones);
            albumBO.insertarAlbum(album77);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Con Altura"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Yo x Ti, Tu x Mi"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Juro Que"));
            AlbumDTO album78 = new AlbumDTO("Singles", LocalDate.of(2019, Month.MARCH, 28), "Flamenco", "/ImagenesAlbumes/Singles.jpeg", artistaBO.obtenerIdPorNombre("ROSALIA"), listaCanciones);
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
            AlbumDTO album91 = new AlbumDTO("Canta a Juan Gabriel", LocalDate.of(1977, Month.JUNE, 30), "Regional", "/ImagenesAlbumes/CantaAJuanGabriel.jpeg", artistaBO.obtenerIdPorNombre("Rosio Durcal"), listaCanciones);
            albumBO.insertarAlbum(album91);
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Como Tu Mujer"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Tarde"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Jamás Te Prometí un Jardín de Rosas"));
            AlbumDTO album92 = new AlbumDTO("Canta a Juan Gabriel Vol. 6", LocalDate.of(1988, Month.JUNE, 21), "Regional", "/ImagenesAlbumes/CantaAJuanGabrielVol6.jpeg", artistaBO.obtenerIdPorNombre("Rosio Durcal"), listaCanciones);
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

            // Álbumes de Maroon 5
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("She Will Be Loved"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("This Love"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Sunday Morning"));
            AlbumDTO album113 = new AlbumDTO("Songs About Jane", LocalDate.of(2002, Month.JUNE, 25), "Pop", "/ImagenesAlbumes/SongsAboutJane.jpeg", artistaBO.obtenerIdPorNombre("Maroon 5"), listaCanciones);
            albumBO.insertarAlbum(album113);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Sugar"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Animals"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Maps"));
            AlbumDTO album114 = new AlbumDTO("V", LocalDate.of(2014, Month.SEPTEMBER, 2), "Pop", "/ImagenesAlbumes/V.jpeg", artistaBO.obtenerIdPorNombre("Maroon 5"), listaCanciones);
            albumBO.insertarAlbum(album114);

            // Álbumes de AC/DC
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Highway to Hell"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Girls Got Rhythm"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("If You Want Blood (You've Got It)"));
            AlbumDTO album115 = new AlbumDTO("Highway to Hell", LocalDate.of(1979, Month.JULY, 27), "Rock", "/ImagenesAlbumes/HighwayToHell.jpeg", artistaBO.obtenerIdPorNombre("AC/DC"), listaCanciones);
            albumBO.insertarAlbum(album115);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Back in Black"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Hells Bells"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("You Shook Me All Night Long"));
            AlbumDTO album116 = new AlbumDTO("Back in Black", LocalDate.of(1980, Month.JULY, 25), "Rock", "/ImagenesAlbumes/BackInBlack.jpeg", artistaBO.obtenerIdPorNombre("AC/DC"), listaCanciones);
            albumBO.insertarAlbum(album116);

            // Álbumes de Linkin Park
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("In the End"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Crawling"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("One Step Closer"));
            AlbumDTO album117 = new AlbumDTO("Hybrid Theory", LocalDate.of(2000, Month.OCTOBER, 24), "Metal", "/ImagenesAlbumes/HybridTheory.jpeg", artistaBO.obtenerIdPorNombre("Linkin Park"), listaCanciones);
            albumBO.insertarAlbum(album117);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Numb"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Faint"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Somewhere I Belong"));
            AlbumDTO album118 = new AlbumDTO("Meteora", LocalDate.of(2003, Month.MARCH, 25), "Metal", "/ImagenesAlbumes/Meteora.jpeg", artistaBO.obtenerIdPorNombre("Linkin Park"), listaCanciones);
            albumBO.insertarAlbum(album118);

            // Álbumes de Arctic Monkeys
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("I Bet You Look Good on the Dancefloor"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Fake Tales of San Francisco"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Mardy Bum"));
            AlbumDTO album119 = new AlbumDTO("Whatever People Say I Am, That's What I'm Not", LocalDate.of(2006, Month.JANUARY, 23), "Indie", "/ImagenesAlbumes/WhateverPeopleSay.jpeg", artistaBO.obtenerIdPorNombre("Arctic Monkeys"), listaCanciones);
            albumBO.insertarAlbum(album119);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Do I Wanna Know?"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("R U Mine?"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Arabella"));
            AlbumDTO album120 = new AlbumDTO("AM", LocalDate.of(2013, Month.SEPTEMBER, 9), "Indie", "/ImagenesAlbumes/AM.jpeg", artistaBO.obtenerIdPorNombre("Arctic Monkeys"), listaCanciones);
            albumBO.insertarAlbum(album120);

            // Álbumes de Twenty One Pilots
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Stressed Out"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Ride"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Tear in My Heart"));
            AlbumDTO album121 = new AlbumDTO("Blurryface", LocalDate.of(2015, Month.MAY, 17), "Pop", "/ImagenesAlbumes/Blurryface.jpeg", artistaBO.obtenerIdPorNombre("Twenty One Pilots"), listaCanciones);
            albumBO.insertarAlbum(album121);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Heathens"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Lane Boy"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Polarize"));
            AlbumDTO album122 = new AlbumDTO("Trench", LocalDate.of(2018, Month.OCTOBER, 5), "Pop", "/ImagenesAlbumes/Trench.jpeg", artistaBO.obtenerIdPorNombre("Twenty One Pilots"), listaCanciones);
            albumBO.insertarAlbum(album122);

            // Álbumes de Paramore
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Misery Business"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Crushcrushcrush"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("That's What You Get"));
            AlbumDTO album123 = new AlbumDTO("Riot!", LocalDate.of(2007, Month.JUNE, 12), "Rock", "/ImagenesAlbumes/Riot.jpeg", artistaBO.obtenerIdPorNombre("Paramore"), listaCanciones);
            albumBO.insertarAlbum(album123);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Still Into You"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Ain't It Fun"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Daydreaming"));
            AlbumDTO album124 = new AlbumDTO("Paramore", LocalDate.of(2013, Month.APRIL, 5), "Rock", "/ImagenesAlbumes/Paramore.jpeg", artistaBO.obtenerIdPorNombre("Paramore"), listaCanciones);
            albumBO.insertarAlbum(album124);

            // Álbumes de BTS
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("DNA"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Mic Drop"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Fake Love"));
            AlbumDTO album125 = new AlbumDTO("Love Yourself: Tear", LocalDate.of(2018, Month.MAY, 18), "K-pop", "/ImagenesAlbumes/LoveYourselfTear.jpeg", artistaBO.obtenerIdPorNombre("BTS"), listaCanciones);
            albumBO.insertarAlbum(album125);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Yet To Come"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Run BTS"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("For Youth"));
            AlbumDTO album126 = new AlbumDTO("Proof", LocalDate.of(2022, Month.JUNE, 10), "K-pop", "/ImagenesAlbumes/Proof.jpeg", artistaBO.obtenerIdPorNombre("BTS"), listaCanciones);
            albumBO.insertarAlbum(album126);

            // Álbumes de ABBA
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Dancing Queen"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Mamma Mia"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Take a Chance on Me"));
            AlbumDTO album127 = new AlbumDTO("Arrival", LocalDate.of(1976, Month.AUGUST, 11), "Pop", "/ImagenesAlbumes/Arrival.jpeg", artistaBO.obtenerIdPorNombre("ABBA"), listaCanciones);
            albumBO.insertarAlbum(album127);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Waterloo"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Honey, Honey"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("I Do, I Do, I Do, I Do, I Do"));
            AlbumDTO album128 = new AlbumDTO("Waterloo", LocalDate.of(1974, Month.MARCH, 4), "Pop", "/ImagenesAlbumes/Waterloo.jpeg", artistaBO.obtenerIdPorNombre("ABBA"), listaCanciones);
            albumBO.insertarAlbum(album128);

            // Álbumes de BLACKPINK
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("DDU-DU DDU-DU"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Kill This Love"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("As If It's Your Last"));
            AlbumDTO album129 = new AlbumDTO("The Album", LocalDate.of(2020, Month.OCTOBER, 2), "K-pop", "/ImagenesAlbumes/TheAlbum.jpeg", artistaBO.obtenerIdPorNombre("BLACKPINK"), listaCanciones);
            albumBO.insertarAlbum(album129);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("How You Like That"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Lovesick Girls"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Ice Cream"));
            AlbumDTO album130 = new AlbumDTO("Born Pink", LocalDate.of(2022, Month.SEPTEMBER, 16), "K-pop", "/ImagenesAlbumes/BornPink.jpeg", artistaBO.obtenerIdPorNombre("BLACKPINK"), listaCanciones);
            albumBO.insertarAlbum(album130);

            // Álbumes de The Piano Guys
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("A Thousand Years"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Beethoven's 5 Secrets"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("All of Me"));
            AlbumDTO album131 = new AlbumDTO("The Piano Guys", LocalDate.of(2012, Month.AUGUST, 7), "Soul", "/ImagenesAlbumes/ThePianoGuys.jpeg", artistaBO.obtenerIdPorNombre("The Piano Guys"), listaCanciones);
            albumBO.insertarAlbum(album131);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Fight Song"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("What Makes You Beautiful"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Let It Go"));
            AlbumDTO album132 = new AlbumDTO("The Piano Guys 2", LocalDate.of(2013, Month.OCTOBER, 8), "Soul", "/ImagenesAlbumes/ThePianoGuys2.jpeg", artistaBO.obtenerIdPorNombre("The Piano Guys"), listaCanciones);
            albumBO.insertarAlbum(album132);

            // Álbumes de Daft Punk
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("One More Time"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Digital Love"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Harder, Better, Faster, Stronger"));
            AlbumDTO album133 = new AlbumDTO("Discovery", LocalDate.of(2001, Month.MARCH, 12), "Electronica", "/ImagenesAlbumes/Discovery.jpeg", artistaBO.obtenerIdPorNombre("Daft Punk"), listaCanciones);
            albumBO.insertarAlbum(album133);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Get Lucky"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Lose Yourself to Dance"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Give Life Back to Music"));
            AlbumDTO album134 = new AlbumDTO("Random Access Memories", LocalDate.of(2013, Month.MAY, 17), "Electronica", "/ImagenesAlbumes/RandomAccessMemories.jpeg", artistaBO.obtenerIdPorNombre("Daft Punk"), listaCanciones);
            albumBO.insertarAlbum(album134);

            // Álbumes de Camila (banda)
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Elypse"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("No Es Así"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Quiero Verte"));
            AlbumDTO album135 = new AlbumDTO("Elypse", LocalDate.of(2017, Month.OCTOBER, 6), "Pop", "/ImagenesAlbumes/Elypse.jpeg", artistaBO.obtenerIdPorNombre("Camila"), listaCanciones);
            albumBO.insertarAlbum(album135);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Regresa"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Te Extraño"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Por Un Segundo"));
            AlbumDTO album136 = new AlbumDTO("Regresa", LocalDate.of(2019, Month.AUGUST, 16), "Pop", "/ImagenesAlbumes/Regresa.jpeg", artistaBO.obtenerIdPorNombre("Camila"), listaCanciones);
            albumBO.insertarAlbum(album136);

            // Álbumes de Måneskin
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Zitti E Buoni"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("I Wanna Be Your Slave"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Coraline"));
            AlbumDTO album137 = new AlbumDTO("Il Ballo Della Vita", LocalDate.of(2018, Month.OCTOBER, 26), "Rock", "/ImagenesAlbumes/IlBalloDellaVita.jpeg", artistaBO.obtenerIdPorNombre("Måneskin"), listaCanciones);
            albumBO.insertarAlbum(album137);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("The Loneliest"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Mammamia"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Gossip"));
            AlbumDTO album138 = new AlbumDTO("Rush!", LocalDate.of(2021, Month.MAY, 7), "Rock", "/ImagenesAlbumes/Rush.jpeg", artistaBO.obtenerIdPorNombre("Måneskin"), listaCanciones);
            albumBO.insertarAlbum(album138);

            // Álbumes de Grupo Frontera
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Baila Conmigo"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("No Me Tienes Que Decir"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("En Mi Corazón"));
            AlbumDTO album139 = new AlbumDTO("El Comienzo", LocalDate.of(2021, Month.JUNE, 18), "Banda", "/ImagenesAlbumes/ElComienzo.jpeg", artistaBO.obtenerIdPorNombre("Grupo Frontera"), listaCanciones);
            albumBO.insertarAlbum(album139);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Amigos No"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Mi Última Carta"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("A Tu Lado"));
            AlbumDTO album140 = new AlbumDTO("Jugando A Que No Pase Nada", LocalDate.of(2022, Month.APRIL, 2), "Banda", "/ImagenesAlbumes/JugandoAQueNoPaseNada.jpeg", artistaBO.obtenerIdPorNombre("Grupo Frontera"), listaCanciones);
            albumBO.insertarAlbum(album140);

            // Álbumes de One Direction
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("What Makes You Beautiful"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Gotta Be You"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("One Thing"));
            AlbumDTO album141 = new AlbumDTO("Up All Night", LocalDate.of(2011, Month.MARCH, 18), "Pop", "/ImagenesAlbumes/UpAllNight.jpeg", artistaBO.obtenerIdPorNombre("One Direction"), listaCanciones);
            albumBO.insertarAlbum(album141);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Live While We're Young"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Little Things"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Kiss You"));
            AlbumDTO album142 = new AlbumDTO("Take Me Home", LocalDate.of(2012, Month.NOVEMBER, 9), "Pop", "/ImagenesAlbumes/TakeMeHome.jpeg", artistaBO.obtenerIdPorNombre("One Direction"), listaCanciones);
            albumBO.insertarAlbum(album142);

            // Álbumes de Le Sserafim
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Fearless"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Blue Flame"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("The World is My Oyster"));
            AlbumDTO album143 = new AlbumDTO("Fearless", LocalDate.of(2022, Month.MAY, 2), "K-pop", "/ImagenesAlbumes/Fearless.jpeg", artistaBO.obtenerIdPorNombre("Le Sserafim"), listaCanciones);
            albumBO.insertarAlbum(album143);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Pierrot"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("CRAZY"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("1-800-hot-n-fun"));
            AlbumDTO album144 = new AlbumDTO("CRAZY", LocalDate.of(2023, Month.OCTOBER, 13), "K-pop", "/ImagenesAlbumes/CRAZY.jpeg", artistaBO.obtenerIdPorNombre("Le Sserafim"), listaCanciones);
            albumBO.insertarAlbum(album144);

            // Álbumes de Intocable
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("¿Y Todo Lo Demás?"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Te Amo"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Enséñame a Olvidar"));
            AlbumDTO album145 = new AlbumDTO("Contigo", LocalDate.of(2018, Month.AUGUST, 10), "Regional", "/ImagenesAlbumes/Contigo.jpeg", artistaBO.obtenerIdPorNombre("Intocable"), listaCanciones);
            albumBO.insertarAlbum(album145);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Fuerte No Soy"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Dímelo"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Te Va A Doler"));
            AlbumDTO album146 = new AlbumDTO("Percepción", LocalDate.of(2021, Month.JUNE, 11), "Regional", "/ImagenesAlbumes/Percepcion.jpeg", artistaBO.obtenerIdPorNombre("Intocable"), listaCanciones);
            albumBO.insertarAlbum(album146);

            // Álbumes de Banda MS
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Mi Razón de Ser"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Hermosa Experiencia"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Por Siempre"));
            AlbumDTO album147 = new AlbumDTO("Mi Razón de Ser", LocalDate.of(2015, Month.APRIL, 22), "Banda", "/ImagenesAlbumes/MiRazonDeSer.jpeg", artistaBO.obtenerIdPorNombre("Banda MS"), listaCanciones);
            albumBO.insertarAlbum(album147);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("El Color de Tus Ojos"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Qué Bendición"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("La Mejor de Todas"));
            AlbumDTO album148 = new AlbumDTO("Qué Bendición", LocalDate.of(2017, Month.MAY, 19), "Banda", "/ImagenesAlbumes/QueBendicion.jpeg", artistaBO.obtenerIdPorNombre("Banda MS"), listaCanciones);
            albumBO.insertarAlbum(album148);

            // Álbumes de Timbiriche
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Soy un desastre"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("México"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Ojos de Miel"));
            AlbumDTO album149 = new AlbumDTO("Singles", LocalDate.of(1982, Month.MARCH, 1), "Pop", "/ImagenesAlbumes/Singles.jpeg", artistaBO.obtenerIdPorNombre("Timbiriche"), listaCanciones);
            albumBO.insertarAlbum(album149);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Soy el mismo"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("La Vida No Es Igual"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Me Puedo Matar"));
            AlbumDTO album150 = new AlbumDTO("Timbiriche 7", LocalDate.of(1989, Month.SEPTEMBER, 19), "Pop", "/ImagenesAlbumes/Timbiriche7.jpeg", artistaBO.obtenerIdPorNombre("Timbiriche"), listaCanciones);
            albumBO.insertarAlbum(album150);

            // Álbumes de RBD
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Rebelde"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Sálvame"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Solo Quédate en Silencio"));
            AlbumDTO album151 = new AlbumDTO("Rebelde", LocalDate.of(2004, Month.NOVEMBER, 30), "Pop", "/ImagenesAlbumes/Rebelde.jpeg", artistaBO.obtenerIdPorNombre("RBD"), listaCanciones);
            albumBO.insertarAlbum(album151);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Nuestro Amor"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Aún Hay Algo"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Tras de Mí"));
            AlbumDTO album152 = new AlbumDTO("Nuestro Amor", LocalDate.of(2005, Month.SEPTEMBER, 22), "Pop", "/ImagenesAlbumes/NuestroAmor.jpeg", artistaBO.obtenerIdPorNombre("RBD"), listaCanciones);
            albumBO.insertarAlbum(album152);

            // Álbumes de Mecano
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Hoy No Me Puedo Levantar"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Me Cuesta Tanto Olvidarte"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Perdido en Mi Habitación"));
            AlbumDTO album153 = new AlbumDTO("Entre el Cielo y el Suelo", LocalDate.of(1986, Month.JUNE, 3), "Pop", "/ImagenesAlbumes/EntreElCieloYElSuelo.jpeg", artistaBO.obtenerIdPorNombre("Mecano"), listaCanciones);
            albumBO.insertarAlbum(album153);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Mujer Contra Mujer"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Un Año Más"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Cruz de Navajas"));
            AlbumDTO album154 = new AlbumDTO("Descanso Dominical", LocalDate.of(1988, Month.MAY, 24), "Pop", "/ImagenesAlbumes/DescansoDominical.jpeg", artistaBO.obtenerIdPorNombre("Mecano"), listaCanciones);
            albumBO.insertarAlbum(album154);

            // Álbumes de OV7
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Tus Besos"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Te Quiero Tanto, Tanto"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Enloquéceme"));
            AlbumDTO album155 = new AlbumDTO("OV7 Primera Fila", LocalDate.of(1998, Month.APRIL, 21), "Pop", "/ImagenesAlbumes/PrimeraFila.jpeg", artistaBO.obtenerIdPorNombre("OV7"), listaCanciones);
            albumBO.insertarAlbum(album155);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Jam"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("No Es Obsesión"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Volveras"));
            AlbumDTO album156 = new AlbumDTO("Punto", LocalDate.of(2001, Month.JUNE, 19), "Pop", "/ImagenesAlbumes/Punto.jpeg", artistaBO.obtenerIdPorNombre("OV7"), listaCanciones);
            albumBO.insertarAlbum(album156);

            // Álbumes de Ha-Ash
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Lo Aprendí de Ti"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Te Dejo en Libertad"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Qué Hago Yo"));
            AlbumDTO album157 = new AlbumDTO("A Tiempo", LocalDate.of(2011, Month.MAY, 16), "Pop", "/ImagenesAlbumes/ATiempo.jpeg", artistaBO.obtenerIdPorNombre("Ha-Ash"), listaCanciones);
            albumBO.insertarAlbum(album157);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Te acuerdas"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Todavía No"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Te Apuesto"));
            AlbumDTO album158 = new AlbumDTO("Haashville", LocalDate.of(2014, Month.NOVEMBER, 11), "Pop", "/ImagenesAlbumes/Haashville.jpeg", artistaBO.obtenerIdPorNombre("Ha-Ash"), listaCanciones);
            albumBO.insertarAlbum(album158);

            // Álbumes de Los Tigres del Norte
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("La Puerta Negra"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Golpes en el Corazón"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Jefe de Jefes"));
            AlbumDTO album159 = new AlbumDTO("Jefe de Jefes", LocalDate.of(1997, Month.JULY, 15), "Regional", "/ImagenesAlbumes/JefeDeJefes.jpeg", artistaBO.obtenerIdPorNombre("Los Tigres del Norte"), listaCanciones);
            albumBO.insertarAlbum(album159);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Ni Parientes Somos"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("La Mesa del Rincón"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Pacas de a Kilo"));
            AlbumDTO album160 = new AlbumDTO("El Ejemplo", LocalDate.of(2001, Month.APRIL, 10), "Regional", "/ImagenesAlbumes/ElEjemplo.jpeg", artistaBO.obtenerIdPorNombre("Los Tigres del Norte"), listaCanciones);
            albumBO.insertarAlbum(album160);

            // Álbumes de Pandora
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Como te va mi amor"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Solo él y yo"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Todo tiene su tiempo"));
            AlbumDTO album161 = new AlbumDTO("1985-1998", LocalDate.of(1985, Month.JUNE, 1), "Balada", "/ImagenesAlbumes/Pandora1985.jpeg", artistaBO.obtenerIdPorNombre("Pandora"), listaCanciones);
            albumBO.insertarAlbum(album161);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Con tu amor"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("En carne viva"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Popurrí: Éxitos de Juan Gabriel"));
            AlbumDTO album162 = new AlbumDTO("Con Amor Eterno", LocalDate.of(1991, Month.NOVEMBER, 15), "Balada", "/ImagenesAlbumes/ConAmorEterno.jpeg", artistaBO.obtenerIdPorNombre("Pandora"), listaCanciones);
            albumBO.insertarAlbum(album162);

            // Álbumes de Spice Girls
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Wannabe"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Say You'll Be There"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("2 Become 1"));
            AlbumDTO album163 = new AlbumDTO("Spice", LocalDate.of(1996, Month.NOVEMBER, 4), "Pop", "/ImagenesAlbumes/Spice.jpeg", artistaBO.obtenerIdPorNombre("Spice Girls"), listaCanciones);
            albumBO.insertarAlbum(album163);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Spice Up Your Life"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Stop"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Too Much"));
            AlbumDTO album164 = new AlbumDTO("Spiceworld", LocalDate.of(1997, Month.NOVEMBER, 3), "Pop", "/ImagenesAlbumes/Spiceworld.jpeg", artistaBO.obtenerIdPorNombre("Spice Girls"), listaCanciones);
            albumBO.insertarAlbum(album164);

            // Álbumes de TXT
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Crown"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Blue Orangeade"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Cat & Dog"));
            AlbumDTO album165 = new AlbumDTO("The Dream Chapter: STAR", LocalDate.of(2019, Month.MARCH, 4), "K-pop", "/ImagenesAlbumes/TheDreamChapterStar.jpeg", artistaBO.obtenerIdPorNombre("TXT"), listaCanciones);
            albumBO.insertarAlbum(album165);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("9 and Three Quarters (Run Away)"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Angel Or Devil"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("New Rules"));
            AlbumDTO album166 = new AlbumDTO("The Dream Chapter: MAGIC", LocalDate.of(2019, Month.OCTOBER, 21), "K-pop", "/ImagenesAlbumes/TheDreamChapterMagic.jpeg", artistaBO.obtenerIdPorNombre("TXT"), listaCanciones);
            albumBO.insertarAlbum(album166);

            // Álbumes de Morat
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Cómo Te Atreves"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Amor Con Hielo"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Yo Contigo, Tú Conmigo"));
            AlbumDTO album167 = new AlbumDTO("Sobre El Amor y Sus Efectos Secundarios", LocalDate.of(2016, Month.JUNE, 23), "Pop", "/ImagenesAlbumes/SobreElAmor.jpeg", artistaBO.obtenerIdPorNombre("Morat"), listaCanciones);
            albumBO.insertarAlbum(album167);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Besos en Guerra"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Cuando Nadie Ve"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Punto y Aparte"));
            AlbumDTO album168 = new AlbumDTO("Balas Perdidas", LocalDate.of(2018, Month.OCTOBER, 26), "Pop", "/ImagenesAlbumes/BalasPerdidas.jpeg", artistaBO.obtenerIdPorNombre("Morat"), listaCanciones);
            albumBO.insertarAlbum(album168);

            // Álbumes de Jesse & Joy
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Espacio Sideral"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Ya No Quiero"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Volveré"));
            AlbumDTO album169 = new AlbumDTO("Esta Es Mi Vida", LocalDate.of(2006, Month.JUNE, 13), "Pop", "/ImagenesAlbumes/EstaEsMiVida.jpeg", artistaBO.obtenerIdPorNombre("Jesse & Joy"), listaCanciones);
            albumBO.insertarAlbum(album169);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Corre!"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("La De La Mala Suerte"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Me Voy"));
            AlbumDTO album170 = new AlbumDTO("¿Con Quién Se Queda El Perro?", LocalDate.of(2011, Month.DECEMBER, 6), "Pop", "/ImagenesAlbumes/ConQuienSeQuedaElPerro.jpeg", artistaBO.obtenerIdPorNombre("Jesse & Joy"), listaCanciones);
            albumBO.insertarAlbum(album170);

            // Álbumes de La Oreja de Van Gogh
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Cuídate"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("La Playa"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("París"));
            AlbumDTO album171 = new AlbumDTO("El Viaje de Copperpot", LocalDate.of(2000, Month.SEPTEMBER, 11), "Pop", "/ImagenesAlbumes/ElViajeDeCopperpot.jpeg", artistaBO.obtenerIdPorNombre("La Oreja de Van Gogh"), listaCanciones);
            albumBO.insertarAlbum(album171);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Jueves"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("El Último Vals"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Inmortal"));
            AlbumDTO album172 = new AlbumDTO("A Las Cinco en el Astoria", LocalDate.of(2008, Month.SEPTEMBER, 2), "Pop", "/ImagenesAlbumes/ALasCincoEnElAstoria.jpeg", artistaBO.obtenerIdPorNombre("La Oreja de Van Gogh"), listaCanciones);
            albumBO.insertarAlbum(album172);

            // Álbumes de DVICIO
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Paraíso"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Nada"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Justo Ahora"));
            AlbumDTO album173 = new AlbumDTO("Justo Ahora", LocalDate.of(2014, Month.MARCH, 18), "Pop", "/ImagenesAlbumes/JustoAhora.jpeg", artistaBO.obtenerIdPorNombre("DVICIO"), listaCanciones);
            albumBO.insertarAlbum(album173);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Qué Tienes Tú"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("5 Sentidos"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Valeria"));
            AlbumDTO album174 = new AlbumDTO("Qué Tienes Tú", LocalDate.of(2017, Month.APRIL, 28), "Pop", "/ImagenesAlbumes/QueTienesTu.jpeg", artistaBO.obtenerIdPorNombre("DVICIO"), listaCanciones);
            albumBO.insertarAlbum(album174);

            // Álbumes de Little Mix
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Wings"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("DNA"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Change Your Life"));
            AlbumDTO album175 = new AlbumDTO("DNA", LocalDate.of(2012, Month.NOVEMBER, 19), "Pop", "/ImagenesAlbumes/DNA.jpeg", artistaBO.obtenerIdPorNombre("Little Mix"), listaCanciones);
            albumBO.insertarAlbum(album175);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Shout Out to My Ex"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Touch"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Power"));
            AlbumDTO album176 = new AlbumDTO("Glory Days", LocalDate.of(2016, Month.NOVEMBER, 18), "Pop", "/ImagenesAlbumes/GloryDays.jpeg", artistaBO.obtenerIdPorNombre("Little Mix"), listaCanciones);
            albumBO.insertarAlbum(album176);

            // Álbumes de Reik
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Yo Quisiera"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Que Vida La Mía"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Noviembre Sin Ti"));
            AlbumDTO album177 = new AlbumDTO("Reik", LocalDate.of(2005, Month.MAY, 24), "Pop", "/ImagenesAlbumes/Reik2005.jpeg", artistaBO.obtenerIdPorNombre("Reik"), listaCanciones);
            albumBO.insertarAlbum(album177);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Me Niego"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Amigos con Derechos"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Aleluya"));
            AlbumDTO album178 = new AlbumDTO("Ahora", LocalDate.of(2019, Month.MAY, 31), "Pop", "/ImagenesAlbumes/Ahora.jpeg", artistaBO.obtenerIdPorNombre("Reik"), listaCanciones);
            albumBO.insertarAlbum(album178);

            // Álbumes de Río Roma
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Al Fin Te Encontré"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Me Cambiaste la Vida"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Por Eso Te Amo"));
            AlbumDTO album179 = new AlbumDTO("Al Fin Te Encontré", LocalDate.of(2011, Month.JULY, 1), "Balada", "/ImagenesAlbumes/AlFinTeEncontre.jpeg", artistaBO.obtenerIdPorNombre("Río Roma"), listaCanciones);
            albumBO.insertarAlbum(album179);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Caminar de Tu Mano"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Contigo"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Te Quiero Mucho Mucho"));
            AlbumDTO album180 = new AlbumDTO("Eres la Persona Correcta en el Momento Equivocado", LocalDate.of(2016, Month.JULY, 8), "Balada", "/ImagenesAlbumes/EresLaPersonaCorrecta.jpeg", artistaBO.obtenerIdPorNombre("Río Roma"), listaCanciones);
            albumBO.insertarAlbum(album180);

            // Álbumes de Fifth Harmony
            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Worth It"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Sledgehammer"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Bo$$"));
            AlbumDTO album181 = new AlbumDTO("Reflection", LocalDate.of(2015, Month.FEBRUARY, 3), "Pop", "/ImagenesAlbumes/Reflection.jpeg", artistaBO.obtenerIdPorNombre("Fifth Harmony"), listaCanciones);
            albumBO.insertarAlbum(album181);

            listaCanciones.clear();
            listaCanciones.add(cancionBO.obtenerIdPorNombre("Work from Home"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("That's My Girl"));
            listaCanciones.add(cancionBO.obtenerIdPorNombre("All in My Head"));
            AlbumDTO album182 = new AlbumDTO("7/27", LocalDate.of(2016, Month.MAY, 27), "Pop", "/ImagenesAlbumes/727.jpeg", artistaBO.obtenerIdPorNombre("Fifth Harmony"), listaCanciones);
            albumBO.insertarAlbum(album182);

        } catch (ExceptionBO ex) {
            Logger.getLogger(ArranqueInicioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
