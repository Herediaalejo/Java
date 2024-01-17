import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingreso nombre o descripcion de factura: ");

        String factura = scanner.nextLine();

        try {
            System.out.println("Ingrese precio del primer producto: ");

            double precio1 = scanner.nextDouble();

            System.out.println("Ingrese precio del segundo producto: ");

            double precio2 = scanner.nextDouble();

            double totalBruto = precio1 + precio2;

            double impuesto = 1.19;

            double totalNeto = totalBruto * impuesto;

            String mensaje = "La factura '" + factura +  "' tiene un total bruto de '" + totalBruto + "', con un impuesto de '" + (totalNeto - totalBruto) + "' y el monto después de impuesto es de '" + totalNeto + "'";

            System.out.println(mensaje);
        }catch(InputMismatchException e){
            System.out.println("Error, precio invalido");
            main(args);
            System.exit(0);
        }
    }
}
