/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.Date;

/**
 *
 * @author Tamara
 */
public class Persona {
    
    private String dni;
    private String nss;
    private String nombre;
    private String sexo;
    private String estadoCivil;
    private String direccion;
    private String telefono;
    private String departamento;
    private String contrato;
    private Date fechaAlta;
    private String numeroEmple;
    
    public Persona() {
    }

    public Persona(String dni, String nss, String nombre, String sexo, String estadoCivil, String direccion, String telefono, String departamento, String contrato, Date fechaAlta, String numeroEmple) {
        this.dni = dni;
        this.nss = nss;
        this.nombre=nombre;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.direccion = direccion;
        this.telefono = telefono;
        this.departamento = departamento;
        this.contrato = contrato;
        this.fechaAlta = fechaAlta;
        this.numeroEmple = numeroEmple;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNumeroEmple() {
        return numeroEmple;
    }

    public void setNumeroEmple(String numeroEmple) {
        this.numeroEmple = numeroEmple;
    }
    
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
   
}
