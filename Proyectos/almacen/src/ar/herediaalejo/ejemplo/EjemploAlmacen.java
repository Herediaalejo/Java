package ar.herediaalejo.ejemplo;

import ar.herediaalejo.almacen.*;

public class EjemploAlmacen {
    /*
    Para el ejemplo de la clase main se pide crear dos objetos por cada tipo de
    producto que deben ser almacenados en un arreglo del tipo Producto, se debe
    mostrar iterando el arreglo, por cada uno el detalle completo, el precio, nombre
    y los atributos adicionales.
     */
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];
        Lacteo producto1 = new Lacteo("Leche Sancor", 800, 2, 350);
        Lacteo producto2 = new Lacteo("Yogur Yogurisimo", 1100, 1, 250);
        Fruta producto3 = new Fruta("Manzana", 1200, 1000, "Verde");
        Fruta producto4 = new Fruta("Frutilla", 1800, 500, "Rojo");
        Limpieza producto5 = new Limpieza("Detergente Ayudín", 1500, "", 1);
        Limpieza producto6 = new Limpieza("Jabón liquido", 2500, "", 2);
        NoPerecible producto7 = new NoPerecible("Arroz", 1500, 2, 150);
        NoPerecible producto8 = new NoPerecible("Fideos", 1800, 2, 650);
        productos[0] = producto1;
        productos[1] = producto2;
        productos[2] = producto3;
        productos[3] = producto4;
        productos[4] = producto5;
        productos[5] = producto6;
        productos[6] = producto7;
        productos[7] = producto8;

        for(Producto producto: productos){
            System.out.println(producto);
        }

    }
}
