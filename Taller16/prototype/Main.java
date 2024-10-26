package Taller16.prototype;

public class Main {
    public static void main(String[] args) {
        Producto prod1 = new Producto("Doritos", 3000, "Mecato");
        Producto prod2 = prod1.clone();
        prod2.setNombre("Papas");

        System.out.println("Nombre: " + prod1.getNombre());
        System.out.println("Nombre: " + prod2.getNombre());

    }
}
