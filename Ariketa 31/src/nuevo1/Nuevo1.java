/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo1;

import javax.swing.JOptionPane;
/**
 *
 * @author Tamara
 */
public class Nuevo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    String contar =("");
    
  }   
    public static void contar () {
        
    String vocales = "aeiouAEIOU";
    int contador [] = {0,0,0,0,0,0,0,0,0,0};
    
    for (int v=0; v<vocales.length(); v++) {
        
     for (int letra=0; letra<vocales.length(); letra++) {
         if (vocales.charAt (v) == vocales.charAt (letra))
             //charAt(x) == caracter de la posicion x
         {
             contador [letra]++;
         }         
        }   
       }
    
    for (int v=0; v<vocales.length();v++) {
        
        System.out.println("Aparece la letra" + vocales.charAt(v) + ": " + contador [v] + " veces");
    }
        
  }
}
    
