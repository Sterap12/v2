/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Masterr}
 */
public class ConexioBD {
    
        private String driver, urlBD, userBD, passwordBD, bd;
    private Connection conexion;
    
    public ConexioBD(){
        driver = "com.mysql.jdbc.Driver";
        userBD="root";
        passwordBD="";
        bd="novafinal";
        urlBD="jdbc:mysql://localhost:3306/"+ bd;
        
        try {
            
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(urlBD, userBD, passwordBD);
            System.out.println("¡Conexión OK!");
            
        } catch (Exception e) {
            System.out.println("Error al conectarse a la BD"+e.toString());
        }
    }
    
    public Connection obtenerConexion(){
        return conexion;
    }
    public Connection cerrarConexion() throws SQLException{
        conexion.close();
        conexion = null;
        return conexion;
    }
    public static void main(String[] args) {
        new ConexioBD();
    }
    
}
