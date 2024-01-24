package ar.herediaalejo.empresa;

public class Empleado extends Persona{
    private double remuneracion;
    private int empleadoId;
    private static int ultimoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion){
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = ++ultimoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        if(porcentaje < 0){
            this.remuneracion += this.remuneracion * porcentaje;
        } else {
            this.remuneracion += (this.remuneracion * porcentaje)/100;
        }
    }

    @Override
    public String toString() {
        return " empleadoId = " + empleadoId + "," +
                super.toString() +
                ", remuneracion = " + remuneracion;
    }
}
