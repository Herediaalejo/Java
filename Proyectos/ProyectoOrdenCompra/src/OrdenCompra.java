/*
La tarea es crear un proyecto nuevo llamado ProyectoOrdenCompra de la siguiente
manera:

Se requiere crear la clase OrdenCompra con los siguientes campos privados:
identificador tipo Integer autoincremental, descripcion String, fecha tipo Date,
cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos con 4
elementos: Producto[] productos.

En la clase OrdenCompra, crear constructor que inicialice solo la descripción.

En la clase OrdenCompra, crear métodos getter para todos los atributos.

En la clase OrdenCompra implementar sólo métodos set para cliente y fecha.

Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar usando el
método public void addProducto (Producto producto), nada más, es decir no se pueden
agregar en el constructor ni en métodos setter.

La clase OrdenCompra debe tener un método que devuelva el gran total, sumando los
precios de los productos.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdenCompra {
    private String descripcion;
    private Integer id;
    private static int contadorId = 0;
    private Date fecha = new Date();
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProductos = 0;

    public OrdenCompra(String descripcion){
        this.id = ++contadorId;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public String getFecha() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return format.format(fecha);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setFecha(String fecha){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try{
            this.fecha = format.parse(fecha);
        } catch (ParseException e){
            System.out.println("Error al analizar la fecha, debe tener el formate dia-mes-anio ");
            System.exit(1);
        }
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto (Producto producto){
        if (indiceProductos < this.productos.length){
            this.productos[indiceProductos++] = producto;
        }
    }

    public int getTotal(){
        int total = 0;
         for(Producto producto : productos){
             total += producto.getPrecio();
         }
         return total;
    }
}
