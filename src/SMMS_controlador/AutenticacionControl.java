/**
*
* Clase que implementa el control de Autenticación
* @author: ç Inés Topalli
* @version: v0.1 24/03/2022
* @see <a href="https://www.universidadviu.com/"> VIU </a>
*/
package SMMS_controlador;

import SMMS_modelo.ConsultaM;

/**
 * Clase controlAutenticacion 
 * @author:Inés Topalli
 */
public class AutenticacionControl {
    private final String nom;
    private final String pass;
    
    /**
    * Constructor de la clase controlAutenticación
    * @param nom Nombre del usuario
    * @param pass Password del Usuario
    */
    public AutenticacionControl(String nom, String pass){
        this.nom=nom;
        this.pass=pass;
    }
    
    /**
    * Función autenticar
    * @return Devuelve el resultado de la consulta sobre el nombre del usuario. Permite saber si el usuario es válido 
    */
    public String autenticar(){
        
        ConsultaM consulta=new ConsultaM();
        return consulta.select_nom_usuario(nom);
    }
}
