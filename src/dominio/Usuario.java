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
public class Usuario extends Usuarios {
    List<String> librosPrestamo;

    public Usuario(List<String> librosPrestamo, String nombreUnico, String contraseña, String nombreCompleto, String tipoIdentificacion, String identificaion) {
        super(nombreUnico, contraseña, nombreCompleto, tipoIdentificacion, identificaion);
        this.librosPrestamo = librosPrestamo;
    }

    public Usuario() {
        
    }

    public List<String> getLibrosPrestamo() {
        return librosPrestamo;
    }

    public void setLibrosPrestamo(List<String> librosPrestamo) {
        this.librosPrestamo = librosPrestamo;
    }
    
}
