public class RepositorioProducto {
    public void guardarEnBaseDeDatos(Producto producto) {
        System.out.println("Producto " + producto.getNombre() + " guardado correctamente en la base de datos.");
    }
}