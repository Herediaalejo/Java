package ar.herediaalejo.supermercado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaSupermercado<T> implements Iterable<T>{
    private List<T> productos;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public List<T> getProductos() {
        return productos;
    }

    public void addProductos(T producto){
        this.productos.add(producto);
    }

    @Override
    public Iterator<T> iterator() {
        return this.productos.iterator();
    }
}
