
package ariketa24;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class Ariketa24 {

    
    public static void main(String[] args) {
        try{
           
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
            String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
            LocalDate fechaUno = LocalDate.parse(fechaString, formatter);
           
        
            fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
            LocalDate fechaDos = LocalDate.parse(fechaString, formatter);
          
            Period period = Period.between(fechaUno, fechaDos);
            JOptionPane.showMessageDialog(null, "La diferencia es de " + period.getDays() + " días");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas");
        }
      }
    }
    

