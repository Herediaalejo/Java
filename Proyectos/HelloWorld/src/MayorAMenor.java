import java.util.Scanner;

public class MayorAMenor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
        System.out.println("Ingrese un numero: ");
        int numero1 = s.nextInt();

        System.out.println("Ingrese un segundo numero: ");
        int numero2 = s.nextInt();

        int mayor = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("El numero mayor es: " + mayor);

        }catch(Exception e){
            System.out.println("Debe ingresar solo numeros enteros!");
            main(args);
            System.exit(0);
        }
    }
}
