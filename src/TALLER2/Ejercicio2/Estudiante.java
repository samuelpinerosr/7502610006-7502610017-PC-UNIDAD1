package TALLER2.Ejercicio2;

public class Estudiante {
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Estudiante() {
        this("Sin nombre", 0);
    }
    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarDetalles();
        System.out.println("------------------");
        Estudiante estudiante2 = new Estudiante("Samuel", 18);
        estudiante2.mostrarDetalles();
    }
}