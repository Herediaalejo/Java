package ar.herediaalejo.zoologico.animales.mamiferos.felino;

public class Tigre extends Felino{
    /*
    - El Tigre tiene el atributo especie tigre (string)
     */
    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer(){
        return "El tigre " + this.getEspecieTigre() + " empieza a comer un poco de carne de cabra que cazó por la mañana";
    }
    @Override
    public String dormir(){
        return "El tigre " + this.getEspecieTigre() + " se acuesta en la cima de una pequeña colina de la " + this.getHabitat() + " y empieza a emitir unos pequeños ronquidos";
    }
    @Override
    public String correr(){
        return "El tigre "  + this.getEspecieTigre() + " sale de caza a una velocidad de " + this.getVelocidad() + "km/h";
    }
    @Override
    public String comunicarse(){
        return "El tigre "  + this.getEspecieTigre() + " se acerca a una tigresa y empieza a emitir particulares sonidos";
    }
}
