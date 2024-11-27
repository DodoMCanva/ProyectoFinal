/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author cesar
 */
public class IntegranteDTO {

    private String id;
    private String nombre;
    private String rol;
    private String imagen;
    private LocalDate ingreso;
    private LocalDate salida;
    private boolean estado;

    public IntegranteDTO() {
    }

    public IntegranteDTO(String nombre, String rol, String imagen, LocalDate ingreso, LocalDate salida, boolean estado) {
        this.nombre = nombre;
        this.rol = rol;
        this.ingreso = ingreso;
        this.salida = salida;
        this.estado = estado;
        this.imagen = imagen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getIngreso() {
        return ingreso;
    }

    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "IntegranteDTO{" + "id=" + id + ", nombre=" + nombre + ", rol=" + rol + ", imagen=" + imagen + ", ingreso=" + ingreso + ", salida=" + salida + ", estado=" + estado + '}';
    }

   

}
