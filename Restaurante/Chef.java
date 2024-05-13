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
public class Chef extends Empleado{
    private double salario; 

    public Chef(double salario, Date fechaVinculacion, Time horaIngreso, Time horaSalida, String nombre, String cedula, String telefono, String correo) {
        super(fechaVinculacion, horaIngreso, horaSalida, nombre, cedula, telefono, correo);
        this.salario = salario;
    }

    public Chef(String nombre){
          super(nombre);
    }

    @Override
    public String toString() {
        return "" +nombre;
    }
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
