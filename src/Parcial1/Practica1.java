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
public class Practica1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas: ");
        int n=leer.nextInt ();
        for (int i = 0; i < n; i++) { //controla lineas
            for (int j = 0; j <= i; j++) { //controla astericos por linea
                System.out.print("*");
            }
                System.out.println("");
            }
        }
    }

