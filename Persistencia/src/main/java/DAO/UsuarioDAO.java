/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.ConexionDB;
import IDAO.IUsuarioDAO;
import POJO.UsuarioModelo;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author cesar
 */
public class UsuarioDAO implements IUsuarioDAO {

    @Override
    public void guardar(UsuarioModelo usuario) throws Exception {
        MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> collectionUsuarios = baseDeDatos.getCollection("usuarios");

        Document documento = new Document()
                .append("nombre", usuario.getNombre())
                .append("apellidoPaterno", usuario.getApellidoPaterno())
                .append("apellidoMaterno", usuario.getApellidoMaterno())
                .append("celular", usuario.getCelular())
                .append("correoElectronico", usuario.getCorreoElectronico())
                .append("contrasenaUsuario", usuario.getContrasenaUsuario());

        collectionUsuarios.insertOne(documento);
    }
    

}
