import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre del primer familiar: ");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese nombre del segundo familiar: ");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese nombre del tercer familiar: ");
        String nombre3 = scanner.nextLine();

        String resultado1 = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2);
        String resultado2 = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);
        String resultado3 = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);
    
        String resultadoFinal = resultado1 + "_" + resultado2 + "_" + resultado3;
        System.out.println("resultadoFinal = " + resultadoFinal);
    }
}
