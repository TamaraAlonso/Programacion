/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;


public class Persona {
    /*Define una clase Persona con los siguientes datos: nombre, dNacimiento
(d´ıa de nacimiento), mNacimiento (mes de nacimiento), aNacimiento
(a ˜no de nacimiento), direcci ´on, c´odigo postal y ciudad.
Crea varios objetos de tipo Persona y a trav´es de un programa muestra
los siguientes datos:
Nombre de la persona de mayor edad.
Nombre de las personas que viven en Elche.
N´umero de personas mayores de edad.
Hay que comprobar que todos los campos contienen informaci´on y
que es l ´ogica.*/
    
    
    String [] persona = new String [7];
    
    private String nombre;
    private String dNacimiento;
    private String mNacimiento;
    private String aNacimiento;
    private String direccion;
    private String codigoPostal;
    private String ciudad;

    public Persona () {}
    
    public Persona(String nombre, String dNacimiento, String mNacimiento, String aNacimiento, String direccion, String codigoPostal, String ciudad) {
        this.nombre = nombre;
        this.dNacimiento = dNacimiento;
        this.mNacimiento = mNacimiento;
        this.aNacimiento = aNacimiento;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }
    

    public String[] getPersona() {
        return persona;
    }

    public void setPersona(String[] persona) {
        this.persona = persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(String dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public String getmNacimiento() {
        return mNacimiento;
    }

    public void setmNacimiento(String mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public String getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(String aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
   
            
}
