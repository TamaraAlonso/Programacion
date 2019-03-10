/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 1gdaw04
 */
public class BDconnection {
    
   private String bd = "t9p1e2";
    private String usuario = "root";
    private String contraseña = "usbw";
    private String url = "jdbc:mysql://localhost:3307/" + bd;
    
    private Connection connection;
 
    public BDconnection(){}
  
    public void conectar() throws Exception
    {
         //obtenemos el driver para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         connection = DriverManager.getConnection(url,usuario,contraseña);
 
         if (connection==null){
            throw new Exception("Problemas con la conexión");
         }
   }
    
    public Connection getConnection(){
      return connection;
   }
 
    public void desconectar() throws Exception{
      connection.close();
   }
}
