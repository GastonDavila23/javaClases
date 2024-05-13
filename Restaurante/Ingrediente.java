/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

/**
 *
 * @author Matias
 */
public class Ingrediente {
    private int cantidadStock;
    private String descripcion; 

    public Ingrediente(int cantidadStock, String descripcion) {
        this.cantidadStock = cantidadStock;
        this.descripcion = descripcion;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "" + "cantidadStock=" + cantidadStock + ", descripcion=" + descripcion + '}';
    }
    
    
}
