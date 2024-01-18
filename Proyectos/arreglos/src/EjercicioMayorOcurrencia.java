/*
Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también
imprimir la cantidad de veces que aparece en el arreglo.

Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

Como resultado debería imprimir lo siguiente:

La mayor ocurrencias es: 3
El elemento que mas se repite es: 5
En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia
de 3 veces.
 */

public class EjercicioMayorOcurrencia {
    public static void main(String[] args) {
        int[] arreglo = {3,2,5,3,5,2,10,2,2,3};
        int ocurrencias;
        int mayor = 0;
        int numeroRepetido = 0;

        for(int i = 0; i < arreglo.length ; i++){
            ocurrencias = 0;
            for(int j = 0; j < arreglo.length ; j++){
                if(arreglo[i] == arreglo[j]){
                    ocurrencias++;
                }
            }
            numeroRepetido = mayor > ocurrencias? numeroRepetido : arreglo[i];
            mayor = mayor > ocurrencias? mayor : ocurrencias;

        }
        System.out.println("El elemento que mas se repite es: " + numeroRepetido);
        System.out.println("Cantidad de veces que se repite: " + mayor);

    }
}
