/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa22;

import javax.swing.JOptionPane;

/**
 *
 * @author Tamara
 */
public class Ariketa22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
        invertirCadena(cadena);
    }
    public static void invertirCadena(String cadena){
        StringBuilder cadenaInvertida = new StringBuilder(); 
        String cadenaInvertida2="";
        // Recorrer desdee el final al principio.
        for(int y = cadena.length()-1; y >= 0; y--)
        {
            cadenaInvertida.append(cadena.charAt(y));
            cadenaInvertida2 = cadenaInvertida2 + cadena.charAt(y);
        }
        
        JOptionPane.showMessageDialog(null, " La cadena invertida es " + cadenaInvertida);
    }
    
}
    
    

