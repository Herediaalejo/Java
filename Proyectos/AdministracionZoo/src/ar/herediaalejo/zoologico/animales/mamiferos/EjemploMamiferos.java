package ar.herediaalejo.zoologico.animales.mamiferos;

import ar.herediaalejo.zoologico.animales.mamiferos.canino.*;
import ar.herediaalejo.zoologico.animales.mamiferos.felino.*;

public class EjemploMamiferos {
    /*
    Al final crear la clase con el método main llamada EjemploMamiferos y crear algunas
    instancias de ejemplo de cada clase concreta, entre 5 a 7 objetos, asociado al tipo mas
    genérico posible y mostrar los datos en consola.
     */
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];
        Mamifero perro = new Perro("Bosque", 74, 92, 22, "Lycaon pictus", "marron", 20, 10);
        Mamifero leon = new Leon("Sabana", 90, 110, 180, "Panthera leo", 15, 70, 6, 110);
        Mamifero guepardo = new Guepardo("Sabana", 70, 100, 50, "Acinonyx jubatus", 10, 100);
        Mamifero lobo = new Lobo("Bosque", 80, 120, 120, "Canis lupus pambasileus", "negro", 12, 10,  "negro de Alaska" );
        Mamifero tigre = new Tigre("Selva", 95, 300, 200, "Panthera tigris tigris", 30, 70, "bengala");

        mamiferos[0] = perro;
        mamiferos[1] = leon;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = tigre;

        System.out.println("==========================");
        for(Mamifero mamifero: mamiferos){
            System.out.println("Animal: " + mamifero.getClass().getSimpleName());
            System.out.println(mamifero.comer());
            System.out.println(mamifero.dormir());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());
            System.out.println("==========================");
        }
    }

}
