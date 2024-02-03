package ar.herediaalejo.ejercicios;

import java.util.Arrays;

public class ManejoListas {
    /*
    Enunciado: Dada una lista de números, implementa una función que devuelva la suma
    de los números pares.
     */
    public static void main(String[] args) {

        double[] numeros = new double[10];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] =  Math.floor(Math.random() * 100);
        }

        System.out.println(Arrays.toString(numeros));

        //opción 1
        double resultado = 0.0;
        System.out.print("Numeros pares: ");
        for(double numero : numeros){
            if(numero%2==0){
                resultado+=numero;
                System.out.print(numero+ " - ");
            }

        }
        System.out.println();
        System.out.println("resultado = " + resultado);
        System.out.println("------------------------------");

        //Opción 2

        System.out.println("resultado = " + obtenerSumaPares(numeros));
        System.out.println("------------------------------");

        //Opción 3

        interface sumarPares {
            double aplicar(double[] array);
        }

        sumarPares sumarPares = lista -> Arrays.stream(lista)
                .filter( numero -> numero % 2 == 0)
                .reduce(0, Double::sum);

        System.out.println("resultado = " + sumarPares.aplicar(numeros));
    }

    public static double obtenerSumaPares(double[] numeros){
        double resultado = 0;
        for(double numero : numeros){
            if(numero%2==0){
                resultado+= numero;
            }
        }
        return resultado;
    }

}
