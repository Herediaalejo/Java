package ar.herediaalejo.app.hogar;

import ar.herediaalejo.app.jardin.Perro;

public class Persona {
    private String nombre;
    private String apellido;
    private ColorPelo colorPelo;
    String descripcion;
    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }
    public String lanzarPelota(Perro perro){
        return "lanza la pelota a " + perro.getNombre();
    }
    public static String saludar(){
        return "hola que tal!";
    }

}
