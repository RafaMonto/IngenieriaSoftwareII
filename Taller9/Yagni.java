import java.util.ArrayList;
import java.util.List;

public class Libro {
    String titulo;
    String autor;
    int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

}

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
}

//Se refectorizo el codigo, quitando los atributos y las funcionalidades innecesarias

