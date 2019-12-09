/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import modeloVO.UsuarioVO;
import util.ConexioBD;
import util.InterfaceCrud;

/**
 *
 * @author Masterr}
 */
public class UsuarioDAO extends ConexioBD implements InterfaceCrud {

    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    private ResultSet rol = null;

    private String usuId = "";
    private String usuLogin = "";
    private String usuPassword = "";
    private String usuTipo = "";
    private String usunumId ="";

    private boolean operaciones = false;
    private boolean cargo = false;

    public UsuarioDAO(UsuarioVO usuVO) {

        super();
        try {
            conexion = this.obtenerConexion();
            puente = conexion.createStatement();

            usuId = usuVO.getUsuId();
            usuLogin = usuVO.getUsuLogin();
            usuPassword = usuVO.getUsuPassword();
            usuTipo = usuVO.getUsuTipo();
            usunumId = usuVO.getUsunumId();


        } catch (Exception e) {
        }
    }

    @Override
    public boolean agregarRegistro() {
        try {

            puente.executeUpdate("CALL `PA_UserS`(null,'"+usuLogin+"','"+usuPassword+"','"+usunumId+"' , '"+usuTipo+"', 1, 'nuevo');");
            operaciones = true;

        } catch (Exception e) {

            System.out.println("¡Error!" + e.toString());
        }
        return operaciones;
    }

    @Override
    public boolean actualizarRegistro() {
        try {

            puente.executeUpdate("CALL `PA_UserS`(null,null,'"+usuPassword+"','"+usunumId+"' , null, null, 'actualizar');");
            operaciones = true;

        } catch (Exception e) {

            System.out.println("¡Error!" + e.toString());
        }
        return operaciones;
    }

    public boolean validarIngreso(String usuario, String password) {
        try {

            conexion = this.obtenerConexion();
            puente = conexion.createStatement();
            mensajero = puente.executeQuery("CALL `PA_UserS`(null,'"+usuario+"','"+password+"',null , null, 1, 'consultar');");
           

            if (mensajero.next()) {
                operaciones = true;

            }
            this.cerrarConexion();

        } catch (Exception e) {

            System.out.println("¡Error!" + e.toString());
        }
        return operaciones;
    }
    

}
