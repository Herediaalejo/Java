package ar.herediaalejo.alfanumerico;

import java.util.concurrent.TimeUnit;

public class Alfanumerico implements Runnable{
    /*
    Para la tarea se pide implementar una clase llamada AlfanumericoTarea que
    implemente la interface Runnable y tenga como atributo un enum llamado Tipo.

    El enum Tipo tiene dos elementos NUMERO Y LETRA.

    Si el tipo es NUMERO, mostrara los números del 1 al 10, excluyente el último.

    Si el tipo es LETRA, mostrar las letras de la 'A' a la 'Z', inclusivo el último.

    Crea un par de hilos de diferentes tipos y ejecutarlos.
     */
    private Tipo tipo;
    private String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Alfanumerico(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        if(this.tipo == Tipo.NUMERO){
            for(int i = 0; i < 9; i++){
                System.out.print(i+1);
                try {
                    TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } else if (this.tipo == Tipo.LETRA){
            for(char letra: letras.toCharArray()){
                System.out.print(letra);
                try {
                    TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 300));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
