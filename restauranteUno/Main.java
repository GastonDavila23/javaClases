import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date cheft = new Date(2002, 06, 20); //Fecha del ingreso
        Gerente gerente = new Gerente("Franco Albornoz", "41967129", "2616828351", "francoAlbornoz@gmail.com", "Franquito", "123456789");
        Chef chef = new Chef("Lucio Alboronz", "41967128", "2616828352", "lucioAlbornoz@gmail.com", "Lucio", "123456789", cheft, 2000);

        // Crear los ingredientes
        Ingrediente ingrediente1 = new Ingrediente(30, "Fideos");
        Ingrediente ingrediente2 = new Ingrediente(15, "Salsa");
        Ingrediente ingrediente3 = new Ingrediente(300, "Carne");
        Ingrediente ingrediente4 = new Ingrediente(300, "Zanahoria");

        // Crear un array de ingredientes
        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

        Ingrediente[] receta1 = {ingrediente1, ingrediente2};
        Ingrediente[] receta2 = {ingrediente3, ingrediente4};

        ingredientes.add(receta1[0]);
        ingredientes.add(receta2[1]);

        // Crear una despensa y agregar los ingredientes
        Despensa almacen = new Despensa(ingredientes);

        // El gerente agrega los ingredientes a la despensa
        gerente.agregarItemDespensa(almacen, ingredientes);

        almacen.setIngrediente(ingredientes);

        // Crear una receta con los ingredientes
        Receta fideo = new Receta(chef, "Fideos", ingredientes, "Fideos caseros a la olla");
        Receta carne = new Receta(chef, "Carne", ingredientes, "Carne de la olla");

        Alimento alimento1 = new Alimento("Fideos a la olla", 400, fideo);
        Alimento alimento2 = new Alimento("Carne a la olla", 800, carne);

        // Crear un array de alimentos para el menú
        Alimento[] alimentosMenu = {alimento1, alimento2};

        Menu menu = new Menu(alimentosMenu);

        System.out.println("Gerente: " + gerente.getNombre());
        System.out.println("Menú disponible:");
        for (Alimento alimento : menu.getAlimentos()) {
            System.out.println("- " + alimento.getNombre());
        }
        System.out.println(" ");
        System.out.println("Gerente: " + gerente.getNombre());
        System.out.println("Stock en Despensa:");
        for (Ingrediente ingrediente : almacen.getIngrediente()) {
                System.out.println("- " + ingrediente.getDescripcion() + ": " + ingrediente.getCantidadStock() + " kilos");
        }

        Cliente cliente = new Cliente("Ignacio Albornoz", "41967127", "2616828353", "nachoAlbornoz@gmail.com", "nacho", "13245679");
        Mesero mesero = new Mesero("Luciana Falconi", "41967126", "2616828354", "lucianaAlbornoz@gmail.com", "luciana", "123456", cheft, 2000);
        Pedido pedido = new Pedido(cliente, mesero, alimentosMenu, new Date(), new Time(System.currentTimeMillis()), alimento1.getPrecio()+alimento2.getPrecio(), true);

        System.out.println(" ");
        System.out.println("Pedido:");
        System.out.println("Fecha: " + pedido.getFechaPedido());
        System.out.println("Precio Total: $" + pedido.getPrecioTotalPedido());
        System.out.println("Mesero: " + pedido.getMesero().getNombre() + " " + "cedula " +pedido.getMesero().getCedula() + " - Salario: " + pedido.getMesero().getSalario() + " - Hora de ingreso: " + pedido.getHoraPedido());
        System.out.println("Cliente: " + "Cedula: " + pedido.getCliente().getCedula() + " Nombre: " + pedido.getCliente().getNombre());
        System.out.println("Alimentos solicitados:");
        for (Alimento alimento : pedido.getAlimentosAdquiridos()) {
            System.out.println("- " + alimento.getNombre());
        }
    }
}


