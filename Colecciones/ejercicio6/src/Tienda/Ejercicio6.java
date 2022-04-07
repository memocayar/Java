/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import Tienda.servicios.ServicioProducto;
import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioProducto t = new ServicioProducto();
        int rta;

        do {
            System.out.println("¿QUÉ ACCIÓN DESEA REALIZAR?");
            System.out.println("1- Ingresar productos");
            System.out.println("2- Mostrar productos");
            System.out.println("3- Eliminar producto");
            System.out.println("4- Modificar precio de un producto");
            System.out.println("5- Salir");
            rta = leer.nextInt();
            
            switch (rta) {
                case 1: 
                    t.fabricaDeProductos();
                    break;
                case 2: 
                    t.mostrarProductos();
                    break;
                case 3: 
                    t.eliminarProducto();
                    t.mostrarProductos();
                    break; 
                case 4: 
                    t.modificarPrecio();
                    t.mostrarProductos();
                    break;
                case 5: 
                    break;
                default: 
                    System.out.println("La opción ingresada no es válida. Inténtelo nuevamente.");
            }
        } while (rta != 5);
    }
}
