
package ariketa47;

import javax.swing.JOptionPane;

public class Ariketa47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    /* En este ejercicio el usuario nos va a proporcionar a trav´es del teclado el n´umero de unidades que se venden de los distintos
productos con los que trabaja una empresa. Esta empresa trabaja con diez productos distintos cuyos c´odigos son: 10, 23, 30, 47, 55, 65,135,256, 526, 663. 
El usuario cada vez que se hace una venta, nos proporcionara el c´odigo del producto (hay que comprobar que es v´alido) y el n´umero de unidades vendidas
de ese producto.Alﬁnaldeld´ıa,esdecir,cuandoelusuarionosdigaqueno desea continuar, nosotros tenemos que visualizar el n´umero total de unidades vendidas de
cada producto y el c´odigo del producto, todo ello ordenado de menor a mayor por n´umero de unidades vendidas. */
     
    int [] codigo;
    codigo = new int [10];
    
    codigo [0] = 10;
    codigo [1] = 23;
    codigo [2] = 30;
    codigo [3] = 47;
    codigo [4] = 55;
    codigo [5] = 65;
    codigo [6] = 135;
    codigo [7] = 256;
    codigo [8] = 526;
    codigo [9] = 663;
    
    char continuar;
        do
        {
            solicitarDatosEntrada(codigo);
            continuar = JOptionPane.showInputDialog("¿Quieres seguir introduciendo datos? <s/n>").toLowerCase().charAt(0);
        }
        while (continuar == 's');
    
    JOptionPane.showMessageDialog(null, args);
    }
    
    public static void solicitarDatosEntrada ( int [] codigo) {
        
        int unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de unidades que vendes"));
        int producto = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código del producto"));
        
        for (unidades = 0; unidades < codigo.length; unidades++) {
            
        }
    }
    
}
