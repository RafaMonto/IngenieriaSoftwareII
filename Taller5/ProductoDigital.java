public class ProductoDigital extends Producto {
    public double tamanoArchivo;

    public ProductoDigital(String nombre, double precio, int cantidad, double tamanoArchivo) {
        super(nombre, precio, cantidad);
        this.tamanoArchivo = tamanoArchivo;
    }

    @Override
    public double calcularCostoTotal() {
        return precio * cantidad;
    }
}
