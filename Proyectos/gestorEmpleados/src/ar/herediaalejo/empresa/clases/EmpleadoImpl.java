package ar.herediaalejo.empresa.clases;

import ar.herediaalejo.empresa.interfaz.Empleado;

import java.util.Optional;

public class EmpleadoImpl implements Empleado {
    private String nombre;
    private double salario;
    private String puesto;

    public EmpleadoImpl(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public EmpleadoImpl(String nombre, double salario, String puesto) {
        this(nombre, salario);
        this.puesto = puesto;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Optional<String> getPuesto() {
        return Optional.ofNullable(puesto);
    }

    @Override
    public double getSalario() {
        return salario;
    }
}
