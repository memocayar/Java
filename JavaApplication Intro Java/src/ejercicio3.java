
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Emilia
 */
public class ejercicio3 {
    /** Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. **/ 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase; 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        System.out.println(toUpperCase(frase));
        System.out.println(frase.toUpperCase());
        System.out.println(toLowerCase(frase));
    }
    
}
