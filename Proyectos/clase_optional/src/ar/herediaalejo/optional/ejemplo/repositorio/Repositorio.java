package ar.herediaalejo.optional.ejemplo.repositorio;

import ar.herediaalejo.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);

}
