import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FabricaPedidos fabrica = new FabricaPedidos();
        Cliente cliente = fabrica.crearCliente("Juan Pérez", "Calle 123");

        List<Producto> productos = new ArrayList<>();
        productos.add(fabrica.crearProducto("Laptop", 2500000, 1));
        productos.add(fabrica.crearProducto("Mouse", 40000, 2));
        productos.add(fabrica.crearProducto("Teclado", 60000, 1));

        Pedido pedido = fabrica.crearPedido(cliente, productos);
        System.out.println("Pedido a nombre de "+pedido.getCliente().getNombre()+" creado correctamente");
    }
}
