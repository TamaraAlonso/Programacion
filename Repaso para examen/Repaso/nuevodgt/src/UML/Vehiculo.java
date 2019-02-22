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
public class Vehiculo {
    
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String nombre;
    private String dniProp;
    
    private ArrayList <Multa> listaMultas;

    
    public Vehiculo() {
    }
    
    public Vehiculo(String matricula, String marca, String modelo, String color, String nombre, String dniProp, ArrayList<Multa> listaMultas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.nombre = nombre;
        this.dniProp = dniProp;
        this.listaMultas = listaMultas;
    }

    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDniProp() {
        return dniProp;
    }

    public void setDniProp(String dniProp) {
        this.dniProp = dniProp;
    }

    public ArrayList<Multa> getListaMultas() {
        return listaMultas;
    }

    public void setListaMultas(ArrayList<Multa> listaMultas) {
        this.listaMultas = listaMultas;
    }
    
    
}
