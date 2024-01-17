import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        /*Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

        La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.

        Si la capacidad actual es 70 litros: imprimir Estanque lleno

        Si está entre 60 y menor a 70: imprimir Estanque casi lleno

        Si está entre 40 y menor a 60: imprimir Estanque 3/4

        Si está entre 35 y menor a 40: imprimir Medio Estanque

        Si está entre 20 y menor a 35: imprimir Suficiente

        Si está entre 1 y menor a 20: imprimir Insuficiente*/

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese cantidad de combustible actual en el estanque (En litros)(Max 70 litros): ");
        double cantidadCombustible = 0;

        try{
        cantidadCombustible = s.nextDouble();

        }catch(Exception e) {
            System.out.println("Numero invalido!");
            main(args);
            System.exit(0);
        }
        if (cantidadCombustible>70){
            System.out.println("El estanque no admite mas de 70 litros!");
            main(args);
            System.exit(0);
        }
        if(cantidadCombustible>= 1 && cantidadCombustible < 20){
            System.out.println("Insuficiente");
        } else if (cantidadCombustible < 35) {
            System.out.println("Suficiente");
        } else if (cantidadCombustible < 40) {
            System.out.println("Medio estanque");
        }else if(cantidadCombustible < 60){
            System.out.println("Estanque3/4");
        } else if (cantidadCombustible < 70) {
            System.out.println("Estanque casi lleno");
        }else{
            System.out.println("Estanque lleno");
        }


    }
}
