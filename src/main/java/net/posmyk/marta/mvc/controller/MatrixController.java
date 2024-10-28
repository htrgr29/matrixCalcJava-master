/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.posmyk.marta.mvc.controller;


import net.posmyk.marta.mvc.model.MatrixModel;
import net.posmyk.marta.mvc.view.MatrixView;
import java.util.Scanner;
import net.posmyk.marta.mvc.model.MatrixSizeException;

/**
 *
 * @author marta
 * @version 1.0
 */
public class MatrixController  extends Controller {
    
    private MatrixModel matrix;
    
    /**
     * this method initializes the construction of the matrix.
     * @param size string with two values (rows, columns) separated by a comma.
     */
    public void initWithSize(String size) {
        try {
                String s[] = size.split(",");
                matrix = new MatrixModel (Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        } catch (MatrixSizeException e) {
            System.out.println(e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.out.println("error: " + e.getMessage());
            return;
        }
        
        this.askForData();
    }

    /**
     * this method asks for the size of the matrix.
     */
    public void askForSize() {
        
        Scanner scanner = new Scanner(System.in);
        MatrixView v = new MatrixView();
        v.askForMatrixSize();
        String s = scanner.next();
        
        this.initWithSize(s);

    }
    /**
     * this method asks for data and gets it
     */
    public void askForData() {
      
        int rows = matrix.getSize()[1];
        int cols = matrix.getSize()[0];
        
        MatrixView v = new MatrixView();
        
         for (int i = 0; i < rows; i++){
    
          Scanner scanner = new Scanner(System.in);
          v.askForMatrixRow(i, cols);
          String s = scanner.next();
        
          String _row = s;
          String row[];
          row = _row.split(",");
          for (int j=0; j<cols; j++){
              matrix.setMatrixElement(i, j, Double.parseDouble(row[j]));
          }
         }
        this.run();
    }


/**
 * this method runs the program. it;s the menu loop.
 */
    public void run() {

        MatrixView v = new MatrixView();
        
        boolean x = true;
        do {
            v.showMatrix(matrix.getMatrix());
            v.printMenuOptions();
           
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();

            switch (s) {
                case "1" -> {
                    v.askForScalar();
                    Scanner _scanner = new Scanner(System.in);
                    String scalar = _scanner.next();
                    matrix.scalarMultiplication(Double.parseDouble(scalar));
                    v.showMatrix(matrix.getMatrix());
                }
                case "2" -> {
                    matrix.transposeMatrix();
                    v.showMatrix(matrix.getMatrix());
                }
                case "3" -> x=false;
                default -> {
                }
            }
        } while (x);
        
    }
    
}


