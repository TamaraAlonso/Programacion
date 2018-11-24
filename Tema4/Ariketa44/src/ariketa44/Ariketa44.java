/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa44;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ariketa44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        String [] abecedario;
        abecedario = new String [27];
        
        int contador [] = new int [27];
        // String abecedario1 = {"a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o,p,q,r,s,t,u,v,w,x,y,z"};
        // abecedario1.split(",");
        
        abecedario [0] = "a";
        abecedario [1] = "b";
        abecedario [2] = "c";
        abecedario [3] = "d";
        abecedario [4] = "e";
        abecedario [5] = "f";
        abecedario [6] = "g";
        abecedario [7] = "h";
        abecedario [8] = "i";
        abecedario [9] = "j";
        abecedario [10] = "k";
        abecedario [11] = "l";
        abecedario [12] = "m";
        abecedario [13] = "n";
        abecedario [14] = "ñ";
        abecedario [15] = "o";
        abecedario [16] = "p";
        abecedario [17] = "q";
        abecedario [18] = "r";
        abecedario [19] = "s";
        abecedario [20] = "t";
        abecedario [21] = "u";
        abecedario [22] = "v";
        abecedario [23] = "w";
        abecedario [24] = "x";
        abecedario [25] = "y";
        abecedario [26] = "z";
        
        int texto= Integer.parseInt (JOptionPane.showInputDialog("Introduce un texto"));
        
        for (int x = 0; x < abecedario.length; x++)
           abecedario[x] = texto++; 
        
        for (int x = 0; x < contador.length; x++)
           contador[x] = 0;
        
    
    }

}


