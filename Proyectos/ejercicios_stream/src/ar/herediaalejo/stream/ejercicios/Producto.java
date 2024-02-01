package ar.herediaalejo.stream.ejercicios;

public class Producto {
    /*
    El siguiente requerimiento es para una lista de productos List<Producto> , de 3 a
    5 elementos, se pide calcular el importe (precio por cantidad) y sumarlos.

    La clase Producto debe tener el atributo precio del tipo double y cantidad int,
    entonces utilizando stream convertir la lista de productos en el gran total del tipo double.
     */
    private double precio;
    private int cantidad;

    public Producto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
