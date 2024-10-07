public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private String direccionCliente;

    public Cliente(int idCliente, String nombreCliente, String direccionCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }
}
