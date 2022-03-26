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
 * Clase ConsultaUsuario
 * @author: Inés Topalli
 */
public class ConsultaUsuario {
    private  static Statement stmt;

    /**
     * Realiza una consulta a la base de datos
     */
    public ConsultaUsuario(){
        try {
            ConsultaUsuario.stmt = Conexion.conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return "-1";
        }
        try {
            devuelta=rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return devuelta;
    }

    /**
     *Permite seleccionar el password del usuario
     * @param nombre nombre del usuario del que queremos seleccionar el password
     * @return
     */
    public String select_pass(String nombre){
        String devuelta=null;
        ResultSet rs;
        try {
            rs=stmt.executeQuery("SELECT clave FROM USUARIOS WHERE nom_usuario=" + nombre);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return "-1";
        }
        try {
            devuelta=rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return devuelta;
    }

    /**
     * Permite seleccionar el tipo de usuario del usuario
     * @param nombre nombre del usuario del que queremos seleccionar el tipo de usuario
     * @return
     */
    public String select_ap1_usuario(String nombre){
        String devuelta=null;
        ResultSet rs;
        try {
            rs=stmt.executeQuery("SELECT apellido1 FROM USUARIOS WHERE nom_usuario=" + nombre);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return "-1";
        }
        try {
            devuelta=rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return devuelta;
    }
    
    public String select_ap2_usuario(String nombre){
        String devuelta=null;
        ResultSet rs;
        try {
            rs=stmt.executeQuery("SELECT apellido2 FROM USUARIOS WHERE nom_usuario=" + nombre);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return "-1";
        }
        try {
            devuelta=rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return devuelta;
    }
    public String select_tel_usuario(String nombre){
        String devuelta=null;
        ResultSet rs;
        try {
            rs=stmt.executeQuery("SELECT telefono FROM USUARIOS WHERE nom_usuario=" + nombre);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return "-1";
        }
        try {
            devuelta=rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return devuelta;
    }
    public String select_estado_usuario(String nombre){
        String devuelta=null;
        ResultSet rs;
        try {
            rs=stmt.executeQuery("SELECT estado FROM USUARIOS WHERE nom_usuario=" + nombre);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return "-1";
        }
        try {
            devuelta=rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return devuelta;
    }
}
