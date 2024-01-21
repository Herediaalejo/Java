package ar.herediaalejo.app.jardin;
import ar.herediaalejo.app.hogar.*;
import static ar.herediaalejo.app.hogar.Persona.*;
import static ar.herediaalejo.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Alejo");
        // p.descripcion = "lalalala"; Marca error porque descripcion es un atributo default que solo se puede acceder en el mismo paquete
        System.out.println("nombre = " + p.getNombre() + " apellido: " + p.getApellido());
        Perro perro = new Perro();
        perro.setNombre("Thor");
        perro.setRaza("Braco alemán");
        System.out.println("nombre = " + perro.getNombre());
        System.out.println("raza = " + perro.getRaza());

        String jugando = perro.jugar(p);
        System.out.println(p.getNombre() + " " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        System.out.println("generoMujer = " + generoMujer);
        String generoHombre = GENERO_MASCULINO;
        System.out.println("generoHombre = " + generoHombre);

        p.setColorPelo(CAFE);
    }
}
