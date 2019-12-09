package modeloDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modeloVO.DescripcionVO;
import modeloVO.InventarioVO;
import util.ConexioBD;
import util.InterfaceCrud;

public class InventarioDAO extends ConexioBD implements InterfaceCrud {

    //objetos para realizar las operaciones de la BD
    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    //variables para hacer las operaciones (valores encapsulados)
    private String invId = "";
    private String invType = "";
    private String invName = "";
    private String serial = "";
    private String identificador = "";
    private String modelo = "";
    private String salon = "";

    private boolean operaciones = false;
    private boolean cargo = false;

    public InventarioDAO(InventarioVO invVO) {
        super();//traer para utilizar el método constructor de VehiculoVO
        try {
            //2 métodos genéricos
            conexion = this.obtenerConexion();
            puente = conexion.createStatement();
            invId = invVO.getinvId();
            invType = invVO.getinvType();
            invName = invVO.getinvName();
            serial = invVO.getSerial();
            identificador = invVO.getIdentificador();
            modelo = invVO.getModelo();
            salon = invVO.getSalon();

        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
    }

    @Override
    public boolean agregarRegistro() {
        try {
            puente.executeUpdate("CALL PA_Inv(null,'" + invType + "','" + invName + "','" + serial + "','" + identificador + "','" + modelo + "','" + salon + "',1,'nuevo');");
            operaciones = true;
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return operaciones;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            puente.executeUpdate("update inventory set  id_inv = '" + invId + "',type_inv = '" + invType + "',Id_pro = '"  + "' where name_inv = '" + invName + "';");
            operaciones = true;
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return operaciones;
    }

    public static InventarioVO consultarPorNombre(String Nombre) {
        InventarioVO invVO = null;
        try {
            ConexioBD conexionBD = new ConexioBD();
            Connection conexion = conexionBD.obtenerConexion();
            Statement puente = conexion.createStatement();
            ResultSet mensajero = puente.executeQuery("select * from inventory where name_inv = '" + Nombre + "'");
            while (mensajero.next()) {
                invVO = new InventarioVO(mensajero.getString(1), mensajero.getString(2),mensajero.getString(3),mensajero.getString(4),mensajero.getString(5),mensajero.getString(6),Nombre);
            }
            mensajero.close();
            puente.close();
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return invVO;
    }

    public ArrayList<InventarioVO> listar() {
        ConexioBD conexionBD = new ConexioBD();
        ArrayList<InventarioVO> listaInventario = new ArrayList<>();
        try {
            puente = conexionBD.obtenerConexion().createStatement();
            mensajero = puente.executeQuery("select * from inventory");
            while (mensajero.next()) {
                InventarioVO invVO = new InventarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3),mensajero.getString(4),mensajero.getString(5),mensajero.getString(6),mensajero.getString(7));
                listaInventario.add(invVO);
            }
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return listaInventario;
    }

    public InventarioDAO() {
    }
}
