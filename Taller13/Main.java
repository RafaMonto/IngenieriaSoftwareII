public class Main {
    public static void main(String[] args) {
        CanalNotificacion canalCorreo = new CanalCorreoElectronico();
        Notificador notificador = new Notificador(canalCorreo);

        Notificacion notificacion = new Notificacion("Nueva notificacion", "Hola mundo");
        notificador.enviarNotificacion(notificacion);
    }
}
