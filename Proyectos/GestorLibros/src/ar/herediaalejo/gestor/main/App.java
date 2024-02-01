package ar.herediaalejo.gestor.main;

import ar.herediaalejo.gestor.clases.LibroImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<LibroImpl> libros = new ArrayList<>();
        libros.add(new LibroImpl("El principito", 160));
        libros.add(new LibroImpl("1984", "George Orwell", 180));
        libros.add(new LibroImpl("El retrato de Dorian Gray", "Oscar Wilde", 250));

        Function<List<LibroImpl>, Stream<String>> filtrar = lista -> lista.stream()
                    .filter(libro -> libro.getPaginas() >= 200)
                    .map(libro -> libro.getTitulo().toUpperCase());


        filtrar.apply(libros)
                .forEach(System.out::println);
        
        String autor = buscarAutorPorTitulo("1984", libros);
        System.out.println("autorFiltrado = " + autor);

    }

    public static String buscarAutorPorTitulo(String titulo, List<LibroImpl> libros){
        String autor = libros.stream()
                            .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
                            .flatMap(libro -> libro.getAutor().stream())
                            .findFirst()
                            .orElse("Autor no encontrado");

        return autor;
    }
}
