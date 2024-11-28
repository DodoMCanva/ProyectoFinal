/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAO;

import Exceptions.ExceptionDAO;
import POJO.AlbumPOJO;

/**
 *
 * @author cesar
 */
public interface IAlbumDAO {
    
    
    void InsertarAlbum(AlbumPOJO album) throws ExceptionDAO;
}
