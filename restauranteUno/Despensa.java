import java.util.ArrayList;

public class Despensa {
    private ArrayList<Ingrediente> ingrediente;

    public Despensa(ArrayList<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public ArrayList<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(ArrayList<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }
}
