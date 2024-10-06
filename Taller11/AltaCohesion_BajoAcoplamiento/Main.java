public class Main{
    public static void main(String[] args) {

        Producto producto1 = new Producto("Laptop", 2500000, "Laptop de alta gama");
        Producto producto2 = new Producto("Smartphone", 1000000, "Smartphone con gran cámara");

        RepositorioProducto almacenamiento = new RepositorioProducto();
        almacenamiento.guardarEnBaseDeDatos(producto1);
        almacenamiento.guardarEnBaseDeDatos(producto2);

        Carrito carrito = new Carrito();
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);

        double total = carrito.calcularPrecioTotal();
        System.out.println("El precio total del pedido es: $" + total);
    }
}
