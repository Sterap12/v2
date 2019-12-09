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
import modeloVO.ClassroomVO;
import util.ConexioBD;
import util.InterfaceCrud;

/**
 *
 * @author sroja
 */
public class ClassroomDAO extends ConexioBD implements InterfaceCrud {
    
    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    private ResultSet rol = null;
    
    
    private String ClId = "";
    private String Cltype  = "";
    private String ClNumber = "";
    
    private boolean operaciones = false;
    private boolean cargo = false;
    
     public ClassroomDAO(ClassroomVO ClVO){
         
        super();
        try {
            conexion = this.obtenerConexion();
            puente = conexion.createStatement();


            ClId = ClVO.getClId();
            Cltype = ClVO.getCltype();
            ClNumber = ClVO.getClNumber();
            

        } catch (Exception e) {
        }
    }

    @Override
    public boolean agregarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<ClassroomVO> listar() {
        ConexioBD conexionbd = new ConexioBD();
        ArrayList<ClassroomVO> listaClassroom = new ArrayList<>();
        try {
            puente = conexionbd.obtenerConexion().createStatement();
            mensajero = puente.executeQuery("select*from classroom");
            while (mensajero.next()) {
                ClassroomVO ClVO = new ClassroomVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3));
                listaClassroom.add(ClVO);
            }
        } catch (Exception e) {
            System.out.println("¡Error!" + e.toString());

        }
        return listaClassroom;
    }
    public ClassroomDAO(){
         
    }
    
}
