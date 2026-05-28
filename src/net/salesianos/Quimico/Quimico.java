package net.salesianos.Quimico;

import net.salesianos.Investigador.Investigador;
import net.salesianos.TrabajoDual.TrabajoDual;
import java.util.ArrayList;
import java.util.Collections;

public class Quimico extends Investigador implements TrabajoDual {

    private ArrayList<String> elementos = new ArrayList<>();

    public Quimico(String nombre, double sueldo) {
        super(nombre, "Químico", sueldo);
    }

    public void anadir(String e) {
        elementos.add(e);
    }

    @Override
    public String estadoSueldo() {
        return sueldo < 1200 ? "Debe pedir aumento." : "Sueldo correcto.";
    }

    @Override
    public void trabajar() {
        System.out.println("Químico trabajando → invirtiendo elementos");
        Collections.reverse(elementos);
    }

    @Override
    public void trabajoDual() {
        System.out.println("Químico en trabajo dual → ordenando y eliminando mayor");
        elementos.sort((a, b) -> a.length() - b.length());
        elementos.remove(elementos.size() - 1);
    }

    public ArrayList<String> getElementos() {
        return elementos;
    }
}
