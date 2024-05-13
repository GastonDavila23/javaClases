import java.util.Date;

public class Mesero extends Empleado{

    private double salario;

    public Mesero(String nombre, String cedula, String telefono, String correo, String usuario, String contrasenia, Date fechaVinculacion, double salario) {
        super(nombre, cedula, telefono, correo, usuario, contrasenia, fechaVinculacion);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private void tomarPedido(String[]pedido){}
    private void cancelarPedido(String pedido){}
    private void modificarPedido(String pedido){}
    private void entrarPedido(String pedido){}
}
