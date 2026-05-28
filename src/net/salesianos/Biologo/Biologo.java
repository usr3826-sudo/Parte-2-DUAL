package net.salesianos.Biologo;

import net.salesianos.Investigador.Investigador;
import net.salesianos.TrabajoDual.TrabajoDual;
import java.util.ArrayList;
import java.util.Collections;

public class Biologo extends Investigador implements TrabajoDual {

    private ArrayList<String> especimenes = new ArrayList<>();

    public Biologo(String nombre, double sueldo) {
        super(nombre, "Biólogo", sueldo);
    }

    public void anadir(String esp) {
        especimenes.add(esp);
    }

    @Override
    public String estadoSueldo() {

        return sueldo < 1500 ? "Debe pedir aumento." : "Sueldo correcto.";
    }

    @Override
    public void trabajar() {
        if (especimenes.isEmpty()) {
            System.out.println("No hay especímenes.");
            return; 
        }

        especimenes.sort((a, b) -> a.length() - b.length());
        
        String eliminado = especimenes.remove(especimenes.size() - 1);

        System.out.println("Eliminado el espécimen más largo: " + eliminado);
    }

}
