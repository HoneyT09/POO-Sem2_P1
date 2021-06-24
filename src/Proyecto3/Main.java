/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Honey
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Cliente> clientes = new ArrayList<>();
        //Menu principal
        //1.Agregar clientes (pedir datos)
        //2.Eliminar clientes (pedir nombre a eliminar)
        //3.Buscar cliente por nombre
        //4.Mostrar clientes
        //0 salir
        //Uso de List, Interfaz

        //Se captura la opcion que elija el usuario (y es la variable donde captura lo que el usuario introduzca)
        int opcion = 0;
        //Ciclo infinito para que corra hasta que tu presiones la opcion de salir en este caso (0)
        while (opcion!=5) {
            //MENU
            System.out.println("------------¿Que opcion del menu quieres?----------");
            System.out.println("[1] Agregar cliente (pedir datos)");
            System.out.println("[2] Eliminar clientes");
            System.out.println("[3] Buscar cliente por nombre");
            System.out.println("[4] Mostrar clientes");
            System.out.println("[0] Salir");

            //Capturar opcion que el usuario quiere
            opcion = leer.nextInt();
//        System.out.println ("La opcion que eligio del menu fue:" +opcion);
            switch (opcion) {
                case 0:
                    System.out.println("Gracias por usar este programa.<3");
                    //Un metodo el cual utilizas para salir del programa (exit)
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("Ingresa el idCliente");
                    int idCliente = leer.nextInt();
                    System.out.println("Ingresa el nombre del cliente");
                    String nombre = bf.readLine();
                    System.out.println("Ingresa la edad del cliente");
                    int edad = leer.nextInt();
                    System.out.println("Ingresa el correo del cliente");
                    String correo = bf.readLine();
                    System.out.println("Ingresa el telefono del cliente");
                    String telefono = bf.readLine();
                    //Clientes = La lista se llama clientes. y se agrega a cliente que es la varibale que se de
                    Cliente cliente = new Cliente(idCliente,nombre,edad,correo,telefono);
                    clientes.add(cliente);
          
                    break;

                case 2:
                    String nom;
                    System.out.println("Que cliente quieres eliminar (nombre)");
                    nom = bf.readLine();
                   for (Cliente c: clientes){
                       if (c.getNombre().equals(nom)){
                           clientes.remove(c);
                       }
                   }
                    break;

                case 3:
                    String nombreAbuscar;
                    System.out.println("Dame el nombre del cliente que quieres buscar: ");
                    nombreAbuscar = bf.readLine();
                    //String es un tipo de variable (que se utiliza para letras) y el valor inicial es el nextInt (donde se guarda el nombre que ingresen)
                    int H = 0;
                    for (int i = 0; i < clientes.size(); i++) {
                        if (nombreAbuscar.equals(clientes.get(i).getNombre())) {
                            System.out.println("Nombre del cliente --Encontrado--");
                            System.out.println("idCliente: " + clientes.get(i).getIdCliente());
                            System.out.println("Nombre: " + clientes.get(i).getNombre());
                            System.out.println("Edad: " + clientes.get(i).getEdad());
                            System.out.println("Correo: " + clientes.get(i).getCorreo());
                            System.out.println("Telefono: " + clientes.get(i).getTelefono());
                            H = 1;
                        }
                    }
                    if (H == 0) {
                        System.out.println("Cliente no encontrado en esta cartera");
                    }
                    break;

                case 4:
                    System.out.println("_________Lista de clientes:___________");
                    for (Cliente c : clientes) {
                        System.out.println("IdCliente: " + c.getIdCliente());
                        System.out.println("Nombre: " + c.getNombre());
                        System.out.println("Edad: " + c.getEdad());
                        System.out.println("Correo: " + c.getCorreo());
                        System.out.println("Telefono: " + c.getTelefono());
                    }
                    break;

                default:
                    System.out.println("Esa opcion no existe en este menu");
            }
        } 

    }
}
