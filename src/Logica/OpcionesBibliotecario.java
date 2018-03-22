/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import dominio.Autor;
import dominio.Libros;
import dominio.Usuario;
import dominio.Usuarios;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.codec.digest.DigestUtils;
import javax.swing.JOptionPane;

/**
 *
 * @author fabian
 */
public class OpcionesBibliotecario {
    Libros libros = new Libros();
    Usuarios usuarios = new Usuarios();
    public static List<Usuarios> usuariosList = new LinkedList<Usuarios>();
    public static List<Libros> librosList = new LinkedList<Libros>();
    Autor autor = new Autor();
    Usuario usuario = new Usuario();
    

    public void eligeOpciones(String opciones) {

        switch (opciones) {
            case "Autores":

                String[] menu1 = {"Agregar", "Modificar", "Eliminar"};
                String eleccion1 = (String) JOptionPane.showInputDialog(null, "Selecciona una opción", "Elegir", JOptionPane.QUESTION_MESSAGE, null, menu1, menu1[0]);
                switch (eleccion1) {
                    case "Agregar":
                        agregarAutor();
                        break;
                    case "Modificar":
                        modificarAutor();
                        break;
                    case "Eliminar":
                        eliminarAutor();
                        break;

                }

                break;
            case "Usuarios":

                String[] menu2 = {"Agregar", "Modificar", "Eliminar"};
                String eleccion2 = (String) JOptionPane.showInputDialog(null, "Selecciona una opción", "Elegir", JOptionPane.QUESTION_MESSAGE, null, menu2, menu2[0]);
                switch (eleccion2) {
                    case "Agregar":
                        agregarUsuario();
                        break;
                    case "Modificar":
                        modificarUsuario();
                        break;
                    case "Eliminar":
                        eliminarUsuario();
                        break;

                }

                break;
            case "Libros" :
                String[] menu3 = {"Agregar","Eliminar"};
                String eleccion3 = (String) JOptionPane.showInputDialog(null, "Selecciona una opción", "Elegir", JOptionPane.QUESTION_MESSAGE, null, menu3, menu3[0]);
                               switch (eleccion3) {
                    case "Agregar":
                        agregarLibro();
                        break;  
                    case "Eliminar":
                        eliminarLibro();
                        break;

                }
                break;
        }

    }

    public void agregarAutor() {
        String nombreUnico = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
        String pass = JOptionPane.showInputDialog("Ingrese una contraseña");
        String contraseñaMD5=DigestUtils.md5Hex(pass);
        String nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre completo");
        String[] opciones = {"Nacional", "Extranjero"};
        String tipoIdentificacion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de identificación", "Elegir", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        String identificaion = JOptionPane.showInputDialog("Ingrese el numero de identificaion");

        autor.setNombreUnico(nombreUnico);
        autor.setContraseña(contraseñaMD5);
        autor.setNombreCompleto(nombreCompleto);
        autor.setTipoIdentificacion(tipoIdentificacion);
        autor.setIdentificacion(identificaion);
        usuariosList.add(autor);
        JOptionPane.showMessageDialog(null, "Usuario agregado con exito");

    }

    public void agregarUsuario() {
        String nombreUnico = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
        String pass = JOptionPane.showInputDialog("Ingrese una contraseña");
        String contraseñaMD5=DigestUtils.md5Hex(pass);
        String nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre completo");
        String[] opciones = {"Nacional", "Extranjero"};
        String tipoIdentificacion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de identificación", "Elegir", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        String identificaion = JOptionPane.showInputDialog("Ingrese el numero de identificaion");

        usuario.setNombreUnico(nombreUnico);
        usuario.setContraseña(contraseñaMD5);
        usuario.setNombreCompleto(nombreCompleto);
        usuario.setTipoIdentificacion(tipoIdentificacion);
        usuario.setIdentificacion(identificaion);
        usuariosList.add(usuario);
        JOptionPane.showMessageDialog(null, "Usuario agregado con exito");

    }
    
    public void modificarAutor() {
        String nombreAModificar = JOptionPane.showInputDialog(null, "Ingrese el nombre de autor a modificar");

        for (int i = 0; i <= usuariosList.size() - 1; i++) {

            if (usuariosList.get(i).getNombreUnico().equals(nombreAModificar)) {

                String nombreUnico = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
                String contraseña = JOptionPane.showInputDialog("Ingrese una contraseña");
                String nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre completo");
                String[] opciones = {"Nacional", "Extranjero"};
                String tipoIdentificacion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de identificación", "Elegir", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                String identificaion = JOptionPane.showInputDialog("Ingrese el numero de identificaion");
                autor.setNombreUnico(nombreUnico);
                autor.setContraseña(contraseña);
                autor.setNombreCompleto(nombreCompleto);
                autor.setTipoIdentificacion(tipoIdentificacion);
                autor.setIdentificacion(identificaion);
                usuariosList.add(i, autor);
                

            }

            JOptionPane.showMessageDialog(null, "Elemento modificado con exito");
        }

        
    
    }
    
    public void modificarUsuario(){
                String nombreAModificar = JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario a modificar");

        for (int i = 0; i <= usuariosList.size() - 1; i++) {

            if (usuariosList.get(i).getNombreUnico().equals(nombreAModificar)) {

                String nombreUnico = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
                String contraseña = JOptionPane.showInputDialog("Ingrese una contraseña");
                String nombreCompleto = JOptionPane.showInputDialog("Ingrese el nombre completo");
                String[] opciones = {"Nacional", "Extranjero"};
                String tipoIdentificacion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de identificación", "Elegir", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                String identificaion = JOptionPane.showInputDialog("Ingrese el numero de identificaion");
                usuario.setNombreUnico(nombreUnico);
                usuario.setContraseña(contraseña);
                usuario.setNombreCompleto(nombreCompleto);
                usuario.setTipoIdentificacion(tipoIdentificacion);
                usuario.setIdentificacion(identificaion);
                usuariosList.add(i, usuario);
                

            }

            JOptionPane.showMessageDialog(null, "Elemento modificado con exito");
        }
    
    }

    public void eliminarAutor() {
        String nombreABorrar = JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario");

        for (int i = 0; i <= usuariosList.size() - 1; i++) {

            if (usuariosList.get(i).getNombreUnico().equals(nombreABorrar)) {
                usuariosList.remove(i);
            }

            
            JOptionPane.showMessageDialog(null, "Elemento borrado con exito");
        }

    }

    public void eliminarUsuario() {
        String nombreABorrar = JOptionPane.showInputDialog(null, "Ingrese el nombre de usuario");

        for (int i = 0; i <= usuariosList.size() - 1; i++) {

            if (usuariosList.get(i).getNombreUnico().equals(nombreABorrar)) {
                usuariosList.remove(i);
            }

            
            JOptionPane.showMessageDialog(null, "Elemento borrado con exito");
        }

    }

    private void agregarLibro() {
        String titulo = JOptionPane.showInputDialog("Ingrese el titulo");
        String nombreAsociado = JOptionPane.showInputDialog("Ingrese un nombre asociado");
        libros.setNombreRelacionado(nombreAsociado);
        libros.setTitulo(titulo);
        librosList.add(libros);
        
        JOptionPane.showMessageDialog(null, "Libro agregado con exito");
        
    }

    private void eliminarLibro() {
        String nombreABorrar = JOptionPane.showInputDialog(null, "Ingrese el tirulo del libro");
        for (int i = 0; i <= librosList.size() - 1; i++) {

            if (librosList.get(i).getTitulo().equals(nombreABorrar)) {
                librosList.remove(i);
            }

            
            JOptionPane.showMessageDialog(null, "Elemento borrado con exito");
        }
    }

}
