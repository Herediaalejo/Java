package ar.herediaalejo.ejercicios;

public class InvertirCadena {
    public static void main(String[] args) {
        String palabra = "Lagartija";
        System.out.println("Palabra: " + palabra);
        System.out.println("Palabra invertida: " + invertir(palabra));


    }

    public static String invertir(String cadena){
        StringBuilder nuevaCadena = new StringBuilder();
        int largo = cadena.length();

        for(int i = largo; i > 0; i--){
            nuevaCadena.append(cadena.toCharArray()[i-1]);
        }

        return nuevaCadena.toString();
    }
}

