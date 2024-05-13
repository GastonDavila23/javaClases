/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

/**
 *
 * @author Matias
 */
public class Cliente extends Persona{
    
    public void registrarse (String [] regis){
        
    }
    
    public void reservarMesa (){
        
    }
    
    public void cancelarReservacion(){
        
    }

    public Cliente(String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo);
    }

    public Cliente(String nombre, String cedula) {
        super(nombre, cedula);
    }

    @Override
    public String toString() {
        return "Cliente:"+"Nombre=" + nombre+" Cedula= "+cedula+'}';
    }
    
    
}
