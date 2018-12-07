/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa61;

import javax.swing.JOptionPane;
import Circunferencia.Circunferencia;



public class Ariketa61 extends Circunferencia{

    /**
     *
     * @param args
     */
    public static void main(String[] args)  {
        
    /* Escribe un programa que pida los datos necesarios para calcular la longitud de una circunferencia (2 * PI * radio),
       su ´area ( PI * radio * radio) y el volumen de una esfera ( 4 * PI * radio * radio * radio / 3)  */
   
    Circunferencia c1;
    c1 = new Circunferencia ();
    
    c1.setLongitud(Double.parseDouble("Introduce la longitud"));
    
    
    
    JOptionPane.showMessageDialog(null, c1.getLongitud() + c1.getArea() + c1.getVolumen());
    
    }
    

    
    
}
