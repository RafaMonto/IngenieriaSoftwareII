public class ProcesarOrdenUPS implements IProcesarOrdenUPS{
    @Override
    public void enviarOrdenesUPS(Orden orden){
        System.out.println(orden.getOrigen());
        System.out.println("HASTA");
        System.out.println(orden.getDestino());
    }
}
