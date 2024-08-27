import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Factura factura = new Factura(851, "2024/06/24", 500.0);
        Cliente cliente = new Cliente("Rafael Montoya",  "Calle 16 # 51B - 22",  "rafael@gmail.com");

        GuardarFacturaBD facturaRepo = new GuardarFacturaBD();
        facturaRepo.guardarFactura(factura);
        System.out.println("");

        GuardarClienteBD clienteRepo = new GuardarClienteBD();
        clienteRepo.guardarCliente(cliente);
        System.out.println("");

        EnviarEmailFactura emailFactura = new EnviarEmailFactura();
        emailFactura.enviarEmailFactura(factura, cliente);
        System.out.println("");

        GenerarReporteFactura reporteFactura = new GenerarReporteFactura();
        reporteFactura.generarReporteFacturas(List.of(factura));
        System.out.println("");

        FacturaDian dianFactura = new FacturaDian();
        dianFactura.enviarFacturaDian(factura);

        System.out.println("");
        System.out.println("");
        System.out.print("¿Por qué la clase Factura tiene más de una responsabilidad?");
        System.out.println("");
        System.out.print("Se esta violando la principal funcion del SRP debido a que en una sola clase o en pocas clases tenemos muchas funciones que debemos serparar. Solamente creamos mas clases con su respectiva funcion y le enviamos los datos necesarios. Y la clase factura tiene mas de una responsabilidad debido a que las otras funciones estan relacionadas con la factura por datos similares que se trabaja en conjunto, sin embargo esta mal el codigo.");
    }
}
