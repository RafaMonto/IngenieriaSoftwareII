package Taller15Patrones.factoryMethod;

public class PaypalMetodoFactory extends MetodoFactory{
    @Override
    public MetodoPago crearMetodo(){
        return new PaypalMetodo();
    }
}
