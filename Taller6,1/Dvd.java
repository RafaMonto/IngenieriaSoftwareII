public class Dvd implements LibreriaDVD{
    public String nombre;
    public String archivo;
    public int stock;

    public Dvd(String nombre, String archivo, int stock){
        this.nombre = nombre;
        this.archivo = archivo;
        this.stock = stock;
    }

    @Override
    public void prestar() {
        System.out.println("El DVD ha sido prestado a un usuario.");
    }

    @Override
    public void devolver() {
        System.out.println("El DVD ha sido devuelto a la biblioteca.");
    }
}
