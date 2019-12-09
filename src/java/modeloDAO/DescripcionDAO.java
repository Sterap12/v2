package modeloDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modeloVO.DescripcionVO;
import modeloVO.DescripcionVO;
import util.ConexioBD;
import util.InterfaceCrud;

public class DescripcionDAO extends ConexioBD implements InterfaceCrud {

    //objetos para realizar las operaciones de la BD
    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    //variables para hacer las operaciones (valores encapsulados)
    private String desId;
    private String desReason;
    private String desDate;

    private boolean operaciones = false;
    private boolean cargo = false;

    public DescripcionDAO(DescripcionVO desVO) {
        super();//traer para utilizar el método constructor de VehiculoVO
        try {
            //2 métodos genéricos
            conexion = this.obtenerConexion();
            puente = conexion.createStatement();
            desId = desVO.getdesId();
            desReason = desVO.getdesReason();
            desDate = desVO.getdesDate();

        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
    }

    @Override
    public boolean agregarRegistro() {
        try {
            puente.executeUpdate("insert into descriptionofcomponents values (default,'" + desReason + "',null,'" + desDate + "');");
            operaciones = true;
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return operaciones;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            puente.executeUpdate("update descriptionofcomponents set Id_Des = '" + desId + "',reason_Des = '" + desReason + "',Id_pro = '"  + "' where date_Des = '" + desDate + "';");
            operaciones = true;
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return operaciones;
    }

    public static DescripcionVO consultarPorFecha(String Fecha) {
        DescripcionVO desVO = null;
        try {
            ConexioBD conexionBD = new ConexioBD();
            Connection conexion = conexionBD.obtenerConexion();
            Statement puente = conexion.createStatement();
            ResultSet mensajero = puente.executeQuery("select * from descriptionofcomponents where date_Des = '" + Fecha + "'");
            while (mensajero.next()) {
                desVO = new DescripcionVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3),Fecha);
            }
            mensajero.close();
            puente.close();
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return desVO;
    }

    public ArrayList<DescripcionVO> listar() {
        ConexioBD conexionBD = new ConexioBD();
        ArrayList<DescripcionVO> listaDescripcion = new ArrayList<>();
        try {
            puente = conexionBD.obtenerConexion().createStatement();
            mensajero = puente.executeQuery("select * from descriptionofcomponents");
            while (mensajero.next()) {
                DescripcionVO desVO = new DescripcionVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3),mensajero.getString(4));
                listaDescripcion.add(desVO);
            }
        } catch (Exception e) {
            System.out.println("¡Error!  " + e.toString());
        }
        return listaDescripcion;
    }

    public DescripcionDAO() {
    }
}
