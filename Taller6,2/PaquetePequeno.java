public class PaquetePequeno extends Paquete implements PaquetePequenoInterface{
    public double valorDeclarado;

    public PaquetePequeno(double peso, String dimensiones, double valorDeclarado){
        super(peso, dimensiones);
        this.valorDeclarado = valorDeclarado;
    }

    @Override
    public void calcularCostoEnvioPequeno(){
        double costo = 0.1 * valorDeclarado;
        System.out.println("El costo de envio es de "+costo);
    } 
}
