public class CalculoImpuestoReteIva extends Calculo{
    public int impuesto;

    public CalculoImpuestoReteIva(String producto, int cantidad, double precio, int impuesto){
        super(producto, cantidad, precio);
        this.impuesto = impuesto;
    }

    @Override
    public double CalcularImpuesto() {
        double resul = precio * cantidad;
        return ((resul * (impuesto*0.01)) + resul);
    }
}
