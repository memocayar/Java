
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
public class ejercicio8 {
    /** Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java. **/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String contrasenia;
        String correcto; 
        correcto = "eureka"; 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar contraseña");
        contrasenia = leer.nextLine();
        
        if (contrasenia.equals(correcto)) {
            System.out.println("La contraseña es correcta");
    } else {
            System.out.println("La contraseña es incorrecta");
    }
    }
}
