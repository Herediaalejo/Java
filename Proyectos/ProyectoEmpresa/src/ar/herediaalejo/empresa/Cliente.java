package ar.herediaalejo.empresa;

public class Cliente extends Persona{
    private int clienteId;
    private static int ultimoId;
    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        clienteId = ++ultimoId;
    }

    public int getClienteId(){
        return clienteId;
    }

    @Override
    public String toString() {
        return "clienteId=" + clienteId + " " +
                super.toString();
    }
}
