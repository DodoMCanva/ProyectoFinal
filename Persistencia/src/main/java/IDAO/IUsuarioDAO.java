/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAO;

import POJO.UsuarioPOJO;

/**
 *
 * @author cesar
 */
public interface IUsuarioDAO {
    void guardarUsuario(UsuarioPOJO usuario); // Inserta un usuario en la colección
    UsuarioPOJO buscarPorNombre(String nombre); // Busca un usuario por su nombreUsuario
}
