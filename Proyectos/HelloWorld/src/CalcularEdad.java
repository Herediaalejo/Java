/*
Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.

Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante, también se pueden apoyar de google que hay varios ejemplos.
 */

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcularEdad {
    public static void main(String[] args) {

        //Definimos el formato de fecha y le solicitamos al usuario que ingrese la fecha de nacimiento con ese mismo formato
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaNacimiento;
        try {
            fechaNacimiento = formato.parse(JOptionPane.showInputDialog("Ingresar fecha de nacimiento en formato dia-mes-año: "));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //Obtenemos la fecha actual
        Date fecha = new Date();
        String fechaActual = formato.format(fecha);

        //Definimos un formato para obtener individualmente el anio, el mes y el dia.
        SimpleDateFormat formatoAnio = new SimpleDateFormat("yyyy");
        SimpleDateFormat formatoMes = new SimpleDateFormat("MM");
        SimpleDateFormat formatoDia = new SimpleDateFormat("dd");

        //Obtenemos anio, mes y dia actual
        int anioActual = Integer.parseInt(formatoAnio.format(fecha));
        int mesActual = Integer.parseInt(formatoMes.format(fecha));
        int diaActual = Integer.parseInt(formatoDia.format(fecha));

        //Obtenemos anio, mes y dia de nacimiento
        int anioNacimiento = Integer.parseInt(formatoAnio.format(fechaNacimiento));
        int mesNacimiento = Integer.parseInt(formatoMes.format(fechaNacimiento));
        int diaNacimiento = Integer.parseInt(formatoDia.format(fechaNacimiento));

        int edad = 0;

        //Realizamos el cálculo de la edad
        if(fecha.after(fechaNacimiento)){
            if(mesActual>mesNacimiento){
                edad = anioActual - anioNacimiento;
            } else if (mesActual == mesNacimiento) {
                if(diaActual>=diaNacimiento){
                    edad = anioActual - anioNacimiento;
                } else {
                    edad = anioActual - anioNacimiento - 1;
                }
            } else {
                edad = anioActual - anioNacimiento - 1;
            }
        } else {
            JOptionPane.showMessageDialog(null,"La fecha ingresada es incorrecta");
        }

        //Mostramos por pantalla
        JOptionPane.showMessageDialog(null,"Usted tiene: " + edad + " años");

    }
}
