/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectomenu1;

import java.util.Scanner;


/**
 *
 * @author pc1
 */
public class ProyectoMenu1 {
    static Scanner scanner=new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion = 0 ;
        String[] NombrePersonaje = new String[25] ;
        String [] NombreArmaPersonaje = new String [25] ;
        String [] HabilidadesPersonaje = new String [25] ;
     do{
            System.out.println("Gestion de Personajes");
            System.out.println("1. Agregar Personaje");
            System.out.println("2. Editar Personaje");
            System.out.println("3. Eliminar Personaje");
            System.out.println("4. Salir");
            System.out.println("Elege una opcion");
            opcion = scanner.nextInt();
            
        switch(opcion) {
            case 1 :
                do{
                    System.out.println("AGREGAR PERSONAJE");
                    for(int i=0;i<1; i++){
                        System.out.println("Ingresar nombre del personaje");
                        NombrePersonaje[i] = scanner.next().strip() ;
                    }
                    
                    for(int i=0;i<1; i++){
                        System.out.println("Ingresar nombre del arma del personaje");
                        NombreArmaPersonaje[i] = scanner.next().strip() ;
                    }
  
                    for(int i=0;i<5; i++){
                        System.out.println("Ingresar habilidades del personaje (Max. 5)");
                        HabilidadesPersonaje[i] = scanner.next().strip() ;
                    }
                    
                  System.out.println("El nombre del personaje");  
                  for(int i=0;i<1; i++){
                        System.out.println(NombrePersonaje[i]);
                        NombrePersonaje[i] = scanner.next().strip() ;
                    }
                  
                  System.out.println("El nombre del arma del personaje");  
                  for(int i=0;i<1; i++){
                        System.out.println(NombreArmaPersonaje[i]);
                        NombrePersonaje[i] = scanner.next().strip() ;
                    }
                  
                  System.out.println("Las habilidades del personaje");  
                  for(int i=0;i<5; i++){
                        System.out.println(HabilidadesPersonaje[i]);
                        NombrePersonaje[i] = scanner.next().strip() ;
                    }
                  
                  System.out.println("1. Agregar otro personaje");
                    System.out.println("2. Retroceder");
                    opcion = scanner.nextInt();
                }while(opcion != 2) ; //Final de caso 1
                
                
                
                
        } //Fin switch    
            
            
        }while(opcion != 4) ;  //Fin do principal1
                                
    } // Final public static void

    
    
} // Final public class
