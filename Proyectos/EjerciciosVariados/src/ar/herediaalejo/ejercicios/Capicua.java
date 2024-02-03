package ar.herediaalejo.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;
        int numero = 0;

        while (!valido) {
            System.out.println("Ingrese un número: ");
            try {
                numero = scanner.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Número invalido!");
            }
        }

        System.out.println("es capicua: " + esCapicua(numero));
    }

    public static boolean esCapicua(int numero){
        char[] cadena = Integer.toString(numero).toCharArray();
        for(int i = 0; i < cadena.length / 2; i++){
            if(cadena[i] == cadena[cadena.length - 1 - i]){
                continue;
            }
            return false;
        }
        return true;
    }
}
