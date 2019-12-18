package pacticavariables;

public class Pacticavariables {

    public static void main(String[] args) {

        ejersicioArray();
        
        ejercicio2();
        
        ejercicio1();
        
    }

    public static void ejercicio1() {
        int n1 = 2, n2 = 5, n3 = 0;
        n3 = n2 - n1;
        n2 = 2;
        n1 = n3 + n2;
        n3 = n2 * n3;
        n2 = n3 / n1;

        System.out.println("El valor de n3=" + n3);
        System.out.println("El valor de n1=" + n1);
        System.out.println("El valor de n2=" + n2);
    }

    public static void ejercicio2() {

        float n1 = 2.5F;
        float n2 = 7.2F;
        float n3 = 0F;
        float pi = 3.14F;

        n3 = pi;
        n2 = n3 + pi;
        n1 = n2 / n1;
        n3 = n2 + n1;
        n2 = n2 - pi;

        System.out.println("El valor de n1=" + n1);
        System.out.println("El valor de n2=" + n2);
        System.out.println("El valor de n3=" + n3);
        System.out.println("Soy el ejerci 2");
    }

    public static void ejersicioArray() {
        String j = "alejandro";
        int a = 29;
        int b;

        int[] calificaciones = {5, 6, 3, 1};

        String[] vocales = {"a", "e", "i", "o", "u"};
        System.out.println("pablito=" + calificaciones[2]);
        System.out.println("ahí viene la..." + vocales[1]);

        String[][] matriz = {
            {"Edad", "Nombre", "profesion"},
            {"camilo", "20", "ing"},
            {"juan", "29", "admi"},
            {"joss", "29", "admin"}
        };
        System.out.println(matriz.length);

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " | ");
            }
            System.out.println();
        }
    }
   
}
