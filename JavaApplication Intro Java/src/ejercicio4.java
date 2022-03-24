
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Emilia
 */

/** Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).**/

public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float F, C; 
        Scanner leer = new Scanner(System.in);
        System.out.println("CONVERSIÓN CENTÍGRADOS A FAHRENHEIT");
        System.out.println("Ingrese temperatura en grados centígrados");
        C = leer.nextFloat();
        F = 32 + (9 * C / 5);
        System.out.println(C + "°C = " + F + "°F");
    }
    
}
