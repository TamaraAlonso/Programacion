/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso.arrays;

import javax.swing.JOptionPane;
import Excepciones.*;

/**
 *
 * @author Tamara
 */
public class RepasoArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Empleado listaEmpleados [0]= new Empleado [3];

    listaEmpleados[0]= new Empleado ["Ana","34",2000];
    listaEmpleados[1]= new Empleado ["Ernesto","22",2450];
    listaEmpleados[2]= new Empleado ["Susana","77",2900];
    }
    
    public class Empleado {
        
        private String nombre;
        private String edad;
        private int salario;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEdad() {
            return edad;
        }

        public void setEdad(String edad) {
            this.edad = edad;
        }

        public int getSalario() {
            return salario;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }

        public Empleado(String nombre, String edad, int salario) {
            this.nombre = nombre;
            this.edad = edad;
            this.salario = salario;
        }
        
        
    }
}
