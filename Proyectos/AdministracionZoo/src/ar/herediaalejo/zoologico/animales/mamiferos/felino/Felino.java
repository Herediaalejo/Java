package ar.herediaalejo.zoologico.animales.mamiferos.felino;

import ar.herediaalejo.zoologico.animales.mamiferos.Mamifero;

/*
Todos los felinos deberán tener los atributos tamaño garras (decimal) y velocidad
(int), inicializar los datos mediante constructor y sus métodos getters.
 */
abstract public class Felino extends Mamifero {
    private double tamanioGarras;
    private int velocidad;

    public Felino(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }

    public double getTamanioGarras() {
        return tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
