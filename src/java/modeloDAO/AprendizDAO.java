/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modeloVO.AprendizVO;
import util.ConexioBD;
import util.InterfaceCrud;

/**
 *
 * @author sroja
 */
public class AprendizDAO extends ConexioBD implements InterfaceCrud {

    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    private ResultSet rol = null;

    private String apId = "";
    private String apName = "";
    private String apLastName = "";
    private String apClassNumber = "";
    private String apEmail = "";
    private String apNIT = "";

    private boolean operaciones = false;
    private boolean cargo = false;

    public AprendizDAO(AprendizVO ApVO) {

        super();
        try {
            conexion = this.obtenerConexion();
            puente = conexion.createStatement();

            apId = ApVO.getApId();
            apName = ApVO.getApName();
            apLastName = ApVO.getApLastName();
            apEmail = ApVO.getApEmail();
            apClassNumber = ApVO.getApClassNumber();
            apNIT = ApVO.getApNIT();

        } catch (Exception e) {
        }
    }

    @Override
    public boolean agregarRegistro() {
        try {
            ///Name_Pre = PA_Name_Pre, LastName_Pre = PA_LastName_Pre, Class_number = PA_Class_number, Email = PA_Email WHERE NIT = PA_NIT;
            puente.executeUpdate("CALL Prentice(null,'" + apName + "','" + apLastName + "','" + apClassNumber + "','" + apEmail + "','" + apNIT + "',1,'nuevo');");
            operaciones = true;
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return operaciones;
    }

    @Override
    public boolean actualizarRegistro() {
        try {

            puente.executeUpdate("CALL Prentice(null,'" + apName + "','" + apLastName + "'," + apClassNumber + ",'" + apEmail + "'," + apNIT + ",'editar');");
            //puente.executeUpdate(" update vehiculo set DATID ='" + datid + "',CATID='" + catid + "',VEHMODELO = '" + vehmodelo + "',VEHMARCA = '" + vehmarca + "',VEHESTADO = '" + vehestado + "',VEHPRECIO = '" + vehprecio + "' where VEHPLACA='" + vehPlaca + "'; ");
            operaciones = true;

        } catch (Exception e) {

            System.out.println("¡Error!" + e.toString());
        }
        return operaciones;
    }

    public static AprendizVO consultarPorNit(String Nit) {
        AprendizVO apVo = null;
        try {
            ConexioBD conexionbd = new ConexioBD();
            Connection conexion = conexionbd.obtenerConexion();
            Statement puente = conexion.createStatement();

            ResultSet mensajero = puente.executeQuery("SELECT*FROM prentice WHERE nit = '" + Nit + "'");
            while (mensajero.next()) {
                apVo = new AprendizVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), Nit);
            }
            mensajero.close();
            puente.close();
        } catch (Exception e) {
            System.out.println("¡Error!" + e.toString());

        }
        return apVo;
    }

    public ArrayList<AprendizVO> listar() {
        ConexioBD conexionbd = new ConexioBD();
        ArrayList<AprendizVO> listaaprendices = new ArrayList<>();
        try {
            puente = conexionbd.obtenerConexion().createStatement();
            mensajero = puente.executeQuery("select*from prentice");
            while (mensajero.next()) {
                AprendizVO apVo = new AprendizVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6));
                listaaprendices.add(apVo);
            }
        } catch (Exception e) {
            System.out.println("¡Error!" + e.toString());

        }
        return listaaprendices;
    }

    public AprendizDAO() {

    }

}
