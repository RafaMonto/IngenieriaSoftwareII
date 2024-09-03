public class PaquetePeligroso extends Paquete implements PaquetePeligrosoInterface{
    public String etiquetasPeligro;
    public boolean embalajeEspecial;

    public PaquetePeligroso(double peso, String dimensiones, String etiquetasPeligro, boolean embalajeEspecial){
        super(peso, dimensiones);
        this.etiquetasPeligro = etiquetasPeligro;
        this.embalajeEspecial = embalajeEspecial;
    }

    @Override
    public void verificarContenidoPeligroso(){
        System.out.println("El contenido del paquete es... "+etiquetasPeligro);
    }

    @Override
    public void asegurarPaquetePeligroso(){
        if(embalajeEspecial){
            System.out.println("El paquete se encuentra asegurado");
        }else{
            System.out.println("El paquete no se encuentra segurado");
        }     
    }
}
