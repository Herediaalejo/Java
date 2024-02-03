package ar.herediaalejo.ejercicios;

import javax.swing.*;

public class ManejoExcepcion {
    public static void main(String[] args) {
        String mensaje = "asIngrese un número: ";
        boolean valido = false;
        while (!valido) {
            try {
                double numero = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje));
                JOptionPane.showMessageDialog(null, "Número valido!");
                valido = true;
            } catch (NumberFormatException e) {
                mensaje = "Número invalido, ingrese un número: ";
            }
        }
    }
}
