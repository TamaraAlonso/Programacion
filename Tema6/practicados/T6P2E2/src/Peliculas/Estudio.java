/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peliculas;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Tamara
 */
class Estudio {
     private String nombre;
    private String ciudad;
    private String direccion;
    private String dirWeb;
    private Date fechaFundacion;
    ArrayList <Lista> telefonos;
    ArrayList <Peliculas> listaPeliculas;

    public Estudio(ArrayList<Peliculas> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public ArrayList<Peliculas> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Peliculas> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public Estudio(String nombre, String ciudad, String direccion, String dirWeb, Date fehcaFundacion, ArrayList<Lista> telefonos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dirWeb = dirWeb;
        this.fechaFundacion = fehcaFundacion;
        this.telefonos = telefonos;
    }

    public Estudio(String producciones_Sergio, String vitoria, String c_a, String wwwprosercom, Date parse, String españa, ArrayList<String> telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirWeb() {
        return dirWeb;
    }

    public void setDirWeb(String dirWeb) {
        this.dirWeb = dirWeb;
    }

    public Date getFehcaFundacion() {
        return fechaFundacion;
    }

    public void setFehcaFundacion(Date fehcaFundacion) {
        this.fechaFundacion = fehcaFundacion;
    }

    
    public ArrayList<Lista> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Lista> telefonos) {
        this.telefonos = telefonos;
    }
    public void modificarPelicula(){}
    public void desplieguePelicula(){}
    public void eliminarPelicula(){}
}
