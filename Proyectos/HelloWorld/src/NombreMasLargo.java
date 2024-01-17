
/*Obtener el nombre mas largo de tres personas, según los siguientes requerimientos

Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().

Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)(Imprimir sólo uno de los tres, el de más caracteres en el nombre.)

Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.

Restricción no usar loops en el desarrollo de la tarea.

Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."*/

import javax.swing.*;

public class NombreMasLargo {

    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog(null,"Ingrese nombre + apellido 1:");
        String nombre2 = JOptionPane.showInputDialog(null,"Ingrese nombre + apellido 2:");
        String nombre3 = JOptionPane.showInputDialog(null,"Ingrese nombre + apellido 3:");
        String[] nombres = {nombre1.trim().split(" ")[0], nombre2.trim().split(" ")[0], nombre3.trim().split(" ")[0]};
        String nombreMasLargo = "";
        for(int i = 0; i<nombres.length; i++) {
            if (nombres[i].length() > nombreMasLargo.length()) {
                nombreMasLargo = nombres[i];
            }
            System.out.println(nombres[i] + " = " + nombres[i].length() + " caracteres");
        }

        System.out.println("El nombre mas largo es \"" + nombreMasLargo + "\" con " + nombreMasLargo.length() + " caracteres.");
    }
}
