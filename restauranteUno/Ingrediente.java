public class Ingrediente {
    private int cantidadStock;
    private String descripcion;

    public Ingrediente(int cantidadStock, String descripcion) {
        this.cantidadStock = cantidadStock;
        this.descripcion = descripcion;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
