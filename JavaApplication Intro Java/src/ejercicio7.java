
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
public class ejercicio7 {
    /** Crear un programa que dado un numero determine si es par o impar. **/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("NÚMERO PAR O IMPAR");
        System.out.println("Ingrese el número a evaluar");
        num = leer.nextFloat();
        
        if (num % 2 == 0){
        System.out.println("El número ingresado es par");
    } else {
        System.out.println("El número ingresado es impar");
        }
    } 
}
