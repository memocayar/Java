
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
public class ejercicio21 {
    
/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
        pida al usuario un numero a buscar en el vector. El programa mostrará donde se
        encuentra el numero y si se encuentra repetido*/
        
        Scanner leer = new Scanner(System.in);
        int n, x, contador = 0; 
        String rta;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        
        int[] vector;
        vector = new int[n];
        
        for (int i = 0; i<n; i++){
            vector[i] =  (int) (Math.random() * 100 + 1);      
        }
        
        System.out.println("");
        System.out.println("Ingrese el número que desea buscar");
        x = leer.nextInt();
        
        for (int i = 0; i<n; i++){
            if (x == vector[i]) {
                contador = contador + 1;
                if (contador == 1) {
                    System.out.print("El número se encuentra en las siguientes posiciones: ");
                    System.out.print(i);
                    System.out.print(", ");
                } else {
                    System.out.print(i);
                }
            }
        }
        
        if (contador == 0) {
            System.out.print(", ");
            System.out.println("El número ingresado no se encuentra en el vector.");
        }
        System.out.println("");
        
        System.out.println("¿Desea imprimir el vector? (s/n)");
        rta = leer.next();
        if ("s".equals(rta)) {
            for (int i = 0; i<n; i++){
                System.out.print(vector[i]);
                if (i == n-1){
                    System.out.println("");
                } else {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("");
    }
}
