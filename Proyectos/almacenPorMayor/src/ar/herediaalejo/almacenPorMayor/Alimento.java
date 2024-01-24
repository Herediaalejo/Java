package ar.herediaalejo.almacenPorMayor;

public class Alimento extends Producto{

    private double calorias;
    private double azucares;
    private double grasasTotales;

    public Alimento(String nombre, double precio, String marca, int cantidad, double calorias, double azucares, double grasasTotales) {
        super(nombre, precio, marca, cantidad);
        this.calorias = calorias;
        this.azucares = azucares;
        this.grasasTotales = grasasTotales;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getAzucares() {
        return azucares;
    }

    public double getGrasasTotales() {
        return grasasTotales;
    }
}
