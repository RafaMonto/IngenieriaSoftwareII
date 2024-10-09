public class ServicioImpuestos {
    private ICalcularImpuesto calcularImpuestos;

    public ServicioImpuestos(ICalcularImpuesto calcularImpuestos){
        this.calcularImpuestos = calcularImpuestos;
    }

    public void calcular(){
        this.calcularImpuestos.calcular();
    }
}
