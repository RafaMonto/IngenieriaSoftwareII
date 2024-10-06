import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Date fecha;
    private Cliente cliente;
    private List<Producto> productos;
    private static int idCounter = 1;

    public Pedido(Cliente cliente, List<Producto> productos) {
        this.id = idCounter++;
        this.fecha = new Date();
        this.cliente = cliente;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
