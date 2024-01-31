package ar.herediaalejo.funcioneslambda;

import java.util.HashMap;
import java.util.Map;

public class EjemploLambda {
    public static void main(String[] args) {
        ConvertirFrase convertir = frase -> {
            StringBuilder nuevaFrase = new StringBuilder();
            for (char c : frase.toCharArray()) {
                if (c != ' ' && c != '.' && c != ',') {
                    nuevaFrase.append(c);
                }
            }
            return nuevaFrase.toString().toUpperCase();
        };

        System.out.println(convertir.convertirFrase("Hola, buenas tardes."));

        ContarPalabras contar = frase -> {
            String[] palabras = frase.toLowerCase().split(" ");
            int contador;
            int mayorOcurrencia = 0;
            String palabraMasRepetida = "";
            for(int i = 0; i < palabras.length; i++){
                contador = 0;
                for(int j=0; j< palabras.length; j++){
                    if(palabras[i].equals(palabras[j])){
                        contador++;
                    }
                }
                if(mayorOcurrencia<contador){
                    palabraMasRepetida = palabras[i];
                    mayorOcurrencia = contador;
                }
            }
            Map<String,Integer> resultado = new HashMap<>();
            resultado.put(palabraMasRepetida, mayorOcurrencia);
            return resultado;
        };

        Map<String,Integer> resultado = contar.contar("El auto de el señor Augusto es muy elegante pero el auto del señor José es una joya ");

        resultado.forEach((llave,valor)-> System.out.println("La palabras mas repetida fue \"" + llave + "\" con " + valor + " ocurrencias"));
    }
}
