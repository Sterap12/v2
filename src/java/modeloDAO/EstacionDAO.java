package modeloDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modeloVO.EstacionVO;
import util.ConexioBD;
import util.InterfaceCrud;

/**
 *
 * @author SEVEN
 */
public class EstacionDAO extends ConexioBD implements InterfaceCrud {

    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    private ResultSet rol = null;

    private String PA_Id_Sta = "";
    private String PA_type_Sta = "";
    private String PA_quantity_Sta = "";
    private String PA_Id_Cla = "";
    private String PA_Id_inv = "";
    private String PA_object_Sta = "";

    private boolean operaciones = false;
    private boolean cargo = false;

    public EstacionDAO(EstacionVO EsVO) {

        super();
        try {
            conexion = this.obtenerConexion();
            puente = conexion.createStatement();

            PA_Id_Sta = EsVO.getPA_Id_Sta();
            PA_type_Sta = EsVO.getPA_type_Sta();
            PA_quantity_Sta = EsVO.getPA_quantity_Sta();
            PA_Id_Cla = EsVO.getPA_Id_Cla();
            PA_Id_inv = EsVO.getPA_Id_inv();
            PA_object_Sta = EsVO.getPA_object_Sta();

        } catch (Exception e) {
        }

    }

    public boolean agregarRegistro() {
        try {
            puente.executeUpdate("CALL Station(null,'" + PA_type_Sta + "','" + PA_quantity_Sta + "'," + PA_Id_Cla + "," + PA_Id_inv + ",'" + PA_object_Sta + "',1,'nuevo');");
            operaciones = true;
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return operaciones;
    }

    public boolean actualizarRegistro() {
        try {

            puente.executeUpdate("CALL Station(" + PA_Id_Sta + ",'" + PA_type_Sta + "','" + PA_quantity_Sta + "'," + PA_Id_Cla + "," + PA_Id_inv + ",'" + PA_object_Sta + "','editar');");
            operaciones = true;

        } catch (Exception e) {

            System.out.println("¡Error!" + e.toString());
        }
        return operaciones;
    }

    public boolean eliminarRegistro() {
        try {

            puente.executeUpdate("CALL Station(" + PA_Id_Sta + ",'" + PA_type_Sta + "','" + PA_quantity_Sta + "'," + PA_Id_Cla + "," + PA_Id_inv + ",'" + PA_object_Sta + "','eliminar');");
            operaciones = true;

        } catch (Exception e) {

            System.out.println("¡Error!" + e.toString());
        }
        return operaciones;
    }

    public ArrayList<EstacionVO> listar() {
        ConexioBD conexionbd = new ConexioBD();
        ArrayList<EstacionVO> listaaprendices = new ArrayList<>();
        try {
            puente = conexionbd.obtenerConexion().createStatement();
            mensajero = puente.executeQuery("select*from Station");
            while (mensajero.next()) {
                EstacionVO apVo = new EstacionVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6));
                listaaprendices.add(apVo);
            }
        } catch (Exception e) {
            System.out.println("¡Error!" + e.toString());

        }
        return listaaprendices;
    }

    public static EstacionVO consultarPorid(String id) {
        EstacionVO instivo = null;
        try {
            ConexioBD conexionbd = new ConexioBD();
            Connection conexion = conexionbd.obtenerConexion();
            Statement puente = conexion.createStatement();

            ResultSet mensajero = puente.executeQuery("CALL Station(" + id + ",null,null,null,null,null,'consultar');");
            ;
            while (mensajero.next()) {

                instivo = new EstacionVO(id, mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6));

            }
            mensajero.close();
            puente.close();

        } catch (Exception e) {
            System.out.println("¡ERROR!" + e.toString());
        }
        return instivo;
    }

    public EstacionDAO() {
    }

}
