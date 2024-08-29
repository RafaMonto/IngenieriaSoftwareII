public class ProductoMixto extends Producto implements EnviarCorreoPMixto{
    public double peso;
    public double tamanoArchivo;

    public ProductoMixto(String nombre, double precio, int cantidad, double peso, double tamanoArchivo) {
        super(nombre, precio, cantidad);
        this.peso = peso;
        this.tamanoArchivo = tamanoArchivo;
    }

    @Override
    public double calcularCostoTotal() {
        return precio * cantidad;
    }

    @Override
    public void envioCorreo(){
        System.out.println("Correo enviado correctamente");
    }
}
