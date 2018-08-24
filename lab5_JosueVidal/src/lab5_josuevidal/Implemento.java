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
public class Implemento {
    private String nombre;
    private String descripcion;
    private String funcion;

    public Implemento() {
    }

    public Implemento(String nombre, String descripcion, String funcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.funcion = funcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "Implemento{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", funcion=" + funcion + '}';
    }
    
}
