public class ProductoFisico extends Producto implements EnviarCorreoPFisico{
    public double peso;

    public ProductoFisico(String nombre, double precio, int cantidad, double peso) {
        super(nombre, precio, cantidad);
        this.peso = peso;
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
