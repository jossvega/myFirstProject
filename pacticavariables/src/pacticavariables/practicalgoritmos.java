package pacticavariables;

public class practicalgoritmos {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicioEdades();
        miPrimerCiclo();

    }

    public static void ejercicio1() {

        int radio = 2;
        float pi = 3.14f;
        float areaCirculo = radio * radio * pi;

        int base = 7;
        float altura = 21.0f;
        int diviv = 2;
        double areaTriangulo = base * altura / diviv;

        System.out.println("El area del circulo es " + areaCirculo);
        System.out.println("El area del triangulo es " + areaTriangulo);
    }

    public static void ejercicio2() {

        int numero = 89;
        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("El numero introducido es PAR");
            } else {
                System.out.println("El numero introducido es IMPAR");
            }
        } else {
            System.out.println("Introduce algún numero positivo");
        }

    }

    public static void ejercicioEdades() {
        int edad = 15;

        if (edad <= 12) {
            System.out.println("Eres niño");
        } else if (edad > 12 && edad <= 18) {
            System.out.println("Eres adolescente");
            System.out.println("y posiblemente tengas acne");
        } else if (edad > 18 && edad <= 60) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres anciano");
        }
    }

    public static void miPrimerCiclo() {
        //impresión de los números del 1 al 10
        int contador = 1;
        System.out.println("Antes del ciclo-> " + contador);
        while (contador <= 10) {
            System.out.println("El numero va en: " + contador);
            contador++;
        }
        System.out.println("Después del ciclo->" + contador);

    }

}
