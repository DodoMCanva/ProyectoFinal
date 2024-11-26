/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAO;

import POJO.ArtistaPOJO;

/**
 *
 * @author cesar
 */
public interface IArtistaDAO {

    void insertarArtistasSolistas(ArtistaPOJO artistaPOJO);
    void insertarArtistasGrupo();
    String obtenerIdPorNombre(String nombreArtista);
}
