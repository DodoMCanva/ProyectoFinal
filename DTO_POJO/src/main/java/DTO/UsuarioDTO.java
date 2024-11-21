/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author cesar
 */
public class UsuarioDTO {

    private String id_Usuario;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int Celular;
    private String CorreoElectronico;
    private String ContrasenaUsuario;

    
    
    
    public UsuarioDTO() {
    }

    public UsuarioDTO(String id_Usuario, String nombre, String apellidoPaterno, String apellidoMaterno, int Celular, String CorreoElectronico, String ContrasenaUsuario) {
        this.id_Usuario = id_Usuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.Celular = Celular;
        this.CorreoElectronico = CorreoElectronico;
        this.ContrasenaUsuario = ContrasenaUsuario;
    }

    
    
    public String getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(String id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getContrasenaUsuario() {
        return ContrasenaUsuario;
    }

    public void setContrasenaUsuario(String ContrasenaUsuario) {
        this.ContrasenaUsuario = ContrasenaUsuario;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "id_Usuario="
                + id_Usuario + ", nombre=" + nombre
                + ", apellidoPaterno=" + apellidoPaterno
                + ", apellidoMaterno=" + apellidoMaterno
                + ", Celular=" + Celular + ", CorreoElectronico="
                + CorreoElectronico + ", ContrasenaUsuario="
                + ContrasenaUsuario + '}';
    }

}
