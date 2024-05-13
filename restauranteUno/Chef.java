import java.util.Date;

public class Chef extends  Empleado{
    private double salario;

    public Chef(String nombre, String cedula, String telefono, String correo, String usuario, String contrasenia, Date fechaVinculacion, double salario) {
        super(nombre, cedula, telefono, correo, usuario, contrasenia, fechaVinculacion);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
