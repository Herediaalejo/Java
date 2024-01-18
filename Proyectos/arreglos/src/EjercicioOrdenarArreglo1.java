/*
Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
el segundo, el antepenúltimo, el tercero, y así sucesivamente.
 */


import java.util.Scanner;

public class EjercicioOrdenarArreglo1 {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 10 números para el array: ");
        for (int i=0; i<10 ; i++){
            arreglo[i] = s.nextInt();
        }

        int[] arregloResultante = new int[10];
        int aux = 0;
        for (int i = 0; i < arreglo.length - i; i++){
            arregloResultante[aux++] = arreglo[arreglo.length-i-1];
            arregloResultante[aux++] = arreglo[i];
        }

        for (int i=0; i<10 ; i++){
            System.out.println("Posicion: " + i + ", Valor: " + arregloResultante[i]);
        }
    }
}
