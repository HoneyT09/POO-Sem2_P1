/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;

import java.util.Scanner;

/**
 *
 * @author Honey
 */
public class Operacion {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int a;
        int b;
        int suma;
        int resta;
        
        //Empieza la suma
        
//        System.out.print("Dime el valor de a: ");
//        a = sc.nextInt();
//        System.out.print("Dime el valor de b: ");
//        b = sc.nextInt();
//        
//        resta = a - b;
//        
//        System.out.println ("El resultado de la suma es: " + resta);

         //Procedimiento de Trapecio y rectangulo
         //dos lados iguales, uno pequeño y uno grande
         //bmayor + bmenor*h/2
         
         double bM;
         double bm;
         double h;
         double area;
         double base;
         
//         System.out.print("Dame base mayor: ");
//         bM = sc.nextDouble();
//         System.out.print("Dame base menor: ");
//         bm = sc.nextDouble();
//         System.out.print("Dame base altura: ");
//         h = sc.nextDouble();
//         
//         area=(bM + bm)*h/2; 
//         
//         System.out.println("El resultado del area es: " + area);



          //-------RECTANGULO---------//
           System.out.print("Dame base: ");
           base = sc.nextDouble();
           System.out.print("Dame base altura: ");
           h = sc.nextDouble();
           
           area=(base * h); 
       
           System.out.println("El resultado del area es: " + area);
  
    }    
}
