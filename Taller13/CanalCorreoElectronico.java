public class CanalCorreoElectronico implements CanalNotificacion{
    @Override
    public void enviarNotificacion(Notificacion notificacion){
        System.out.println("Enviando notificacion por correo electronico: "+notificacion.getTitulo());
    }
}
