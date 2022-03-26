package SMMS_modelo;
/**
*
* Clase que implementa la Conexion a la base de datos
* @author:  Ines Topalli
* @version: v0.1 24/03/2022
* @see <a href="https://www.universidadviu.com/"> VIU </a>
*/

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author: Ines Topalli
 */
public class Conexion {
     static Connection conn=null;
     String bd="SMMS";
     String url="";
     String user="admin";
     String pass="12345";
     String driver="com.mysql.jdbc.Driver";        
   
    /**
     * Funci�n que permite conectar a la base de datos 
     */
    public void conector() {
        try {
            conn=DriverManager.getConnection(url,user,pass);
            System.out.println("conexion establecida");
        } 
        catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Consulta la conexi�n a la base de datos
     * @return Devuelve la conexi�n a la base de datos
     */
    
    public Connection getConexion(){
        return Conexion.conn;
    }
      
    /**
     * Aplica la conexi�n a la base de datos
     * @param conexion
     */
    public void setConexion(Connection conexion){
        Conexion.conn=conexion;
    }
    
   /*public ResultSet consultar(String sql) {
        ResultSet resultado;
        try {
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            return null;
        }        return resultado;
    }*/
                                             
}