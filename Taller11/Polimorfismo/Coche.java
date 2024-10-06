public class Coche implements Transporte {
    @Override
    public void acelerar() {
        System.out.println("El coche acelera.");
    }

    @Override
    public void frenar(){
        System.out.println("El coche frena.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Coche Ferrari 488 GTB");
    }
}
