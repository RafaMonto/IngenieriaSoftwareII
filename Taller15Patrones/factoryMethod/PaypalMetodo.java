package Taller15Patrones.factoryMethod;

public class PaypalMetodo implements MetodoPago{
    @Override
    public void procesarPago(double Cantidad){
        System.out.println("Pago con Paypal exitoso");
    }   
}
