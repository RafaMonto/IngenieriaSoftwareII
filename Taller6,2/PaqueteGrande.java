public class PaqueteGrande extends Paquete implements PaqueteGrandeInterface{
    public String volumen;
    public String medioTranporte;

    public PaqueteGrande(double peso, String dimensiones, String volumen, String medioTransporte){
        super(peso, dimensiones);
        this.volumen = volumen;
        this.medioTranporte = medioTransporte;
    }

    @Override
    public void calcularCostoEnvioGrande(){
        double costo = 10000 * peso;
        System.out.println("El costo de envio es de "+costo);
    } 
}
