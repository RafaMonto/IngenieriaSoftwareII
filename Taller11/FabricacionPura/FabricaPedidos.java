import java.util.List;

public class FabricaPedidos {

    public Pedido crearPedido(Cliente cliente, List<Producto> productos) {
        System.out.println("Pedido creado correctamente...");
        return new Pedido(cliente, productos);
    }

    public Producto crearProducto(String nombre, double precio, int cantidad) {
        return new Producto(nombre, precio, cantidad);
    }

    public Cliente crearCliente(String nombre, String direccion) {
        return new Cliente(nombre, direccion);
    }
}
