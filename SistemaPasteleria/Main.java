package SistemaPasteleria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Disponibilidad disponibilidad = new Disponibilidad();
        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        // Solicitar tipo de postre
        System.out.println("Seleccione el tipo de postre:");
        System.out.println("1. Helado");
        System.out.println("2. Cupcake");
        System.out.println("3. Pastel");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        String tipoPostre;
        switch (opcion) {
            case 1:
                tipoPostre = "Helado";
                break;
            case 2:
                tipoPostre = "Cupcake";
                break;
            case 3:
                tipoPostre = "Pastel";
                break;
            default:
                System.out.println("Opción no válida. Seleccionando Helado por defecto.");
                tipoPostre = "Helado";
                break;
        }

        // cantidad de postres
        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // sabor del postre
        String sabor = null; // Inicializar sabor como null
        do {
            System.out.println("Ingrese el sabor adicional: ");
            System.out.println("1. Vainilla");
            System.out.println("2. Chocolate");
            System.out.println("3. Fresa");
            System.out.println("4. Limón");
            System.out.println("5. Naranja");
            int saboropcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        
            switch (saboropcion) {
                case 1:
                    sabor = "Vainilla";
                    break;
                case 2:
                    sabor = "Chocolate";
                    break;
                case 3:
                    sabor = "Fresa";
                    break;
                case 4:
                    sabor = "Limón";
                    break;
                case 5:
                    sabor = "Naranja";
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
            if (!disponibilidad.esSaborDisponible(sabor)) {
                System.out.println("Lo sentimos, actualmente el sabor seleccionado no está disponible. Por favor, elija otro de la lista.");
            }
            if (disponibilidad.esSaborDisponible(sabor)) {
                System.out.println("El sabor seleccionado esta disponible");
            }
        } while (!disponibilidad.esSaborDisponible(sabor)); // Repetir este proceso mientras el sabor no esté disponible
        
        // Solicitar ingrediente adicional (opcional)
        String ingrediente = null; // Inicializar ingrediente como null
        System.out.println("¿Desea agregar un ingrediente adicional: ");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.print("Opción: ");
        int respuesta = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        if (respuesta == 1) {
            do {
                System.out.println("Ingrese el ingrediente adicional: ");
                System.out.println("1.Chispas de chocolate");
                System.out.println("2.Sirope de caramelo");
                System.out.println("3.Nueces");
                System.out.println("4.Mermelada");
                int ingredienteopcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
        
                switch (ingredienteopcion) {
                    case 1:
                        ingrediente = "Chispas de chocolate";
                        break;
                    case 2:
                        ingrediente = "Sirope de caramelo";
                        break;
                    case 3:
                        ingrediente = "Nueces";
                        break;
                    case 4:
                        ingrediente = "Mermelada";
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        break;
                }
                if (!disponibilidad.esIngredienteDisponible(ingrediente)) {
                    System.out.println("Lo sentimos, actualmente el ingrediente seleccionado no está disponible. Por favor, elija otro de la lista.");
                }
                if (disponibilidad.esIngredienteDisponible(ingrediente)) {
                    System.out.println("El ingrediente seleccionado ha sido añadido");
                }
            } while (!disponibilidad.esIngredienteDisponible(ingrediente)); // Repetir este proceso mientras el ingrediente no esté en la lista
        }

        // Mostrar factura del pedido
        System.out.println("\nResumen del pedido:");
        System.out.println("Usuario: " + usuario);
        System.out.println("Tipo de postre: " + tipoPostre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Sabor: " + sabor);
        if (ingrediente != null) {
            System.out.println("Ingrediente adicional: " + ingrediente);
        } else {
            System.out.println("Sin ingrediente adicional.");
        }

    }
}
