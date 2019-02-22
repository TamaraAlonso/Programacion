/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;
import java.util.ArrayList;
/**
 *
 * @author Tamara
 */
public class Departamento {
    
    private String nombre;

    private ArrayList <Persona> listaPersonas;
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public Departamento() {
    }

    public ArrayList <Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(Persona p) {
        this.listaPersonas = listaPersonas;
    }

   
   
    
}
