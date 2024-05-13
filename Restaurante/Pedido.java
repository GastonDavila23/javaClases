/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Matias
 */
public class Pedido {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Mesero> meseros = new ArrayList<>();
    private ArrayList<Alimento> alimentosAdquiridos = new ArrayList<>();
    private Date fechaPedido;
    private Time horaPedido;
    private double precioTotalPedido;
    private boolean estado; 

    public Pedido(Date fechaPedido, Time horaPedido, double precioTotalPedido, boolean estado, ArrayList<Cliente> clientes, ArrayList<Mesero> meseros,ArrayList<Alimento> alimentos) {
        this.fechaPedido = fechaPedido;
        this.horaPedido = horaPedido;
        this.precioTotalPedido = precioTotalPedido;
        this.estado = estado;
        this.clientes=clientes;
        this.meseros=meseros;
        this.alimentosAdquiridos=alimentos;
    }
    public Pedido(){
        
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Mesero> getMeseros() {
        return meseros;
    }

    public void setMeseros(ArrayList<Mesero> meseros) {
        this.meseros = meseros;
    }

    public ArrayList<Alimento> getAlimentosAdquiridos() {
        return alimentosAdquiridos;
    }

    public void setAlimentosAdquiridos(ArrayList<Alimento> alimentosAdquiridos) {
        this.alimentosAdquiridos = alimentosAdquiridos;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Time getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(Time horaPedido) {
        this.horaPedido = horaPedido;
    }

    public double getPrecioTotalPedido() {
        return precioTotalPedido;
    }

    public void setPrecioTotalPedido(double precioTotalPedido) {
        this.precioTotalPedido = precioTotalPedido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void addClientes(Cliente cliente){
        clientes.add(cliente);        
    
    }
    
    public void removeClientes(Cliente cliente){
        clientes.remove(cliente);        
    }
    
    public void addMesero (Mesero mesero){
        meseros.add(mesero);
    }
    public void removeMesero (Mesero mesero){
        meseros.remove(mesero);
    }
    public void addAlimento(Alimento alimento){
        alimentosAdquiridos.add(alimento);
    }

    @Override
    public String toString() {
        return "Pedido{" + "clientes=" + clientes + ", meseros=" + meseros + ", alimentosAdquiridos=" + alimentosAdquiridos + ", fechaPedido=" + fechaPedido + ", horaPedido=" + horaPedido + ", precioTotalPedido=" + precioTotalPedido + '}';
    }
    
    
    
}
