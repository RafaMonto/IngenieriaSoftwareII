public class ServicioFacturaFisica implements IServicioFacturaFisica{

    @Override
    public Factura crear(Cliente cliente) {
        FacturaFisica fs = new FacturaFisica();
        fs.setCliente(cliente);
        System.out.println("Se ha creadooo");
        return fs;     
    }
}