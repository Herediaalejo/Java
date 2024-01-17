import java.util.Scanner;

/*
Pedir el radio de un círculo y calcular su área.

utilizar la formula:
area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
 */
public class CalculoAreaCirculo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese radio del círculo: ");
        double radio = s.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo con radio " + radio + " es de " + area);
        s.close();
    }
}
