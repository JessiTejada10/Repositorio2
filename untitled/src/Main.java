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
            System.out.println("5. Verificar si un número es primo");
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
                        opcion4(scanner); // Llamamos a la opción 4 y le pasamos el scanner
                        break;
                    case 5:
                        opcion5(scanner); // Llamamos a la opción 5 y le pasamos el scanner
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número entero válido.");
            }
        }

        scanner.close();
    }

    public static void opcion1() {
        System.out.println("Opción 1 seleccionada: Parámetros de números.");
        // Implementación de la opción 1
    }

    public static void opcion2() {
        System.out.println("Opción 2 seleccionada: Parámetros de letras.");
        // Implementación de la opción 2
    }

    public static void opcion3() {
        System.out.println("Opción 3 seleccionada: Tabla de multiplicar del 1 al 10.");
        // Implementación de la opción 3
    }

    public static void opcion4(Scanner scanner) {
        System.out.println("Opción 4 seleccionada: Operaciones con 2 números.");

        // Pedir al usuario que seleccione la operación
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingrese el número de la operación: ");
        int opcion = scanner.nextInt();

        // Pedir al usuario que ingrese los dos números
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Realizar la operación seleccionada y mostrar el resultado
        switch (opcion) {
            case 1:
                double suma = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + suma);
                break;
            case 2:
                double resta = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resta);
                break;
            case 3:
                double multiplicacion = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                break;
            case 4:
                if (numero2 != 0) {
                    double division = numero1 / numero2;
                    System.out.println("El resultado de la división es: " + division);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una operación del 1 al 4.");
                break;
        }
    }

    public static void opcion5(Scanner scanner) {
        System.out.print("Ingrese un número entero positivo mayor que 1: ");

        try {
            int numero = Integer.parseInt(scanner.nextLine());

            // Verificar si el número ingresado es primo
            boolean esPrimo = true;
            if (numero <= 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            // Mostrar el resultado
            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número entero válido.");
        }
    }
}
