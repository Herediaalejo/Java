package ar.herediaalejo.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FiltrarNombres {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Alejandro");
        nombres.add("Florencia");
        nombres.add("José");
        nombres.add("Lucas");
        nombres.add("Alejo");
        nombres.add("Rocío");
        nombres.add("Matias");
        nombres.add("Alan");

        Function<List<String>, List<String>> filtrar = (lista) -> {
            return lista.stream()
                    .filter(nombre -> nombre.toUpperCase().startsWith("A"))
                    .collect(Collectors.toList());
        };


        filtrar.apply(nombres).forEach(System.out::println);
    }

}
