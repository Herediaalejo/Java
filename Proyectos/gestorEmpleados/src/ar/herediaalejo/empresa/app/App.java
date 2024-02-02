package ar.herediaalejo.empresa.app;

import ar.herediaalejo.empresa.clases.EmpleadoImpl;
import ar.herediaalejo.empresa.interfaz.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List <Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoImpl("Juan", 100000, "Desarrollador Java"));
        empleados.add(new EmpleadoImpl("Alberto", 28000, "Tester"));
        empleados.add(new EmpleadoImpl("Alan", 23000));
        empleados.add(new EmpleadoImpl("Diego", 120000, "Scrum Master"));
        empleados.add(new EmpleadoImpl("Jorge", 900000, "Desarrollador Python"));
        empleados.add(new EmpleadoImpl("Simon", 82000));

        Stream<String> nombres = empleados.stream()
                .filter(empleado -> empleado.getSalario() > 30000)
                .map(Empleado::getNombre)
                .map(String::toUpperCase);

        nombres.forEach(System.out::println);

        BiFunction<String , List<Empleado> , Optional<String>> buscarPuestoPorNombre = (nombre, lista) -> {
            return lista.stream()
                        .filter(empleado -> empleado.getNombre().equalsIgnoreCase(nombre))
                        .map(empleado -> empleado.getPuesto().orElse("Puesto no encontrado"))
                        .findFirst();
        };

        System.out.println(buscarPuestoPorNombre.apply("jorge", empleados).orElse("Empleado no encontrado"));

    }
}
