
package ariketapalindromo;

import javax.swing.JOptionPane;


public class AriketaPalindromo {

    
    public static void main(String[] args) {
        
       String cadena = JOptionPane.showInputDialog("Teclea una cadena");
       boolean palindromo =funcionPalindromo(cadena);
       if (palindromo==true)
            JOptionPane.showMessageDialog(null, " La cadena " + cadena +" si es un palindromo");
       else
           JOptionPane.showMessageDialog(null, " La cadena " + cadena +" no es un palindromo");
    }
    
    public static boolean funcionPalindromo(String cadena)
    {
        int x = 0;
        int y = cadena.length() - 1;
        while(x < y && cadena.charAt(x) == cadena.charAt(y))
        {
            x++;
            y--;
        }
        // return x >= y;
        if (x < y)
            return false;
        else
            return true;
    }
    
}
    
    

