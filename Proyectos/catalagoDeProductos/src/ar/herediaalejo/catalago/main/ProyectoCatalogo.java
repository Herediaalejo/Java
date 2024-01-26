package ar.herediaalejo.catalago.main;

import ar.herediaalejo.catalago.clasesAbstractas.*;
import ar.herediaalejo.catalago.clasesConcretas.*;
import ar.herediaalejo.catalago.interfaces.IProducto;

import java.text.SimpleDateFormat;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        IProducto[] productos = new Producto[6];

        productos[0] = new TvLcd("Samsung", 250000, 42);
        productos[1] = new Libro(18000, "05-04-1890", "Oscar Wilde", "El retrato de Dorian Gray", "Losada");
        productos[2] = new IPhone("Apple", "Rojo", "Iphone 13 Pro", 1500000);
        productos[3] = new Comics(5500, "20-01-2011", "Yoshihiro Togashi", "Hunter X Hunter", "Long", "Gon");
        productos[4] = new Libro(14000, "10-01-1948", "George Orwell", "1984", "Debolsillo");

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        for(IProducto producto:productos){
            if (producto != null){
                System.out.println("Producto: " + producto.getClass().getSimpleName());
                System.out.println("Precio compra: $" + producto.getPrecio());
                System.out.println("Precio venta: $" + producto.getPrecioVenta());
                if (producto instanceof Electronico) {
                    System.out.println("fabricante: " + ((Electronico) producto).getFabricante());
                }
                if (producto instanceof Libro) {
                    System.out.println("Titulo: " + ((Libro) producto).getTitulo());
                    System.out.println("Autor: " + ((Libro) producto).getAutor());
                    System.out.println("Fecha de publicacion: " + formato.format(((Libro) producto).getFechaPublicacion()));
                    System.out.println("Editorial: " + ((Libro) producto).getEditorial());

                }
                if (producto instanceof Comics) {
                    System.out.println("Personaje principal: " + ((Comics) producto).getPersonaje());
                }
                System.out.println("=========================================");

            }
        }
    }

}
