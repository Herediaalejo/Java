/*
Leer 7 números por teclado para llenar un arreglo y a continuación calcular el
promedio de los números positivos, el promedio de los negativos y contar el número de
ceros.
 */

import java.util.Scanner;

public class EjercicioCalculoPromedios {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        double sumaPositivos = 0, sumaNegativos = 0, promedioPositivos = 0, promedioNegativos = 0;
        int cantidadPositivos = 0, cantidadNegativos = 0, cantidadCero = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 números enteros: ");
        for (int i=0; i<7 ; i++){
            arreglo[i] = s.nextInt();
        }

        for (int i=0; i<7 ; i++){
            if(arreglo[i] > 0){
                sumaPositivos += arreglo[i];
                cantidadPositivos++;
            } else if (arreglo[i]<0) {
                sumaNegativos += arreglo[i];
                cantidadNegativos++;
            } else{
                cantidadCero++;
            }
        }
        promedioPositivos = sumaPositivos / cantidadPositivos;
        promedioNegativos = sumaNegativos / cantidadNegativos;
        System.out.println("El promedio de los números positivos es: " + promedioPositivos);
        System.out.println("El promedio de los números negativos es: " + promedioNegativos);
        System.out.println("La cantidad de números cero encontrados es: " + cantidadCero);
    }
}
