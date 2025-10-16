/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerParcial;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author emira
 */
public class Menu {
     AgenciaNaves agencia = new AgenciaNaves();
     
    public void menuPrincipal(){
         Scanner sc = new Scanner(System.in);
         int opcion;
         
         do{
            System.out.println("------MENU CUENTA AGENCIA NAVE------");
            System.out.println("[1] Agregar naves");
            System.out.println("[2] Mostrar Naves");
            System.out.println("[3] Iniciar Exploracion de Naves");
            System.out.println("[4] Salir");
            System.out.print("Elegí una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion){
                case 1 -> {
                    menuAgregarNave();
                }
                case 2 -> {
                    agencia.mostrarNaves();
                }
                case 3 -> {
                    agencia.iniciarExploracion();
                }
                case 4 -> {
                    opcion = 4;
                }
            }
            
         }
         while (opcion != 4);
                 
    }

    public void menuAgregarNave(){
        Scanner sc = new Scanner(System.in);
        
        
         System.out.println("Ingrese la opcion de tipo de nave?");
         System.out.println("[1]Carguero");
         System.out.println("[2]Crucero Estelar");
         System.out.println("[3]Nave de Exploracion");
         int opcion = sc.nextInt();
         sc.nextLine();
        
         System.out.println("¿Como se llama la nave?");
         String nombre = sc.nextLine();  
         
         System.out.println("¿Ingrese su capacidad en numeros?");
         double capacidad = sc.nextDouble();  
         
         System.out.println("[Año de Lanzamiento:");
        int anio = sc.nextInt();

        System.out.println("[Mes de Lanzamiento:");
        int mes = sc.nextInt();

        System.out.println("Día de Lanzamiento:");
        int dia = sc.nextInt();

        LocalDate fechaLanzamiento = LocalDate.of(anio, mes, dia);
        
        
        if (opcion == 1) {
            System.out.println("Ingrese la capacidad de Carga en toneladas:");
            int cargaToneladas = sc.nextInt();

            Carguero nuevaNave = new Carguero(nombre, capacidad, fechaLanzamiento, cargaToneladas);
            try {
                agencia.agregarNave(nuevaNave);
            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        }
        
        if (opcion == 2 ){
            System.out.println("Ingrese la cantidad de pasajeros:");
            int cantidadPasajeros = sc.nextInt();
            
            CruceroEstelar nuevaNave = new CruceroEstelar(nombre, capacidad, fechaLanzamiento, cantidadPasajeros);
            
            try {
                agencia.agregarNave(nuevaNave);
            }
            catch (Exception e){
                 System.out.println("❌ Error: " + e.getMessage());
            }
        }
        
        if (opcion == 3){
            System.out.println("Ingrese el tipo de mision  "
                    + "- CARTOGRAFIA"
                    + "- INVESTIGACION"
                    + "- CONTACTO");
            }
        
            String mision = sc.nextLine().toUpperCase(); 
            NaveExploracion.tipoMision tipoMision = NaveExploracion.tipoMision.valueOf(mision); 
            
            NaveExploracion nuevaNave = new NaveExploracion(nombre, capacidad, fechaLanzamiento, tipoMision);
            
            try{
                agencia.agregarNave(nuevaNave);
            }
            catch (Exception e){
                System.out.println("❌ Error: " + e.getMessage());
            }
            
    }
}
