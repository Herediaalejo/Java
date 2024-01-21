import java.text.ParseException;

/*
Escribir un programa, clase con método main, la cual llamaremos EjemploOrdenes:

Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro
productos a cada una, cada orden con distintos productos, que no se repitan.

Para cada una imprimir sus valores en consola usando método getter incluyendo los
productos, donde con el método getter obtenemos el arreglo de productos y con un
foreach recorremos e imprimimos sus atributos fabricante, nombre y precio. Tener en
cuenta en la salida el gran total de cada orden, los clientes, todo.
 */
public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("1 hamburguesas x4, 1 Gaseosa, 1 Chocolate, 1 Alfajor");
        orden1.addProducto(new Producto("Paty", "Hamburguesas x4", 2500));
        orden1.addProducto(new Producto("Coca-Cola", "Gaseosa Coca-Cola 2,25l", 2000));
        orden1.addProducto(new Producto("Milka", "Chocolate blanco 125g", 1100));
        orden1.addProducto(new Producto("Águila", "Alfajor chocotorta", 1000));

        orden1.setCliente(new Cliente("Alberto", "Diaz"));
        orden1.setFecha("02-01-2024");

        OrdenCompra orden2 = new OrdenCompra("1 galletas , 1 jugo , 1 turrones , 1 botella de agua");
        orden2.addProducto(new Producto("Frutigram", "Galletas chocolate", 800));
        orden2.addProducto(new Producto("Tang", "Jugo sabor Manzana", 150));
        orden2.addProducto(new Producto("Arcor", "Turrón", 120));
        orden2.addProducto(new Producto("Villa del Sur", "Agua 2,25l", 1000));

        orden2.setCliente(new Cliente("Alejandra", "Gómez"));
        orden2.setFecha("05-01-2024");

        OrdenCompra orden3 = new OrdenCompra("1 queso, 1 jamon, 2 panes");
        orden3.addProducto(new Producto("Cremon", "Queso Cremoso 500g", 3500));
        orden3.addProducto(new Producto("Paladini", "Jamón cocido 300g ", 3000));
        orden3.addProducto(new Producto("Bimbo", "Pan hamburguesa x4", 1400));
        orden3.addProducto(new Producto("Bimbo", "Pan hamburguesa x4", 1400));

        orden3.setCliente(new Cliente("Osvaldo", "Tarantín"));
        orden3.setFecha("21-01-2024");

        System.out.println("_______________________________\nOrden " + orden1.getId());
        System.out.println("Fecha: " + orden1.getFecha());
        System.out.println("Cliente: " + orden1.getCliente().getNombre() +" "+  orden1.getCliente().getApellido());
        System.out.println("Descripción: " + orden1.getDescripcion());
        System.out.println("Productos: ");
        for(Producto producto : orden1.getProductos()){
            System.out.print("Fabricante: " + producto.getFabricante() + " --- Nombre: " + producto.getNombre() + " --- Precio: $" + producto.getPrecio());
            System.out.println();
        }
        System.out.println("Total: " + orden1.getTotal());

        System.out.println("_______________________________\nOrden " + orden2.getId());
        System.out.println("Fecha: " + orden2.getFecha());
        System.out.println("Cliente: " + orden2.getCliente().getNombre() +" "+  orden2.getCliente().getApellido());
        System.out.println("Descripción: " + orden2.getDescripcion());
        System.out.println("Productos: ");
        for(Producto producto : orden2.getProductos()){
            System.out.print("Fabricante: " + producto.getFabricante() + " --- Nombre: " + producto.getNombre() + " --- Precio: $" + producto.getPrecio());
            System.out.println();
        }
        System.out.println("Total: " + orden2.getTotal());

        System.out.println("_______________________________\nOrden " + orden3.getId());
        System.out.println("Fecha: " + orden3.getFecha());
        System.out.println("Cliente: " + orden3.getCliente().getNombre() +" "+  orden3.getCliente().getApellido());
        System.out.println("Descripción: " + orden3.getDescripcion());
        System.out.println("Productos: ");
        for(Producto producto : orden3.getProductos()){
            System.out.print("Fabricante: " + producto.getFabricante() + " --- Nombre: " + producto.getNombre() + " --- Precio: $" + producto.getPrecio());
            System.out.println();
        }
        System.out.println("Total: $" + orden3.getTotal());




    }
}
