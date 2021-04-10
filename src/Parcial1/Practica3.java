/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Honey
 */
public class Practica3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;
        
        //Eso del Joption es para un modelo juevo de ingrese numeros pero puede ser de otra manera: entrada.nextInt();y en la 
        //siguiente linea ponerle sout y entre parentesisi y comillas lo que pedimos 
       nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elemetos: ")); 
        arreglo = new int[nElementos];
                
                for(int i=0;i<nElementos;i++){
                    System.out.println((i+1)+". Ingresa un numero: ");
                    arreglo[i] = entrada.nextInt();
                } 
                
                for (int i=0;i<(nElementos-1);i++){
                    for(int j=0;j<(nElementos-1);j++){
                    if(arreglo[j] > arreglo[j+1]){
                        aux = arreglo[j];
                        arreglo[j] = arreglo [j+1];
                        arreglo[j+1] = aux;
                        
                    }
                }
                } 
                System.out.print("\nArreglo ordenado en forma creciente: ");
                for(int i=0;i<nElementos;i++){
                    System.out.print(arreglo[i]+",");
                }
                
                System.out.print("\nArreglo ordenado en forma decreciente: ");
                for(int i=(nElementos-1);i>=0;i--){
                    System.out.print(arreglo[i]+",");
                }
                System.out.println("");
    }
    }
