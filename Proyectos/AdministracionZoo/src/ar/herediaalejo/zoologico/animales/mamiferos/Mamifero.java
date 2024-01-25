package ar.herediaalejo.zoologico.animales.mamiferos;

/*
Se requiere escribir un programa para la administración de animales de un zoológico,
inicialmente para los mamíferos, para leones, lobos, tigres, guepardos y perros
salvaje africano.

Se necesita diseñar una jerarquías de clases en común a todos ellos, por ejemplo para
los felinos (Leon, Tigre y Guepardo) vamos a necesitar la clase abstracta Felino,
para los caninos (Lobo y Perro) vamos a necesitar la clase abstracta Canino y una
clase que sea en comun para todos ellos, la clase abstracta Mamifero.

Los métodos abstractos comer(), dormir(), correr() y comunicarse() tienen que ser implementados por
las clases concretas devolviendo un string con alguna frase u oración que sea de acuerdo a cada tipo
y que interactúe con sus atributos. No hay una regla para implementar estos métodos, pueden aplicar
la creatividad, por ejemplo en la clase Leon el método comer() podría ser implementado devolviendo la
cadena "El León caza junto a su grupo de " + numManada + " individuos en las llanuras africanas", o
para el Lobo el método dormir() devolver "El Lobo " + color + " duerme en las cavernas de " + habitat.

 */

abstract public class Mamifero {
    /*
    Para todos los mamíferos mencionados se requieren de los siguientes atributos en
común (que deberan de implementar en la clase abstracta Mamifero): el habitat
(string), altura (decimal), largo (decimal), peso (decimal), nombre científico
(string) con sus respectivos métodos getters, usar constructor para inicializar los
datos. También se necesitan 4 métodos abstractos que deberán implementar los tipos
concretos: comer(), dormir(), correr(), comunicarse(), todos devuelven string.
     */

    private String habitat;
    private double altura;
    private double largo;
    private double peso;
    private String nombreCientifico;

    public Mamifero(String habitat, double altura, double largo, double peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargo() {
        return largo;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();
}
