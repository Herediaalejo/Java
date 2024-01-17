public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 73456.23e-3;
        System.out.println("d = " + d);
        
        float f = 1.03234e2f;
        System.out.println("f = " + f);

        datoLogico = d > f;

        System.out.println("datoLogico = " + datoLogico);
        
        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
