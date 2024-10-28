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
public class MatrixModel extends Model {
     private double matrix [][];
     private int x,y;
    
     /**
      * class constructor that builds the matrix with dimensions passed as parameters.
      * @param rows
      * @param columns
      * @throws MatrixSizeException if the parameters of the matrix are less than 1.
      */
   public MatrixModel (int rows, int columns) throws MatrixSizeException 
   {

       if (rows <1 || columns <1) {
           throw new MatrixSizeException("Both matrix dimensions should be greater or equal 1");
       }
       
       matrix = new double [rows] [columns];
       x=rows;
       y=columns;
       
       for(int i = 0; i < rows; i++)
       {
         for(int j = 0; j < columns; j++)
         {
            matrix[i][j] = 0;
         }
       }
   }    
   /**
    * this method multiplies the matrix by the scalar passed as a parameter.
    * @param scalar a number by which you multiply the matrix.
    */
   public void scalarMultiplication(double scalar) {
        
      for (int i = 0; i < x; i++){
    for (int j = 0; j < y; j++){
         matrix[i][j] = (matrix[i][j]*scalar);
      }
     } 
    }
   
   /**
    * this method transposes the matrix.
    */
   public void transposeMatrix(){
  
       double[][] tmpMatrix = matrix;
       
      matrix = new double[y][x];
       
      for (int i = 0; i < x; i++){
    for (int j = 0; j < y; j++){
        matrix[j][i] = tmpMatrix[i][j];
      }
     } 
     int tmp;
     tmp = x; x=y; y=tmp;
      
   }
           /**
            * this method sets the value for the element of the matrix.
            * @param x the number of the row.
            * @param y the number of the column.
            * @param value the value of the particular matrix [x][y] element.
            */
   public void setMatrixElement(int x, int y, double value) {
       matrix [x][y] = value;
   }
   
   /**
    * this method returns the array that contains the dimensions of the matrix.
    * x stands for rows,
    * y stands for columns.
    * @return 
    */
   public int[] getSize() {
       int[] size = {x,y};
       return size;
   }
   
   /**
    * this method returns the matrix as a double array.
    * @return 
    */
   public double [][] getMatrix() {
       return matrix;
   }
}



