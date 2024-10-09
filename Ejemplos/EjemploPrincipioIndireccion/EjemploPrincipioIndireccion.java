public class EjemploPrincipioIndireccion {
    public static void main(String[] args) {
        IServicioFacturaFisica servicioFactura = new ServicioFacturaFisica();
        Cliente cliente = new Cliente("dsfs", "hola", "chao");
        servicioFactura.crear(cliente);  
    }
}
