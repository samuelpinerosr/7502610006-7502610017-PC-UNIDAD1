package TALLER2.Ejercicio1;

public class Producto {
    String nombre;
    String precio;

    Producto(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    void mostrarProducto() {
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("PRECIO: " + this.precio);
    }

    public static void main(String[] args) {
        Producto producto = new Producto("Anillo de oro", "4.000.000 cop");
        producto.mostrarProducto();
    }
}