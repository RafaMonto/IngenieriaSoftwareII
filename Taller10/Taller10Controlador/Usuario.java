public class Usuario {
    private ControladorVenta controlador = new ControladorVenta();
    public void comprar(String tipoEntada){
        controlador.comprarEntrada(tipoEntada);
    }
}
