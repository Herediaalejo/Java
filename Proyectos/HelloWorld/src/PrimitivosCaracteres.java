public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("caracter = decimal : " + (caracter==decimal));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("caracter = simbolo : " + (caracter==simbolo));

        char espacio = ' ';
        char retroceso = '\b'; //Borra un caracter
        char tabulador = '\t';//Agrega una tabulacion
        char nuevaLinea = '\n';//Agrega un salto de linea
        char retornoCarro = '\r';//Se utiliza para mover el cursor al principio de la línea actual, algunos sistemas windows lo requieren junto al /n
        System.lineSeparator();// forma de obtener el separador de líneas específico del sistema en el que se está ejecutando




    }
}
