
public class EmailYahoo extends Email{
    public String files;

    public EmailYahoo(String to, String subject, String body, String files){
        super(to, subject, body);
        this.files = files; 
     }
}
