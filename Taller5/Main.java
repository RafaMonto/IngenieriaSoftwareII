public class Main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda();
        Producto producto1 = new ProductoFisico("Doritos", 2000, 9, 250.0);
        Producto producto2 = new ProductoDigital("Office", 90000, 20, 5.5);
        Producto producto3 = new ProductoMixto("Doritos Office Pack", 50000, 100, 250.0, 5.5);

        System.out.println("El precio total de "+producto1.getName()+": "+tienda.hacerCalculo(producto1));
        System.out.println("El precio total de "+producto2.getName()+": "+tienda.hacerCalculo(producto2));
        System.out.println("El precio total de "+producto3.getName()+": "+tienda.hacerCalculo(producto3));

        ProductoFisico fisico1 = new ProductoFisico("Papas", 2000, 5, 250.0);
        fisico1.envioCorreo();

        ProductoMixto fisico2 = new ProductoMixto("Papas", 2000, 5, 250.0, 5.5);
        fisico2.envioCorreo();
    }
}
