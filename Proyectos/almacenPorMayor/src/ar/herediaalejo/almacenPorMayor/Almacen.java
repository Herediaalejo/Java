package ar.herediaalejo.almacenPorMayor;

import java.util.Arrays;

public class Almacen {
    private String nombreAlmacen;
    private Producto[] productos = new Producto[10];
    private Vendedor[] vendedores = new Vendedor[2];
    private Cliente[] clientes = new Cliente[10];
    private int indiceVendedores;
    private int indiceProductos;
    private int indiceClientes;

    public Almacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
    }

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void addVendedor(Vendedor vendedor){
        if(indiceVendedores < 2){
            this.vendedores[indiceVendedores++] = vendedor;
        }
    }

    public void addProducto(Producto producto){
        if(indiceProductos<10){
            this.productos[indiceProductos++] = producto;
        }
    }

    public void addCliente(Cliente cliente){
        if(indiceClientes<10){
            this.clientes[indiceClientes++] = cliente;
        }
    }

    @Override
    public String toString() {
        String mensaje = "nombreAlmacen = " + nombreAlmacen + '\n' + "productos:\n"+"==================";
        for(Producto producto : productos){
            if(producto!=null){
                mensaje += "\n" + producto.toString();
            }
        }
        mensaje += "\n=================="+"\nvendedores:\n"+"==================";
        for(Vendedor vendedor: vendedores){
            if(vendedor!=null){
                mensaje += "\n" + vendedor.toString();
            }
        }
        mensaje += "\n=================="+"\nclientes:\n"+"==================";
        for(Cliente cliente: clientes){
            if(cliente!=null){
                mensaje += "\n" + cliente.toString();
            }
        }
        return mensaje;
    }
}
