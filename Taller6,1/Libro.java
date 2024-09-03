public class Libro implements LibreriaLibro{
    public String titulo;
    public String autor;
    public int anoLanzamiento;

    public Libro(String titulo, String autor, int anoLanzamiento){
        this.titulo = titulo;
        this.autor = autor;
        this.anoLanzamiento = anoLanzamiento;
    }

    @Override
    public void prestar() {
        System.out.println("El libro '" + titulo + "' ha sido prestado a un usuario.");
    }

    @Override
    public void devolver() {
        System.out.println("El libro '" + titulo + "' ha sido devuelto a la biblioteca.");
    }

    @Override
    public void solicitarNuevaVersion() {
        System.out.println("Se ha solicitado una nueva versión del libro '" + titulo + "'.");
    }

    @Override
    public void renovarPortada() {
        System.out.println("La portada del libro '" + titulo + "' ha sido renovada.");
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("Se está realizando el mantenimiento de las hojas del libro '" + titulo + "'.");
    }

}
