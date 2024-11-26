/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import IBO.IAlbumBO;
import IBO.IArtistasBO;

/**
 *
 * @author cesar
 */
public class AlbumBO implements IAlbumBO {
    
    private IArtistasBO artistaBO;
    
     @Override
    public String obtenerIdPorNombre(String nombreArtista) {
        return artistaBO.obtenerIdPorNombre(nombreArtista);
    }
    
    
}
