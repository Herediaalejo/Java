package ar.herediaalejo.catalago.clasesAbstractas;

import ar.herediaalejo.catalago.interfaces.IProducto;

abstract public class Producto implements IProducto {
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
