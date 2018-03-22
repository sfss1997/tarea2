/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.List;
import sun.security.util.Password;

/**
 *
 * @author fabian
 */
public class Autor extends Usuarios{
    
    List<String> librosAutoria;

    public Autor(List<String> librosAutoria, String nombreUnico, String contraseña, String nombreCompleto, String tipoIdentificacion, String identificaion) {
        super(nombreUnico, contraseña, nombreCompleto, tipoIdentificacion, identificaion);
        this.librosAutoria = librosAutoria;
    }

    public Autor() {
       
    }

    public List<String> getLibrosAutoria() {
        return librosAutoria;
    }

    public void setLibrosAutoria(List<String> librosAutoria) {
        this.librosAutoria = librosAutoria;
    }
    
    
}
