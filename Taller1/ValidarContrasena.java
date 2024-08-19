public class ValidarContrasena{
    public boolean ValidarC(String contraseña){
        String pass = "12345678";
        if(contraseña.equals(pass)){
            return true;
        }else{
            return false;
        }
    }
}
