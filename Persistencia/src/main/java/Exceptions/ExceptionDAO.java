/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 * Clase que representa una excepción específica del DAO. Extiende de la clase
 * Exception y se utiliza para manejar errores relacionados con la base de
 * datos.
 *
 * @author equpo 2
 */
public class ExceptionDAO extends Exception {

    /**
     * Constructor que crea una nueva excepción con el mensaje especificado.
     *
     * @param message el mensaje de la excepción
     */
    public ExceptionDAO(String message) {

        super(message);
    }

    /**
     * Constructor que crea una nueva excepción con el mensaje y la causa
     * especificados.
     *
     * @param message el mensaje de la excepción
     * @param cause la causa de la excepción
     */
    public ExceptionDAO(String message, Throwable cause) {
        super(message, cause);
    }

}
