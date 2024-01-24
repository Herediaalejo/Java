package ar.herediaalejo.almacen;

public class Producto {
    /*
    Para la tarea se pide desarrollar un diseño orientado a objetos para un almacén y
    verdulería, como requerimiento vamos a tener 4 clases de productos Fruta,
    Limpieza, Lacteo y NoPerecible, todas tiene en común dos atributos el nombre
    (string) y precio (double) que deben heredar de la clase padre Producto, pero
    ademas cada una van a tener dos atributos propios adicionales, sus métodos getter
    y constructor para inicializar los 4 atributos (los 2 del padre y los 2 propios).
     */
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ", precio = " + precio;
    }
}
