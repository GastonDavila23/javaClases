import java.util.ArrayList;

public class Receta {
    private Chef nombreChef;
    private String nombreReceta;
    private Ingrediente[] ingrediente;
    private String descripcionProceso;

    public Receta(Chef nombreChef, String nombreReceta, ArrayList<Ingrediente> ingrediente, String descripcionProceso) {
        this.nombreChef = nombreChef;
        this.nombreReceta = nombreReceta;
        this.ingrediente = ingrediente.toArray(new Ingrediente[0]);
        this.descripcionProceso = descripcionProceso;
    }

    public Chef getNombreChef() {
        return nombreChef;
    }

    public void setNombreChef(Chef nombreChef) {
        this.nombreChef = nombreChef;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public Ingrediente[] getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente[] ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getDescripcionProceso() {
        return descripcionProceso;
    }

    public void setDescripcionProceso(String descripcionProceso) {
        this.descripcionProceso = descripcionProceso;
    }
}
