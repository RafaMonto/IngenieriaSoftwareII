package Taller15Patrones.abstractFactory;

public class MuebleFactory implements IMueble{
    @Override
    public Mueble crearClasico(){
        return new MuebleClasico();
    }

    @Override
    public Mueble crearModerno(){
        return new MuebleModerno();
    }
}