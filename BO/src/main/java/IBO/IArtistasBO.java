/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IBO;

import DTO.ArtistasDTO;
import DTO.IntegranteDTO;
import java.util.List;

/**
 *
 * @author cesar
 */
public interface IArtistasBO {

    public void insertarArtistasSolistas(ArtistasDTO artista);

    public void insertarArtistasGrupo(ArtistasDTO artista,List<IntegranteDTO> lista);

    String obtenerIdPorNombre(String nombreArtista);
}
