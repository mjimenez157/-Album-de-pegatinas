package paq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Album album = new Album();

        int opcion;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Agregar pegatina");
            System.out.println("2. Mostrar album");
            System.out.println("3. Buscar pegatina");
            System.out.println("4. Agregar pegatina especial");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Equipo: ");
                    String equipo = sc.nextLine();

                    System.out.print("Jugador: ");
                    String jugador = sc.nextLine();

                    System.out.print("Numero: ");
                    int numero = sc.nextInt();

                    Pegatina p = new Pegatina(
                            equipo,
                            jugador,
                            false,
                            numero
                    );

                    album.agregarPegatina(p);

                    System.out.println("Pegatina agregada");
                    break;

                case 2:

                    album.mostrarAlbum();
                    break;

                case 3:

                    System.out.print("Numero a buscar: ");
                    int buscar = sc.nextInt();

                    Pegatina encontrada = album.buscarPegatina(buscar);

                    if (encontrada != null) {
                        System.out.println(encontrada);
                    } else {
                        System.out.println("No encontrada");
                    }

                    break;

                case 4:

                    System.out.print("Equipo: ");
                    String eq = sc.nextLine();

                    System.out.print("Jugador: ");
                    String jug = sc.nextLine();

                    System.out.print("Numero: ");
                    int num = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Rareza: ");
                    String rareza = sc.nextLine();

                    PegatinaEspecial pe =
                            new PegatinaEspecial(eq, jug, num, rareza);

                    album.agregarPegatina(pe);

                    System.out.println("Pegatina especial agregada");

                    break;

                case 5:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 5);
    }
}
