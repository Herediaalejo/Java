/*
Escribir un programa que imprima una X construida a base de la letra X en las
diagonales de la matriz y utilizar el carácter guion bajo como relleno. El tamaño de
la x se basa en una variable n que indicará el tamaño de la letra para imprimir en
una matriz de n x n.

El carácter "X" en mayúscula y el guion bajo "_" para los espacios.

Por ejemplo para n=5 se obtiene:

X___X
_X_X_
__X__
_X_X_
X___X
Por ejemplo para n=6 se obtiene:

X____X
_X__X_
__XX__
__XX__
_X__X_
X____X
Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
 */

import java.util.Scanner;

public class EjercicioImprimirX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese tamaño de la X: ");
        int n = s.nextInt();
        String[][] matrizX = new String[n][n];

        if (n == 0) {
            System.out.println("ERROR");
            System.exit(-1);
        }

        // Inicializar la matriz con "_"
        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < matrizX.length; j++) {
                matrizX[i][j] = "_";
            }
        }

        // Colocar "X" en la primera diagonal
        for (int i = 0; i < matrizX.length; i++) {
            matrizX[i][i] = "X";
        }

        // Colocar "X" en la otra diagonal
        for (int i = 0; i < matrizX.length; i++) {
            matrizX[i][matrizX.length - 1 - i] = "X";
        }
        for(int i = 0; i< matrizX.length ; i++){
            for (int j = 0; j < matrizX[i].length ; j++){

                System.out.print(matrizX[i][j]);
            }
            System.out.println();
        }
    }
}
