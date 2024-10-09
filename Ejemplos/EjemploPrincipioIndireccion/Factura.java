public class Factura {
    private String codigo;
    private double total;
    public String getCodigo() {
        return codigo;
    }

    public double getTotal() {
        return total;
    }

    private Cliente cliente;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
    
}
