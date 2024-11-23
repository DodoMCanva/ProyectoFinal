/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.ConexionDB;
import IDAO.IUsuarioDAO;
import POJO.UsuarioPOJO;
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
    public void guardarUsuario(UsuarioPOJO usuarioPOJO) {
        // Inicializa la conexión y obtiene la colección
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");

        // Convertimos el UsuarioPOJO a Document antes de insertarlo
        Document usuarioDoc = new Document()
                .append("nombre", usuarioPOJO.getNombre())
                .append("email", usuarioPOJO.getEmail())
                .append("password", usuarioPOJO.getPassword()) // Usamos la contraseña hasheada del POJO
                .append("imagen", usuarioPOJO.getImagen());

        // Insertamos el documento en MongoDB
        coleccionUsuarios.insertOne(usuarioDoc);
    }

    @Override
    public UsuarioPOJO buscarPorNombre(String nombre) {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");

        Document doc = coleccionUsuarios.find(Filters.eq("nombre", nombre)).first();

        if (doc != null) {
            return new UsuarioPOJO(
                    doc.getString("nombre"),
                    doc.getString("email"),
                    doc.getString("password"),
                    doc.getString("imagen")
            );
        }

        return null;
    }
}
