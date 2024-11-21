/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import DTO.UsuarioDTO;
import IBO.IUsuarioBO;
import IDAO.IUsuarioDAO;
import POJO.UsuarioModelo;

/**
 *
 * @author cesar
 */
public class UsuarioBO implements IUsuarioBO {

    private IUsuarioDAO usuarioDAO;

    @Override
    public void guardarUsuario(UsuarioDTO usuario) throws Exception {
        UsuarioModelo modelo = new UsuarioModelo(
                usuario.getNombre(),
                usuario.getApellidoPaterno(),
                usuario.getApellidoMaterno(),
                usuario.getCelular(),
                usuario.getCorreoElectronico(),
                usuario.getContrasenaUsuario()
        );
        usuarioDAO.guardar(modelo);
    }
}
