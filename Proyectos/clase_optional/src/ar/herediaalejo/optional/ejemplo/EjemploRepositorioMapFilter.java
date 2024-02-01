package ar.herediaalejo.optional.ejemplo;

import ar.herediaalejo.optional.ejemplo.models.Computador;
import ar.herediaalejo.optional.ejemplo.models.Fabricante;
import ar.herediaalejo.optional.ejemplo.models.Procesador;
import ar.herediaalejo.optional.ejemplo.repositorio.ComputadorRepositorio;
import ar.herediaalejo.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);


    }

}
