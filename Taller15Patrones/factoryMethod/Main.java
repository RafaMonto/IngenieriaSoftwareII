package Taller15Patrones.factoryMethod;

public class Main {
    public static void main(String[] args) {
        MetodoFactory factory = new PaypalMetodoFactory();
        MetodoPago metodo = factory.crearMetodo();
        metodo.procesarPago(200000);
    }
}
