/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;

import java.util.Scanner;

/**
 *
 * @author Honey
 */
public class Practica4 {
    
    public static void main (String[] args) {
      Scanner s = new Scanner (System.in);
      double promedio;
      double sumatoria=0;
      double numeros=0;
      int tamaño=10;
      double[]arreglo=new double [tamaño];
      
      System.out.println("Escriba los numeros a promediar:");
      numeros = s.nextInt();
      for(int i=0; i<tamaño; i++){
          arreglo[i]=s.nextInt();
      }
      
      System.out.println("El arreglo original es:");
      for(int i=0; i<tamaño; i++){
          System.out.println(arreglo[i]);
      }
      
      for(int i=0; i<tamaño; i++){
          sumatoria+=arreglo[i];
      }
      
      promedio=sumatoria/tamaño;
      System.out.println("El promedio total es:"+promedio);
      }
}
