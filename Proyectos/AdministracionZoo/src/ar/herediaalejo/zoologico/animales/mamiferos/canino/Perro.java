package ar.herediaalejo.zoologico.animales.mamiferos.canino;

public class Perro extends Canino{
    // - El Perro tiene fuerza de mordida en psi (int)

    private int fuerzaMordidaPsi;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioColmillos, int fuerzaMordidaPsi) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.fuerzaMordidaPsi = fuerzaMordidaPsi;
    }

    public int getFuerzaMordidaPsi() {
        return fuerzaMordidaPsi;
    }

    @Override
    public String comer() {
        return "El perro " + this.getColor() + " empieza a comer unos huesos que le quedaron del banquete de ayer, lo hace con una fuerza de mordida de " + this.getFuerzaMordidaPsi() + " lo que termina despedazando los huesos a pequeños granos de huesitos ";
    }

    @Override
    public String dormir() {
        return "El perro " + this.getColor() + " se recuesta sobre el lomo de su madre, duerme como bebe recien nacido";
    }

    @Override
    public String correr() {
        return "El perro " + this.getColor() + " se cansa del aburrimiento y empieza a correr alrededor de su madre, buscando un poco de juego";
    }

    @Override
    public String comunicarse() {
        return "El perro se distrae con un insecto y pierde a su madre, por lo que empieza a aullar en busca de su presencia";
    }
}
