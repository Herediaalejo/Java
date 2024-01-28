package ar.herediaalejo.poointerfaces.repositorio;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);
}
