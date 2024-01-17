import java.util.Scanner;
/*
Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10
valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar, luego
utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el numero
entero, entonces se requiere:

Calcular el menor número e imprimir el valor.

Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no,
imprimir "el numero menor es igual o mayor que 10!".
*/
public class BuscarNumeroMenor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int cantidad = 0;
            while(true){
            System.out.println("Ingrese CANTIDAD de números a ingresar(mínimo 10): ");
            cantidad = s.nextInt();

            if (cantidad >= 10) {
                break;
            } else {
                System.out.println("El mínimo es 10");
            }
            }

            int menor = 0;
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese número " + (i+1) + ": ");
                int numeroIngresado = s.nextInt();
                if (i == 0) {
                    menor = numeroIngresado;
                    continue;
                }
                menor = menor < numeroIngresado ? menor : numeroIngresado;
            }
            System.out.println("El menor número ingresado fue: " + menor);
            if (menor<10) {
                System.out.println("El número menor es menor que 10!");
            } else{
                System.out.println("El número menor es igual o mayor que 10!");
            }
        }catch(Exception e){
            System.out.println("Número invalido!");
            main(args);
            System.exit(0);
        }
    }
}
