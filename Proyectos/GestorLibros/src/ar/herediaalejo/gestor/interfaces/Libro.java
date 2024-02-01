package ar.herediaalejo.gestor.interfaces;

import java.util.Optional;

public interface Libro {
    String getTitulo();
    Optional <String> getAutor();
    int getPaginas();

}
