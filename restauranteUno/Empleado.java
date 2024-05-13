import java.sql.Time;
import java.util.Date;

public class Empleado extends Persona {
    private Date fechaVinculacion;
    private Time horaIngreso;
    private Time horaSalida;

    private void registrarEntrada(Time entrada){

    }
    private void registrarSalida(Time salida){

    }

    public Empleado(String nombre, String cedula, String telefono, String correo, String usuario, String contrasenia, Date fechaVinculacion) {
        super(nombre, cedula, telefono, correo, usuario, contrasenia);
        this.fechaVinculacion = fechaVinculacion;
    }

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
}
