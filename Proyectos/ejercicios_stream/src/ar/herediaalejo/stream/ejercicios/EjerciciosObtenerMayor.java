package ar.herediaalejo.stream.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class EjerciciosObtenerMayor {
    /*
    El siguiente ejercicio es obtener el numero mayor de un arreglo pero utilizando
    programación funcional, implementando la expresión lambda Function<T,R> (que
    viene predefinida) con el api stream y operador reduce.
     */


    public static void main(String[] args) {
        Function<Integer, List<Integer>> generarArrayNumeros = cantidad -> {
            List<Integer> numeros = new ArrayList<>();
            for(int i = 0; i < cantidad; i++){
                numeros.add((int)Math.floor(Math.random() * 1000));
            }
            return numeros;
        };
        List<Integer> array = generarArrayNumeros.apply(10);
        System.out.println(array);

        int mayor = array.stream()
                .reduce(0, (a,b) -> a > b? a: b);
        System.out.println("mayor = " + mayor);
    }
}
