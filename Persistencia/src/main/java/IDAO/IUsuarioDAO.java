/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAO;

import org.bson.Document;

/**
 *
 * @author cesar
 */
public interface IUsuarioDAO {
    void guardarUsuario(Document usuario); // Inserta un usuario en la colección
    Document buscarPorEmail(String nombre); // Busca un usuario por su nombreUsuario
}
