package ar.herediaalejo.almacenPorMayor;

public class Limpieza extends Producto{
    private int litros;

    public Limpieza(String nombre, double precio, String marca, int cantidad, int litros) {
        super(nombre, precio, marca, cantidad);
        this.litros = litros;
    }

    public int getLitros(){
        return litros;
    }
}
