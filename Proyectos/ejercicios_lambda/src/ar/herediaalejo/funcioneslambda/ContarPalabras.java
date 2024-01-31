package ar.herediaalejo.funcioneslambda;

import java.util.Map;

@FunctionalInterface
public interface ContarPalabras {
    Map<String, Integer> contar(String frase);
}
