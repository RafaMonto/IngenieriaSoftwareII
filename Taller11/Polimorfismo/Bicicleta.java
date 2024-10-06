public class Bicicleta implements Transporte{
    @Override
    public void acelerar() {
        System.out.println("Pedalena la bicicleta.");
    }

    @Override
    public void frenar(){
        System.out.println("La bicicleta frena.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Bicicleta Trek Domane SL7");
    }
}
