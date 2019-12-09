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
import modeloVO.NovedadesVO;
import util.ConexioBD;
import util.InterfaceCrud;

/**
 *
 * @author Masterr}
 */
public class NovedadesDAO extends ConexioBD implements InterfaceCrud {

    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    private ResultSet rol = null;

    private String nvId = "";
    private String usuDescri = "";
    private String usuFecha = "";
    private String usuType = "";
    private String usuEntrada = "";
    private String usuSalida = "";
    private String usuSalon = "";
    private String usuInstructor = "";
    private String usuproceso = "";
    private String usuAprendiz = "";

    private boolean operaciones = false;
    private boolean cargo = false;

    public NovedadesDAO(NovedadesVO NovVO) {

        super();
        try {
            conexion = this.obtenerConexion();
            puente = conexion.createStatement();

            nvId = NovVO.getNvid();
            usuDescri = NovVO.getUsuDescri();
            usuType = NovVO.getUsuType();
            usuFecha = NovVO.getUsuFecha();
            usuEntrada = NovVO.getUsuEntrada();
            usuSalida = NovVO.getUsuSalida();
            usuSalon = NovVO.getUsuSalon();
            usuproceso = NovVO.getUsuproceso();
            usuInstructor = NovVO.getUsuInstructor();
            usuAprendiz = NovVO.getUsuAprendiz();

        } catch (Exception e) {
        }
    }

    @Override
    public boolean agregarRegistro() {
       try {
            puente.executeUpdate("call PA_NEW(null, '" + usuDescri + "','" + usuType + "','" + usuFecha + "','" + usuEntrada + "','" + usuSalida + "','" + usuSalon + "','" + usuInstructor + "',null,'" + usuAprendiz + "',1,'nuevo');");
            operaciones = true;
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return operaciones;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            puente.executeUpdate("call PA_NEW('" + nvId + "', null, null, null, null, null, null, null, null, null, null,'eliminar');");
            operaciones = true;
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return operaciones;
    }

    public ArrayList<NovedadesVO> listar() {
        ConexioBD conexionbd = new ConexioBD();
        ArrayList<NovedadesVO> listarNovedades = new ArrayList<>();
        try {
            puente = conexionbd.obtenerConexion().createStatement();
            mensajero = puente.executeQuery("select*from news where idS = 1;");
            while (mensajero.next()) {
                NovedadesVO NoVo = new NovedadesVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9), mensajero.getString(10));
                listarNovedades.add(NoVo);
            }
        } catch (Exception e) {
            System.out.println("¡Error!" + e.toString());

        }
        return listarNovedades;
    } 
        public boolean AgregarProcesos() {
        try {
            puente.executeUpdate("call PA_NEW('" + nvId + "', null, null, null, null, null, null, null, null, null, null,'agregarpro');");
            operaciones = true;
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return operaciones;
    }
  

    public NovedadesDAO() {

    }

}
