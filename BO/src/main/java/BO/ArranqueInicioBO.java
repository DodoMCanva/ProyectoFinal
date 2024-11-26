/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    IArtistasBO artistaBO;
    ICancionBO cancionBO;

    public void InsertarArtistas() {

        artistaBO.insertarArtistasGrupo(artista, lista);

        artistaBO.insertarArtistasSolistas(artista);

    }

    public void CrearArtistasSolistas() {

        ArtistasDTO ListaArtistasSolista[] = new ArtistasDTO[45];

        for (int i = 0; i < 45; i++) {
            artistaBO.insertarArtistasSolistas(ListaArtistasSolista[i]);

        }
    }

    public void CrearArtistasGrupos() {
        ArtistasDTO ListaArtistasGrupo[] = new ArtistasDTO[45];
        IntegranteDTO integrante = new IntegranteDTO("John", "Bajista", LocalDate.of(2023, 2, 10), null, true);
        List<IntegranteDTO> ListaIntegrantes = new ArrayList<>();
        ListaIntegrantes.add(integrante);
        ListaArtistasGrupo[0] = new ArtistasDTO("The Beatles", null, "Grupo", "Rock", ListaIntegrantes);

        for (int i = 0; i < 45; i++) {
            artistaBO.insertarArtistasGrupo(ListaArtistasGrupo[i], ListaIntegrantes);

        }
    }
    
    
    
}
