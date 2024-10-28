/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package net.posmyk.marta.mvc.view;

/**
 *
 * @author marta
 * @version 1.0
 */
public class MatrixView extends View{
    /**
     * this method displays the question. it asks for the size of the matrix.
     */
    public void askForMatrixSize() {
        System.out.println("Enter size for new matrix. Separate dimentions with comma.");
    }

    /**
     * this method displays the question. it asks for the row of the matrix.
     * @param row stands for the row that we enter each time.
     * @param columns stands for the number of columns in our matrix. it determines the number of values in each row.
     */
     public void askForMatrixRow(int row, int columns){
        System.out.println("Enter data for row #"+ (row+1) +". Separate " + columns + " values with comma.");         
     }
     
     /**
      * this method displays the question. it asks for the scalar to multiply the matrix by.
      */
    public void askForScalar(){
         System.out.println("Enter scalar.");
    }
     
    /**
     * this method displays program's menu.
     */
    public void printMenuOptions() {
        System.out.println(" ");
        System.out.println("MENU:");
        System.out.println("1. Scalar Multiplication");
        System.out.println("2. Transposition");
        System.out.println("3. Exit program");
    }

    /**
     * this method displays the matrix.
     * @param matrix passes the matrix we want to display.
     */
    public void showMatrix(double[][] matrix) {
        
        System.out.println(" ");
        for (double[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(" " + matrix1[j] + " ");
            }
            System.out.println();
        } 
    }
    
}


