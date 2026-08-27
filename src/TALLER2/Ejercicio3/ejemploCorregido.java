package TALLER2.Ejercicio3;

public class ejemploCorregido {
    int numero = 10;

    public static void metodoEstatico(ejemploCorregido objeto) {
        System.out.println("El número es: " + objeto.numero);
    }

    public static void main(String[] args) {
        ejemploCorregido miObjeto = new ejemploCorregido();
        metodoEstatico(miObjeto);

        System.out.println("\nEJEMPLO DE ERROR: \n" +
                "\npublic class EjemploError {\n" +
                "    int numero = 10;\n" +
                "\n" +
                "    public static void metodoEstatico() {\n" +
                "        System.out.println(\"El número es: \" + this.numero);\n" +
                "    }\n" +
                "}");
    }
}