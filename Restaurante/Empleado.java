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
public class Empleado extends Persona{

    // Attributes
    protected Date fechaVinculacion;
    protected Time horaIngreso; 
    protected Time horaSalida;


    // Builders
    public Empleado(Date fechaVinculacion, Time horaIngreso, Time horaSalida, String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo);
        this.fechaVinculacion = fechaVinculacion;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
    }

    public Empleado(String nombre) {
        super(nombre);
    }

    public Empleado(Time horaIngreso, String nombre) {
        super(nombre);
        this.horaIngreso = horaIngreso;
    }

    // Gets & Sets
    public Date getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    public Time getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Time horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }


    // Methods
    public void registraEntrada(Time tmp ){
        
    }
    public void registraSalida(Time tmp ){
        
    }
}
