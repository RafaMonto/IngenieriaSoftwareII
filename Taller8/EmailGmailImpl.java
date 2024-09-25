
public class EmailGmailImpl extends EmailGmail implements ServicioEmail{

    public EmailGmailImpl(String to, String subject, String body, String image) {
        super(to, subject, body, image);
    }

    @Override
    public void enviarEmail(){
        System.out.println("ENVIADO  EMAIL CON GMAIL");
    }
    
}
