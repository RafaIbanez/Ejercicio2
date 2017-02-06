/** 
 * Titulo : EJERCICIO2 *
 */
package ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Busqueda por filtro de Fabricantes
 * @version Version : 1.0 31 de Enero de 2017
 * @author Jose Rafael Ibañez Zarzo
 * @see <a> http://teceinval.com </a>
 */
public class FabricantesBusqueda {
/**
 * Busqueda por filtro de Fabricantes
 */ 
 static public ResultSet r;                             //Datos de Fabricantes
 static public Connection conexion = null;
 
 DefaultTableModel ModeloTabla;
// #############################################################################
// ##### METODO BUSCAR POR FILTRO (Nombre, Pais)                           #####
// #############################################################################

    public void Buscar(String valor, String filtro, JTable tablabuscar){
        String [] columnas={"Codigo","Nombre","Pais"};
        String [] registros=new String[3];
        ModeloTabla=new DefaultTableModel(null,columnas);      
        String QRY;
        switch (filtro) {
            case "Nombre":
                QRY= "SELECT COD_FABRICANTE, NOMBRE, PAIS "
                        + "FROM fabricantes WHERE NOMBRE LIKE '%"+valor+"%'";
                break;
            case "Pais":
                QRY= "SELECT COD_FABRICANTE, NOMBRE, PAIS "
                        + "FROM fabricantes WHERE PAIS LIKE '%"+valor+"%'";
                break;
            default:
                QRY= "SELECT COD_FABRICANTE, NOMBRE, PAIS "
                        + "FROM fabricantes WHERE NOMBRE LIKE '%"+valor+"%'";
                break;
        }
    try {
        // Conexion a la base de datos
            String url = "jdbc:mysql://localhost:3306/bases";
            String user = "root";
            String pass = "";
            conexion = DriverManager.getConnection(url,user, pass);
        Statement s = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        r = s.executeQuery(QRY);
        while (r.next()){
            registros[0]=r.getString("COD_FABRICANTE");
            registros[1]=r.getString("NOMBRE");
            registros[2]=r.getString("PAIS");
            ModeloTabla.addRow(registros);
        }
        tablabuscar.setModel(ModeloTabla);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
    }finally{
        if(conexion!=null){
            try {
                conexion.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
}

