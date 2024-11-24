package Vista;

import Controlador.GestionLenguaje;

import java.util.Scanner;

public class SistemaRegistro {
    public static void main(String[] args) {
        SistemaRegistro sistema = new SistemaRegistro();
        sistema.menu();
    }

    private void menu() {
        GestionLenguaje gestionLenguaje = new GestionLenguaje();
        Scanner lector = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Agregar lenguaje");
            System.out.println("2. Buscar lenguaje");
            System.out.println("3. Eliminar lenguaje");
            System.out.println("4. Listar lenguajes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Anio de creación: ");
                    int anio = lector.nextInt();
                    lector.nextLine(); // Consumir nueva línea
                    System.out.print("Caracteristica principal: ");
                    String caracteristica = lector.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = lector.nextLine();
                    System.out.print("Utilizacion: ");
                    String utilizacion = lector.nextLine();
                    gestionLenguaje.agregarLenguaje(anio, caracteristica, nombre, utilizacion);
                    System.out.println("Lenguaje agregado exitosamente.");
                }
                case 2 -> {
                    System.out.print("Nombre del lenguaje: ");
                    String nombre = lector.next();
                    var lenguaje = gestionLenguaje.buscarLenguaje(nombre);
                    if (lenguaje != null) {
                        System.out.println(lenguaje);
                    } else {
                        System.out.println("Lenguaje no encontrado.");
                    }
                }
                case 3 -> {
                    System.out.print("Nombre del lenguaje: ");
                    String nombre = lector.next();
                    if (gestionLenguaje.eliminarLenguaje(nombre)) {
                        System.out.println("Lenguaje eliminado exitosamente.");
                    } else {
                        System.out.println("Lenguaje no encontrado.");
                    }
                }
                case 4 -> gestionLenguaje.imprimirLenguajes();
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opcion inválida.");
            }
        } while (opcion != 5);
    }
}