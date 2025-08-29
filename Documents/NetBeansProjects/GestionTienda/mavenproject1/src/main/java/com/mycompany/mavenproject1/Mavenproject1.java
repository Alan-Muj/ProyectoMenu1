/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc1
 */
public class Mavenproject1 {
    static String Nombre ;
    static String Categoria ;
    static double Precio ;
    static double Stock ;
    static String CUnico ; //Variable para codigo repetido
    
    static int contador = 0 ;    
    static Scanner scanner=new Scanner(System.in);
    static String[] NombreUsuario = new String[25] ; //Vector para usuario
    static String[] CarnetUsuario = new String[25] ; //Vector para carnet usuario
    static String[] NombreProducto = new String[25] ; //Vector para nombres de producto
    static String[] CategoriaProducto = new String[25] ; //Vector para categorias de producto
    static double[] Precios = new double[25] ; //Vector para precios producto
    static double[] CantidadStock = new double[25] ; //Vector para stock producto
    static String[] CodigoUnico = new String[25] ; //Vector para código único producto
    static int opcion = 0 ; //Contador para vectores
    
    
    public static void main(String[] args) {
        
        System.out.println("-----GESTION DE PRODUCTOS-----");
        System.out.println("Ingresar nombre de ususario");
        NombreUsuario [contador] = scanner.nextLine().strip() ;
        System.out.println("Ingresar Carnet");
        CarnetUsuario [contador] = scanner.nextLine().strip() ;
            do{
                System.out.println("-----MENU GESTION DE PRODUCTOS-----");
                System.out.println("1. Agregar Producto");
                System.out.println("2. Bucar Producto");
                System.out.println("3. Eliminar Producto");
                System.out.println("4. Registrar Venta");
                System.out.println("5. Generar Reportes");
                System.out.println("6. Ver Datos del Estudiante");
                System.out.println("7. Bitacora");
                System.out.println("8. Salir");
                opcion = scanner.nextInt() ;
            switch (opcion) {
                case 1:                    
                        Caso1 () ;
                        
                    
                       
               
            }  //Fin switch  

            
            
                
            }while(opcion != 8) ;
        
    }//Fin public static void main
    
    //Metodo caso 1
    @SuppressWarnings("empty-statement")
    static public void Caso1 ()  { //Inicio caso 1
        do{
                    scanner.nextLine();
                    System.out.println("---AGREGAR PRODUCTO---");
                    
                    System.out.println("Ingresar Nombre del Producto");                   
                    NombreProducto [contador] = scanner.nextLine().strip();
                   
                    System.out.println("Ingresar Categoría del producto");
                    CategoriaProducto [contador] = scanner.nextLine().strip() ;
                    
                    do {
                    System.out.println("Ingresar Precio del producto");
                    Precio = scanner.nextDouble() ;
                   if ( Precio < 0) {
                       System.out.println("EL PRECIO NO PUEDE SER NEGATIVO");
                    } else {
                       Precios [contador] = Precio ;
                          }
                    }while (Precio < 0) ;
                    scanner.nextLine(); 
                    
                    do {
                    System.out.println("Ingresar cantidad en Stock");
                    Stock = scanner.nextDouble() ;
                   if ( Stock < 0) {
                       System.out.println("EL CANTIDAD DE STOCK NO PUEDE SER NEGATIVA");
                    } else {
                       CantidadStock [contador] = Stock ;
                          }
                    }while (Stock < 0) ;
                    scanner.nextLine();                 
                     
                    boolean CodigoRepetido;
                    do{
                        CodigoRepetido = false;                  
                        System.out.println("Ingresar Codgio Unico del Producto:");
                        CUnico = scanner.nextLine().strip();
                        for (int i = 0; i < contador; i++) {
                                if (CodigoUnico[i] != null && CodigoUnico[i].equalsIgnoreCase(CUnico)) {
                                    CodigoRepetido = true;
                                    System.out.println("CODIGO UNICO REPETIDO");
                                    break;
                                }
                            }
                        } while (CodigoRepetido);
                        CodigoUnico[contador] = CUnico;
                    contador++;
                    System.out.println("1. Agregar otro Producto");
                    System.out.println("2. Retroceder");
                    opcion = scanner.nextInt() ;
                    
        }while(opcion != 2) ;        
                    
} //Fin caso 1
    
    
    
    
}//Fin public class


 




