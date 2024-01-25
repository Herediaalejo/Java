package ar.herediaalejo.zoologico.animales.mamiferos.canino;

import ar.herediaalejo.zoologico.animales.mamiferos.Mamifero;

abstract public class Canino extends Mamifero {
/*
Todos los caninos deberán tener ademas de lo anterior los atributos color (string),
tamaño colmillos (decimal) e inicializar los datos mediante constructor con sus
métodos getters.
 */
    private String color;
    private double tamanioColmillos;

    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    public String getColor() {
        return color;
    }

    public double getTamanioColmillos() {
        return tamanioColmillos;
    }

}
