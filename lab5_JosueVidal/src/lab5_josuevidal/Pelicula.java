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
public class Pelicula {

    private String nombre;
    private int duracion;
    private String clasificacion;
    private String categoria;

    public Pelicula() {
    }

    public Pelicula(String nombre, int duracion, String clasificacion, String categoria) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", duracion=" + duracion + ", clasificacion=" + clasificacion + ", categoria=" + categoria + '}';
    }
    
}
