/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import DTO.ArtistasDTO;
import DTO.IntegranteDTO;
import IBO.IArtistasBO;
import IDAO.IArtistaDAO;
import POJO.ArtistaPOJO;
import java.util.List;

/**
 *
 * @author cesar
 */
public class ArtistaBO implements IArtistasBO {

    private final IArtistaDAO artistasDAO;

    public ArtistaBO(IArtistaDAO artistasDAO) {
        this.artistasDAO = artistasDAO;
    }

    @Override
    public void insertarArtistasSolistas(ArtistasDTO artista) {
        artistasDAO.insertarArtistasSolistas(CovertirDTOaPOJOSolista(artista));
    }

    public void insertarArtistasGrupo(ArtistasDTO artista,List<IntegranteDTO> lista) {
        artistasDAO.insertarArtistasGrupo();
    }

    @Override
    public String obtenerIdPorNombre(String nombreArtista) {
        return artistasDAO.obtenerIdPorNombre(nombreArtista);
    }
    
    public ArtistaPOJO CovertirDTOaPOJOSolista(ArtistasDTO artistaDTO){
        
        
        return null;
        
        
    }
}
