package ar.herediaalejo.almacenPorMayor;

public class NoPerecedero extends Alimento{
    private double peso;

    public NoPerecedero(String nombre, double precio, String marca, int cantidad, double calorias, double azucares, double grasasTotales, double peso) {
        super(nombre, precio, marca, cantidad, calorias, azucares, grasasTotales);
        this.peso = peso;
    }

    public double getPeso(){
        return peso;
    }
}
