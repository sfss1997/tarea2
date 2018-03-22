/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author fabian
 */
public class IniciaSesion {
   
    OpcionesBibliotecario opcionesBibliotecario = new OpcionesBibliotecario();
    
    public boolean verificarBibliotecario(String identificacion,String contraseña){
        if((contraseña.equals("123")) &&(identificacion.equals("123"))){
            
            String [] opciones ={"Autores","Usuarios","libros"};
            String opcion = (String) JOptionPane.showInputDialog(null,"Selecciona una opción", "Elegir",JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]);
            opcionesBibliotecario.eligeOpciones(opcion);

            
           return true;
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Datos Incorrectos");
            return false;
        }
    }
    public boolean verificarUsuario(String identificacion,String contraseña){
        if((contraseña.equals("123")) &&(identificacion.equals("123"))){
           return true;
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Datos Incorrectos");
            return false;
        }
    }
    public boolean verificarAutor(String identificacion,String contraseña){
        if((contraseña.equals("123")) &&(identificacion.equals("123"))){
           return true;
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Datos Incorrectos");
            return false;
        }
    }

}

