/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.ConexionDB;
import IDAO.IUsuarioDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

/**
 *
 * @author cesar
 */
public class UsuarioDAO implements IUsuarioDAO {
    @Override
    public void guardarUsuario(Document usuario) {
        // Inicializa la conexión y obtiene la colección
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
        
        // Inserta el documento
        coleccionUsuarios.insertOne(usuario);
    }

    @Override
    public Document buscarPorEmail(String nombre) {
        // Inicializa la conexión y obtiene la colección
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
        
        // Busca el documento por el email
        return coleccionUsuarios.find(Filters.eq("nombre", nombre)).first();
    }
}
