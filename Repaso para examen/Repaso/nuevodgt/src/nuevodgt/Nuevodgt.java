/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevodgt;

import UML.Multa;
import UML.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author Tamara
 */
public class Nuevodgt {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList <Multa> listaMultas;
    public static ArrayList <Vehiculo> listaVehiculos;
    
    public static Vehiculo ve;
    public static Vehiculo ve1;
    public static Multa mu;
    public static Multa mu1;
    public static Multa mu2;
    
    public static void main(String[] args) {
        // TODO code application logic here
        generarDatos ();
    }
    
    public static void generarDatos(){
        
      
        ve = new Vehiculo ();
        listaVehiculos.add(ve);
        
        ve.setMatricula("23.23");
        ve.setMarca("Fiat");
        ve.setNombre("Marcos");
        ve.setColor("Azul");
        ve.setDniProp("72825101V");
        ve.setListaMultas(mu);
        
        
        ve1 = new Vehiculo();
        listaVehiculos.add(ve1);
        
        ve1.setMatricula("232.22");
        ve1.setMarca("Opel");
        ve1.setNombre("Rosi");
        ve1.setColor("Gris");
        ve1.setDniProp("12345678X");
        ve1.setListaMultas(mu1);
        
        mu = new Multa ();
        listaMultas.add(mu);
        
        mu.setCod(10);
        mu.setDescripcion("Exceso de velocidad");
        mu.setV(ve);
        
        mu1 = new Multa ();
        mu1.setCod(20);
        mu1.setDescripcion("No llevar cinto");
        mu1.setV(ve1);
    }
    
    public static void terminar (){
        System.exit(0);
    }
}
