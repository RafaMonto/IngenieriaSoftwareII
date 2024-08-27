

public class CalculoImpuestoIva extends Calculo{

    public CalculoImpuestoIva(String producto, int cantidad, double precio){
        super(producto, cantidad, precio);
    }

    @Override
    public double CalcularImpuesto() {
        double iva = 0.19;
        double resul = precio * cantidad;
        return (resul * iva) + resul;
    }
}
