package udla.jaimeh.rp1.p;
import udla.jaimeh.rp1.pc.Gato;
import udla.jaimeh.rp1.pc.Perro;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static List<Perro> listaPerros= new ArrayList<>();
    private static List<Gato> listaGatos= new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opc = 0;
        do {
            mostrarMenu();
            if(scanner.hasNextInt()){
                opc = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                switch (opc) {
                    case 1:
                        registrarPerro();
                        break;
                    case 2:
                        registrarGato();
                        break;
                    case 3:
                        eliminarPerro();
                        break;
                    case 4:
                        eliminarGato();
                        break;
                    case 5:
                        mostrartodo();
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpiar el buffer
                opc=0;
            }
        } while (opc != 6);


    }
    private static void mostrarMenu() {
        System.out.println("----- Menú de Gestión de Animales -----");
        System.out.println("1. Agregar Perro");
        System.out.println("2. Agregar Gato");
        System.out.println("3. Eliminar Perro");
        System.out.println("4. Eliminar Gato");
        System.out.println("5. Mostrar todos");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }
    private static void registrarPerro() {
        System.out.println("----- Registrar Perro -----");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Especie: ");
        String especie = scanner.nextLine();
        System.out.print("Dueño: ");
        String dueno = scanner.nextLine();
        System.out.print("Raza: ");
        String raza = scanner.nextLine();
        System.out.print("Tamaño: ");
        String tamano = scanner.nextLine();
        System.out.print("¿Vacunas al día? (true/false): ");
        boolean vacunaldia = scanner.nextBoolean();
        scanner.nextLine();
        Perro nuevoPerro = new Perro(nombre, edad, especie, dueno, 1, vacunaldia, tamano, raza);
        listaPerros.add(nuevoPerro);
        System.out.println("Perro registrado con éxito.");
        System.out.println("\n Perro ingresado con éxito. ID asignado: " + nuevoPerro.getId());
    }
    private static void registrarGato() {
        System.out.println("----- Registrar Gato -----");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Especie: ");
        String especie = scanner.nextLine();
        System.out.print("Dueño: ");
        String dueno = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("¿Es interior? (true/false): ");
        boolean esinterior = scanner.nextBoolean();
        scanner.nextLine();
        Gato nuevoGato = new Gato(nombre, edad, especie, dueno, 1, color, esinterior);
        listaGatos.add(nuevoGato);
        System.out.println("Gato registrado con éxito.");
        System.out.println("\n Gato ingresado con éxito. ID asignado: " + nuevoGato.getId());
    }
    private static void eliminarPerro() {
        if(listaPerros.isEmpty()){
            System.out.println("No hay perros registrados.");
            return;
        }
        System.out.println("----- Eliminar Perro -----");
        int ideliminar=scanner.nextInt();
        scanner.nextLine();
        boolean encontrado=false;
        for (int i = 0; i < listaPerros.size(); i++) {
            if(listaPerros.get(i).getId()==ideliminar){
                listaPerros.remove(i);
                encontrado=true;
                System.out.println("Perro eliminado con éxito.");
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se encontró un perro con el ID proporcionado.");
        }

    }
    private static void eliminarGato() {
        if(listaGatos.isEmpty()){
            System.out.println("No hay gatos registrados.");
            return;
        }
        System.out.println("----- Eliminar Gato -----");
        int ideliminar=scanner.nextInt();
        scanner.nextLine();
        boolean encontrado=false;
        for (int i = 0; i < listaGatos.size(); i++) {
            if(listaGatos.get(i).getId()==ideliminar){
                listaGatos.remove(i);
                encontrado=true;
                System.out.println("Gato eliminado con éxito.");
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se encontró un gato con el ID proporcionado.");
        }

    }
    private static void mostrartodo() {
        System.out.println("----- Lista de Perros -----");
        if(listaPerros.isEmpty()){
            System.out.println("No hay perros registrados.");
        }else{
            for (Perro perro : listaPerros) {
                perro.mostrarInfoPerro();
                System.out.println("-------------------------");
            }
        }
        System.out.println("----- Lista de Gatos -----");
        if(listaGatos.isEmpty()){
            System.out.println("No hay gatos registrados.");
        }else{
            for (Gato gato : listaGatos) {
                gato.mostrarInfoGato();
                System.out.println("-------------------------");
            }
        }
    }



}