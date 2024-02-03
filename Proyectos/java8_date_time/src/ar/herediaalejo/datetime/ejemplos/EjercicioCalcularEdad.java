package ar.herediaalejo.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EjercicioCalcularEdad {
    public static void main(String[] args) {
        /*
        Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
        convertirla a una fecha del tipo LocalDate y calcular la edad de la persona de acuerdo
        a la fecha actual.
         */
        Scanner s = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNacimiento = null;

        // Bucle para solicitar la fecha hasta que sea válida
        while(true){
            System.out.println("Ingrese fecha de nacimiento de la persona en formato dd-mm-yyyy: ");
            try{
                fechaNacimiento = LocalDate.parse(s.next(), formato);
                break;
            }catch(DateTimeParseException e){
                System.out.println("Fecha invalida, ingrese nuevamente");
            }
        }

        LocalDate fechaActual = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, fechaActual);
        System.out.println("Usted tiene " + edad.getYears() + " años, "+ edad.getMonths() + " meses y " + edad.getDays() + " dias");

        s.close();

    }
}
