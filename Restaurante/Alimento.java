/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

/**
 *
 * @author Matias
 */
public class Alimento {
    protected String nombre; 
    protected double precio; 
    protected Receta receta; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Alimento(String nombre, double precio, Receta receta) {
        this.nombre = nombre;
        this.precio = precio;
        this.receta = receta;
    }

    public Alimento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", precio=" + precio + ", receta=" + receta + '}';
    }
    
    
}
