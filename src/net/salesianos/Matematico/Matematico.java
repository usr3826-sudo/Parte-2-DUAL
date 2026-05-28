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
    
}