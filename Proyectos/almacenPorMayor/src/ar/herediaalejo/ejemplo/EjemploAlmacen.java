package ar.herediaalejo.ejemplo;
import ar.herediaalejo.almacenPorMayor.*;
public class EjemploAlmacen {
    public static void main(String[] args) {

    Almacen miAlmacen = new Almacen("Pepito");

    miAlmacen.addVendedor(new Vendedor("Juan", "Martinez", 320000));
    miAlmacen.addVendedor(new Vendedor("Roberto", "Perez", 350000));
    miAlmacen.addProducto(new Perecedero("Lomo de cerdo", 5500, "Paladini", 10, 1250, 0, 250, "07-02-2024"));
    miAlmacen.addProducto(new NoPerecedero("Arroz", 1500, "Dos hermanos", 50, 400, 50, 10, 1000));
    miAlmacen.addProducto(new Limpieza("Mopa", 5400, "Cuchuflin", 10, 0));
    miAlmacen.addCliente(new Cliente("Walter", "Almada", "3512323231"));

    System.out.println(miAlmacen);

    }

}
