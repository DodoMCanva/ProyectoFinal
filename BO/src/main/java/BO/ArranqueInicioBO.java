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
        IntegranteDTO integrante = new IntegranteDTO("John", "Bajista", LocalDate.of(2023, 2, 10), null, true);
        List<IntegranteDTO> ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(integrante);
        ArtistasDTO grupo = new ArtistasDTO("The Beatles", " ", "Grupo", "Rock", ListaIntegrantes);

        artistaBO.insertarArtista(grupo);
        
        ArtistasDTO solista = new ArtistasDTO("Adele", " ", "Solista", "Pop", null);

        artistaBO.insertarArtista(solista);

//        //Crear Solistas
//        ArtistasDTO ArtistaSolista[] = new ArtistasDTO[45];
//
//        //Creacion manual solistas
//        
//        
//        //Insertar solistas
//        for (int i = 0; i < 45; i++) {
//            artistaBO.insertarArtista(ArtistaSolista[i]);
//
//        }
//
//        //Crear Grupos
//        ArtistasDTO ListaArtistasGrupo[] = new ArtistasDTO[45];
//
//        //Creacion manual de grupos
//        IntegranteDTO integrante = new IntegranteDTO("John", "Bajista", LocalDate.of(2023, 2, 10), null, true);
//        List<IntegranteDTO> ListaIntegrantes = new ArrayList<>();
//        ListaIntegrantes.add(integrante);
//        ListaArtistasGrupo[0] = new ArtistasDTO("The Beatles", null, "Grupo", "Rock", ListaIntegrantes);
//
//        //Insertar grupos
//        for (int i = 0; i < 45; i++) {
//            artistaBO.insertarArtista(ListaArtistasGrupo[i]);
//
//        }
    }

    public void crearCanciones() {

    }

    public void crearAlbums() {

    }

}
