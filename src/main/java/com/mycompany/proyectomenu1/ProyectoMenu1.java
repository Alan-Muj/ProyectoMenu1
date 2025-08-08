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
    static Scanner scanner=new Scanner(System.in);
    
    public static void main(String[] args) {
        Vector<String> NombrePersonajes = new Vector<>();
        Vector<String> NombreArmas = new Vector<>();
        Vector<String> HabilidadesPersonajes = new Vector<>();
        System.out.println("Gestion de Personajes");
        System.out.println("1. Agregar Personaje");
        System.out.println("2. Editar Personaje");
        System.out.println("3. Eliminar Personaje");
        System.out.println("4. Salir");
        
        System.out.println("Elige una opcion:");
        int opcion=0;
        
        do{
        opcion=scanner.nextInt();
            switch(opcion) {
                case 1 :
                    do{
                        System.out.println("Ingresar nombre del personaje");
                        String nombre = scanner.nextLine();
                        NombrePersonajes.add(nombre);
                        
                        System.out.println("Ingresar arma del personaje");
                        String arma = scanner.nextLine();
                        NombreArmas.add(arma);
                        
                        System.out.println("Ingresar habilidades del personaje del personaje");
                        String habilidad = scanner.nextLine();
                        HabilidadesPersonajes.add(habilidad);
                        
                        System.out.println("1. Agregar otro personaje?") ;
                        System.out.println("2. Atras") ;
                        
                        break;
        
                    }while(opcion!=2) ;
                
                
                
            }
            
        }while(opcion!=4);
        
         
        
        
                                
    }

    
    
    
}
