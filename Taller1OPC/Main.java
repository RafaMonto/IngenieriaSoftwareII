public class Main {
    public static void main(String[] args) {

        EnvioEstandar envioEstandar = new EnvioEstandar();
        EnvioExpress envioExpress = new EnvioExpress();

        double peso = 30.0;
        double distancia = 220.0;

        System.out.println("Costo de Envío Estándar para peso: "+peso+"kg y distancia: "+distancia+"km: " + envioEstandar.calcularCosto(peso, distancia));
        System.out.println("Costo de Envío Express para peso: "+peso+"kg y distancia: "+distancia+"km: " + envioExpress.calcularCosto(peso, distancia));

        System.out.println("");
        System.out.println("");
        System.out.print("¿Qué sucede si queremos agregar un nuevo tipo de envío, como envío internacional?");
        System.out.println("");
        System.out.print("Lo unico que tenemos que hacer es crear otra clase llamada EnvioInternacional y sobrescribir el metodo que ya tenemos en la interfaz Envio a nuestra conveniencia.");
        System.out.println("");
        System.out.println("");
        System.out.print("¿Qué parte del código necesita modificarse?");
        System.out.println("");
        System.out.print("Casi un 100% del codigo original se tuvo que modificar debido a que OCP nos indica de crear una unica funcion en una interfaz aparte y despues sobrescribirla a nuestra conveniencia despues. Tuvimos que crear una interfaz Envio donde se crea la funcion original y de ahi creamos las otras clases necesarias para cada tipo de envio donde cada una implementa la funcion de la interfaz Envio.");
    }
}
