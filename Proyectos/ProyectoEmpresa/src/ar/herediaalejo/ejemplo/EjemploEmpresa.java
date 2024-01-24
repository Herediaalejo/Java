package ar.herediaalejo.ejemplo;

import ar.herediaalejo.empresa.Cliente;
import ar.herediaalejo.empresa.Gerente;

public class EjemploEmpresa {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Pepe", "Muschio", "12421312412", "Los manantiales 123", 890000);

        gerente.setPresupuesto(3214785.45);
        System.out.println(gerente);
    }
}
