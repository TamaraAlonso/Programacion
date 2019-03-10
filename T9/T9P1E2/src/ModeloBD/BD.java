/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import UML.Acontecimiento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;

/**
 *
 * @author 1gdaw04
 */

    
    public class BD {
    
    private Connection con;
    
     public BD(Connection con)
    {
        this.con = con;
    }
    
    public void registrarPersona(Acontecimiento ac) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        /*
        Statement sentencia = con.createStatement();
        sentencia.executeUpdate("INSERT INTO personas VALUES ('"+p.getNombrePersona()+"', '"
                            +p.getEdadPersona()+"', '"
               +            p.getProfesionPersona()+"', '"+
                            p.getTelefonoPersona()+"')");
        sentencia.close();*/
        
        String plantilla = "INSERT INTO personas VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, ac.getNombre());
        ps.setString(2,ac.getLugar());
        ps.setDate(3, convertToDateViaSqlDate(ac.getFechaAcontecimiento()));
        ps.setString(4,ac.getTelefonoPersona());
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
    
    public Date convertToDateViaSqlDate(LocalDate dateToConvert) {
    return java.sql.Date.valueOf(dateToConvert);
}
}
