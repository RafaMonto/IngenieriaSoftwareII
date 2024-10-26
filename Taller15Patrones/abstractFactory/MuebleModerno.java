package Taller15Patrones.abstractFactory;

public class MuebleModerno implements Mueble{
    @Override
    public void crear(){
        System.out.println("Se ha creado un mueble moderno");
    }
}
