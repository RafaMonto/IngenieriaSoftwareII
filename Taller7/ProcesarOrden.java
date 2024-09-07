public class ProcesarOrden implements IProcesarOrdenes{
    @Override
    public void enviarOrden(Orden orden){
        System.out.println(orden.getOrigen());
        System.out.println("HASTA");
        System.out.println(orden.getDestino());
    }
    
}
