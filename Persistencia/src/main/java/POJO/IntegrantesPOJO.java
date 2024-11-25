/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author cesar
 */
public class IntegrantesPOJO {

    private ObjectId id;
    private String nombre;
    private String rol;
    private Date ingreso;
    private Date salida;
    private boolean estado;

    public IntegrantesPOJO() {
    }

    public IntegrantesPOJO(String nombre, String rol, Date ingreso, Date salida, boolean estado) {
        this.nombre = nombre;
        this.rol = rol;
        this.ingreso = ingreso;
        this.salida = salida;
        this.estado = estado;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
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

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
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
        return "IntegrantesPOJO{" + "id="
                + id + ", nombre="
                + nombre + ", rol="
                + rol + ", ingreso="
                + ingreso + ", salida="
                + salida + ", estado="
                + estado + '}';
    }

}
