import java.util.Date;
import java.util.List;

public class Factura {
    private List<Producto> productosComprados;
    private Cliente cliente;
    private double descuento;
    private double total;
    private Date fechaFactura;

    public Factura(Cliente cliente, List<Producto> productosComprados, double descuento) {
        this.cliente = cliente;
        this.productosComprados = productosComprados;
        this.descuento = descuento;
        this.fechaFactura = new Date();
        calcularTotal();
    }

    public double calcularPrecioConDescuento() {
        return total - (total * descuento / 100);
    }

    private void calcularTotal() {
        total = 0;
        for (Producto producto : productosComprados) {
            total += producto.getPrecioProducto();
        }
    }

    public String generarNumeroFactura() {
        return "FACT-" + System.currentTimeMillis();
    }

    public void procesarFactura() {
        System.out.println("Factura procesada para: " + cliente.getNombreCliente());
        System.out.println("Total a pagar con descuento: " + calcularPrecioConDescuento());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductosComprados() {
        return productosComprados;
    }

    public double getDescuento() {
        return descuento;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }
}
