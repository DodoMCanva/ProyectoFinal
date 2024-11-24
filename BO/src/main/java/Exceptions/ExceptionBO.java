/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author cesar
 */
public class ExceptionBO extends Exception{
    public ExceptionBO(String mesagge){
        super(mesagge);
    }
     public ExceptionBO(String message, Throwable cause) {
        super(message, cause);
    }
}
