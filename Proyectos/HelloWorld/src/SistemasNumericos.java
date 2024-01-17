public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 100;

        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        
        int numeroBinario = 0b1100100; //Con 0b le hacemos entender a la computadora que se trata de un numero binario por lo tanto lo transforma a su version entera

        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0144; // anteponiendo el 0 el lenguaje entiende que es un numero octal

        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHexadecimal = 0x64; //Anteponemos 0x para que el lenguaje entienda que es un hexadecimal y me lo muestre en su expresion decimal;

        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

    }
}
