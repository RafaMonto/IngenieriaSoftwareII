public class Avion implements Transporte {
    @Override
    public void acelerar() {
        System.out.println("El avión despega.");
    }

    @Override
    public void frenar(){
        System.out.println("El avion frena.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Avion Boeing 737");
    }
}