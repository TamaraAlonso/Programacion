/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class Circunferencia {
    
  
    private double radio;

    public Circunferencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public Circunferencia(double longitud, double area, double volumen) {
        this.radio=radio;
    }
    
    public Circunferencia (double radio, double area, double volumen, double longitud) {
    
     radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));

     area = Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El área de la circunferencia es " + area);
    
     volumen = (4 * Math.PI * radio * radio * (radio/3));
     
     longitud = (2 * Math.PI * radio);
    }

    private static class radio {

        public radio() {
        }
    }

}
