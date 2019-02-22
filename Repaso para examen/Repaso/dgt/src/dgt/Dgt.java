/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgt;

import UML.Multa;
import UML.Vehiculo;
import Vista.altaMultas;
import java.util.ArrayList;

/**
 *
 * @author Tamara
 */
public class Dgt {

    public static ArrayList <Multa> listaMultas;
    public static ArrayList <Vehiculo> aVehiculos;
    
    public static Multa multa1;
    public static Multa multa2;
    public static Multa multa3;
    
    public static Vehiculo aVehiculo1;
    public static Vehiculo aVehiculo2;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        generarDatos();
    }
    
    public static void generarDatos (){
        
        multa1 = new Multa ();
        listaMultas.add(multa1);
        
        multa1.setCodigo(10);
        multa1.setDescripcion("Exceso de velocidad");
        
        multa2 = new Multa();
        listaMultas.add(multa2);
        
        multa2.setCodigo(20);
        multa2.setDescripcion("Hablar por teléfono");
        
        multa3 = new Multa ();
        listaMultas.add(multa3);
        
        multa3.setCodigo(30);
        multa3.setDescripcion("No llevar cinto");
    }
    
    public static void terminar (){
        System.exit(0);
    }
    
}
