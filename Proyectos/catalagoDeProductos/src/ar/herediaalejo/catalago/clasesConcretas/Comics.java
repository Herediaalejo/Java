package ar.herediaalejo.catalago.clasesConcretas;

public class Comics extends Libro{
    private String personaje;

    public Comics(int precio, String fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.40;
    }
}
