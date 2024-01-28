package ar.herediaalejo.supermercado;

import ar.herediaalejo.supermercado.productos.*;

public class EjemploSupermercado{
    public static void main(String[] args) {
        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();

        bolsaFrutas.addProductos(new Fruta("Manzana", 1000, 1000, "rojo"));
        bolsaFrutas.addProductos(new Fruta("Banana", 800, 1250, "amarillo"));
        bolsaFrutas.addProductos(new Fruta("Durazno", 1200, 800, "naranja"));
        bolsaFrutas.addProductos(new Fruta("Frutilla", 1500, 1000, "rojo"));
        bolsaFrutas.addProductos(new Fruta("Sandia", 2300, 5000, "verde"));


        bolsaLacteos.addProductos(new Lacteo("Manteca", 2000, 1, 250));
        bolsaLacteos.addProductos(new Lacteo("Leche", 1000, 1, 750));
        bolsaLacteos.addProductos(new Lacteo("Yogur", 1100, 1, 650));
        bolsaLacteos.addProductos(new Lacteo("Queso", 3500, 1, 450));
        bolsaLacteos.addProductos(new Lacteo("Crema", 980, 1, 150));

        bolsaLimpieza.addProductos(new Limpieza("Jabón Liquido", 2100, "Jabón, botella", 2.5));
        bolsaLimpieza.addProductos(new Limpieza("Jabón Blanco", 700, "Jabón", 0));
        bolsaLimpieza.addProductos(new Limpieza("Detergente", 1200, "Detergente, botella", 0.4));
        bolsaLimpieza.addProductos(new Limpieza("Dentífrico", 2000, "Dentífrico", 0.25));
        bolsaLimpieza.addProductos(new Limpieza("Liquido para pisos", 2500, "Liquido, botella", 2));

        bolsaNoPerecibles.addProductos(new NoPerecible("Fideos", 1450, 500, 1000));
        bolsaNoPerecibles.addProductos(new NoPerecible("Arroz", 1600, 600, 500));
        bolsaNoPerecibles.addProductos(new NoPerecible("Choclo", 1100, 500, 250));
        bolsaNoPerecibles.addProductos(new NoPerecible("Garbanzo", 2200, 400, 300));
        bolsaNoPerecibles.addProductos(new NoPerecible("Albaca", 800, 100, 10));

        System.out.println("-------------------------------- Frutas ---------------------------------");
        for (Fruta fruta : bolsaFrutas) {
            System.out.println("-------------------------------- \n" +  fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso (gr): " + fruta.getPeso());
            System.out.println("Color: " + fruta.getColor());
        }

        System.out.println("-------------------------------- Limpieza ---------------------------------");
        for (Limpieza prod : bolsaLimpieza) {
            System.out.println("-------------------------------- \n" +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Componentes: " + prod.getComponentes());
            System.out.println("Litros: " + prod.getLitros());
        }

        System.out.println("-------------------------------- Lacteo ---------------------------------");
        for (Lacteo prod : bolsaLacteos) {
            System.out.println("-------------------------------- \n" +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Cantidad (gr): " + prod.getCantidad());
            System.out.println("Proteinas (gr): " + prod.getProteinas());
        }

        System.out.println("-------------------------------- NoPerecible ---------------------------------");
        for (NoPerecible prod : bolsaNoPerecibles) {
            System.out.println("-------------------------------- \n" +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Calorias (kCal): " + prod.getCalorias());
            System.out.println("Contenido neto (gr): " + prod.getContenido());
        }
    }
}

