/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosExtra.ej2;

import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Puntos p = new Puntos();
        p.crearPuntos();
        
        System.out.println("La distancia entre los dos puntos ingresados es " + p.calcularDistancia());
        
    }
    
}
