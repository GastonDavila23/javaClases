import java.sql.Time;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private Mesero mesero;
    private Alimento[] alimentosAdquiridos;
    private Date fechaPedido;
    private Time horaPedido;
    private double precioTotalPedido;
    private boolean estado;


    public Pedido(Cliente cliente, Mesero mesero, Alimento[] alimentosAdquiridos, Date fechaPedido, Time horaPedido, double precioTotalPedido, boolean estado) {
        this.cliente = cliente;
        this.mesero = mesero;
        this.alimentosAdquiridos = alimentosAdquiridos;
        this.fechaPedido = fechaPedido;
        this.horaPedido = horaPedido;
        this.precioTotalPedido = precioTotalPedido;
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public Alimento[] getAlimentosAdquiridos() {
        return alimentosAdquiridos;
    }

    public void setAlimentosAdquiridos(Alimento[] alimentosAdquiridos) {
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
}
