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
public class Practica5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int arreglo[],numero;
        boolean creciente =true;
        
        arreglo = new int[10];
        
        do{
            System.out.println("Rellene el arreglo: ");
            for(int i=0; i<10; i++){
                System.out.print(i+". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
            for(int i=0;i<9;i++){
                if(arreglo[i] < arreglo[i+1]){
                creciente = true;
            }
                if(arreglo[i] > arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }
            
            if(creciente == false){
                System.out.println("\nEl arreglo esta desordenado, digite nuevamente: \n");
            }
        }while(creciente == false);
        
       System.out.print("\nDigite el numero a buscar en el arreglo: ");
       numero = entrada.nextInt();
       
       int i=0;
       
       while(i<10 && arreglo[i]<numero){
           i++;
       }
       if(i==10){
           System.out.println(" -1");
       }
       else{
           if(arreglo[i]== numero){
               System.out.println("\nNumero encontrado, en la posicion: "+i);
           }
           else{ 
               System.out.println(" -1");
           }
       }
        }
        }
 




        
        


            
        
    
    


    
