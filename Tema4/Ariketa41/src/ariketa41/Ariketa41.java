/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa41;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ariketa41 {

    
    
    public static void main(String[] args) {
        double numMax = 0;
        double numMin = 0;       
        double [] listaNumeros = new double [10];
        
        for (int i = 0; i < 5; i++) {            
            
            listaNumeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce 10 números"));
            if (listaNumeros [i] < numMin){
                numMin = listaNumeros [i];
            }
            else {
                if (listaNumeros [i] > numMax) {
                    numMax = listaNumeros [i];
                }
            }
            System.out.println(listaNumeros[i]);
        }        
        
        JOptionPane.showMessageDialog(null, "El número mayor es " + numMax + "\n"
                + "El número menor es" + numMin);
        
        
    }    
}
        // double [] listaNumeros;
        // listaNumeros= new double [10];
        // entrada de datos
        // for (int x=0; x<listaNumeros.length;x++);
        //{
        // listaNumeros [x]=Double.parseDouble(JO..);
//}

        //for/double elemento: listaNumeros
    
//}
