package TALLER3.Ejercicio1;

public class Coche {

    String marca;
    String modelo;
    static int contadorCoches = 0;


    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }


    public static void mostrarContador() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }
}
