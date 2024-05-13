/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Matias
 */
public class Mesero extends Empleado{

    // Attributes
    private double salario;

    // Builders
    public Mesero(double salario, Date fechaVinculacion, Time horaIngreso, Time horaSalida, String nombre, String cedula, String telefono, String correo) {
        super(fechaVinculacion, horaIngreso, horaSalida, nombre, cedula, telefono, correo);
        this.salario = salario;
    }

    public Mesero(double salario, Time horaIngreso, String nombre) {
        super(horaIngreso, nombre);
        this.salario = salario;
    }

    // Gets & Sets
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Methods
    public void tomarPedido (String[] ped){
        
    }
    
    public void cancelarPedido (String cnl){
        
    }
    
    public void modificarPedido(String mod){
        
    }
    
    public void entregarPedido(String entr){
        
    }

    @Override
    public String toString() {
        return "Mesero{" + "salario=" + salario + " Nombre " +nombre+ " Hora Ingreso "+horaIngreso+'}';
    }


    
    
    
    
}
