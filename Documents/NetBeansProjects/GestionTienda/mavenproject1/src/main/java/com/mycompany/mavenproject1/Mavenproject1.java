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
    static String Dato ; //Variabel para buscar nombre
    static int contador = 0 ;    
    static Scanner scanner=new Scanner(System.in);
    static String[] NombreUsuario = new String[10] ; //Vector para usuario
    static String[] CarnetUsuario = new String[10] ; //Vector para carnet usuario
    static String[] NombreProducto = new String[25] ; //Vector para nombres de producto
    static String[] CategoriaProducto = new String[25] ; //Vector para categorias de producto
    static double[] Precios = new double[25] ; //Vector para precios producto
    static double[] CantidadStock = new double[25] ; //Vector para stock producto
    static String[] CodigoUnico = new String[25] ; //Vector para código único producto
    static int opcion = 0 ; //Contador para vectores
    
    
    public static void main(String[] args) {
        
        System.out.println("-----GESTION DE PRODUCTOS-----");
        System.out.println("INGRESAR NOMBRE DE USUARIO");
        NombreUsuario [contador] = scanner.nextLine().strip() ;
        System.out.println("INGRESAR CARNET");
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
                        break;
                case 2:    
                       Caso2 () ;
                       break;
            }  //Fin switch  

            
            
                
            }while(opcion != 8) ;
        
    }//Fin public static void main
    
    //Metodo caso 1
    @SuppressWarnings("empty-statement")
    static public void Caso1 ()  { //Inicio caso 1
        do{
                    scanner.nextLine();
                    System.out.println("---AGREGAR PRODUCTO---");
                    
                    System.out.println("INGRESAR NOMBRE DEL PRODUCTO");                   
                    NombreProducto [contador] = scanner.nextLine().strip();
                   
                    System.out.println("INGRESAR CATEGORIA DEL PRODUCTO");
                    System.out.println("Camisetas y blusas");
                    System.out.println("Pantalones y jeans");
                    System.out.println("Faldas y vestidos");
                    System.out.println("Chamarras y abrigos");
                    System.out.println("Sueteres y sudaderas");
                    System.out.println("Ropa interior");
                    System.out.println("Calzado");
                    System.out.println("Accesorios");
                    System.out.println("Ropa deportiva");
                    System.out.println("Ropa de dormir");
                    CategoriaProducto [contador] = scanner.nextLine().strip() ;
                    
                    do {
                    System.out.println("INGRESAR EL PRECIO DEL PRODUCTO");
                    Precio = scanner.nextDouble() ;
                   if ( Precio < 0) {
                       System.out.println("EL PRECIO NO PUEDE SER NEGATIVO");
                    } else {
                       Precios [contador] = Precio ;
                          }
                    }while (Precio < 0) ;
                    scanner.nextLine(); 
                    
                    do {
                    System.out.println("INGRESAR CANTIDAD EN STOCK");
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
                        System.out.println("INGRESAR CODIGO UNICO DEL PRODUCTO:");
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
                    System.out.println("1. AGREGAR OTRO PRODUCTO");
                    System.out.println("2. RETROCEDER");
                    opcion = scanner.nextInt() ;
                    
        }while(opcion != 2) ;        
                    
} //Fin caso 1
    
    //metodo caso 2
    
    static public void Caso2 ()  { //inicio caso 2
        do{
                    boolean bus = false;
                    int posicion = -1 ;
                    scanner.nextLine();
                    System.out.println("---BUSCAR PRODUCTO---");
                    System.out.println("INGRESAR NOMBRE DEL PRODUCTO A BUSCAR");
                    Dato = scanner.nextLine().strip() ;
                    int i=0  ;
                    while(i< 25 && bus == false){
                        if(NombreProducto[i] != null && NombreProducto[i].equalsIgnoreCase(Dato)){
                            bus = true;
                            posicion = i ;
                        }
                        i ++ ;
                    }
                    if(bus == false){
                        System.out.println("NO SE HA ENCONTRADO EL PRODUCTO");
                    }
                    else{
                        System.out.println("Nombre de Producto: "+ NombreProducto[posicion] );
                        System.out.println("Categoria de Producto: "+ CategoriaProducto[posicion]);
                        System.out.println("Precio Prducto "+"Q."+ Precios[posicion]);
                        System.out.println("Stock de Producto: "+ CantidadStock[posicion]);
                        System.out.println("Codigo Unico Producto: "+CodigoUnico[posicion]);
                    }
                    System.out.println("1. BUSCAR OTRO PRODUCTO");
                    System.out.println("2. RETROCEDER");
                    opcion = scanner.nextInt() ;
          }while(opcion != 2) ;
                    
                    
                     
    } //fin caso2
    
    
    
}//Fin public class


 




