/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Restaurante;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        
       Menu mn = new Menu(new Gerente("Juan", "cedula", "261123456", "gerente1@gmail.com"), new ArrayList<>());
       mn.addAlimento(new Alimento("Fideos con crema", 2000, new Receta(new Chef("Juan Carlos"),"fideos a la crema", "coccion fideos y tirar crema")));
       mn.addAlimento(new Alimento("Osobuco", 2000, new Receta(new Chef("Rodrigo"),"Osobuco Insta", "cocinar a fuego lento")));
       System.out.println("EJERCICIO 1");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println(mn);
       
       
       Despensa dsp = new Despensa(new Gerente("Roberto", "cedula", "2569484", "rober@gmail.com"), new ArrayList<>());
       dsp.addIngrediente(new Ingrediente(6,"Carne vacuna"));
       dsp.addIngrediente(new Ingrediente(3,"Tomate"));
       
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println("EJERCICIO 2");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println(dsp);
       
       
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println("EJERCICIO 3");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       
       Pedido pedido = new Pedido(new Date(2024,4,24),new Time(13,25,55),0.0, true, new ArrayList<Cliente>(),new ArrayList<Mesero>(),new ArrayList<>());
       pedido.addMesero(new Mesero(45000, new Time(13,45,00), "Gaston"));
       pedido.addClientes(new Cliente("Matias", "cedula"));
       pedido.addAlimento(new Bebida("Coca Cola", 500));
       pedido.addAlimento(new Bebida("Cerveza", 800));
       pedido.setPrecioTotalPedido(1300);
       
        System.out.println(pedido);
    }
    
}
