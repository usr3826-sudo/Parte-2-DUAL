package net.salesianos.Investigador;

public abstract class Investigador {

    protected String nombre;        
    protected String especialidad;  
    protected double sueldo;  
    
     public Investigador(String nombre, String especialidad, double sueldo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

      public void identificacion() {
        System.out.println("----- IDENTIFICACIÓN -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Sueldo: " + sueldo + "€");
    }
    
}
