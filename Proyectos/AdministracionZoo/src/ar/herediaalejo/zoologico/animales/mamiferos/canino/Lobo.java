package ar.herediaalejo.zoologico.animales.mamiferos.canino;

public class Lobo extends Canino{
    // - El Lobo tiene numero de camada (int) y especieLobo (string)
     private int numeroCamada;
     private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioColmillos, int numeroCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumeroCamada() {
        return numeroCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo " + this.getEspecieLobo() + " empieza a comer un poco de carne de conejo con sus largos colmillos de " + this.getTamanioColmillos() + "cm";
    }

    @Override
    public String dormir() {
        return "El lobo " + this.getEspecieLobo() + " se junta con su manada y se recuesta, entra en un profundo sueño";
    }

    @Override
    public String correr() {
        return "El lobo " + this.getEspecieLobo() + " entra en frenesí y empieza a correr desesperado";
    }

    @Override
    public String comunicarse() {
        return "El lobo " + this.getEspecieLobo() + " se pierde en el bosque de la " + this.getHabitat() + " y empieza aullar en busca de su camada de " + this.getNumeroCamada() + " lobos";
    }
}
