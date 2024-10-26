package Taller15Patrones.abstractFactory;

public class MuebleClasico implements Mueble{
    @Override
    public void crear(){
        System.out.println("Se ha creado un mueble clasico");
    }
}
