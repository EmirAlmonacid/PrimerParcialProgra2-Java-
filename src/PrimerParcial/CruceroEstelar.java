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
public class CruceroEstelar extends Nave {
        int cantidadPasajeros;
        
    public CruceroEstelar(String nombre, double capacidad, LocalDate anioLanzamiento, int cantidadPasajero) {
        super(nombre, capacidad, anioLanzamiento);
    }

    @Override
    public void explorar() {
        System.out.println("Las Naves CruceroEstelar no pueden explorar");
    }
    
}
