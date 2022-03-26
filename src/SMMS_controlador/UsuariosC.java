/**
*
* Clase que implementa cada Usuario
* @author:  Inés Topalli
* @version: v0.1 24/03/2022
* @see <a href="https://www.universidadviu.com/"> VIU </a>
*/
package SMMS_controlador;

/**
 * Clase UsuariosC 
 * @author:  Inés Topalli
 */
public class UsuariosC {
    private String nom_usuario;
    private String pass;
    private String ap;
    private String email;
    private final String tel;
    private String estado;
    private String org;
    
    
    /**
     * Constructor de la clase usuario
     * @param nom_usuario Nombre del Usuario
     * @param password Password o contraseña del usuario
     * @param ap appelidos
     * @param tel telefono
     * @param email 
     * @param estado si el usuario está activo o de baja en el sistema
     * @param org organización a la que pertenece
     */
    public UsuariosC(String nom_usuario, String password, String ap, String tel, String email, String estado , String org) {
        this.nom_usuario = nom_usuario;
        this.pass = password;
        this.ap = ap;
        this.tel = tel;
        this.email = email;
        this.org=org;
        this.estado=estado;
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
     * @return Devuelve los apellidos del usuario
     */
    
    
    public String getApellidos() {
        return ap;
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
     * @return Devuelve el telefono del usuario
     */
    public String getTel() {
        return tel;
    }
    
    /**
     * 
     * @return Devuelve el estado del usuario si está activo o no en el sistema
     */
    public String getStatus() {
        return estado;
    }
    
    /**
     * 
     * @return Devuelve la organización a la que pertenece el  usuario
     */
    public String getOrg() {
        return org;
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
     * Modifica los apellidos del usuario
     * @param ap
     */
    public void setApellidos(String ap) {
        this.ap = ap;
    }
    
    /**
     * Modifica el email del usuario
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
