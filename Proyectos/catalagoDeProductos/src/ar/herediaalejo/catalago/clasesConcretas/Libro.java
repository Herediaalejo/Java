package ar.herediaalejo.catalago.clasesConcretas;

import ar.herediaalejo.catalago.clasesAbstractas.Producto;
import ar.herediaalejo.catalago.interfaces.ILibro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Libro extends Producto implements ILibro {
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, String fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        try{
            this.fechaPublicacion = formato.parse(fechaPublicacion);
        }catch(ParseException e){
            this.fechaPublicacion = new Date();
        }
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.25;
    }
}
