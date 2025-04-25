import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cine cine = new Cine(3);  // Cine con 3 salas

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú:");
            System.out.println("1. Vender Entradas");
            System.out.println("2. Mostrar Disponibilidad");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la sala (Sala 1, Sala 2, Sala 3): ");
                    String sala = scanner.nextLine();
                    System.out.print("Ingrese la cantidad de entradas: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer

                    int salaIndex = obtenerIndiceSala(sala);
                    if (salaIndex == -1) {
                        System.out.println("Sala no válida.");
                    } else if (cine.venderEntrada(salaIndex, cantidad)) {
                        System.out.println("Entradas vendidas con éxito.");
                    } else {
                        System.out.println("No hay suficiente disponibilidad en la sala.");
                    }
                    break;

                case 2:
                    cine.consultarDisponibilidad();
                    break;

                case 3:
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
                    break;
            }

            if (continuar) {
                System.out.print("¿Desea continuar? (s/n): ");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("n")) {
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                }
            }
        }

        scanner.close();
    }

    private static int obtenerIndiceSala(String nombreSala) {
        switch (nombreSala.toLowerCase()) {
            case "sala 1":
                return 0;
            case "sala 2":
                return 1;
            case "sala 3":
                return 2;
            default:
                return -1;
        }
    }
}