/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2_y_3;

import ejercicio_2_y_3.entidades.Lavadora;
import ejercicio_2_y_3.entidades.Televisor;

/**
 *
 * @author Maria Emilia
 */
public class Ejercicio_2_y_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CREANDO LAVADORA:");
        Lavadora l1 = new Lavadora();
        l1.crearLavadora();
        System.out.println("El precio final de la lavadora es:");
        l1.precioFinal();

        System.out.println("");

        System.out.println("CREANDO TELEVISOR:");
        Televisor t1 = new Televisor();
        t1.crearTelevisor();
        t1.precioFinal();
        System.out.println("El precio final del televisor es:" + t1.getPrecio());
        
    }

}
