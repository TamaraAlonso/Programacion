/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasot8p4e1;

import UML.Contrato;
import UML.Departamento;
import UML.Persona;
import Vista.gestionPersonal;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Tamara
 */
public class RepasoT8P4E1 {

    /**
     * @param args the command line arguments
     */
    
    private static ArrayList <Contrato> aContrato;
    private static ArrayList <Departamento> aDepart;
    private static ArrayList <Persona> listaPersonas;

    private static Persona oPersona;
    private static Persona oPersona1;
    private static Contrato oContrato;
    private static Departamento oDepartamento;
    
    private static String operacion;
    
    public static void main(String[] args) {
        // TODO code application logic here
      
    }
    
    public static void generarDatos (){
        oContrato = new Contrato ();
        aContrato.add(oContrato);
        
        oContrato.setDescripcion("Indefinido");
        oContrato.setDescripcion("Relevo");
        oContrato.setDescripcion("Eventual");
        oContrato.setDescripcion("Interinidad");
        
        
        oDepartamento = new Departamento ();
        aDepart.add(oDepartamento);
        
        oDepartamento.setNombre("Gestión");
        oDepartamento.setNombre("Infor");
        oDepartamento.setNombre("Antro");
        oDepartamento.setNombre("Filo");
        
        
        oPersona = new Persona ();
        listaPersonas.add(oPersona);
        
        oPersona.setDni("72825101V");
        oPersona.setNss("123456");
        oPersona.setNombre("Juan Ortiz");
        oPersona.setDireccion("C/Salvatierra");
        oPersona.setTelefono("652410274");
        oPersona.setSexo("H");
        oPersona.setEstadoCivil("C");
        oPersona.setContrato("Indefinido");
        oPersona.setDepartamento("Gestion");
        oPersona.setFechaAlta("01/11/1994");
        
         oPersona1 = new Persona ();
        listaPersonas.add(oPersona1);
        
        oPersona.setDni("72825102X");
        oPersona.setNss("789012");
        oPersona.setNombre("Yadira Martinez");
        oPersona.setDireccion("C/Urdaibai");
        oPersona.setTelefono("622345678");
        oPersona.setSexo("M");
        oPersona.setEstadoCivil("S");
        oPersona.setContrato("Interinidad");
        oPersona.setDepartamento("Antro");
        oPersona.setFechaAlta("01/11/1994");       
        
    }
    public static void terminar (){
        System.exit(0);
    }
    
    public void llenarDepartamento(JComboBox departamentos){
       
        for(int x=0; x < listaPersonas.size();x++)
        departamentos.insertItemAt(aDepart.get(x).toString(), x);
        }
}

