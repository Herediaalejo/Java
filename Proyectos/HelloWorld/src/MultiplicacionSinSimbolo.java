import javax.swing.*;

public class MultiplicacionSinSimbolo {
    public static void main(String[] args) {
        double numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca primer número: "));
        double numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca segundo número: "));
        double suma = 0;
        if (numero2 > 0){
            for(double i = numero2; i>0; i--){
                suma += numero1;
            }
        } else if (numero2 < 0) {
            for(double i = numero2; i<0; i++){
                suma += -(numero1);
            }
        }
        JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es: " + suma);
    }
}
