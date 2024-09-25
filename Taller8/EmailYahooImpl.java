
public class EmailYahooImpl extends EmailYahoo implements ServicioEmail{
    public EmailYahooImpl(String to, String subject, String body, String files) {
        super(to, subject, body, files);
    }

    @Override
    public void enviarEmail(){
        System.out.println("ENVIADO  EMAIL CON YAHOO");
    }
}
