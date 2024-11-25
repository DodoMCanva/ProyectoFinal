/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import IBO.IArtistasBO;
import IDAO.IArtistaDAO;


/**
 *
 * @author cesar
 */
public class ArtistaBO implements IArtistasBO{
 private final IArtistaDAO artistasDAO;

    public ArtistaBO(IArtistaDAO artistasDAO) {
        this.artistasDAO = artistasDAO;  // Inyección del DAO a través de la interfaz
    }

    @Override
    public void insertarArtistas() {
        artistasDAO.insertarArtistas();
    }
}
