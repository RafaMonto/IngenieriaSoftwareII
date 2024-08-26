public class Factura {
    private int numeroFactura;
    private String fecha;
    private double total;

    public Factura(int numeroFactura, String fecha, double total) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.total = total;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numeroFactura=" + numeroFactura +
                ", fecha='" + fecha + '\'' +
                ", total=" + total +
                '}';
    }
}
