/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

/**
 *
 * @author Matias
 */
public class Persona {
    //Attributes
    protected String nombre, cedula, telefono,correo;
    protected String usuario = null;
    protected String contrasenia = null;


    // Builders
    public Persona(String nombre, String cedula, String telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Persona(String nombre) {
        this.nombre=nombre;
    }

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // Gets & Sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    // Methods
    public void RestablecerContrasenia(){

    }

    public void iniciarSesion(String[] str){

    }
}
