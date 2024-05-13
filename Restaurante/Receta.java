/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Receta {
    private Chef nombreChef; 
    private String nombreReceta; 
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>(); 
    private String descripcionProceso; 

    public Receta(Chef nombreChef, String nombreReceta, String descripcionProceso) {
        this.nombreChef = nombreChef;
        this.nombreReceta = nombreReceta;
        this.descripcionProceso = descripcionProceso;
    }
    
    

    public Chef getNombreChef() {
        return nombreChef;
    }

    public void setNombreChef(Chef nombreChef) {
        this.nombreChef = nombreChef;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public String getDescripcionProceso() {
        return descripcionProceso;
    }

    public void setDescripcionProceso(String descripcionProceso) {
        this.descripcionProceso = descripcionProceso;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "{" + "nombreChef=" + nombreChef + ", nombreReceta=" + nombreReceta + ", descripcionProceso=" + descripcionProceso + '}';
    }
    
    
}
