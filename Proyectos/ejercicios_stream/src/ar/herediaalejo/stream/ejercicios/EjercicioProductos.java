package ar.herediaalejo.stream.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioProductos {
    /*
    El siguiente requerimiento es para una lista de productos List<Producto> , de 3 a
    5 elementos, se pide calcular el importe (precio por cantidad) y sumarlos.

    La clase Producto debe tener el atributo precio del tipo double y cantidad int,
    entonces utilizando stream convertir la lista de productos en el gran total del tipo double.
     */

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1470, 3));
        productos.add(new Producto(1310, 7));
        productos.add(new Producto(2340, 2));

        double total = productos.stream()
                .mapToDouble(p -> p.getPrecio() * p.getCantidad())
                 .reduce(0.0, Double::sum);

        System.out.println("total = " + total);
        
    }
}
