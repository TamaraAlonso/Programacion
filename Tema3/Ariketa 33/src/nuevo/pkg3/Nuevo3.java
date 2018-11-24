/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo.pkg3;

import java.util.Scanner;
/**
 *
 * @author Tamara
 */
public class Nuevo3 {

    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
    System.out.println("Introduce una frase:");
    
    String cadena = sc.nextLine();
    
    System.out.println("Introduce el término que quieres buscar");
    
    String termino = sc.nextLine();
    
    char car = termino.charAt (0);
    int cantidadRepeticiones = 0;
    
    for (int i = 0; i <cadena.length(); i++ ) {
        
        char aux = cadena.charAt(i);
        
        if (aux == car) {
            cantidadRepeticiones++;
            }
        }
    
    System.out.println("La cantidad de repeticiones es:" + cantidadRepeticiones);
    }
    
}
