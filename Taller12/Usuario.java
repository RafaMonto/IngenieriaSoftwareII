public class Usuario {
    private String nombre;
    private String identificacion;
    private ServicioNotificaciones servicioNotificaciones;

    public Usuario(String nombre, String identificacion, ServicioNotificaciones servicioNotificaciones) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.servicioNotificaciones = servicioNotificaciones;
    }

    public void generarCorreo() {
        Correo correo = servicioNotificaciones.crear(this);
        servicioNotificaciones.enviar(correo);
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }
}
