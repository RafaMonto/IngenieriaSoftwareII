public class Cartilla implements LibreriaCartilla{
    public String nombre;
    public int numHojas;

    public Cartilla(String nombre, int numHojas){
        this.nombre = nombre;
        this.numHojas = numHojas;
    }
    
    @Override
    public void prestar() {
        System.out.println("La cartilla ha sido prestada a un usuario.");
    }

    @Override
    public void devolver() {
        System.out.println("La cartilla ha sido devuelta a la biblioteca.");
    }

    @Override
    public void solicitarNuevaVersion() {
        System.out.println("Se ha solicitado una nueva versión de la cartilla.");
    }
}
