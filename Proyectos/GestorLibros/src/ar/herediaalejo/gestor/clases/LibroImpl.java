package ar.herediaalejo.gestor.clases;

import ar.herediaalejo.gestor.interfaces.Libro;

import java.util.Optional;

public class LibroImpl implements Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public LibroImpl(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public LibroImpl(String titulo, String autor, int paginas) {
        this(titulo, paginas);
        this.autor = autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public Optional<String> getAutor() {
        return Optional.ofNullable(autor);
    }

    @Override
    public int getPaginas() {
        return paginas;
    }
}
