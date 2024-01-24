package ar.herediaalejo.almacenPorMayor;

public class Vendedor extends Persona{

    private double sueldo;

    public Vendedor(String nombre, String apellido, double sueldo) {
        super(nombre, apellido);
        this.sueldo = sueldo;
    }

    public double getSueldo(){
        return sueldo;
    }

    public String toString() {
        return " nombre = '" + this.getNombre() + '\t' +
                "apellido = " + this.getApellido() + '\t' +
                "sueldo = '" + this.getSueldo();
    }
}
