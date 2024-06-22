import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while(opcion != 6) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Parámetros de números");
            System.out.println("2. Parámetros de letras");
            System.out.println("3. Tabla de multiplicar del 1 al 10");
            System.out.println("4. Operaciones con 2 números");
            System.out.println("5. Número primo");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        opcion1();
                        break;
                    case 2:
                        opcion2();
                        break;
                    case 3:
                        opcion3();
                        break;
                    case 4:
                        opcion4();
                        break;
                    case 5:
                        opcion5();
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 6.");
                }
            } catch (NumberFormatException var4) {
                System.out.println("Por favor, ingrese un número entero válido.");
            }
        }

        scanner.close();
    }

    // Funciones de las opciones (sin implementación en este ejemplo)

    public static void opcion1() {
        // Implementación de la opción 1
    }

    public static void opcion2() {
        // Implementación de la opción 2
    }

    public static void opcion3() {
        // Implementación de la opción 3
    }

    public static void opcion4() {
        // Implementación de la opción 4
    }

    public static void opcion5() {
        // Implementación de la opción 5
    }

}