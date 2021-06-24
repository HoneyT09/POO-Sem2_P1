/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

import java.util.Scanner;

/**
 *
 * @author Honey
 */
public class Proyecto {

    Scanner scano = new Scanner(System.in);

    //variables
    int[] polinomio1 = new int[10];
    int[] polinomio2 = new int[10];
    int[] grado1 = new int[10];
    int[] resultado = new int[10];
    

    public void llenarArreglo() {
        //Llenar el arreglo con numeros
        System.out.println("Ingresa los valores del primer polinomio");

        for (int i = 0; i < 8; i = i + 2) {
            System.out.println("Dame el valor del coeficiente: ");
            polinomio1[i] = scano.nextInt();
            System.out.println("Dame el valor del grado: ");
            polinomio1[i + 1] = scano.nextInt();
        }

        System.out.println("----Ingresa los valores del segundo polinomio----");
        for (int j = 0; j < 8; j = j + 2) {
            System.out.print("Dame el valor del coeficiente: ");
            polinomio2[j] = scano.nextInt();
            System.out.println("Dame el valor del grado: ");
            polinomio2[j + 1] = scano.nextInt();

        }
    }

    public void Sumarpolinomio() {

        System.out.println("______Ordenando datos______");
        System.out.println("______Sumatoria_____________");
        System.out.println("Resultado: ");
        for (int i = 0; i < 8; i = i + 2) {
            for (int j = 0; j < 8; j = j + 2) {

                if (polinomio1[i + 1] == polinomio2[j + 1]) {
                    System.out.println(" " + (polinomio1[i] + polinomio2[j]) + "x^" + polinomio1[i+1]);
                }
            }
        }
    }

    public void RestarPolinomio() {

        System.out.println("______Ordenando datos______");
        System.out.println("______Resta_____________");
        System.out.println("Resultado: ");
        for (int i = 0; i < 8; i = i + 2) {
            for (int j = 0; j < 8; j = j + 2) {

                if (polinomio1[i + 1] == polinomio2[j + 1]) {
                    System.out.println(" " + (polinomio1[i] - polinomio2[j]) + "x^" + polinomio1[i+1]);
                }
            }
        }
    }

//    public void sumar() {
//        //Sumar los polinomios
//        System.out.println("Espera el resultado...");
//        System.out.println("Sumando los polinomios");
//        for (int i = 0; i < 10; i = i + 2) {
//            resultado[i] = polinomio1[i] + polinomio2[i];
//            System.out.print(resultado[i] + " ");
//
//        }
//    }
//
//    public void restar() {
//        //Restar los polinomios
//        System.out.println("Espera el resultado...");
//        System.out.println("Restando los polinomios");
//        for (int i = 0; i < 10; i = i + 2) {
//            resultado[i] = polinomio1[i] - polinomio2[i];
//            System.out.print(resultado[i] + " ");
        }
