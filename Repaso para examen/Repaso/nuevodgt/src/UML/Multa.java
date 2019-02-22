/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

/**
 *
 * @author Tamara
 */
public class Multa {
    
    private int cod;
    private String descripcion;
    private Vehiculo v;
    

    public Multa() {
    }

    
    public Multa(int cod, String descripcion, Vehiculo v) {
        this.cod = cod;
        this.descripcion = descripcion;
        this.v = v;
    }

    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }
    
    
}
