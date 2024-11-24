/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IBO;

import DTO.UsuarioDTO;
import Exceptions.ExceptionBO;

/**
 *
 * @author cesar
 */
public interface IUsuarioBO {

    void guardarUsuario(UsuarioDTO usuarioDTO) throws ExceptionBO;

    boolean iniciarSesion(String nombre, String password) throws Exception;
}
