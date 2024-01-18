/*
Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de
este.

El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.

Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento
aparece en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números
del 1 al 6, incluso si no están presente en el arreglo.

Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:

1: ***
2:
3: *
4: *****
5: *
6: **
Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.
 */

public class EjercicioHistograma {
    public static void main(String[] args) {
        int[] arreglo = {1,3,4,6,2,1,3,2,4,2,5,3,2,2,6,1};
        String histograma = "";
        int numeroBuscado = 1;
        for(int i = 0; i < 6 ; i++){
            histograma += "\n" + numeroBuscado + ": ";
            for(int j = 0; j < arreglo.length ; j++){
                if(numeroBuscado == arreglo[j]){
                    histograma += "*";
                }
            }
            numeroBuscado++;

        }
        System.out.println(histograma);
    }
}
