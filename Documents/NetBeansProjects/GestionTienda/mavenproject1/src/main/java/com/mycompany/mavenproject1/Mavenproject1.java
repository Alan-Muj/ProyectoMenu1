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
        String[] NombreProducto = new String[25] ; //Vector para nombres de producto
        String[] CategoriaProducto = new String[25] ; //Vector para categorias de producto
        String[] Precios = new String[25] ; //Vector para precios producto
        String[] Stock = new String[25] ; //Vector para stock producto
        String[] CodigoUnico = new String[25] ; //Vector para código único producto
        int contador = 0 ;
        int opcion = 0 ;
        
        System.out.println("-----GESTION DE PRODUCTOS-----");
        System.out.println("Ingresar nombre de ususario");
        NombreUsuario [contador] = scanner.nextLine().strip() ;
        System.out.println("Ingresar Canret");
        CarnetUsuario [contador] = scanner.nextLine().strip() ;
            do{
                System.out.println("-----MENU GESTIÓN DE PRODUCTOS-----");
                System.out.println("1. Agregar Producto");
                System.out.println("2. Bucar Producto");
                System.out.println("3. Eliminar Producto");
                System.out.println("4. Registrar Venta");
                System.out.println("5. Generar Reportes");
                System.out.println("6. Ver Datos del Estudiante");
                System.out.println("7. Bitácora");
                System.out.println("8. Salir");
                opcion = scanner.nextInt() ;
            switch (opcion) {
                case 1:
                    System.out.println("---AGREGAR PRODUCTO---");
                    System.out.println("Ingesar Nombre del Producto");
                    NombreProducto [contador] = scanner.nextLine().strip();
                    System.out.println("Ingresar Categoría del producto");
                    CategoriaProducto [contador] = scanner.nextLine().strip() ;
                    System.out.println("Ingresar Precio del prducto");
                    Precios [contador] = scanner.nextLine().strip() ;
                    System.out.println("Ingresar cantidad en Stock");
                    Stock [contador] = scanner.nextLine().strip() ;
                    System.out.println("Ingresar Código Único del Producto");
                    CodigoUnico [contador] = scanner.nextLine().strip();                  
            }    


                
            }while(opcion != 8) ;
        
    }//Fin public static void main
}//Fin public class
