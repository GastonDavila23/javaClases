import java.util.ArrayList;

public class Gerente extends Persona{

    public Gerente(String nombre, String cedula, String telefono, String correo, String usuario, String contrasenia) {
        super(nombre, cedula, telefono, correo, usuario, contrasenia);
    }
    private void agregarEmpleado() {

    }
    private void borrarEmpleado(){

    }
    private void modificarEmpleado() {

    }
    private void visualizarVentas(){

    }
    private void visualizarPedidos(){

    }
    private void generarPagoEmpleado(String Empleado) {

    }
    private void agregaritemDespensa(String[]Empleado){

    }
    private void eliminaritemDespensa(String[]Empleado) {

    }
    // Método para agregar un ingrediente a la despensa
    public void agregarItemDespensa(Despensa despensa, ArrayList<Ingrediente> ingredientes) {
        despensa.setIngrediente(ingredientes);
    }
}
