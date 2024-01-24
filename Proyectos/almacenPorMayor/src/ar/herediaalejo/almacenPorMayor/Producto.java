package ar.herediaalejo.almacenPorMayor;

public class Producto {
    private String nombre;

    private double precio;

    private String marca;

    private int cantidad;

    public Producto(String nombre, double precio, String marca, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + '\t' +
                "precio = " + precio + '\t' +
                "marca = " + marca + '\t' +
                "cantidad = " + cantidad;
    }
}
