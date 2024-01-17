public class PrimitivosFloat {
    public static void main(String[] args) {
        
        float realFloat = 1.13e10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float: " + Float.MIN_VALUE);

        double realDouble = 3.40128235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("valor maximo de un double: " + Double.MAX_VALUE);
        System.out.println("valor minimo de un double: " + Double.MIN_VALUE);

        var varFlotante = 3.13231;

        System.out.println("varFlotante = " + varFlotante);

    }
}
