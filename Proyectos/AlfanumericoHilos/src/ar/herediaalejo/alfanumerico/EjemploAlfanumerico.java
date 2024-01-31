package ar.herediaalejo.alfanumerico;

public class EjemploAlfanumerico{
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new Alfanumerico(Tipo.LETRA));
        Thread hilo2 = new Thread(new Alfanumerico(Tipo.NUMERO));

        hilo1.start();
        hilo2.start();
    }

}
