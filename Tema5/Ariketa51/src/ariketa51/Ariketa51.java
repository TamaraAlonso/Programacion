
package ariketa51;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Excepciones.*;


public class Ariketa51 {

   static ArrayList <Double> menu = new ArrayList ();
   static int sumaTotal = 0;
   
    public static void main(String[] args) {
        
        /* Crea un arraylist para guardar valores de tipo real(FloatoDouble)que iremos introduciendo por teclado hasta ﬁnalizar (mientras quiera continuar).
        Posteriormente muestra un men´u para que el usuario pueda realizar las siguientes operaciones:
        1. Visualizar el valor m´aximo y el m´ınimo.  
        2. Solicitar un n´umero y buscarlo. Muestra un mensaje indicando si lo has encontrado o no.
        3. Solicitar un n´umero, buscarlo y borrarlo. Sino se encuentra muestra un mensaje de error. 
        4. Convertir el arrayList en un array. 
        5. Si no esta vac´ıo, mostrar el n´umero de elementos que contiene. 
        6. Insertar un nuevo elemento por el ﬁnal. 
        7. Insertar un nuevo elemento en la posici´on que te indique el usuario. 
        8. Borrar un elemento de una posici´on concreta. 
        9. Calcular la suma y la media aritm´etica de los valores contenidos. 
        10. Finalizar.
        */
        
       pedirDatos(); 
  
       int opc = 0;
       do
       {
           try
           {
               opc = mostrarMenu();
               switch(opc){
                   case 1:
                       funcionMaxMin();
                       break;
                   case 2:
                       funcionNumeroEncontrado();
                       break;
                   case 3:
                       funcionNumeroBorrado();
                       break;
                   case 4:
                       funcionArray();
                       break;
                   case 5:
                       funcionElementosContenidos();
                       break;
                   case 6:
                       funcionElementoFinal();
                       break;
                   case 7:
                       funcionElementoEnPosicion();
                       break;
                   case 8:
                       funcionPosicionConcreta();
                       break;
                   case 9:
                       funcionMediaNum();
                       break;
                   case 10:
                        JOptionPane.showMessageDialog(null, "Gracias por participar");
                        break;
               }
           }
           catch(OpcionNoValida e)
           {
               JOptionPane.showMessageDialog(null,"La opción elegida en el menú no es válida");
           }
           catch(NumberFormatException e)
           {
               JOptionPane.showMessageDialog(null,"Hay que teclear numeros");
           }
            catch(ArithmeticException e)
           {
               JOptionPane.showMessageDialog(null,"No se puede realizar la operación con los numeros introducidos");
           }
            catch(NullPointerException | StringIndexOutOfBoundsException e)
           {
               // pulsan x en el cuadro de dialogo de entrada o en el botón de cancelar
               // charAt(0)
               JOptionPane.showMessageDialog(null,"Es obligatorio proporcionar el dato de entrada");
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,"Problemas " + e.getClass() + e.getMessage());
           } 
       }
       while(opc != 10);
    }
   
   public static void pedirDatos (){
       
       String continuar;       
       do {
       
       Double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));       
       menu.add(numero);
       
       continuar = JOptionPane.showInputDialog("¿Quieres continuar introduciendo datos? s/n");
              
        }
       
       while ("s".equalsIgnoreCase(continuar));
    
   }
   
   public static int mostrarMenu() throws Exception
    {
         int opc =  Integer.parseInt(JOptionPane.showInputDialog("1.- Visualizar el valor máximo y mínimo \n"
                + "2.- Solicitar un número y buscarlo \n"
                + "3.- Solicitar un número, buscarlo y borrarlo \n"
                + "4.- Convertir el arrayList en un array \n"
                + "5.- Si no está vacío, mostrar mostrar el menú de los elementos \n"
                + "6.- Insertar un nuevo elemento por el final \n"
                + "7.- Insertar un nuevo elemento en la posición que indiques \n"
                + "8.- Borrar un elemento de una posición concreta \n"
                + "9.- Calcular la suma y la media aritmética de los valores contenidos \n"
                + "10.- Salir del programa\n\n"
                + "Elige una opción"));
        if (opc < 1 || opc > 10)
            throw new OpcionNoValida();
        return opc;
                
    }   
   
    public static int solicitarNumero() throws Exception
    {
        return Integer.parseInt(JOptionPane.showInputDialog("Teclea un número"));
    }
    
    public static void funcionMaxMin() throws Exception {
       
       
        double numMax = 0;            
        double numMin = 999;   
        
        for (int i = 1; i < menu.size(); i++) {
                        
            if (menu.get(i) < numMin){
                numMin = i;
            }
            else {
                if (menu.get(i) > numMax) {
                    numMax = i;
                }
            }
            System.out.println(i);
        }
    }
    
    public static void funcionNumeroEncontrado() throws Exception {
        
        Double num = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número que deseas buscar "));
        
        if (menu.contains(num)) {
            JOptionPane.showMessageDialog(null, "El número introducido " + num + " se encuentra dentro del menú");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número introducido " + num+ " no se encuentra dentro del menú");
        }
    
    }
    
    public static void funcionNumeroBorrado() throws Exception {
      
        Double numBorrado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número que deseas buscar"));
        
        if (menu.contains(numBorrado)) {
            menu.remove(numBorrado);
            JOptionPane.showMessageDialog(null, "El número ha sido borrado");
        }
        else {
            JOptionPane.showMessageDialog(null, "Error, el número no ha sido introducido correctamente");
        }
        
    }
    
    public static void funcionArray() throws Exception {
        
        Object [] array = menu.toArray();
        
    }
    
    public static void funcionElementosContenidos() throws Exception {
        
        if (menu.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El menú se encuentra vacío");
        }
        else {
            if (menu.size()!= 0){
               JOptionPane.showMessageDialog(null, "El contenido del menú es " + menu);
            }
        }
    }
    
    public static void funcionElementoFinal() throws Exception {
        
        JOptionPane.showMessageDialog(null, "El menú se encuentra de la siguiente manera: " + menu);
        
        double numeroFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para ponerlo al final"));
        
        menu.add(numeroFinal);      
        
        JOptionPane.showMessageDialog(null, "La lista se queda de la siguiente manera " + menu);
    
    }
    
    public static void funcionElementoEnPosicion() throws Exception {
        
        JOptionPane.showMessageDialog(null, "El menú se encuentra de la siguiente manera: " + menu);
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        
        double posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición en la que lo quieres colocar"));
        
        menu.set(numero, posicion);
        
        JOptionPane.showMessageDialog(null, "El menú se encuentra de la siguiente manera " + menu);
    }
    
    public static void  funcionPosicionConcreta() throws Exception {
       
       JOptionPane.showMessageDialog(null, "El menú se encuentra de la siguiente manera: " + menu); 
        
       int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición del número que quieres eliminar"));
        
       Double remove;
       remove = menu.remove(posicion);
       
       JOptionPane.showMessageDialog(null, "El menú tras eliminar eliminar el número "+ remove + " se encuentra de la siguiente manera " + menu);
    }
    
    public static void funcionMediaNum() throws Exception {
        
        double suma = 0;
        for (int i=0; i < menu.size(); i++) {
            double valor = 0;

            try {
                valor = menu.get(i);
            }
            catch (NumberFormatException e) {
                valor = 0;
            }
            
            suma += valor;
        }
        
        double numeroDefinitivo = menu.set(sumaTotal, suma);
        
        JOptionPane.showMessageDialog(null, "La media de los números es " + numeroDefinitivo);
    }
    
}
