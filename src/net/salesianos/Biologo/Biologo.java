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

}
