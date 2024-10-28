/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.posmyk.marta.mvc.controller;
import net.posmyk.marta.mvc.model.Model;
import net.posmyk.marta.mvc.view.View;

/**
 *
 * @author marta
 * @version 1.0
 */
public class Controller {
  private Model model;
  private View view;
      
  /**
   * this method sets the value passed as a parameter as the value of the model.
   * @param m 
   */
  public void setModel (Model m) {
      model = m;
  }
  
  /**
   * this method sets the value passed as a parameter as the value of the view.
   * @param v 
   */
  public void setView (View v) {
      view = v;
  }

  /**
   * this method returns the model.
   * @return 
   */
  public Model getModel() {
      return model;
  }
  
  /**
   * this method returns the view.
   * @return 
   */
  public View getView() {
      return view;
  }
          
}
