public class Outlook implements ServicioNotificaciones {
    @Override
    public Correo crear(Usuario usuario) {
        Correo correo = new Correo();
        correo.setDestinatario(usuario.getIdentificacion());
        correo.setAsunto("Correo desde Outlook para " + usuario.getNombre());
        correo.setCuerpo("Este es un mensaje de prueba para Outlook.");
        return correo;
    }

    @Override
    public void enviar(Correo correo) {
        System.out.println("Enviando correo a través de Outlook: " + correo.getDestinatario());
    }
}
