
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
public class ejercicio1 {
    /** Escribir un programa que pida dos números enteros por teclado y calcule la suma
    de los dos. El programa deberá después mostrar el resultado de la suma **/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("SUMA DE DOS NÚMEROS");
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
        suma = num1 + num2 ;
      
        System.out.println("");
        System.out.println(num1 + " + " + num2 + " = " + suma);
    }
    
}
