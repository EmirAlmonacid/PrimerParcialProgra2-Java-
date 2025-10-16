/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerParcial;

import java.util.ArrayList;

/**
 *
 * @author emira
 */
public class AgenciaNaves {
     ArrayList<Nave> naves = new ArrayList<>();
     
        public void agregarNave(Nave nave) throws Exception {
            for (Nave n : naves) {
                if (n.getNombre().equalsIgnoreCase(nave.getNombre()) &&
                    n.getAnioLanzamiento().equals(nave.getAnioLanzamiento())) {
                    throw new Exception("Ya existe una nave con ese nombre y año de lanzamiento");
                }
            }
            naves.add(nave);
            System.out.println("Nave Añadida con Exito");
        }
        
        public void mostrarNaves() {
            for (Nave n : naves) {
                System.out.println("Nombre: " + n.getNombre() +
                                   ", Capacidad: " + n.getCapacidad() +
                                   ", Año lanzamiento: " + n.getAnioLanzamiento());
            }
    }
        
        public void iniciarExploracion(){
            for (Nave n : naves){
                n.explorar();
            }
        }

}
