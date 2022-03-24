
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
public class ejercicio18 {
    /**Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor.**/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n;
        
        for (int i = 1; i <= 4; i++){
            System.out.println("Ingrese un número entre 1 y 20");
            n = leer.nextInt();
            
            System.out.print(n);
            for (int j = 1; j<= n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
