public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        Libro libro = new Libro("Lady masacre", "Mario Mendoza", null, 20000, 5);        
        carrito.agregarLibro(libro);
        double precioTotal = carrito.calcularPrecioTotal();
        System.out.println("El precio total de la compra es de: "+precioTotal);
    }
}
