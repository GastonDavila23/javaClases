public class Alimento {
    private String nombre;
    private double precio;
    private Receta receta = null;

    public Alimento(String nombre, double precio, Receta receta) {
        this.nombre = nombre;
        this.precio = precio;
        this.receta = receta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }
}
