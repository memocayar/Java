
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
public class ejercicio6 {
    /* Implementar un programa que dado dos números enteros determine cuál es el
    mayor y lo muestre por pantalla.*/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, max; 
        Scanner leer = new Scanner(System.in);
        System.out.println("MAYOR ENTRE DOS ENTEROS");
        System.out.println("Ingrese un número");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        num2 = leer.nextInt();
        
        if (num1 > num2) {
            max = num1;
    } else {
            max = num2;
        }
            
        System.out.println("El número mayor es: " + max);
    }
    
}
