package ar.herediaalejo.poointerfaces.repositorio;

import ar.herediaalejo.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
