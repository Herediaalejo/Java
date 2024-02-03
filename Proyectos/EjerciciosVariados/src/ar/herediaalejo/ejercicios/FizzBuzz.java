package ar.herediaalejo.ejercicios;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
        Enunciado: Implementa un programa que imprima los números del 1 al 100. Pero,
        para los múltiplos de 3, imprime "Fizz" en lugar del número y, para los
        múltiplos de 5, imprime "Buzz". Para los números que son múltiplos de ambos
        (3 y 5), imprime "ar.herediaalejo.ejercicios.FizzBuzz".
         */

        for(int i = 1; i <= 100; i++){

            String resultado = "";

            if (i % 3 == 0) {
                resultado += "Fizz";
            }

            if (i % 5 == 0) {
                resultado += "Buzz";
            }

            System.out.println(resultado.isEmpty() ? i : resultado);
        }
    }
}
