package ar.herediaalejo.zoologico.animales.mamiferos.felino;

public class Leon extends Felino{
    /*
    - El Leon ademas tiene numero manada (int) y potencia rugido en decibel (decimal)
     */
    private int numeroManada;
    private double potenciaRugidoDb;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad, int numeroManada, double potenciaRugidoDb) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugidoDb = potenciaRugidoDb;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public double getPotenciaRugidoDb() {
        return potenciaRugidoDb;
    }

    @Override
    public String comer(){
        return "El leon se sienta en una piedra y empieza a comer un poco de pescado";
    }
    @Override
    public String dormir(){
        return "El leon entra en un profundo sueño en una caverna de " + this.getHabitat();
    }
    @Override
    public String correr(){
        return "El león lanza un terrible rugido de " + this.getPotenciaRugidoDb() + "db y empieza a correr a una velocidad de " + this.getVelocidad() + " km/h";
    }
    @Override
    public String comunicarse(){
        return "El león se acerca a su manada de " + this.getNumeroManada() + " leones y empieza a rugir";
    }
}
