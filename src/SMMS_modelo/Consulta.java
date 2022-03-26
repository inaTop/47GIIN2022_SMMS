/**
*
* Clase que implementa las consultas a la base de datos
* @author:  Inés Topalli
* @version: v0.1 24/03/2022
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
public class Consulta {
    private  static Statement stmt;

    /**
     * Realiza una consulta a la base de datos
     */
    public Consulta(){
        try {
            Consulta.stmt = Conexion.conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Permite seleccionar el nombre del usuario
     * @param nombre Nombre del usuario
     * @return
     */
    public String select_nom_usuario(String nombre){
        String devuelta=null;
        ResultSet rs;
        try {
            rs=stmt.executeQuery("SELECT nom_usuario FROM USUARIOS WHERE nom_usuario=" + nombre);
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
            return "-1";
        }
        try {
            devuelta=rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return devuelta;
    }

    /**
     *Permite seleccionar el password del usuario
     * @param nombre nombre del usuario del que queremos seleccionar el password
     * @return
     */
    public String select_passwd(String nombre){
        String devuelta=null;
        ResultSet rs;
        try {
            rs=stmt.executeQuery("SELECT clave FROM USUARIOS WHERE nom_usuario=" + nombre);
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
            return "-1";
        }
        try {
            devuelta=rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return devuelta;
    }

    /**
     * Permite seleccionar el tipo de usuario del usuario
     * @param nombre nombre del usuario del que queremos seleccionar el tipo de usuario
     * @return
     */
    public String select_tipo_usuario(String nombre){
        String devuelta=null;
        ResultSet rs;
        try {
            rs=stmt.executeQuery("SELECT tipo_usuario FROM USUARIOS WHERE ID_usuario=" + nombre);
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
            return "-1";
        }
        try {
            devuelta=rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return devuelta;
    }
}
