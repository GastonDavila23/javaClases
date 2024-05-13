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
public class Despensa {
    private Gerente gerente; 
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>(); 

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Despensa(Gerente gerente, ArrayList<Ingrediente> ing) {
        this.gerente = gerente;
        this.ingredientes = ing;
    }

    @Override
    public String toString() {
        return "Despensa{" + "gerente=" + gerente + ", ingredientes=" + ingredientes + '}';
    }
    
    
    public void addIngrediente (Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }
    
    
    public void removeIngrediente (Ingrediente ingrediente){
        ingredientes.remove(ingrediente);
    }
    
    
}
