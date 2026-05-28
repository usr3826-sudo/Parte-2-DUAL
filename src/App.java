import net.salesianos.Biologo.Biologo;
import net.salesianos.Matematico.Matematico;
import net.salesianos.Quimico.Quimico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        Matematico m = new Matematico("Ana", 1700, matriz);
        Biologo b = new Biologo("Luis", 1400);
        Quimico q = new Quimico("Marta", 1100);

        boolean salir = false;

        while (!salir) {
            try {
                System.out.println("\n--- MENÚ PRINCIPAL ---");
                System.out.println("1. Matemático");
                System.out.println("2. Biólogo");
                System.out.println("3. Químico");
                System.out.println("4. Salir");
                System.out.print("Opción: ");

                int op = sc.nextInt();
                sc.nextLine();
                switch (op) {
                    case 1:
                        menuMatematico(m, sc);
                        break;

                    case 2:
                        menuBiologo(b, sc);
                        break;

                    case 3:
                        menuQuimico(q, sc);
                        break;

                    case 4:
                        salir = true;
                        break;

                    default:
                        System.out.println("Opción inválida.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un número.");
                sc.nextLine();
            }
        }

        System.out.println("Programa finalizado.");
    }

    private static void menuMatematico(Matematico m, Scanner sc) {
        System.out.println("\n--- MENÚ MATEMÁTICO ---");
        m.identificacion();
        System.out.println(m.estadoSueldo());
        m.trabajar();
    }

    private static void menuBiologo(Biologo b, Scanner sc) {
        System.out.println("\n--- MENÚ BIÓLOGO ---");
        b.identificacion();
        b.anadir("ratón");
        b.anadir("elefante");
        b.anadir("pez");
        b.trabajar();
        b.trabajoDual();
        System.out.println(b.getEspecimenes());
    }

    private static void menuQuimico(Quimico q, Scanner sc) {
        System.out.println("\n--- MENÚ QUÍMICO ---");
        q.identificacion();
        q.anadir("H2O");
        q.anadir("NaCl");
        q.anadir("C6H12O6");
        q.trabajar();
        q.trabajoDual();
        System.out.println(q.getElementos());
    }
}
