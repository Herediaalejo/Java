import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion = 0;
        try{
            do {
                System.out.println("Bienvenido al programa de gestión de productos!");
                System.out.println("Elija una opción:");
                System.out.println("1 -> Agregar");
                System.out.println("2 -> Listar");
                System.out.println("3 -> Actualizar");
                System.out.println("4 -> Eliminar");
                System.out.println("5 -> Salir");
                opcion = s.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Producto agregado con éxito!");
                    System.out.println("Pulsar ENTER para continuar");
                    s.nextLine();
                    s.nextLine();
                    break;
                case 2:
                    System.out.println("Lista de productos: ");
                    for(int i = 0; i<5; i++){
                        System.out.println("---------- Producto " + (i+1) + " ----------");
                    }
                    System.out.println("Pulsar ENTER para continuar");
                    s.nextLine();
                    s.nextLine();
                    break;
                case 3:
                    System.out.println("Producto actualizado correctamente!");
                    System.out.println("Pulsar ENTER para continuar");
                    s.nextLine();
                    s.nextLine();
                    break;
                case 4:
                    System.out.println("Producto eliminado con éxito!");
                    System.out.println("Pulsar ENTER para continuar");
                    s.nextLine();
                    s.nextLine();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el sistema de gestión de productos! Hasta pronto...");
                    System.exit(0);
                default:
                    System.out.println("El número ingresado no esta en el rango de opciones");
                    System.out.println("Pulsar ENTER para continuar");
                    s.nextLine();
                    s.nextLine();
            }
            } while(true);

        } catch(Exception e){
            System.out.println("La opción debe ser un numero entero!");
            main(args);
        }
    }
}
