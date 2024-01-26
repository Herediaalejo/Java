package ar.herediaalejo.catalago.clasesConcretas;

import ar.herediaalejo.catalago.clasesAbstractas.Electronico;
import ar.herediaalejo.catalago.interfaces.IProducto;

public class IPhone extends Electronico implements IProducto {
    private String color;
    private String modelo;

    public IPhone(String fabricante, String color, String modelo, int precio) {
        super(fabricante, precio);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.5;
    }
}
