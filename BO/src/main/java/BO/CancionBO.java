/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import DTO.CancionDTO;
import IBO.ICancionBO;
import IDAO.ICancionDAO;

/**
 *
 * @author cesar
 */
public class CancionBO implements ICancionBO{
     private ICancionDAO cancionDAO;

    public CancionBO(ICancionDAO cancionDAO) {
        this.cancionDAO = cancionDAO;
    }

    @Override
    public void insertarCanciones(CancionDTO cancion) {
        cancionDAO.insertarCanciones(); 
    }
}

