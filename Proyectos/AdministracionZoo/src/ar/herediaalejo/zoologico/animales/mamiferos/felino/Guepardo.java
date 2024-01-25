package ar.herediaalejo.zoologico.animales.mamiferos.felino;

public class Guepardo extends Felino{
    /*
    - El Guepardo sin atributos adicionales
     */
    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }

    @Override
    public String comer(){
        return "El guepardo se acuesta al lado de un pequeño lago de la " + this.getHabitat() + " y empieza a comer un poco de carne de buey";
    }

    @Override
    public String dormir(){
        return "El guepardo duerme placidamente en un arbol de la " + this.getHabitat();
    }

    @Override
    public String correr(){
        return "El guepardo empieza a correr como si de su vida se tratase a una velocidad de " + this.getVelocidad() + " km/h";
    }

    @Override
    public String comunicarse(){
        return "El guepardo se acerca a un pequeño guepardito y empieza a lamerle la espalda, parece ser su hijo";
    }
}
