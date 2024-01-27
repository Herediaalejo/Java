package ar.herediaalejo.poointerfaces.repositorio;

import ar.herediaalejo.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
