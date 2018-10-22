/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo.pkg2;

import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class Nuevo2 {

   
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        String palabra;
        String palabraInvertida = "";
        
        System.out.println("Introduce una palabra");
        palabra=s.nextLine();
    
        for (int i = palabra.length()-1; i>=0; i--) {
            // estamos empezando desde el final al principio
            // lo que me dice es que coge toda la longitud de la línea hasta la -1 que es el último caracter
            // hasta que la i (digamos como si fuera el primer caracter) llega a la posicion 0 que es el primero de todos
            // i -- = i = i-1;
            
            //length()-1 es para saber dónde termina la cadena 
            palabraInvertida += palabra.charAt (i);
            // palabraInvertida = palabraInvertida + palabra.charAt (i);
        }
        
        System.out.println("La palabra invertida es: " + palabraInvertida);
    }
    
}
