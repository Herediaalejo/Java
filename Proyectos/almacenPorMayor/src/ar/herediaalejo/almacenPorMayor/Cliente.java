package ar.herediaalejo.almacenPorMayor;

public class Cliente extends Persona{

    private String telefono;

    public Cliente(String nombre, String apellido, String telefono) {
        super(nombre, apellido);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public String toString() {
        return " nombre = " + this.getNombre() + '\t' +
                "apellido = " + this.getApellido() + '\t' +
                "telefono = " + this.getTelefono();
    }


}
