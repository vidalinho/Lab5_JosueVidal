/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josuevidal;

/**
 *
 * @author josue
 */
public class Dulce {
    private String nombre;
    private String sabor;
    private String categoria;

    public Dulce() {
    }

    public Dulce(String nombre, String sabor, String categoria) {
        this.nombre = nombre;
        this.sabor = sabor;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Dulce{" + "nombre=" + nombre + ", sabor=" + sabor + ", categoria=" + categoria + '}';
    }
    
}
