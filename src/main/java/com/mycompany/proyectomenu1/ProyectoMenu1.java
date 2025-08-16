/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectomenu1;


import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author pc1
 */
public class ProyectoMenu1 {
    static Scanner scanner=new Scanner(System.in);
    Random random = new Random();
    public static void main(String[] args) {
        int opcion = 0 ;
        int contador = 0 ;
        int fuerza = 1 ;
        String nombrebuscado;
        
        
        String[] NombrePersonaje = new String[25] ;
        String [] NombreArmaPersonaje = new String [25] ;
        String [][] HabilidadesPersonaje = new String [25][5] ;
        int [] NivelFuerza = new int [25];
     do{
            System.out.println(" ---GESTION DE PERSONAJES--- ");
            System.out.println("1. Agregar Personaje");
            System.out.println("2. Editar Personaje");
            System.out.println("3. Eliminar Personaje");
            System.out.println("4. Ver datos de un personaje");
            System.out.println("5. Ver listado de personajes");
            System.out.println("6. Realizar pelea entre personajes");
            System.out.println("7. Ver historial de peleas");
            System.out.println("8. Ver datos de estudiante");
            System.out.println("9. Salir");
            System.out.println("Elege una opcion:");
            opcion = scanner.nextInt();
            
        switch(opcion) {
            case 1 :
                do{
             
                    scanner.nextLine();
                    System.out.println(" --- AGREGAR PERSONAJE --- ");
                    String nombre;
                    boolean nombreRepetido;
                    do{
                        nombreRepetido = false;                  
                        System.out.println("Ingresar nombre del personaje:");
                        nombre = scanner.nextLine().strip();
                        for (int i = 0; i < contador; i++) {
                                if (NombrePersonaje[i] != null && NombrePersonaje[i].equalsIgnoreCase(nombre)) {
                                    nombreRepetido = true;
                                    System.out.println("Nombre no disponible, Ingrese otro.");
                                    break;
                                }
                            }
                        } while (nombreRepetido);
                        NombrePersonaje[contador] = nombre;
                        
                    scanner.nextLine();    
                    
                        System.out.println("Ingresar nombre del arma del personaje:");
                        NombreArmaPersonaje[contador] = scanner.nextLine().strip() ;   
                      
                    scanner.nextLine();    
                    for(int j=0;j<5; j++){
            
                        System.out.println("Ingresar habilidades del personaje (Max. 5) ó 'Continuar' para finalizar");
                        String Habilidad = scanner.nextLine().strip();
                        if (Habilidad.equalsIgnoreCase("Continuar")) {
                                break;
                            }
                        HabilidadesPersonaje[contador][j] = Habilidad;
                    }
                    System.out.println("--PERSONAJE AGREGADO CORRECTAMENTE--");
                    fuerza = new Random().nextInt(100);
                    System.out.println("El nivel de fuerza es: " + fuerza);
                    System.out.println("1. Agregar otro personaje");
                    System.out.println("2. Retroceder");
                    NivelFuerza[contador] = scanner.nextInt();
                    contador++;
                    opcion = scanner.nextInt();
                }while(opcion != 2) ; //Final de caso 1
            
            case 2 :
                do{
                System.out.println("--- MODIFICAR PERSONAJE ---");
                System.out.println("Ingresar nombre de personaje a modificar: "); 
                nombrebuscado = scanner.nextLine().strip();
                
                int i = 0;
                }while(opcion !=2) ;
                
                
                
    
        } //Fin switch    
            
            
        }while(opcion != 9) ;  //Fin do principal1
                                
    } // Final public static void main
    
   
   
    
    
} // Final public class
