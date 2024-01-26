package ar.herediaalejo.catalago.clasesConcretas;

import ar.herediaalejo.catalago.clasesAbstractas.Electronico;

public class TvLcd extends Electronico {
    private int pulgada;

    public TvLcd(String fabricante, int precio, int pulgada) {
        super(fabricante, precio);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.35;
    }
}
