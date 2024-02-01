package ar.herediaalejo.stream.ejercicios;

import java.util.Arrays;
import java.util.stream.Stream;

public class EjercicioFlatMap {
    /*
    El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel y eliminar
    repetidos usando el api stream.

    Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el arreglo de primer nivel.
     */
    public static void main(String[] args) {
        String[][] clientes = {{"Alejo", "Heredia"},{"Juan", "Soto"}, {"Lucas", "Lolo"}, {"Matias", "Heredia"}, {"Juan", "Mastin"}, {"Alejo", "Lolo"}};

        Arrays.stream(clientes)
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
    }
}
