package modeloDAO;

import modeloVO.RolVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import util.ConexioBD;

public class RolDAO {

    public static RolVO consultarRol(String usuid) {
        RolVO rolvo = null;
        try {
            ConexioBD conexionbd = new ConexioBD();
            Connection conexion = conexionbd.obtenerConexion();
            Statement puente = conexion.createStatement();

            ResultSet mensajero = puente.executeQuery("select Nickname_Use, idr from UserS where Nickname_Use = '" + usuid + "' ;");
            while (mensajero.next()) {
                rolvo = new RolVO(mensajero.getString(2), mensajero.getString(1));

            }
            mensajero.close();
            puente.close();

        } catch (Exception e) {
            System.out.println("¡ERROR!" + e.toString());
        }
        return rolvo;
    }
}
