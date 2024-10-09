public interface ServicioNotificaciones {
    Correo crear(Usuario usuario);
    void enviar(Correo correo);
}
