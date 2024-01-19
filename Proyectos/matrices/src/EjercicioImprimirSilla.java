/*
Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h
minúscula) construida a base del numero 1 y utilizar el numero 0 como espacio. El
tamaño de la silla se basa en una variable n que indicará el tamaño de la figura a
imprimir en una matriz de n x n.

Por ejemplo para n=5 se obtiene:

10000
10000
11111
10001
10001
Por ejemplo para n=6 se obtiene:

100000
100000
100000
111111
100001
100001
Por ejemplo para n=10 se obtiene:

1000000000
1000000000
1000000000
1000000000
1000000000
1111111111
1000000001
1000000001
1000000001
1000000001
Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
 */

import java.util.Scanner;

public class EjercicioImprimirSilla {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese tamaño de la silla: ");
        int n = s.nextInt();
        int[][] matrizSilla = new int[n][n];

        if (n == 0) {
            System.out.println("ERROR");
            System.exit(-1);
        }

        // Inicializar la matriz con 0
        for (int i = 0; i < matrizSilla.length; i++) {
            for (int j = 0; j < matrizSilla.length; j++) {
                matrizSilla[i][j] = 0;
            }
        }

        int mitad = matrizSilla.length / 2;

        for (int i = 0; i < matrizSilla.length; i++) {
            for (int j = 0; j < matrizSilla.length; j++) {

                if(j == 0){
                    matrizSilla[i][j] = 1;
                } else if (i == mitad) {
                    matrizSilla[i][j] = 1;
                } else if (j == matrizSilla[i].length - 1 && i > mitad) {
                    matrizSilla[i][j] = 1;
                }
            }
        }

        for(int i = 0; i< matrizSilla.length ; i++){
            for (int j = 0; j < matrizSilla[i].length ; j++){

                System.out.print(matrizSilla[i][j]);
            }
            System.out.println();
        }
    }
}
