/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAO;

import Exceptions.ExceptionDAO;
import POJO.UsuarioPOJO;

/**
 *
 * @author cesar
 */
public interface IUsuarioDAO {
    void guardarUsuario(UsuarioPOJO usuario)throws ExceptionDAO; // Inserta un usuario en la colección
    UsuarioPOJO buscarPorNombre(String nombre) throws ExceptionDAO;// Busca un usuario por su nombreUsuario
}
