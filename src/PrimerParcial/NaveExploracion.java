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
public class NaveExploracion extends Nave {

    enum tipoMision {
        CARTOGRAFIA,
        INVESTIGACION,
        CONTACTO
    }
            
    public NaveExploracion(String nombre, double capacidad, LocalDate anioLanzamiento, tipoMision tipoMision) {
        super(nombre, capacidad, anioLanzamiento);
    }
    
        @Override
    public void explorar() {
       System.out.println("Explorando");
    }
    
}
