import javax.swing.*;

public class SistemasNumericosEntradaSwing {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero: ");
        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);

        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario = 0b1100100; //Con 0b le hacemos entender a la computadora que se trata de un numero binario por lo tanto lo transforma a su version entera

        System.out.println("numeroBinario = " + numeroBinario);

        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        int numeroOctal = 0144; // anteponiendo el 0 el lenguaje entiende que es un numero octal

        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);

        int numeroHexadecimal = 0x64; //Anteponemos 0x para que el lenguaje entienda que es un hexadecimal y me lo muestre en su expresion decimal;

        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
