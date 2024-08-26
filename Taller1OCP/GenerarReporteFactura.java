import java.util.List;

public class GenerarReporteFactura {
    public void generarReporteFacturas(List<Factura> facturas) {
        System.out.println("Generando reporte de facturas del mes de agosto...");
        for (Factura factura : facturas) {
            System.out.println(factura);
        }
    }
}
