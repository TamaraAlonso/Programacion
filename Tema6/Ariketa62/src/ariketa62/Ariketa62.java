/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa62;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Excepciones.*;
        
        
public class Ariketa62{

    
    static ArrayList <Integer> codigo = new ArrayList ();
    static ArrayList <String> nombre = new ArrayList ();
    static ArrayList <String> domicilio = new ArrayList ();
    static ArrayList <Integer> telefono = new ArrayList ();
    
    public static void main(String[] args) {
      
       String continuar = null;       
    
       do {
          
            try {
       
                int cod = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del alumno"));
                codigo.add(cod);

                String alumno = JOptionPane.showInputDialog("Introduce el nombre del alumno");
                nombre.add(alumno);

                String casa = JOptionPane.showInputDialog("Introduce el domicilio del alumno");
                domicilio.add(casa);

                int tel = Integer.parseInt(JOptionPane.showInputDialog("Introduce el teléfono del alumno"));
                telefono.add(tel);
       
    
                continuar = JOptionPane.showInputDialog("¿Quieres continuar introduciendo datos? s/n");
              
            }
            
            catch(NumberFormatException e)
            {
               JOptionPane.showMessageDialog(null,"Hay que teclear numeros");
            }
       }
       while ("s".equalsIgnoreCase(continuar));
              
       JOptionPane.showMessageDialog(null, "La lista de los alumnos es: \n"
                + "El código del alumno es: " + codigo + "\n"
                + "El nombre de los alumnos es : " + nombre + "\n"
                + "El domicilio de los alumnos es : " + domicilio + "\n"
                + "El telefono de los alumnos es : " + telefono + "\n");
 
    }       
}


    

