
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
public class ejercicio17 {
    //Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, espacios, filas;
        
        System.out.println("Ingrese un número entero");
        num = leer.nextInt();
        
        filas = num - 2;
        espacios = num - 2;
        
        if (num == 1) {
            System.out.println("*");
        } else {
            
            for (int i = 1; i <= num; i++){
                System.out.print("*");
            }
            
            System.out.println("");
            
            if (filas >= 1){
                for (int i=1; i<= filas; i++){
                    System.out.print("*");
                    
                    for (int j=1; j<= espacios; j++){
                        System.out.print(" ");
                    }
                    
                    System.out.println("*");
                }
            }
            
            for (int i = 1; i <= num; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    
}
