import java.util.ArrayList;
import java.util.List;

public class ControladorVenta {
    private List<Entrada> entradas = new ArrayList<>();

    public void agregarEntrada(Entrada entrada){
        entradas.add(entrada);
        System.out.println("Entrada agregada correctamente");
    }

    public void comprarEntrada(String tipoEntrada){
        Entrada entrada = encontrarEntrada(tipoEntrada);
        if(entrada.isDisponibilidad()){
            entrada.setDisponibilidad(false);
            System.out.println("Entrada comprada");
        } else {
            System.out.println("Entrada no disponible.");
        }
    }

    private Entrada encontrarEntrada(String tipoEntrada){
        for (Entrada entrada : entradas){
            System.out.println(entrada.getTipo());
            if(entrada.getTipo().equals(tipoEntrada)){
                return entrada;
            }
        }
        return new Entrada(null, 0, false);
    }
}
