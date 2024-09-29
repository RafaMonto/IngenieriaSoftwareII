public class Main {
    public static void main(String[] args) {
        Entrada entrada = new Entrada("VIP", 50000, true);
        ControladorVenta controlador = new ControladorVenta();
        controlador.agregarEntrada(entrada);
        System.out.println("");
        Usuario usuario = new Usuario();
        usuario.comprar("VIP");
    }
}
