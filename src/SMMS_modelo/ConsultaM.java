/**
*
* Clase que implementa las consultas a la base de datos
* @author:  Inés Topalli
* @version: v0.1 24/03/202
* @see <a href="https://www.universidadviu.com/"> VIU </a>
*/
package SMMS_modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Clase Consulta
 * @author: Inés Topalli
 */
public class ConsultaM {
    private  static Statement stmt;

    /**
     * Realiza una consulta a la base de datos
     */
    public ConsultaM(){
        try {
            ConsultaM.stmt = Conexion.conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Permite seleccionar el nombre del usuario
     * @param nom Nombre del usuario
     * @return
     */
    public String select_nom_usuario(String nom){
        String devuelta=null;
        ResultSet rs;
        try {
            rs=stmt.executeQuery("SELECT ID_usuario FROM USUARIOS WHERE ID_usuario=" + nom);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaM.class.getName()).log(Level.SEVERE, null, ex);
            return "-1";
        }
        try {
            devuelta=rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaM.class.getName()).log(Level.SEVERE, null, ex);
        }
        return devuelta;
    }

    /**
     *Permite seleccionar el password del usuario
     * @param nom nombre del usuario del que queremos seleccionar el password
     * @return clave ( pass)
     */
    public String select_pass(String nom){
        String devuelta=null;
        ResultSet rs;
        try {
            rs=stmt.executeQuery("SELECT clave FROM USUARIOS WHERE ID_usuario=" + nom);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaM.class.getName()).log(Level.SEVERE, null, ex);
            return "-1";
        }
        try {
            devuelta=rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaM.class.getName()).log(Level.SEVERE, null, ex);
        }
        return devuelta;
    }

    /**
     * Permite seleccionar el estado de usuario del usuario
     * @param nom nombre del usuario del que queremos seleccionar el tipo de usuario
     * @return
     */
    public String select_estado_usuario(String nom){
        String devuelta=null;
        ResultSet rs;
        try {
            rs=stmt.executeQuery("SELECT estado FROM USUARIOS WHERE ID_usuario=" + nom);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaM.class.getName()).log(Level.SEVERE, null, ex);
            return "-1";
        }
        try {
            devuelta=rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaM.class.getName()).log(Level.SEVERE, null, ex);
        }
        return devuelta;
    }
}
