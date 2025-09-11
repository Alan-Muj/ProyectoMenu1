/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


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
    static String Dato ; //Variabel para buscar
    static int ContadorVentas = 0 ; //Variable para registro ventas
    static int contador = 0 ;    
    static Scanner scanner=new Scanner(System.in);
    static String[] NombreUsuario = new String[10] ; //Vector para usuario
    static String[] CarnetUsuario = new String[10] ; //Vector para carnet usuario
    static String[] NombreProducto = new String[25] ; //Vector para nombres de producto
    static String[] CategoriaProducto = new String[25] ; //Vector para categorias de producto
    static double[] Precios = new double[25] ; //Vector para precios producto
    static double[] CantidadStock = new double[25] ; //Vector para stock producto
    static String[] CodigoUnico = new String[25] ; //Vector para código único producto
    static String[] FechaVentas = new String[25] ; //Vector para las fechas de las ventas
    static String[] HoraVentas = new String[25] ; //Vector para la hora de las ventas
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
                       
                case 3:    
                       Caso3 () ;
                       break;
                       
                case 4:
                       Caso4 () ;
                       break ; 
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
                    System.out.println("INGRESAR CATEGORIA: ");
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
                    int rep = 0;
        do{
                    scanner.nextLine();
                    System.out.println("---BUSCAR PRODUCTO---");
                    System.out.println("1. Buscar Producto Por Nombre");
                    System.out.println("2. Buscar Producto Por Categoria");
                    System.out.println("3. Buscar Producto por Codigo Unico");
                    System.out.println("4. RETROCEDER");
                    opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    do{
                        scanner.nextLine();
                    System.out.println("--- BUSCAR PRODUCTO ---");    
                    System.out.println("INGRESAR NOMBRE DEL PRODUCTO A BUSCAR");
                    Dato = scanner.nextLine().strip() ;
                
                    for(int i=0; i < contador; i++){
                        if(NombreProducto[i] != null && NombreProducto[i].equalsIgnoreCase(Dato)){
                            rep ++;
                            System.out.println("Nombre de Producto: "+ NombreProducto[i] );
                            System.out.println("Categoria de Producto: "+ CategoriaProducto[i]);
                            System.out.println("Precio Prducto "+"Q."+ Precios[i]);
                            System.out.println("Stock de Producto: "+ CantidadStock[i]);
                            System.out.println("Codigo Unico Producto: "+CodigoUnico[i]);
                        }                   
                    }
                    if(rep == 0){
                        System.out.println("NO SE HA ENCONTRADO EL PRODUCTO");
                    }
                    System.out.println("1. BUSCAR OTRO PRODUCTO");
                    System.out.println("2. RETROCEDER");
                    opcion = scanner.nextInt() ;
                    }while(opcion != 2) ;
                    break ;
                case 2 :
                    do{
                        scanner.nextLine();
                    System.out.println("--- BUSCAR PRODUCTO ---");    
                    System.out.println("INGRESAR CATEGORIA DEL PRODUCTO A BUSCAR");
                    Dato = scanner.nextLine().strip() ;
                
                    for(int i=0; i < contador; i++){
                        if(CategoriaProducto[i] != null && CategoriaProducto[i].equalsIgnoreCase(Dato)){
                            rep ++;
                            System.out.println("Nombre de Producto: "+ NombreProducto[i] );
                            System.out.println("Categoria de Producto: "+ CategoriaProducto[i]);
                            System.out.println("Precio Prducto "+"Q."+ Precios[i]);
                            System.out.println("Stock de Producto: "+ CantidadStock[i]);
                            System.out.println("Codigo Unico Producto: "+CodigoUnico[i]);
                        }                   
                    }
                    if(rep == 0){
                        System.out.println("NO SE HA ENCONTRADO EL PRODUCTO");
                    }
                    System.out.println("1. BUSCAR OTRO PRODUCTO");
                    System.out.println("2. RETROCEDER");
                    opcion = scanner.nextInt() ;
                    }while(opcion != 2) ;
                    break ;
                case 3:
                    do{
                        scanner.nextLine();
                    System.out.println("--- BUSCAR PRODUCTO ---");    
                    System.out.println("INGRESAR CODIGO UNICO DEL PRODUCTO A BUSCAR");
                    Dato = scanner.nextLine() ;
                
                    for(int i=0; i < contador; i++){
                        if(CodigoUnico[i] != null && CodigoUnico[i].equalsIgnoreCase(Dato)){
                            rep ++;
                            System.out.println("Nombre de Producto: "+ NombreProducto[i] );
                            System.out.println("Categoria de Producto: "+ CategoriaProducto[i]);
                            System.out.println("Precio Prducto "+"Q."+ Precios[i]);
                            System.out.println("Stock de Producto: "+ CantidadStock[i]);
                            System.out.println("Codigo Unico Producto: "+CodigoUnico[i]);
                        }                   
                    }
                    if(rep == 0){
                        System.out.println("NO SE HA ENCONTRADO EL PRODUCTO");
                    }
                    System.out.println("1. BUSCAR OTRO PRODUCTO");
                    System.out.println("2. RETROCEDER");
                    opcion = scanner.nextInt() ;
                    }while(opcion != 2) ;
                    break ;
            }//Fin switch       
          }while(opcion != 4) ;         
                    
    } //fin caso2
    
    
    //Metodo 3
    public static void Caso3() { //Inicio caso 3
        int PosElim = 0; //Varibale para eliminar producto
        do{
            int rep = 0 ;
                        scanner.nextLine();
                    System.out.println("--- ELIMINAR PRODUCTO ---");
                    System.out.println("INGRESAR CODIGO UNICO DEL PRODUCTO A ELIMINAR");
                    Dato = scanner.nextLine() ;
                    for(int i=0; i < contador; i++){
                        if(CodigoUnico[i] != null && CodigoUnico[i].equalsIgnoreCase(Dato)){
                            rep ++;
                            System.out.println("¿DESEA ELIMINAR ESTE PRODUCTO?");
                            System.out.println("Nombre de Producto: "+ NombreProducto[i] );
                            System.out.println("Categoria de Producto: "+ CategoriaProducto[i]);
                            System.out.println("Precio Prducto "+"Q."+ Precios[i]);
                            System.out.println("Stock de Producto: "+ CantidadStock[i]);
                            System.out.println("Codigo Unico Producto: "+CodigoUnico[i]);
                            i = PosElim ;
                            System.out.println("1. ACEPTAR");
                            System.out.println("2. RETROCEDER");
                            opcion = scanner.nextInt() ;
                        }                   
                    }
                    if(rep == 0){
                        System.out.println("NO SE HA ENCONTRADO EL PRODUCTO");
                    }
                    if(opcion == 1) {
                        for(int j = PosElim ; j < contador - 1; j++){
                    NombreProducto[j] = NombreProducto[j+1];
                    CategoriaProducto[j] = CategoriaProducto[j+1];
                    Precios[j] = Precios[j+1];
                    CantidadStock[j] = CantidadStock[j+1];
                    CodigoUnico[j] = CodigoUnico[j+1];
                    }
                    
                    NombreProducto[contador-1] = null;
                    CategoriaProducto[contador-1] = null;
                    Precios[contador-1] = 0;
                    CantidadStock[contador-1] = 0;
                    CodigoUnico[contador-1] = null;

                    contador--;
                    System.out.println("EL PRODUCTO HA SIDO ELIMINADO");

                       
                   } else {
                      System.out.println("ELIMINACIÓN CANCELADA");  
                    }
                    
                    System.out.println("1. ELIMINAR OTRO PRODUCTO");
                    System.out.println("2. RETROCEDER");
                    opcion = scanner.nextInt() ;
                    }while(opcion != 2) ;    
}//Fin Caso 3
    
    //Inicio metodo 4
    public static void Caso4() {
        double Venta = 0; //Varibale para venta producto
        int NumeroVentas = 0 ;
        do{
            int rep = 0 ;
                        scanner.nextLine();
                   System.out.println("--- REGSITRAR VENTA ---");
                   System.out.println("INGRESAR CANTIDAD DE PRODUCTOS A VENDER");
                   NumeroVentas = scanner.nextInt() ;
                   while(ContadorVentas < NumeroVentas){
                   scanner.nextLine() ;
                   System.out.println("INGRESAR CODIGO UNICO DEL PRODUCTO " + ContadorVentas++ + " A VENDER");
                    Dato = scanner.nextLine() ;
                    for(int i=0; i < contador; i++){
                        if(CodigoUnico[i] != null && CodigoUnico[i].equalsIgnoreCase(Dato)){
                            rep ++;
                            System.out.println("PRODUCTO A VENDER");
                            System.out.println("Nombre de Producto: "+ NombreProducto[i] );
                            System.out.println("Categoria de Producto: "+ CategoriaProducto[i]);
                            System.out.println("Precio Prducto "+"Q."+ Precios[i]);
                            System.out.println("Stock de Producto: "+ CantidadStock[i]);
                            System.out.println("INGRESAR CANTIDAD DE UNIDADES A VENDER: ");
                            Venta = scanner.nextInt() ;
                            
                            if(CantidadStock[i]>= Venta){
                            CantidadStock[i] = CantidadStock[i] - Venta ;
                            
                            LocalDateTime FechaActual = LocalDateTime.now() ;
                            DateTimeFormatter FormatoFecha = DateTimeFormatter.ofPattern("MMMM dd yyyy") ;
                            String Fecha = FormatoFecha.format(FechaActual);
                            
                            LocalDateTime HoraActual = LocalDateTime.now() ;
                            DateTimeFormatter FormatoHora = DateTimeFormatter.ofPattern("HH : mm") ;
                            String Hora = FormatoHora.format(HoraActual);
                            
                            FechaVentas[ContadorVentas] = Fecha ;
                            HoraVentas[ContadorVentas] = Hora ;

                            System.out.println("VENTA REGISRADA CORRECTAMENTE");
                            } else{
                                System.out.println("NO HAY STOCK SUFICIENTE PARA REALIZAR LA VENTA");
                                System.out.println("Hay "+ CantidadStock[i] + " unidades de este producto");
                        }
                          
                       }                   
                    }
                    if(rep == 0){
                        System.out.println("NO SE HA ENCONTRADO EL PRODUCTO");
                    }
                    ContadorVentas++ ;
                    }//finwhile 
                    System.out.println("1. VENDER OTRO PRODUCTO");
                    System.out.println("2. RETROCEDER");
                    opcion = scanner.nextInt() ;
                    }while(opcion != 2) ;
    
    
    }
    
    
    
    
    
    
}//Fin public class


 




