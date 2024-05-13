/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

/**
 *
 * @author Matias
 */
public class Bebida extends Alimento{
    
    public Bebida(String nombre, double precio) {
        super(nombre, precio);
        
        
    }

    @Override
    public String toString() {
        return "Bebida" +"Produco= "+nombre+ " Precio= "+precio+'}';
    }
    
}
