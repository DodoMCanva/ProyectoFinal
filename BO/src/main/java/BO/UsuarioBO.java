/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import DTO.UsuarioDTO;
import IBO.IUsuarioBO;
import IDAO.IUsuarioDAO;
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
        // Lógica de negocio: encriptar la contraseña
        String hashedPassword = BCrypt.hashpw(usuarioDTO.getPassword(), BCrypt.gensalt());

        // Crear el documento para enviar al DAO
        Document usuarioDoc = new Document()
                .append("nombre", usuarioDTO.getNombre())
                .append("email", usuarioDTO.getEmail())
                .append("password", hashedPassword)
                .append("imagen", usuarioDTO.getImagen());

        // Delegar al DAO
        usuarioDAO.guardarUsuario(usuarioDoc);
    }

   
    @Override
    public boolean iniciarSesion(String nombre, String password) {
        // Buscar al usuario por email usando el DAO
        Document usuarioDoc = usuarioDAO.buscarPorEmail(nombre);

        if (usuarioDoc == null) {
            return false; // Usuario no encontrado
        }

        // Extraer la contraseña almacenada (hash)
        String hashedPassword = usuarioDoc.getString("password");

        // Validar la contraseña ingresada contra el hash
        return BCrypt.checkpw(password, hashedPassword);
    }

}