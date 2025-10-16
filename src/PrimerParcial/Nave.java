/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerParcial;

import java.time.LocalDate;

/**
 *
 * @author emira
 */
abstract public class Nave {
    String nombre;
    double capacidad;
    private LocalDate anioLanzamiento; 

    public Nave(String nombre, double capacidad, LocalDate anioLanzamiento) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

   public LocalDate getAnioLanzamiento() {
    return anioLanzamiento;
}

    public void setAniolanzamiento(LocalDate aniolanzamiento) {
        this.anioLanzamiento = aniolanzamiento;
    }
    
    
    
    public abstract void explorar();

    
}
