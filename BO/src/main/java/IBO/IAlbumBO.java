/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IBO;

import DTO.AlbumDTO;
import Exceptions.ExceptionBO;
import java.util.List;

/**
 *
 * @author cesar
 */
public interface IAlbumBO {

    public void insertarAlbum(AlbumDTO album);

    String obtenerIdPorNombre(String nombreArtista);

    List<AlbumDTO> consultaGeneralAlbums(List<String> generosRestringidos) throws ExceptionBO;

    List<AlbumDTO> busquedaGeneralAlbum(List<String> generosRestringidos, String busqueda) throws ExceptionBO;

}
