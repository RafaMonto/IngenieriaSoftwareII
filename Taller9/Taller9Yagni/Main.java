public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Boulevard", "Mercedes Ron", 2020);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro);
    }
}
