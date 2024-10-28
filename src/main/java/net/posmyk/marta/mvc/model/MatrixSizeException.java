/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.posmyk.marta.mvc.model;

/**
 *
 * @author marta
 * @version 1.0
 */
public class MatrixSizeException extends Exception {
    
   
        /**
     * class constructor that as a parameter has a description of an error
     * @param message description of an error
     */
    MatrixSizeException(String message) {
        super(message);
    }
}
