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
import modeloVO.ProcesoVO;
import util.ConexioBD;
import util.InterfaceCrud;

/**
 *
 * @author Masterr}
 */
public class ProcesoDAO extends ConexioBD implements InterfaceCrud {

    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    private ResultSet rol = null;

    private String idnovedad = "";
    private String idpro = "";
    private String tipo = "";
    private String duracion = "";
    private String ingreso = "";
    private String radicado = "";
    private String salon = "";

    private boolean operaciones = false;
    private boolean cargo = false;

    public ProcesoDAO(ProcesoVO PrVO) {

        super();
        try {
            conexion = this.obtenerConexion();
            puente = conexion.createStatement();

            idpro = PrVO.getIdpro();
            tipo = PrVO.getTipo();
            duracion = PrVO.getDuracion();
            ingreso = PrVO.getIngreso();
            radicado = PrVO.getRadicado();
            salon = PrVO.getSalon();

        } catch (Exception e) {
        }
    }

    @Override
    public boolean agregarRegistro() {
        try {
            puente.executeUpdate("CALL Processs(null,'" + tipo + "','" + duracion + "',null,'" + radicado + "','"+salon+"',1,'nuevo');");
            operaciones = true;
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return operaciones;
    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<ProcesoVO> listar() {
        ConexioBD conexionbd = new ConexioBD();
        ArrayList<ProcesoVO> listaProceso = new ArrayList<>();
        try {
            puente = conexionbd.obtenerConexion().createStatement();
            mensajero = puente.executeQuery("select*from processs where Ids =1");
            while (mensajero.next()) {
                ProcesoVO prVO = new ProcesoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3),mensajero.getString(5),mensajero.getString(6),mensajero.getString(7));
                listaProceso.add(prVO);
            }
        } catch (Exception e) {
            System.out.println("¡Error!" + e.toString());

        }
        return listaProceso;
    }

    public boolean agregarproceso() {
        try {
            puente.executeUpdate("CALL Processs('"+idpro+"',null,null,null,null,null,null,'eliminar');");
            operaciones = true;
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return operaciones;
    }     
   

    public ProcesoDAO() {

    }

}
