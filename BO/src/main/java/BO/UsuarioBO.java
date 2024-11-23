/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import DTO.UsuarioDTO;
import IBO.IUsuarioBO;
import IDAO.IUsuarioDAO;
import POJO.UsuarioPOJO;
import org.bson.Document;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author cesar
 */
public class UsuarioBO implements IUsuarioBO {
    private final IUsuarioDAO usuarioDAO;
     

    public UsuarioBO(IUsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public void guardarUsuario(UsuarioDTO usuarioDTO) {
        String hashedPassword = BCrypt.hashpw(usuarioDTO.getPassword(),BCrypt.gensalt());
        // Convertir UsuarioDTO a UsuarioPOJO
        UsuarioPOJO usuarioPOJO = new UsuarioPOJO(usuarioDTO.getNombre(), usuarioDTO.getEmail(),hashedPassword, usuarioDTO.getImagen());

        // Llamar al DAO para guardar el POJO en MongoDB
        usuarioDAO.guardarUsuario(usuarioPOJO);
    }

  @Override
public boolean iniciarSesion(String nombre, String password) {
    // Buscar el UsuarioPOJO por nombre o email (asegúrate de que el método sea correcto)
    UsuarioPOJO usuarioPOJO = usuarioDAO.buscarPorNombre(nombre); // O buscarPorEmail, según tu caso

    // Validar que el usuario exista y que el hash de la contraseña no sea nulo
    if (usuarioPOJO == null || usuarioPOJO.getPassword() == null) {
        System.out.println("Usuario no encontrado o hash no válido");
        return false;
    }

    // Comparar la contraseña con el hash almacenado
    boolean contraseñaValida = BCrypt.checkpw(password, usuarioPOJO.getPassword());
    if (contraseñaValida) {
        System.out.println("Inicio de sesión exitoso");
    } else {
        System.out.println("Contraseña incorrecta");
    }

    return contraseñaValida;
}

}