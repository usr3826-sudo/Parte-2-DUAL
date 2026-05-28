package net.salesianos.Matematico;

import net.salesianos.Investigador.Investigador;

public class Matematico extends Investigador {

    private int[][] matriz;

    public Matematico(String nombre, double sueldo, int[][] matriz) {
        super(nombre, "Matemático", sueldo); // especialidad fija
        this.matriz = matriz;
    }

    @Override
    public String estadoSueldo() {

        return sueldo < 1800 ? "Debe pedir aumento." : "Sueldo correcto.";
    }

    @Override
    public void trabajar() {
        System.out.println("Mostrando matriz actual:");
        mostrarMatriz();
    }

    public void trabajar(int n) {
        System.out.println("Multiplicando matriz por " + n);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= n;
            }
        }
    }

    public void trabajar(int[][] otra) {
        System.out.println("Sumando matrices...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] += otra[i][j];
            }
        }
    }

    private void mostrarMatriz() {
        for (int[] fila : matriz) {
            for (int n : fila) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
