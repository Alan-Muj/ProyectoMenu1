/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectomenu1;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author pc1
 */
public class ProyectoMenu1 {

    
    public static void main(String[] args) {
        Vector<String> NombresPersonajes = new Vector<>();
        Vector<String> ArmasPersonajes = new Vector<>();
        Vector<String> HabilidadesPersonajes = new Vector<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Gestion de Personajes");
        System.out.println("1. Agregar Personaje");
        System.out.println("2. Editar Personaje");
        System.out.println("3. Eliminar Personaje");
        
        
        System.out.println("Elige una opcion:");
        int opcion=scanner.nextInt();
        
        switch(opcion) {
            case 1:
                System.out.println("AGEGAR PERSONAJE");
                System.out.println("1. Ingresar nombre del personaje");
                    personaje();    
                    
                System.out.println("2. Ingresar arma del personaje");
                    arma();
                    
                System.out.println("3. Ingresar habilidad del personaje");
                    habilidad();
                
                System.out.println("4. Ingresar Nivel de poder del personaje");
                    nivel();
                        break;   
                        
                        }
    }

    private static void personaje() {
        
    }
    private static void arma() {
        
    }
    private static void habilidad() {
        
    }
    private static void nivel() {
        
    }
}
