public class Libro {
    private String nombre;
    private String autor;
    private String isbn;
    private double precio;
    private int cantidad;

    public Libro(String nombre, String autor, String isbn, double precio, int cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
