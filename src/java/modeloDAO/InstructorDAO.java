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
import modeloVO.InstructorVO;
import util.ConexioBD;
import util.InterfaceCrud;

/**
 *
 * @author Masterr}
 */
public class InstructorDAO extends ConexioBD implements InterfaceCrud {

    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    private ResultSet rol = null;

    private String inId = "";
    private String inName = "";
    private String inLastName = "";
    private String inTypeDoc = "";
    private String inNumber = "";
    private String inSpeciality = "";
    private String inEge = "";
    private String inGender = "";
    private String inEmail = "";

    private boolean operaciones = false;
    private boolean cargo = false;

    public InstructorDAO(InstructorVO IpVO) {

        super();
        try {
            conexion = this.obtenerConexion();
            puente = conexion.createStatement();

            inId = IpVO.getInId();
            inName = IpVO.getInName();
            inLastName = IpVO.getInLastName();
            inTypeDoc = IpVO.getInTypeDoc();
            inNumber = IpVO.getInNumber();
            inSpeciality = IpVO.getInSpeciality();
            inEge = IpVO.getInEge();
            inGender = IpVO.getInGender();
            inEmail = IpVO.getInEmail();

        } catch (Exception e) {
        }
    }

    @Override
    public boolean agregarRegistro() {
        try {
            puente.executeUpdate("CALL PA_Istructor(null,'" + inName + "','" + inLastName + "','" + inTypeDoc + "','" + inNumber + "','" + inSpeciality + "','" + inEge + "','" + inGender + "','" + inEmail + "','1','nuevo');");
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

    public ArrayList<InstructorVO> listar() {
        ConexioBD conexionbd = new ConexioBD();
        ArrayList<InstructorVO> listaaprendices = new ArrayList<>();
        try {
            puente = conexionbd.obtenerConexion().createStatement();
            mensajero = puente.executeQuery("select*from instructor");
            while (mensajero.next()) {
                InstructorVO apVo = new InstructorVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));
                listaaprendices.add(apVo);
            }
        } catch (Exception e) {
            System.out.println("¡Error!" + e.toString());

        }
        return listaaprendices;
    }

    public ArrayList<InstructorVO> listarultimo() {
        ConexioBD conexionbd = new ConexioBD();
        ArrayList<InstructorVO> listainstructor = new ArrayList<>();
        try {
            puente = conexionbd.obtenerConexion().createStatement();
            mensajero = puente.executeQuery("SELECT*FROM instructor ORDER BY Id_ins DESC LIMIT 1;");
            while (mensajero.next()) {
                InstructorVO apVo = new InstructorVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));
                listainstructor.add(apVo);
            }
        } catch (Exception e) {
            System.out.println("¡Error!" + e.toString());

        }
        return listainstructor;
    }


    public static InstructorVO consultarcorreo(String mail) {
        InstructorVO InstrucVo = null;
        try {
            ConexioBD conexionbd = new ConexioBD();
            Connection conexion = conexionbd.obtenerConexion();
            Statement puente = conexion.createStatement();

            ResultSet mensajero = puente.executeQuery("CALL PA_Istructor(null,null,null,null,null,null,null,null,'" + mail + "',null,'consultarcorreo');");
            while (mensajero.next()) {
                 InstrucVo = new InstructorVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mail, mensajero.getString(9));
            }
            mensajero.close();
            puente.close();
        } catch (Exception e) {
            System.out.println("¡Error!" + e.toString());

        }
        return InstrucVo;
    }

    public InstructorDAO() {

    }

}
