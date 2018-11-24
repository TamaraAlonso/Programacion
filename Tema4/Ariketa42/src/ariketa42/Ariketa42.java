
package ariketa42;

import javax.swing.JOptionPane;

public class Ariketa42 {

    
    public static void main(String[] args) {
        
        String [] nombreMes;
        nombreMes = new String [12];
        
        //Llenado
        
        nombreMes [0] = "Enero";
        nombreMes [1] = "Febrero";
        nombreMes [2] = "Marzo";
        nombreMes [3] = "Abril";
        nombreMes [4] = "Mayo";
        nombreMes [5] = "Junio";
        nombreMes [6] = "Julio";
        nombreMes [7] = "Agosto";
        nombreMes [8] = "Septiembre";
        nombreMes [9] = "Octubre";
        nombreMes [10] = "Noviembre";
        nombreMes [11] = "Diciembre";
        
        String mes =  JOptionPane.showInputDialog("Introduce la inicial de un mes");
        mes = mes.toUpperCase();
        char letraMes = mes.charAt(0);
        
        switch (letraMes) {
            
            case 'E':             
            case 'F':             
            case 'M':             
            case 'A':         
            case 'J':      
            case 'S': 
            case 'O': 
            case 'N': 
            case 'D': 
                JOptionPane.showMessageDialog(null, "El mes introducido es correcto");
            break;
            default:
                JOptionPane.showMessageDialog(null, "El mes introducido no es correcto");
            
            
        }
        
    }
    
}
