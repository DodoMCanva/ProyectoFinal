/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IBO;

import DTO.AlbumDTO;
import POJO.AlbumPOJO;

/**
 *
 * @author cesar
 */
public interface IAlbumBO {

    public void insertarAlbum(AlbumDTO album);
    
    String obtenerIdPorNombre(String nombreArtista);
    
    
    
}
