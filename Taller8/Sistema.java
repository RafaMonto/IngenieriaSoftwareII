
public class Sistema {
    public ServicioEmail email;

    public Sistema(ServicioEmail email){
        this.email = email;
    }

    public void enviarEmail(){
        email.enviarEmail();
    }
}
