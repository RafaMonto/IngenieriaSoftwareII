public class Cliente {
    private String identificacion;
    private String nombre;
    private String correo;
    
    public Cliente(String identificacion, String nombre, String correo){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
