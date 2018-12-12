/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p2e1;

import Peliculas.Estudio;
import Peliculas.Pelicula;
import javax.swing.JOptionPane;
import java.util.ArrayList;



public class T6p2e1 {

    static ArrayList <String> nombrePelicula = new ArrayList ();
    static ArrayList <Integer> duracionPelicula = new ArrayList ();
    static ArrayList <Integer> cantidadPeliculas = new ArrayList ();


    public static void main(String[] args) {
    
     /*En este ejercicio hay que mostrar el nombre del o de los estudios en
los que se ha producido la pel´ıcula m´as larga y el nombre del estudio
que m´as pel´ıculas ha producido.*/
     
     pedirDatos();
     peliculaLarga();
    
    } 
    
     public static void pedirDatos (){
       
       String continuar = null;   
      try {
       do {
       
         String pelicula = JOptionPane.showInputDialog("Introduce el nombre del estudio");
         int duracion = Integer.parseInt("Introduce la duración de la película");
         int cantidadPelis = Integer.parseInt("Introduce la cantidad de películas que ha producido ese estudio");  
         
         nombrePelicula.add(pelicula);
         duracionPelicula.add(duracion);        
         cantidadPeliculas.add(cantidadPelis);
         
       }       
       
       while ("s".equalsIgnoreCase(continuar));
      }
      catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Error");
      }
       JOptionPane.showMessageDialog(null, nombrePelicula + "" + duracionPelicula + "" + cantidadPeliculas );
   }
     
     public static void peliculaLarga () {
         
         int peliculaMayor = 0;
         int peli = Integer.parseInt("Introduce la duración de la película");
         
         for (int i=0; i<peli.length();i++) {
             if (peli[i] > peliculaMayor) {
                 peliculaMayor=peli [i];
             }
         }
         JOptionPane.showMessageDialog(null, peliculaMayor);
     }
      
    
}
