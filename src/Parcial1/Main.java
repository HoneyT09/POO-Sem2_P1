/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Honey
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Proyecto[] proyectos;
        int tam=0;
        System.out.print("De que tamaño quieres el arreglo: ");
        tam=sc.nextInt();
        proyectos = new Proyecto[tam];
        
        for(int i = 0; i<proyectos.length; i++) {
            proyectos[i] = new Proyecto();
        }
        
        try{
           for (int i = 0; i<proyectos.length; i++) {
               System.out.print("codigoCliente: ");
                proyectos[i].setCodigoCliente(sc.nextInt());
               System.out.print("Nombre: ");
                proyectos[i].setNombre(bf.readLine());
                System.out.print("ApellidoPaterno: ");
                proyectos[i].setApellidoPaterno(bf.readLine());
                System.out.print("ApellidoMaterno: ");
                proyectos[i].setApellidoMaterno(bf.readLine());
                System.out.print("Telefono: ");
              proyectos[i].setTelefono(bf.readLine());
              System.out.print("Direccion: ");
              proyectos[i].setDireccion(bf.readLine());
               System.out.print("Edad: ");
                proyectos[i].setEdad(sc.nextInt());
               proyectos[i].setActivo(true);
            }
        }catch(Exception e){
           System.out.println(e.getMessage());
       }
 
    int opc=0;
    int opc2=0;
    int opc3=0;
    while (opc !=4){
        System.out.println("--------------------------------");
        System.out.println("Elige una opcion del menu: ");
        System.out.println("1) Agregar cliente. ");
        System.out.println("2) Mostrar clientes. ");
        System.out.println("3) Buscar cliente.  ");
        System.out.println("4) Salir. ");
        opc = sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("---------Agrega un cliente-----------------");
                 opc2=sc.nextInt();
                if(opc2>=0 && opc2 < proyectos.length){
                    System.out.println("codigoCliente: " + proyectos[opc2].getCodigoCliente());
                     System.out.println("Nombre: " + proyectos[opc2].getNombre());
                     System.out.println("ApellidoPaterno: " + proyectos[opc2].getApellidoPaterno());
                     System.out.println("ApellidoMaterno: " + proyectos[opc2].getApellidoMaterno());
                     System.out.println("Telefono: " + proyectos[opc2].getTelefono());
                     System.out.println("Direccion: " + proyectos[opc2].getDireccion());
                     System.out.println("Edad: " + proyectos[opc2].getEdad());
                     System.out.println("Ativo: " + proyectos[opc2].isActivo());
                }else{
                    System.out.println("Ese cleinte no existe,Lo lamento");
            }
                System.out.println("--------------------------------");
                break;
            case 2:
                System.out.println("---------Listado de clienetes-----------------");
                for (int i=0; i<proyectos.length; i++){
                     System.out.println("codigoCliente: " + proyectos[i].getCodigoCliente());
                     System.out.println("Nombre: " + proyectos[i].getNombre());
                     System.out.println("ApellidoPaterno: " + proyectos[i].getApellidoPaterno());
                     System.out.println("ApellidoMaterno: " + proyectos[i].getApellidoMaterno());
                     System.out.println("Telefono: " + proyectos[i].getTelefono());
                     System.out.println("Direccion: " + proyectos[i].getDireccion());
                     System.out.println("Edad: " + proyectos[i].getEdad());
                     System.out.println("Ativo: " + proyectos[i].isActivo());
   }
                System.out.println("--------------------------------");
                break;
            case 3:
                while (opc3!=0){
                     System.out.println("---------Submenu--------- ");
                     System.out.println("1) Buscar por codigo ");
                     System.out.println("2) Buscar por nombre  ");
                     System.out.println("0) Regresar al menu anterior. ");
                     System.out.println("Elige una opcion del menu: ");
                     opc3 = sc.nextInt();
                     switch (opc3){
                         case 1:
                             //buscar por nombre
                             break;
                         case 2:
                             //buscar por codigo
                             break;
                         case 0:
                             System.out.println("Gracias por usar el submenu");
                             break;
                     }
                }
                break;
            case 4:
                System.out.println("Tarde horaaas en hacer este programa gracias por haber utilizado este programa: ");
        }
    }
            
    }
}

