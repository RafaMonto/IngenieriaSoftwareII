public class Main {
    public static void main(String[] args) {
        ServicioNotificaciones gmailServicio = new Gmail();
        Usuario usuarioGmail = new Usuario("Roberto", "roberto.perez@gmail.com", gmailServicio);
        usuarioGmail.generarCorreo();

        ServicioNotificaciones outlookServicio = new Outlook();
        Usuario usuarioOutlook = new Usuario("Maria", "maria.lopez@outlook.com", outlookServicio);
        usuarioOutlook.generarCorreo(); 
    }
}
