package ar.herediaalejo.vuelos;

import java.util.Date;

public class Vuelo implements Comparable<Vuelo>{
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private int cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaLlegada, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public int compareTo(Vuelo o) {
        if (o == null) return 0;
        return this.getFechaLlegada().compareTo(o.getFechaLlegada());

    }

    @Override
    public String toString() {
        return "nombre = " + nombre +
                ", origen = " + origen +
                ", destino = " + destino +
                ", fechaLlegada = " + fechaLlegada +
                ", cantidadPasajeros = " + cantidadPasajeros;
    }
}
