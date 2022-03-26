/**
*
* Clase que implementa el control de Autenticación
* @author: Inés Topalli
* @version: v0.1 24/03/2022
* @see <a href="https://www.universidadviu.com/"> VIU </a>
*/

package SMMS_controlador;



import SMMS_modelo.ConsultaUsuario;

/**
 * Clase controlAutenticacion 
 * @author:  Inés Topalli
 */
public class LoginC {
    private final String nombre;
    private final String clave;
    
    /**
    * Constructor de la clase LoginC
    * @param nombre Nombre del usuario
    * @param clave Password del Usuario
    */
    public LoginC(String nombre, String clave){
        this.nombre=nombre;
        this.clave=clave;
    }
    
    /**
    * Función autenticar
    * @return Devuelve el resultado de la consulta sobre el nombre del usuario. Permite saber si el usuario es válido 
    */
    public String autenticar(){
        
        ConsultaUsuario consulta=new ConsultaUsuario();
        return consulta.select_nom_usuario(nombre);
    }
}


