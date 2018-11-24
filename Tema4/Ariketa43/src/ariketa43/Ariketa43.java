/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa43;

import javax.swing.JOptionPane;

public class Ariketa43 {

    /*Nieves ha hecho cada apartado con una función diferente: 
        ha creado:
            -inicializarArrayLitrosCaidos: para poner a 0 el contador para que cuando una persona introduzca los datos vaya empezando desde
                cero
            -solicitarDatosEntrada: JOptions + repetitiva hasta que la persona diga que quiere salir
            -visualizarLitrosCaidos: este lo ha hecho para ir contabilizando los datos que introduce la persona 
    
    */
   
    public static void main(String[] args) {
       
     double [] arrayLitrosCaidos = new double [12];
     
     //inicializamos el contador a 0 de los litros que han caido
     for (int x = 0; x < arrayLitrosCaidos.length; x++)
       arrayLitrosCaidos[x] = 0;
     
     //repetitiva hasta que la persona diga que quiere salir, sigue introduciendo datos:
     char continuar;
        do
        {
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes<1..12>: "));
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia (nro): "));
            int litros = Integer.parseInt(JOptionPane.showInputDialog("Teclea los litros caídos: "));
                 arrayLitrosCaidos[mes-1] += litros;
                 
            continuar = JOptionPane.showInputDialog("¿Quieres seguir introduciendo datos? <s/n>").toLowerCase().charAt(0);
        }
        while (continuar == 's');
     
     //cuenta total de los litros que caen y se recoge el total
     String litrosCaidos = "";
        for (int x = 0; x < arrayLitrosCaidos.length; x++)
        {
          litrosCaidos = litrosCaidos + (x+1) + " - " + arrayLitrosCaidos[x]+ "\n";
  
        }   
       JOptionPane.showMessageDialog(null, "Los litros recogidos durante los doce meses del año son: \n" + litrosCaidos );  
    }
    
}
