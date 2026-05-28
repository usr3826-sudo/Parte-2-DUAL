package net.salesianos.Matematico;
import net.salesianos.Investigador.Investigador;

public class Matematico extends Investigador {

    private int[][] matriz;

     public Matematico(String nombre, double sueldo, int[][] matriz) {
        super(nombre, "Matemático", sueldo); // especialidad fija
        this.matriz = matriz;
    }
}