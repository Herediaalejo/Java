package ar.herediaalejo.empresa.interfaz;

import java.util.Optional;

public interface Empleado {
    String getNombre();
    Optional<String> getPuesto();
    double getSalario();
}
