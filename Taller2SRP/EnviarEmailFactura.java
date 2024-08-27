public class EnviarEmailFactura {
    public void enviarEmailFactura(Factura factura, Cliente cliente) {
        System.out.println("Enviando email al cliente " + cliente.getNombre() + " con la factura: " + factura);
    }
}
