public class Main {
    public static void main(String[] args) {
        // ejercicio 1
        int numerousIf = 5;

        if (numerousIf < 6) {
            System.out.println("el numero es positivo");
        } else if (numerousIf > 6) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es zero");

            // fin del ejercicio 1
        }
        // ejercicio 2

        int numerousWhile = 0;

        while (numerousWhile < 3) {
            numerousWhile = numerousWhile + 1;
            System.out.println(numerousWhile);

            // fin del ejercicio 2
        }
        // ejercicio 3

        int numerousDoWhile = 3;

        do {
            System.out.println(numerousDoWhile);
            numerousDoWhile = numerousDoWhile--;
        } while (numerousDoWhile > 3);

        // fin del ejercicio 3

        // ejercicio 4

        for (int numerous = 0; numerous <= 3; numerous = numerous + 1) {
            System.out.println(numerous);

            // fin del ejercicio 4
        }
        // ejercicio 5

        var estacion = "INVIERNO";

        switch (estacion) {
            case "VERANO":
                System.out.println("es verano");
            case "OTOÑO":
                System.out.println("es otoño");
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
            default:
                System.out.println("es otra estacion");

                // fin del ejercicio 5
        }
    }
}