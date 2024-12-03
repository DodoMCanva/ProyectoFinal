/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDate;

/**
 * Clase que representa un integrante de una banda o grupo. Incluye información
 * sobre su ID, nombre, rol, imagen, fechas de ingreso y salida, y su estado
 * actual.
 *
 * @author Equipo2
 */
public class IntegranteDTO {

    private String id; // Identificador único del integrante
    private String nombre; // Nombre del integrante
    private String rol; // Rol del integrante en la banda o grupo
    private String imagen; // Imagen del integrante
    private LocalDate ingreso; // Fecha de ingreso del integrante
    private LocalDate salida; // Fecha de salida del integrante
    private boolean estado; // Estado actual del integrante (activo/inactivo)

    /**
     * Constructor por defecto.
     */
    public IntegranteDTO() {
    }

    /**
     * Constructor con parámetros para inicializar un nuevo integrante.
     *
     * @param nombre El nombre del integrante
     * @param rol El rol del integrante en la banda o grupo
     * @param imagen La imagen del integrante
     * @param ingreso La fecha de ingreso del integrante
     * @param salida La fecha de salida del integrante
     * @param estado El estado actual del integrante (activo/inactivo)
     */
    public IntegranteDTO(String nombre, String rol, String imagen, LocalDate ingreso, LocalDate salida, boolean estado) {
        this.nombre = nombre;
        this.rol = rol;
        this.ingreso = ingreso;
        this.salida = salida;
        this.estado = estado;
        this.imagen = imagen;
    }

    /**
     * Obtiene el ID del integrante.
     *
     * @return El ID del integrante
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID del integrante.
     *
     * @param id El ID del integrante
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del integrante.
     *
     * @return El nombre del integrante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del integrante.
     *
     * @param nombre El nombre del integrante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el rol del integrante en la banda o grupo.
     *
     * @return El rol del integrante
     */
    public String getRol() {
        return rol;
    }

    /**
     * Establece el rol del integrante en la banda o grupo.
     *
     * @param rol El rol del integrante
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Obtiene la fecha de ingreso del integrante.
     *
     * @return La fecha de ingreso del integrante
     */
    public LocalDate getIngreso() {
        return ingreso;
    }

    /**
     * Establece la fecha de ingreso del integrante.
     *
     * @param ingreso La fecha de ingreso del integrante
     */
    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }

    /**
     * Obtiene la imagen del integrante.
     *
     * @return La imagen del integrante
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Establece la imagen del integrante.
     *
     * @param imagen La imagen del integrante
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Obtiene la fecha de salida del integrante.
     *
     * @return La fecha de salida del integrante
     */
    public LocalDate getSalida() {
        return salida;
    }

    /**
     * Establece la fecha de salida del integrante.
     *
     * @param salida La fecha de salida del integrante
     */
    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }

    /**
     * Obtiene el estado actual del integrante (activo/inactivo).
     *
     * @return El estado actual del integrante
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Establece el estado actual del integrante (activo/inactivo).
     *
     * @param estado El estado actual del integrante
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Representación en formato de cadena del objeto IntegranteDTO.
     *
     * @return Una cadena con la información del integrante
     */
    @Override
    public String toString() {
        return "IntegranteDTO{"
                + "id="
                + id + ", nombre="
                + nombre + ", rol="
                + rol + ", imagen="
                + imagen + ", ingreso="
                + ingreso + ", salida="
                + salida + ", estado="
                + estado + '}';
    }
}
