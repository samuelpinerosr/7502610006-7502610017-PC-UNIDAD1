package TALLER3.Ejercicio3;

public class EjemploCorregido {
    static int numero = 10;

    public static void modificarNumero() {
        numero = 20;
    }

    public static void main(String[] args) {
        System.out.println("Valor inicial: " + numero);
        modificarNumero();
        System.out.println("Valor modificado: " + numero);
    }
}