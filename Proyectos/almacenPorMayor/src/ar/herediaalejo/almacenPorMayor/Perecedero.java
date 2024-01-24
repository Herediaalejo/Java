package ar.herediaalejo.almacenPorMayor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Perecedero extends Alimento{
    private Date fechaVencimiento;

    public Perecedero(String nombre, double precio, String marca, int cantidad, double calorias, double azucares, double grasasTotales, String fechaVencimiento) {
        super(nombre, precio, marca, cantidad, calorias, azucares, grasasTotales);
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        try{
            this.fechaVencimiento = formato.parse(fechaVencimiento);
        } catch(ParseException e){
            this.fechaVencimiento = new Date();
        }
    }

    public Date getFechaVencimiento(){
        return fechaVencimiento;
    }
}
