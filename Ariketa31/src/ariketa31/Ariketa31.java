
package ariketa31;

import javax.swing.JOptionPane;


public class Ariketa31 {

    private static byte horasTrabajadas;
    private static char estadoCivil;
    private static char nivelEstudios;
    
    public static void main(String[] args) {
        
        solicitarDatos();
        JOptionPane.showMessageDialog(null, "El sueldo de este trabajador asciende a " + calcularSueldo()); 
    }
    
    public static void solicitarDatos(){
        try
        {
             horasTrabajadas = Byte.parseByte(JOptionPane.showInputDialog("Teclea el número de horas que ha trabajado"));

             do
             {
                estadoCivil = JOptionPane.showInputDialog("Teclea el estado civil del trabajador").charAt(0);
                estadoCivil = Character.toUpperCase(estadoCivil);
             }
             while (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'D' && estadoCivil != 'V');

             do
             {
                 nivelEstudios = JOptionPane.showInputDialog("Teclea el nivel de estudios del trabajador").charAt(0);
                 nivelEstudios = Character.toUpperCase(nivelEstudios);
             }
             while (nivelEstudios != 'P'  && nivelEstudios != 'M' && nivelEstudios != 'S');
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El dato tecleado no es del tipo correcto");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getClass()+ e.getMessage());
        }         
    }
     
    public static float calcularSueldo(){
         
         float precioHoraNormal = 10;
         float precioHoraExtra = 15;
         
        float sueldo;
        if (horasTrabajadas > 40) 
            sueldo = (horasTrabajadas - 40) * precioHoraExtra + 40 * precioHoraNormal;
        else
            sueldo = horasTrabajadas * precioHoraNormal; 
                
        final float PLUS = 100.0f;
                
        if (nivelEstudios == 'S')
            sueldo = sueldo + PLUS;
        else
            if (estadoCivil == 'S')
                sueldo += PLUS;
            else
                if (estadoCivil == 'V' && nivelEstudios == 'P')
                    sueldo += PLUS;
        
        return sueldo;
                
    }
  
 }

