
public class EmailGmail extends Email{
    public String image;

    public EmailGmail(String to, String subject, String body, String image){
        super(to, subject, body);
        this.image = image; 
    }
}
