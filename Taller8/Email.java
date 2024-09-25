
public abstract class Email {
    public String to;
    public String subject;
    public String body;

    public Email(String to, String subject, String body){
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }
}
