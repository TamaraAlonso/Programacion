/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw04
 */
public class Acontecimiento {
    
    private String nombre;
    private String lugar;
    private LocalDate fechaAcontecimiento;
    private LocalTime horaInicio;
    private LocalTime horaFinalizacion;
    private int aforo;

    
    public Acontecimiento() {
    }
    
    public Acontecimiento(String nombre, String lugar, LocalDate fechaAcontecimiento, LocalTime horaInicio, LocalTime horaFinalizacion, int aforo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaAcontecimiento = fechaAcontecimiento;
        this.horaInicio = horaInicio;
        this.horaFinalizacion = horaFinalizacion;
        this.aforo = aforo;
    }    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFechaAcontecimiento() {
        return fechaAcontecimiento;
    }

    public void setFechaAcontecimiento(LocalDate fechaAcontecimiento) {
        this.fechaAcontecimiento = fechaAcontecimiento;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFinalizacion() {
        return horaFinalizacion;
    }

    public void setHoraFinalizacion(LocalTime horaFinalizacion) {
        this.horaFinalizacion = horaFinalizacion;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

   
    
}
