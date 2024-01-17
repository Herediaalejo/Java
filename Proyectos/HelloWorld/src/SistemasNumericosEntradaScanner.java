import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Creamos un objeto del tipo scanner que va a tomar como parametro la consola

        System.out.println("Ingrese un numero entero: ");

        // String numeroStr = scanner.nextLine(); // Se guarda en la variable numeroStr la proxima linea que lee el objeto Scanner de la consola

        int numeroDecimal = 0;

        try{
            numeroDecimal =  scanner.nextInt(); //Integer.parseInt(numeroStr);
        } catch(InputMismatchException e){
            System.out.println("Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);

        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String mensajeHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexadecimal;

        System.out.println(mensaje);

    }
}
