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
public class Menu {
     private ArrayList<Alimento> alimentos = new ArrayList<>();
     private Gerente miGerente; 

    public Menu(Gerente miGerente, ArrayList<Alimento> alimentos) {
        this.miGerente = miGerente;
        this.alimentos= alimentos;
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public Gerente getMiGerente() {
        return miGerente;
    }

    public void setMiGerente(Gerente miGerente) {
        this.miGerente = miGerente;
    }

    public void addAlimento(Alimento al) {
        alimentos.add(al);
    }
    public void removeAlimento(Alimento al) {
        alimentos.remove(al);
    } 

    @Override
    public String toString() {
        return "Menu{" + "alimentos =" + alimentos + ", miGerente=" + miGerente + '}';
    }
     
     
}
