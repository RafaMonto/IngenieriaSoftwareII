import java.util.ArrayList;
import java.util.List;

public class Orden {
    private List<Computadora> computadoras = new ArrayList<>();
    private Fabrica fabrica = new Fabrica();

    public void agregarComputadora(String procesador, String tarjetaGrafica, int ram){
        Computadora computadora = fabrica.creaComputadora(procesador, tarjetaGrafica, ram);
        computadoras.add(computadora);
        System.out.println("Se ha hecho la orden correctamente");
    }
}
