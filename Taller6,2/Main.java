public class Main {
    public static void main(String[] args) {
        PaqueteGrande paquete1 = new PaqueteGrande(30.0, "1.0 x 1.5 x 1.0 mt", "1.5 mt cubicos", "Camion de carga");
        PaquetePequeno paquete2 = new PaquetePequeno(5.0, "30.0 x 15.0 x 15.0 cm", 100000.0);
        PaquetePeligroso paquete3 = new PaquetePeligroso(2.0, "20.0 x 10.0 x 10.0 cm", "Contenido quimico toxico", true);

        paquete1.calcularCostoEnvioGrande();
        System.out.println("");
        System.out.println("");
        paquete2.calcularCostoEnvioPequeno();
        System.out.println("");
        System.out.println("");
        paquete3.verificarContenidoPeligroso();
        paquete3.asegurarPaquetePeligroso();


    }
}
