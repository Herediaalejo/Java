package ar.herediaalejo.ejercicios.poo;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellido;
    private int edad;
    private String oficio;

    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad, String oficio){
        this(nombre, apellido, edad);
        this.oficio = oficio;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    public String getOficio(){
        return oficio;
    }

    public void setOficio(String oficio){
        this.oficio = oficio;
    }

    @Override
    public String toString(){
        return nombre + " " + apellido + " - Edad: " + edad;
    }


    @Override
    public int compareTo(Persona o) {
        return edad - o.getEdad();
    }
}
