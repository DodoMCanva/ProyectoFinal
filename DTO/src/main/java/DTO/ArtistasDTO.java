/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para un
 * artista o grupo musical.
 *
 * @author Equipo2
 */
public class ArtistasDTO {

    // Identificador único del artista o grupo.
    private String id;
    // Nombre del artista o grupo.
    private String nombre;
    // Ruta o URL de la imagen representativa del artista o grupo.
    private String imagen;
    // Tipo de artista (por ejemplo, solista o grupo).
    private String tipo;
    // Género musical del artista o grupo.
    private String genero;
    // Lista de integrantes del grupo, si aplica.
    private List<IntegranteDTO> integrantes;

    /**
     * Constructor vacío. Permite crear una instancia sin inicializar atributos.
     */
    public ArtistasDTO() {
    }

      /**
     * Constructor que inicializa los atributos básicos del artista o grupo.
     * @param nombre Nombre del artista o grupo.
     * @param imagen Imagen representativa.
     * @param tipo Tipo de artista (solista o grupo).
     * @param genero Género musical.
     */
    public ArtistasDTO(String nombre, String imagen, String tipo, String genero) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo = tipo;
        this.genero = genero;
    }

      /**
     * Constructor que inicializa los atributos básicos y los integrantes del grupo.
     * @param nombre Nombre del artista o grupo.
     * @param imagen Imagen representativa.
     * @param tipo Tipo de artista (solista o grupo).
     * @param genero Género musical.
     * @param integrantes Lista de integrantes del grupo.
     */
    public ArtistasDTO(String nombre, String imagen, String tipo, String genero, List<IntegranteDTO> integrantes) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo = tipo;
        this.genero = genero;
        this.integrantes = integrantes;
    }

    /**
     * Constructor que inicializa todos los atributos del artista o grupo.
     * @param id Identificador único.
     * @param nombre Nombre del artista o grupo.
     * @param imagen Imagen representativa.
     * @param tipo Tipo de artista (solista o grupo).
     * @param genero Género musical.
     * @param integrantes Lista de integrantes del grupo.
     */
    public ArtistasDTO(String id, String nombre, String imagen, String tipo, String genero, List<IntegranteDTO> integrantes) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo = tipo;
        this.genero = genero;
        this.integrantes = integrantes;
    }

  /**
 * Obtiene el identificador único del artista o grupo.
 * @return ID del artista o grupo.
 */
public String getId() {
    return id;
}

/**
 * Establece el identificador único del artista o grupo.
 * @param id ID del artista o grupo.
 */
public void setId(String id) {
    this.id = id;
}

/**
 * Obtiene el nombre del artista o grupo.
 * @return Nombre del artista o grupo.
 */
public String getNombre() {
    return nombre;
}

/**
 * Establece el nombre del artista o grupo.
 * @param nombre Nombre del artista o grupo.
 */
public void setNombre(String nombre) {
    this.nombre = nombre;
}

/**
 * Obtiene la imagen del artista o grupo.
 * @return Ruta o URL de la imagen.
 */
public String getImagen() {
    return imagen;
}

/**
 * Establece la imagen del artista o grupo.
 * @param imagen Ruta o URL de la imagen.
 */
public void setImagen(String imagen) {
    this.imagen = imagen;
}

/**
 * Obtiene el tipo del artista (solista o grupo).
 * @return Tipo del artista.
 */
public String getTipo() {
    return tipo;
}

/**
 * Establece el tipo del artista (solista o grupo).
 * @param tipo Tipo del artista.
 */
public void setTipo(String tipo) {
    this.tipo = tipo;
}

/**
 * Obtiene el género musical del artista o grupo.
 * @return Género musical.
 */
public String getGenero() {
    return genero;
}

/**
 * Establece el género musical del artista o grupo.
 * @param genero Género musical.
 */
public void setGenero(String genero) {
    this.genero = genero;
}

/**
 * Obtiene la lista de integrantes del grupo.
 * @return Lista de integrantes.
 */
public List<IntegranteDTO> getIntegrantes() {
    return integrantes;
}


     /**
     * Devuelve una representación en texto del objeto.
     * @return Cadena con los valores de los atributos.
     */
    @Override
    public String toString() {
        return "ArtistasDTO{" + "id=" + id
                + ", nombre=" + nombre
                + ", imagen=" + imagen
                + ", tipo=" + tipo
                + ", genero=" + genero
                + ", integrantes="
                + integrantes + '}';
    }

}
