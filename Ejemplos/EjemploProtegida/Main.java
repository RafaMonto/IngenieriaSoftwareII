public class Main {
    public static void main(String[] args) {
        ICalcularImpuesto calcular = new CalcularImpuestoColombia();
        ServicioImpuestos servicioImpuestos = new ServicioImpuestos(calcular);
        servicioImpuestos.calcular();
    }
}
