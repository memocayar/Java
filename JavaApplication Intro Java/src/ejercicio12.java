
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
public class ejercicio12 {
    /** Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. **/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota; 
        Scanner leer = new Scanner(System.in);
        
        do {
           System.out.println("Ingrese una nota entre 0 y 10");
           nota = leer.nextInt();
           
           if (nota < 0 || nota > 10) {
               System.out.println("Nota incorrecta. Intentelo nuevamente.");
           }
        } while (nota < 0 || nota > 10);
    }

}
