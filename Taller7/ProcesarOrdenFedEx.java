public class ProcesarOrdenFedEx implements IProcesarOrdenFedEx{
    @Override
    public void enviarOrdenFedex(Orden orden){
        System.out.println(orden.getOrigen());
        System.out.println("HASTA");
        System.out.println(orden.getDestino());
    }
}
