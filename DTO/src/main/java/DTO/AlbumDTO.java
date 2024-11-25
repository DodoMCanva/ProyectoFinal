/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;
import java.util.List;

/**
 *
 * @author cesar
 */
public class AlbumDTO {
    private String id;
    private String nombre;
    private Date fechaLanzamiento;
    private String genero;
    private String portada;
    private List<CancionDTO> canciones;
}
