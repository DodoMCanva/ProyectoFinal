/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;
/**
 * Clase que representa una excepción específica para la capa de negocio (BO).
 * 
 * @author Equipo2
 */
public class ExceptionBO extends Exception {

    /**
     * Constructor que acepta un mensaje de error.
     * 
     * @param mesagge El mensaje de error
     */
    public ExceptionBO(String mesagge) {
        super(mesagge);
    }

    /**
     * Constructor que acepta un mensaje de error y una causa.
     * 
     * @param message El mensaje de error
     * @param cause La causa de la excepción
     */
    public ExceptionBO(String message, Throwable cause) {
        super(message, cause);
    }
}

