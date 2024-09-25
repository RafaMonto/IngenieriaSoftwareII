public class Dry {
    public static void main(String[] args) {
        String email1 = "rafa@gmail.com";
        String email2 = "isabela@gmail.com";

        if(validarArrobaPunto(email1) && validarArrobaPunto(email2)){
            System.out.println("Emails validos");
        }else{
            System.out.println("Emails invalidos");
        }
    }

    public static boolean validarArrobaPunto(String email){
        if(email.contains("@") && email.contains(".")){
            return true;
        }else{
            return false;
        }
    }
}
