import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.ObtenerInfo("Tomas", "tomas@gmail.com", "12345678", "ETC");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        ValidarContrasena validarContrasena = new ValidarContrasena();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su contraseña: ");
        String contrasenaIngresada = scanner.nextLine();
        
        // Validar la contraseña
        boolean esValida = validarContrasena.ValidarC(contrasenaIngresada);
        
        // Resultado
        if(esValida){
            System.out.println("Contraseña correcta.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        scanner.close();

        EnviarCorreos enviarCorreos = new EnviarCorreos();
        enviarCorreos.SendEmails(usuario.getEmail());
        System.out.println("");
        System.out.println("");
        System.out.println("");

        CalcularSalario calcularSalario = new CalcularSalario();
        calcularSalario.CalcularS(usuario.getName(), usuario.getInfo());
        System.out.println("");
        System.out.println("");
        System.out.println("");

        


        


        System.out.print("Los metodos de la clase Usuario deberian estar en una clase aparte propia para su funcion cada una. Segun el la regla, aunque tengan cosas en comun como tal con el usuario, son cosas aparte y de eso trata el SRP, separar y organizar los diferentes metodos en sus respectivas clases.");
        System.out.println("");
        System.out.println("La clase usuario tiene el metodo ObtenerInfo porque es muy superficial y no tiene que hacer ningun calculo u operecion o realizar muchas acciones mas complejas.");
    }


}


