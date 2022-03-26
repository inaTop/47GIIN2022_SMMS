/**
*
* Clase que implementa las conexiones
* @author:  Inés Topalli
* @version: v0.1 23/3/2022
* @see <a href="https://www.universidadviu.com/"> VIU </a>
*/
package SMMS_modelo;

import SMMS_controlador.UsuariosC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static SMMS_modelo.Conexion.conn;

/**
 * Clase UsuariosM en Vista Modelo
 * @author: , Inés Topalli
 */
public class UsuariosM extends Conexion {

    private UsuariosC usuario;

    /**
     * Constructor del Usuario en Vista Modelo
     * @param usuario
     */
    public UsuariosM(UsuariosC usuario) {
        this.usuario = usuario;
    }
    
    /**
     * Constructor del Usuario en Vista Modelo
     * @param nombre_usuario
     * @param password
     * @param ap
     * @param tel
     * @param email
     * @param org
     * @param estado
     */
    public UsuariosM(String nombre_usuario, String password, String ap,String tel,String email,String org, String estado) {
        usuario = new UsuariosC(nombre_usuario, password, ap, tel,email,org, estado);
    }

    /**
     * Obtiene el Usuario 
     * @return Devuelve el objeto usuario
     */
    public UsuariosC getUsuario() {
        return usuario;
    }

    /**
     * aplica el objeto Usuario
     * @param usuario Usuario que queremos aplicar
     */
    public void setUsuario(UsuariosC usuario) {
        this.usuario = usuario;
    }
    
    /**
     * Permite añadir un usuario
     * @param usuario Usuario que queremos añadir
     * @return
     */
    public boolean anadeUsuario(UsuariosC usuario) {
        //this.usuario = usuario;
        System.out.println("Añadimos el registro " + usuario.getNombre_usuario());
        try {
            //abreBaseDatos();
            //Aqui todo el codigo para añadir de la base de datos  a través de sql
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO `smms`.`usuarios` (`nombre`, `clave`, `tipo_usuario`) VALUES ('"+ this.usuario.getNombre_usuario()+"', '"+this.usuario.getPassword()+"', '"+this.usuario.getTipo()+"');");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosM.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    /**
     *
     * @param usuario Usuario que queremos modificar
     * @return
     */
    public boolean modificaUsuario(UsuariosC usuario) {
        //this.usuario = usuario;
         System.out.println("Modificamos el registro " + usuario.getNombre_usuario());
        //Aqui todo el codigo para modificar de la base de datos a través de sql
         PreparedStatement ps;
        try {
            ps = conn.prepareStatement(
                    "UPDATE supercomputacion.usuarios SET nombre = ?, clave = ?, tipo= ? WHERE nombre = ? ");
            // set the preparedstatement parameters
            ps.setString(1,usuario.getNombre_usuario());
            ps.setString(2,usuario.getPassword());
            ps.setString(3,usuario.getTipo());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosM.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
    /**
     * Permite eliminar un usuario
     * @param usuario Usuario que queremos eliminar
     * @return
     */
    public boolean eliminaUsuario(UsuarioSC usuario) {
        //this.usuario = usuario;
        System.out.println("Borramos el registro " + usuario.getNombre_usuario());
        //Aqui todo el codigo para borrar de la base de datos  a través de sql
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(
                    "DELETE supercomputacion.usuarios WHERE nombre = ? ");
            // set the preparedstatement parameters
           
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosM.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
   
    /**
     * Permite buscar un usuario
     * @param usuario Usuario que quremos buscar en la base de datos
     * @return
     */
    public boolean buscar(UsuarioSC usuario)
    {
        PreparedStatement ps = null;
        ResultSet rs=null;
        Connection con = getConexion();

            //Buscamos el usuario por nombre
        
        try
        {
            ps=con.prepareStatement("SELECT * FROM usuario WHERE nombre=?");
            ps.setString(1, usuario.getNombre_usuario());
            rs = ps.executeQuery();
            
            if (rs.next())
            {   //Enviamos sus atributos de usuario
                usuario.setNombre_usuario(rs.getString("nombre"));
                usuario.setPassword(rs.getString("password"));
                usuario.setTipo(rs.getString("tipo"));
                return true;
                
            }
            return false;  
            
            //Capturamos la excepción
        } catch (SQLException e)
        {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            }
            catch (SQLException e) {
                System.err.println(e);
            }
        
        }
    }
    
    
    
    
    private void abreBaseDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
