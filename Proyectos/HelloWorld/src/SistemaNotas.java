import java.util.Scanner;

/*
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
*/
public class SistemaNotas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cantidadMayor5 = 0, cantidadMenor4 = 0, cantidad1 = 0;
        double promedioMayor5 = 0, promedioMenor4 = 0, sumaMayor5 = 0, sumaMenor4 = 0, sumaTotal = 0;
        try{
            for(int i = 0; i < 20; i++){
                System.out.println("Ingrese nota " + (i+1) + " :");
                double nota = s.nextDouble();
                if(nota > 5 && nota <= 7) {
                    sumaMayor5 += nota;
                    cantidadMayor5++;
                } else if (nota < 4) {
                    sumaMenor4 += nota;
                    cantidadMenor4++;
                } else if (nota == 1) {
                    cantidad1++;
                } else if (nota <= 0){
                    System.out.println("Nota invalida, finalizando programa...");
                    System.exit(0);
                }
                sumaTotal += nota;
            }
        } catch(Exception e){
            System.out.println("Nota invalida, finalizando programa...");
            System.exit(0);
        }
        if (cantidadMayor5 > 0){
            promedioMayor5 = sumaMayor5 / cantidadMayor5;
        }
        if (cantidadMenor4 > 0){
            promedioMenor4 = sumaMenor4 / cantidadMenor4;
        }
        double promedioTotal = sumaTotal / 20;
        System.out.println("El promedio de notas mayores a 5 es: " + promedioMayor5);
        System.out.println("El promedio de notas menores a 4 es: " + promedioMenor4);
        System.out.println("El promedio general de notas es: " + promedioTotal);

    }
}
