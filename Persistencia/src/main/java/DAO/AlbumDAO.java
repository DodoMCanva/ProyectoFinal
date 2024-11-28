/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.ConexionDB;
import Exceptions.ExceptionDAO;
import IDAO.IAlbumDAO;
import POJO.AlbumPOJO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author cesar
 */
public class AlbumDAO implements IAlbumDAO {
    
    
    @Override
    public void InsertarAlbum(AlbumPOJO album) throws ExceptionDAO{
        try{
             MongoDatabase baseDeDatos = new ConexionDB().conexion();
        MongoCollection<Document> coleccionAlbums = baseDeDatos.getCollection("albums");
        
        Document Doc=new Document()
                .append("artistaId", album.getArtistaId())
                .append("nombre", album.getNombre())
                .append("fechaLanzamiento", album.getFechaLanzamiento())
                .append("genero", album.getGenero())
                .append("portada", album.getPortada())
                .append("canciones", album.getCanciones());
        
        coleccionAlbums.insertOne(Doc);
        }catch(Exception e){
            throw new ExceptionDAO("Error al guardar el Album en la base de datos",e);
        }
    }
              
}
