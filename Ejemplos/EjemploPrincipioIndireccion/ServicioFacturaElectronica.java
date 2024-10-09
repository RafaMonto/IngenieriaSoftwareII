public class ServicioFacturaElectronica implements IServicioFacturaElectronica {

    @Override
    public Factura crear(Cliente cliente) {
        FacturaElectronica fe = new FacturaElectronica();
        fe.setCliente(cliente);
        return fe;
    }
}
