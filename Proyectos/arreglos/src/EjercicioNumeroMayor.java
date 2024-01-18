/*
Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de
rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor
considerar uno solo.
 */

import java.util.Scanner;

public class EjercicioNumeroMayor {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        int mayor = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 números enteros en el rango 11-99: ");
        for (int i=0; i<7 ; i++){
            int valor = s.nextInt();
            if(valor >= 11 && valor <= 99){
                arreglo[i] = valor;
            } else {
                System.out.println("Valor fuera del rango solicitado, por favor ingresar valor valido: ");
                i--;
            }
        }
        for (int i=0; i<7 ; i++){
            mayor = Math.max(mayor, arreglo[i]);
        }
        System.out.println("El numero mayor es: " + mayor);

    }
}
