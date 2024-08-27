import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factura factura = new Factura();
        Calculo calculo1 = new CalculoImpuestoIva("Doritos", 5, 1500.0);
        System.out.println("Precio final mas el Impuesto IVA del producto "+calculo1.getProducto()+": "+factura.hacerFactura(calculo1));
        System.out.println("");
        System.out.println("");
        System.out.println("Ingrese el valor del impuesto ICA: ");
        int impuestoICA = scanner.nextInt();
        Calculo calculo2 = new CalculoImpuestoReteIva("Pollo asado", 3, 20000.0, impuestoICA);
        System.out.println("Precio final mas el Impuesto ICA del producto "+calculo2.getProducto()+": "+factura.hacerFactura(calculo2));
        System.out.println("");
        System.out.println("");
        System.out.println("Ingrese el valor del impuesto Saludable: ");
        int impuestoSaludable = scanner.nextInt();
        Calculo calculo3 = new CalculoImpuestoReteIva("Tomate", 10, 700.0, impuestoSaludable);
        System.out.println("Precio final mas el Impuesto Saludable del producto "+calculo3.getProducto()+": "+factura.hacerFactura(calculo3));
        scanner.close();
    }

}
