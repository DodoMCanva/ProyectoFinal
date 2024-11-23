/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IBO;

import DTO.UsuarioDTO;

/**
 *
 * @author cesar
 */
public interface IUsuarioBO {

    void guardarUsuario(UsuarioDTO usuarioDTO) throws Exception;

    boolean iniciarSesion(String nombre, String password) throws Exception;
}
