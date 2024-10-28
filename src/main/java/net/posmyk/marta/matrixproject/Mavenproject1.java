/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package net.posmyk.marta.matrixproject;

import net.posmyk.marta.mvc.controller.MatrixController;
/**
 * 
 * @author marta
 * @version 1.0
 */
public class Mavenproject1 {

    public static void main(String[] args) {

        MatrixController matrixController = new MatrixController();
        
        switch (args.length) {
            case 0 -> matrixController.askForSize();
            case 2 -> matrixController.initWithSize(args[2]);
            default -> { 
                System.out.println("error");
            }
        }
        
    }
}
