/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;


import java.sql.*;

/**
 *
 * @author dam2
 */
public class conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/datos";
    public static final String USER = "root";
    public static final String CLAVE = "";
    
    public Connection getConexion(){
        Connection conex = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex = (Connection) DriverManager.getConnection(URL,USER,CLAVE);
            
           
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return conex;
    }
}
