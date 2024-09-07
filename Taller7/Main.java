public class Main {
    public static void main(String[] args) {
        IProcesarOrdenFedEx procesarOrdenFedEx = new ProcesarOrdenFedEx();
        IProcesarOrdenUPS procesarOrdenUPS = new ProcesarOrdenUPS();
        IProcesarOrdenDHL procesarOrdenDHL = new ProcesarOrdenDHL();
        SistemaEnvios sistemaEnvios = new SistemaEnvios(procesarOrdenFedEx, procesarOrdenUPS, procesarOrdenDHL);
        Orden orden = new Orden(/*null, */"MANIZALES", "BOGOTA");
        sistemaEnvios.enviarOrdenFedex(orden);
        System.out.println("");
        System.out.println("");
        sistemaEnvios.enviarOrdenUPS(orden);
        System.out.println("");
        System.out.println("");
        sistemaEnvios.enviarOrdenDHL(orden);
    }
}
