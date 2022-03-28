/**
*
* Clase que implementa las conexiones
* @author:  Inés Topalli
* @version: v0.1 23/3/2022
* @see <a href="https://www.universidadviu.com/"> VIU </a>
*/
package SMMS_modelo;

import SMMS_controlador.Usuarios;
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

    private Usuarios usuario;

    /**
     * Constructor del Usuario en Vista Modelo
     * @param usuario
     */
    public UsuariosM(Usuarios usuario) {
        this.usuario = usuario;
    }
    
    /**
     * Constructor del Usuario en Vista Modelo
     * @param nom_usuario
     * @param pass
     * @param email
     * @param empresa
 
     */
    public UsuariosM(String nom_usuario, String pass,String email,String empresa) {
        usuario = new Usuarios(nom_usuario, pass,email,empresa);
    }

    /**
     * Obtiene el Usuario 
     * @return Devuelve el objeto usuario
     */
    public Usuarios getUsuario() {
        return usuario;
    }

    /**
     * aplica el objeto Usuario
     * @param usuario Usuario que queremos aplicar
     */
    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    
    /**
     * Permite añadir un usuario
     * @param usuario Usuario que queremos añadir
     * @return
     */
    public boolean anadeUsuario(Usuarios usuario) {
        //this.usuario = usuario;
        System.out.println("Añadimos el registro " + usuario.getNombre_usuario());
        try {
            //abreBaseDatos();
            //Aqui todo el codigo para añadir de la base de datos  a través de sql
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO `smms`.`usuarios` (`id`,`nombre`, `pass`, `email`, `empresa`) VALUES ('"+ this.usuario.getID_usuario()+"','"+ this.usuario.getNombre_usuario()+"', '"+this.usuario.getPassword()+"',' "+this.usuario.getEmail()+"','"+this.usuario.getEmpresa()+"');");
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
    public boolean modificaUsuario(Usuarios usuario) {
        //this.usuario = usuario;
         System.out.println("Modificamos el registro " + usuario.getNombre_usuario());
        //Aqui todo el codigo para modificar de la base de datos a través de sql
         PreparedStatement ps;
        try {
            ps = conn.prepareStatement(
                    "UPDATE mps.usuarios SET nombre = ?, clave = ?, email = ?, empresa = ? WHERE nombre = ? ");
            // set the preparedstatement parameters
            ps.setString(1,usuario.getNombre_usuario());
            ps.setString(2,usuario.getPassword());
            ps.setString(3,usuario.getEmail());
            ps.setString(4,usuario.getEmpresa());
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
    public boolean eliminaUsuario(Usuarios usuario) {
        //this.usuario = usuario;
        System.out.println("Borramos el registro " + usuario.getNombre_usuario());
        //Aqui todo el codigo para borrar de la base de datos  a través de sql
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(
                    "DELETE smms.usuarios WHERE nombre = ? ");
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
    public boolean buscar(Usuarios usuario)
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
                usuario.setNom_usuario(rs.getString("nombre"));
                usuario.setPass(rs.getString("password"));
                usuario.setEmail(rs.getString("email"));
                usuario.setOrg(rs.getString("empresa"));
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
