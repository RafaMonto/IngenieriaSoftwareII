public class CanalSMS implements CanalNotificacion{
    @Override
    public void enviarNotificacion(Notificacion notificacion){
        System.out.println("Enviando notificacion por SMS: "+notificacion.getTitulo());
    }
}
