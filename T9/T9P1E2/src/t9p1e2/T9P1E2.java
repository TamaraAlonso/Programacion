/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9p1e2;

import Vista.datosAcontecimientos;

/**
 *
 * @author 1gdaw04
 */
public class T9P1E2 {

    /**
     * @param args the command line arguments
     */
    
    private static datosAcontecimientos vda;
    private static String opcion;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void terminar (){
        System.exit(0);
    }
    
    public static void validarNombre (){
               
    }
    
    public static void comenzar (){
        
        vda = new datosAcontecimientos ();
        vda.setVisible(true);
    }
    
    public static void identificarOperacion (String opc){
        opcion = opc;
    }
    
    public static void altaAcontecimiento (){
        
    }
}
