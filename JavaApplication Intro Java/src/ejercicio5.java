
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
public class ejercicio5 {

    /**Escribir un programa que lea un número entero por teclado y muestre por pantalla
    el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt(). */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        n = leer.nextInt();
        
        System.out.println("El doble de " + n + " es: " + n*2);
        System.out.println("El triple de " + n + " es: " + n*3);
        System.out.println("La raíz cuadrada de " + n + " es: " + Math.sqrt(n));   
    }
    
}
