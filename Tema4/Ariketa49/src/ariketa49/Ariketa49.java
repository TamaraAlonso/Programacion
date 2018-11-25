
package ariketa49;

import javax.swing.JOptionPane;


public class Ariketa49 {

   // Me sale bien solo que no sé si es correcto. Simplemente muestro los datos que me ha introducido el usuario.
    
    public static void main(String[] args) {
     /* Queremos almacenar en una matriz el n´umero de alumnos con el que
        cuenta una academia,ordenados en funci´on del nivel y del idioma que se estudia. Tendremos 3 ﬁlas que representar´an al Nivel b´asico,medio
        y de perfeccionamiento y 4 columnas en las que ﬁgurar´an los idiomas (0 = Ingl´es, 1 = Franc´es, 2 = Alem´an y 3 = Ruso). Se pide realizar
        la declaraci´on de la matriz y asignarle unos valores de ejemplo a cada elemento */
     
          
     String [] nivel;
        nivel = new String [12];
        //Llenado        
        nivel [0] = "Básico";
        nivel [1] = "Medio";
        nivel [2] = "Perfeccionamiento";
        
     String [] idioma;
        idioma= new String [4];
        //Llenado
        idioma [0]= "Inglés";
        idioma [1]= "Francés";
        idioma [2]= "Alemán";
        idioma [3]="Ruso";
        
     
     String alumnos = JOptionPane.showInputDialog("Introduce la cantidad de alumnos");
     
     String nivelAlumno =  JOptionPane.showInputDialog("Introduce la inicial del nivel: b/m/p");
        nivelAlumno = nivelAlumno.toLowerCase();
        char letraNivel = nivelAlumno.charAt(0);
        
        switch (letraNivel) {
            
            case 'b':  
                JOptionPane.showMessageDialog(null, "Nivel básico");
                break;
            case 'm':   
                JOptionPane.showMessageDialog(null, "Nivel medio");
                break;
            case 'p':             
                JOptionPane.showMessageDialog(null, "Nivel perfeccionamiento");
                break;          
            default:
                JOptionPane.showMessageDialog(null, "El mes introducido no es correcto");
                
        }
     
      String idiomaAlumno =  JOptionPane.showInputDialog("Introduce la inicial del idioma: i/f/a/r");
        idiomaAlumno = idiomaAlumno.toLowerCase();
        char letraIdioma = idiomaAlumno.charAt(0);
        
        switch (letraIdioma) {
            
            case 'i':  
                JOptionPane.showMessageDialog(null, "Inglés");
                break;
            case 'f':   
                JOptionPane.showMessageDialog(null, "Francés");
                break;
            case 'a':             
                JOptionPane.showMessageDialog(null, "Alemán");
                break;  
            case 'r':             
                JOptionPane.showMessageDialog(null, "Ruso");
                break;  
            default:
                JOptionPane.showMessageDialog(null, "El mes introducido no es correcto");
    }
    
    JOptionPane.showMessageDialog(null, "La cantidad de alumnos " + alumnos + " están en el nivel " + letraNivel + " con el idioma " + letraIdioma);
  }
    
}
    

