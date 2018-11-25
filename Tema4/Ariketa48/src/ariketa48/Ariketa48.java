/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa48;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class Ariketa48 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
    /* Crear una matriz de dos dimensiones de 10 x 10. Pediremos que introduzcan el n´umero de ﬁla y el de columna
        que vamos a utilizar y el valor que quieren almacenar. Una vez introducidos los datos. Se escribir´a la suma
        correspondientes a las ﬁlas de la matriz. */
   
        int [][] arrayBidimensional = new int [10][10];
        
        //Para llenar el primer array:
        arrayBidimensional [0][0]=0;
        arrayBidimensional [0][1]=0;
        arrayBidimensional [0][2]=0;
        arrayBidimensional [0][3]=0;
        arrayBidimensional [0][4]=0;
        arrayBidimensional [0][5]=0;
        arrayBidimensional [0][6]=0;
        arrayBidimensional [0][7]=0;
        arrayBidimensional [0][8]=0;
        arrayBidimensional [0][9]=0;
        //Para llenar el segundo array:
        arrayBidimensional [1][0]=0;
        arrayBidimensional [1][1]=0;
        arrayBidimensional [1][2]=0;
        arrayBidimensional [1][3]=0;
        arrayBidimensional [1][4]=0;
        arrayBidimensional [1][5]=0;
        arrayBidimensional [1][6]=0;
        arrayBidimensional [1][7]=0;
        arrayBidimensional [1][8]=0;
        arrayBidimensional [1][9]=0;
        
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de la fila"));
        int columna = Integer.parseInt("Introduce el número de la columna");
        int dato = Integer.parseInt("Introduce el dato que deseas almacenar");
        
        for (fila =0; fila <10; fila++){
            for (columna=0; columna <10;columna++);
                int sumaTotal = fila + columna;
                    JOptionPane.showMessageDialog(null, "Los datos sumados son: " + sumaTotal);
        }
    }
    
    
    
    }
  
