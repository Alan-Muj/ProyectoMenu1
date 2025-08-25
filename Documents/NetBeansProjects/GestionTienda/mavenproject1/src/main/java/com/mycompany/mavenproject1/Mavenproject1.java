/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author pc1
 */
public class Mavenproject1 {
    
static Scanner scanner=new Scanner(System.in);
int contador = 0 ;


    public static void main(String[] args) {
        String[] NombreUsuario = new String[25] ; //Vector para usuario
        String[] CarnetUsuario = new String[25] ; //Vector para carnet usuario
        int contador = 0 ;
        int opcion = 0 ;
        
        System.out.println("-----GESTION DE PRODUCTOS-----");
        System.out.println("Ingresar nombre de ususario");
        NombreUsuario [contador] = scanner.nextLine().strip() ;
        System.out.println("Ingresar Canret");
        CarnetUsuario [contador] = scanner.nextLine().strip() ;
            do{
                
            }while(opcion != 9) ;
        
    }//Fin public static void main
}//Fin public class
