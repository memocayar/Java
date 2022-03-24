
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
public class ejercicio14 {
    /** Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break. **/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float n; 
        float suma;
        suma = 0;
        
        for (int i = 1; i<= 20; i++){
            System.out.println("Ingrese el " + i + "° número");
            n = leer.nextFloat();
            
            if (n == 0){
                System.out.println("Se capturó el número cero");
                break;
            } else if (n >= 1 ) {
                suma = suma + n;
            }
        }
        
        System.out.println("El resultado de la suma de los números leídos es: " + suma);
    }
    
}
