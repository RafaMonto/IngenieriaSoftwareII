public class Fabrica {
    public Computadora creaComputadora(String procesador, String tarjetaGrafica, int ram){
        return new Computadora(procesador, tarjetaGrafica, ram);
    }
}
