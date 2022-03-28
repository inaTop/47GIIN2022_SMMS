/**
*
* Clase que implementa cada Usuario
* @author:  Inés Topalli
* @version: v0.1 24/03/2022
* @see <a href="https://www.universidadviu.com/"> VIU </a>
*/
package SMMS_controlador;

/**
 * Clase Usuarios 
 * @author:  Inés Topalli
 */
public class Usuarios {
    private int idusuario;
    private String nom_usuario;
    private String pass;
    private String email;
    private String empresa;
    
    
    /**
     * Constructor de la clase usuario
     * @param idusuario identificador del usuario
     * @param nom_usuario Nombre del Usuario
     * @param password Password o contraseña del usuario
     * @param email 
     * @param empresa empresa a la que pertenece
     */
    public Usuarios(Integer idusuario,String nom_usuario, String password, String email , String empresa) {
        this.idusuario=idusuario;
        this.nom_usuario = nom_usuario;
        this.pass = password;
        this.email = email;
        this.empresa=empresa;
    }

    public Usuarios(String nom_usuario, String pass, String email, String empresa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        /**
     * Consulta el identificador del Usuario
     * @return Devuelve el nombre del usuario
     */
    public int getID_usuario() {
        return idusuario;
    }

    
    
    /**
     * Consulta el Nombre del Usuario
     * @return Devuelve el nombre del usuario
     */
    public String getNombre_usuario() {
        return nom_usuario;
    }

    /**
     * Consulta el password del usuario
     * @return Devuelve el password del usuario
     */
    public String getPassword() {
        return pass;
    }

    
    /**
     * 
     * @return Devuelve el email del usuario
     */
    public String getEmail() {
        return email;
    }


    /**
     * 
     * @return Devuelve la organización a la que pertenece el  usuario
     */
    public String getEmpresa() {
        return empresa;
    }
    
    
    
        
    /**
     * Modifica el ID del usuario
     * @param idusuario Nombre del usuario
     */
    public void setID_usuario(int idusuario) {
        this.idusuario = idusuario;
    }
    
    /**
     * Modifica el nombre del usuario
     * @param nom_usuario Nombre del usuario
     */
    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    /**
     * Modifica la contraseña o Password del usuario
     * @param pass contraseña o password del usuario
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * Modifica el email del usuario
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
     /**
     * Modifica la organización del usuario
     * @param empresa
     */
    public void setOrg(String empresa) {
        this.empresa = empresa;
    }
    
    
    
    
    
    
    
}
