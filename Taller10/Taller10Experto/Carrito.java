import java.util.ArrayList;
import java.util.List;

public class Carrito{

    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("El libro se ha agregado correctamente");
    }

    public double calcularPrecioTotal(){
        double total = 0;
        for(Libro libro : libros){
            total+= libro.getPrecio() * libro.getCantidad();
        }

        return total;
    }
}