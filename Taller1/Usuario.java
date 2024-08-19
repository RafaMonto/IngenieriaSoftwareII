public class Usuario{
    public String name;
    public String email;
    public String pass;
    public String info;
    
    public void ObtenerInfo(String name, String email, String pass, String info){
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.info = info;

        System.out.println("Informacion de usuario guardada correctamente");
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getInfo() {
        return this.info;
    }
    
}