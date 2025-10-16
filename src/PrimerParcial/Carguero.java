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
public class Carguero extends Nave {
        
        double capacidadCarga;
        
    public Carguero(String nombre, double capacidad, LocalDate anioLanzamiento, double capacidadCarga) {
        super(nombre, capacidad, anioLanzamiento);
    }

    @Override
    public void explorar() {
        System.out.println("Explorando");
    }
    
}
