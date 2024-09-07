public class ProcesarOrdenDHL implements IProcesarOrdenDHL{
    @Override
    public void enviarOrdenDHL(Orden orden){
        System.out.println(orden.getOrigen());
        System.out.println("HASTA");
        System.out.println(orden.getDestino());
    }
}
