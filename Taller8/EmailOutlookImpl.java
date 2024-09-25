
public class EmailOutlookImpl extends EmailOutlook implements ServicioEmail{
    public EmailOutlookImpl(String to, String subject, String body) {
        super(to, subject, body);
    }

    @Override
    public void enviarEmail(){
        System.out.println("ENVIADO  EMAIL CON OUTLOOK");
    }
}
