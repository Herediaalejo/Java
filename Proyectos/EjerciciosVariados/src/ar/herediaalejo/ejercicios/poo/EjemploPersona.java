package ar.herediaalejo.ejercicios.poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EjemploPersona {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Alejo", "Heredia", 21));
        personas.add(new Persona("Juan", "Campos", 16));
        personas.add(new Persona("Hernan", "Lopez", 45, "Desarrollador Java"));
        personas.add(new Persona("Alberto", "Suki", 32, "Ingeniero Aeronáutico"));

        personas.forEach(System.out::println);

        System.out.println("---------------------------------------");

        System.out.println("Ordenadas por edad descendente");

        ordenarPorEdad(personas);

        personas.forEach(System.out::println);

        System.out.println("---------------------------------------");

        System.out.println("Ordenadas por edad ascendente");

        personas.sort(Collections.reverseOrder());

        personas.forEach(System.out::println);


    }

    public static void ordenarPorEdad(List<Persona> lista){

        Collections.sort(lista);

    }

}
