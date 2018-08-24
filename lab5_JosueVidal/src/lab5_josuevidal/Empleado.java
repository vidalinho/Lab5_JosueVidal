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
public class Empleado {
   private String nombre;
   private int nacimiento;
   private String usuario;
   private String contra;
   private String correo;
   private String puesto;

    public Empleado() {
    }

    public Empleado(String nombre, int nacimiento, String usuario, String contra, String correo, String puesto) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.usuario = usuario;
        this.contra = contra;
        this.correo = correo;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + ", usuario=" + usuario + ", contra=" + contra + ", correo=" + correo + ", puesto=" + puesto + '}';
    }
   
}
