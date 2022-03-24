
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
public class ejercicio13 {
    /** Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial. **/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int limite; 
        float suma;
        float n;
        System.out.println("Ingrese el valor limite positivo");
        limite = leer.nextInt();
        suma = 0; 
        
        do { 
            System.out.println("Ingrese un valor");
            n = leer.nextFloat();
            suma = suma + n; 
        } while (suma < limite);
    }
    
}
