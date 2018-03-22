/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author fabian
 */
public class Libros {
    private  String titulo;
    private String nombreRelacionado;

    public Libros() {
    }

    public Libros(String titulo, String nombreRelacionado) {
        this.titulo = titulo;
        this.nombreRelacionado = nombreRelacionado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreRelacionado() {
        return nombreRelacionado;
    }

    public void setNombreRelacionado(String nombreRelacionado) {
        this.nombreRelacionado = nombreRelacionado;
    }
    
    
    
}
