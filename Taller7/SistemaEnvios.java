public class SistemaEnvios {
    private IProcesarOrdenFedEx procesarOrdenFedEx;
    private IProcesarOrdenUPS procesarOrdenUPS;
    private IProcesarOrdenDHL procesarOrdenDHL;

    public SistemaEnvios(IProcesarOrdenFedEx procesarOrdenFedEx, IProcesarOrdenUPS procesarOrdenUPS, IProcesarOrdenDHL procesarOrdenDHL){
        this.procesarOrdenFedEx = procesarOrdenFedEx;
        this.procesarOrdenUPS = procesarOrdenUPS;
        this.procesarOrdenDHL = procesarOrdenDHL;
    }

    public void enviarOrdenFedex(Orden orden){
        procesarOrdenFedEx.enviarOrdenFedex(orden);
    }

    public void enviarOrdenUPS(Orden orden){
        procesarOrdenUPS.enviarOrdenesUPS(orden);
    }

    public void enviarOrdenDHL(Orden orden){
        procesarOrdenDHL.enviarOrdenDHL(orden);
    }
}
