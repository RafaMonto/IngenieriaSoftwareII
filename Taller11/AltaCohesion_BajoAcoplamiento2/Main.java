import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto(1, "Padmouse Overwatch", 40000);
        Producto producto2 = new Producto(2, "Lampara LED Sleep", 60000);

        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        Cliente cliente = new Cliente(1, "Estiven Osorio", "Cra 30 # ...");

        Factura factura = new Factura(cliente, productos, 10.0);

        factura.procesarFactura();
    }
}

