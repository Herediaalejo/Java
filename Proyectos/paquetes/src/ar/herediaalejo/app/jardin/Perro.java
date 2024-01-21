package ar.herediaalejo.app.jardin;

import ar.herediaalejo.app.hogar.Persona;

public class Perro {
    private String nombre;
    private String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
