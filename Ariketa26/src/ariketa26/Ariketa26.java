
package ariketa26;

import java.time.DateTimeException;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class Ariketa26 {

   
    public static void main(String[] args) {
        
       LocalDate PRIMAVERA = LocalDate.of(2018,3,21);
       LocalDate VERANO = LocalDate.of(2018,6,21);
       LocalDate OTOÑO = LocalDate.of(2018,9,21);
       LocalDate INVIERNO = LocalDate.of(2018,12,21);
       
       boolean error = false;
       do
       {
           try
           {
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el día"));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
                LocalDate fecha = LocalDate.of(2018,mes,dia);

               if (fecha.isBefore(PRIMAVERA))
                   JOptionPane.showMessageDialog(null,"Invierno");
               else
                     if (fecha.isBefore(VERANO))
                        JOptionPane.showMessageDialog(null,"Primavera");
                    else
                           if (fecha.isBefore(OTOÑO))
                                JOptionPane.showMessageDialog(null,"Verano");
                           else
                                JOptionPane.showMessageDialog(null,"Otoño");
               error = false;
           }
           catch(DateTimeException e)
           {
               JOptionPane.showMessageDialog(null," Valores invalidos para convertirlos en fecha");
               error = true;
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,"Problemas");
               error = true;
           }
       }
       while(error == true);
    }
    
}
    
    

