public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        libro.prestar();
        libro.devolver();
        libro.solicitarNuevaVersion();
        libro.renovarPortada();
        libro.mantenimientoHojas();


        Dvd dvd = new Dvd("El Padrino", "Archivo Padrino.mp4", 10);
        dvd.prestar();
        dvd.devolver();


        Cartilla cartilla = new Cartilla("Manual de usuario", 50);
        cartilla.prestar();
        cartilla.devolver();
        cartilla.solicitarNuevaVersion();

        System.out.println("");
        System.out.println("");
        System.out.println("Es una fat interface debido a que tiene un monton de metodos que auqnue esten asociados a varias clases lo ideal seria que se creara una interfaz con una nica funcion o especialidad.");
    }
}

