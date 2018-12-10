/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa63;

import Excepciones.*;
import Persona.Persona;
import static ariketa63.Ariketa63.obtenerDatosPersona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ariketa63 {

    
    public static void main(String[] args) {
     /*Define una clase Persona con los siguientes datos: nombre, dNacimiento
(d´ıa de nacimiento), mNacimiento (mes de nacimiento), aNacimiento
(a ˜no de nacimiento), direcci ´on, c´odigo postal y ciudad.
Crea varios objetos de tipo Persona y a trav´es de un programa muestra
los siguientes datos:
Nombre de la persona de mayor edad.
Nombre de las personas que viven en Elche.
N´umero de personas mayores de edad.
Hay que comprobar que todos los campos contienen informaci´on y
que es l ´ogica.*/
     
     try {
         ArrayList <Persona> datosPersona;
         datosPersona= obtenerDatosPersona;
     }
      catch(Exception e)
        {
            System.out.println("Problemas");
        }
    }
    
    public static ArrayList<Persona> obtenerDatosPersona() {
         ArrayList<Persona> datos = new ArrayList();
         
         do
        {
            try
            {
                String nombre = JOptionPane.showInputDialog("Teclea el nombre de la persona");
                validarNombre(nombre);
                String nacimiento = JOptionPane.showInputDialog("Teclea el día de nacimiento de la persona");
                validarNacimiento(nacimiento);
                String mes = JOptionPane.showInputDialog("Teclea el mes de nacimiento de la persona");
                validarMes(mes);
                String ano = JOptionPane.showInputDialog("Teclea el año de nacimiento de la persona");
                validarAno(ano);
                String direccion = JOptionPane.showInputDialog("Teclea la dirección de la persona");
                validarDireccion(direccion);
                String codigo = JOptionPane.showInputDialog("Teclea el código postal de la persona");
                validarCodigo(codigo);
                String ciudad = JOptionPane.showInputDialog("Teclea la ciudad de la persona");
                validarCiudad(ciudad);
            
                Persona p = new Persona(nombre,nacimiento,mes,ano,direccion,codigo,ciudad);
                
                datos.add(p);
            }
            catch(DatoNoValido e){
              JOptionPane.showMessageDialog(null,"El dato introducido no es correcto");
            }
            catch(Exception e)
            {
                System.out.println("Problemas");
            }
        }
        while(JOptionPane.showConfirmDialog(null,"¿ Quieres continuar?")==0);
        return datos;
        
    }
    
     public static void validarNombre(String nombre)throws Exception{
        
        boolean error=false;
        if (nombre.length()<= 2)
            error = true;
        else
            // Todo letras
            for (int x = 0; x < nombre.length() && error == false;x++)
                if (Character.isDigit(nombre.charAt(x)))
                    error = true;
        if (error)
            throw new DatoNoValido();                    
    }
     
    public static void validarDireccion(String direccion)throws Exception{
        if (direccion.length()<= 10)
            throw new DatoNoValido();
                    
    } 
    
    public static void validarCodigo(String codigo)throws Exception{
        // Cinco dígitos numéricos
        boolean error=false;
        if (codigo.length()!= 4)
            error = true;
        else
            for (int x = 0; x < codigo.length() && error == false;x++)
                if (Character.isAlphabetic(codigo.charAt(x)))
                    error = true;
        if (error)
            throw new DatoNoValido();                    
    }
    
    public static void validarNacimiento (String nacimiento) throws Exception {
        
        int opc = 0;
        switch(opc){
                   case 1: 
                       JOptionPane.showMessageDialog(null, "Día 1");
                       break;
                   case 2:
                       JOptionPane.showMessageDialog(null, "Día 2");
                       break;
                   case 3:
                       JOptionPane.showMessageDialog(null, "Día 3");
                       break;
                   case 4:
                       JOptionPane.showMessageDialog(null, "Día 4");
                       break;
                   case 5:
                       JOptionPane.showMessageDialog(null, "Día 5");
                       break;
                   case 6:
                       JOptionPane.showMessageDialog(null, "Día 6");
                       break;
                   case 7:
                       JOptionPane.showMessageDialog(null, "Día 7");
                       break;
                   case 8:
                       JOptionPane.showMessageDialog(null, "Día 8");
                       break;
                   case 9:
                       JOptionPane.showMessageDialog(null, "Día 9");
                       break;
                    case 10: 
                       JOptionPane.showMessageDialog(null, "Día 10");
                       break;
                   case 11:
                       JOptionPane.showMessageDialog(null, "Día 11");
                       break;
                   case 12:
                       JOptionPane.showMessageDialog(null, "Día 12");
                       break;
                   case 13:
                       JOptionPane.showMessageDialog(null, "Día 13");
                       break;
                   case 14:
                       JOptionPane.showMessageDialog(null, "Día 14");
                       break;
                   case 15:
                       JOptionPane.showMessageDialog(null, "Día 15");
                       break;
                   case 16:
                       JOptionPane.showMessageDialog(null, "Día 16");
                       break;
                   case 17:
                       JOptionPane.showMessageDialog(null, "Día 17");
                       break;
                   case 18:
                       JOptionPane.showMessageDialog(null, "Día 18");
                       break;
                    case 19: 
                       JOptionPane.showMessageDialog(null, "Día 1");
                       break;
                   case 20:
                       JOptionPane.showMessageDialog(null, "Día 20");
                       break;
                   case 21:
                       JOptionPane.showMessageDialog(null, "Día 21");
                       break;
                   case 22:
                       JOptionPane.showMessageDialog(null, "Día 22");
                       break;
                   case 23:
                       JOptionPane.showMessageDialog(null, "Día 23");
                       break;
                   case 24:
                       JOptionPane.showMessageDialog(null, "Día 24");
                       break;
                   case 25:
                       JOptionPane.showMessageDialog(null, "Día 25");
                       break;
                   case 26:
                       JOptionPane.showMessageDialog(null, "Día 26");
                       break;
                   case 27:
                       JOptionPane.showMessageDialog(null, "Día 27");
                       break;
                    case 28: 
                       JOptionPane.showMessageDialog(null, "Día 28");
                       break;
                   case 29:
                       JOptionPane.showMessageDialog(null, "Día 29");
                       break;
                   case 30:
                       JOptionPane.showMessageDialog(null, "Día 30");
                       break;                   
                   default:
                        JOptionPane.showMessageDialog(null, "Error");
                        break;
               }
    }
    
    public static void validarMes(String mes) {
        int mesAño = 0;
        switch(mesAño){
                   case 1: 
                       JOptionPane.showMessageDialog(null, "Enero");
                       break;
                   case 2:
                       JOptionPane.showMessageDialog(null, "Febrero");
                       break;
                   case 3:
                       JOptionPane.showMessageDialog(null, "Marzo");
                       break;
                   case 4:
                       JOptionPane.showMessageDialog(null, "Abril");
                       break;
                   case 5:
                       JOptionPane.showMessageDialog(null, "Mayo");
                       break;
                   case 6:
                       JOptionPane.showMessageDialog(null, "Junio");
                       break;
                   case 7:
                       JOptionPane.showMessageDialog(null, "Julio");
                       break;
                   case 8:
                       JOptionPane.showMessageDialog(null, "Agosto");
                       break;
                   case 9:
                       JOptionPane.showMessageDialog(null, "Septiembre");
                       break;
                    case 10: 
                       JOptionPane.showMessageDialog(null, "Octubre");
                       break;
                   case 11:
                       JOptionPane.showMessageDialog(null, "Noviembre, el mejor mes");
                       break;
                   case 12:
                       JOptionPane.showMessageDialog(null, "Diciembre");
                       break;
                   default:
                       JOptionPane.showMessageDialog(null, "Error");
                       break;
    }
    
    }
    
    public static void validarAno(String ano) throws Exception {
           boolean error=false;
        if (ano.length()!= 4)
            error = true;
        else
            for (int x = 0; x < ano.length() && error == false;x++)
                if (Character.isAlphabetic(ano.charAt(x)))
                    error = true;
        if (error)
            throw new DatoNoValido();   
      }
    
    public static void validarCiudad( String ciudad) throws Exception {
        boolean error=false;
        if (ciudad.length()<= 5)
            error = true;
        else
            // Todo letras
            for (int x = 0; x < ciudad.length() && error == false;x++)
                if (Character.isDigit(ciudad.charAt(x)))
                    error = true;
        if (error)
            throw new DatoNoValido();             
    }
}
