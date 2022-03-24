
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
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float n1, n2, resultado = 0;
        int op;
        
        String rta = "n"; 
        System.out.println("Ingrese el primer número");
        n1 = leer.nextFloat(); 
        System.out.println("Ingrese el segundo número");
        n2 = leer.nextFloat();      
        
        do {
            System.out.println("¿Qué desea realizar?");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            op = leer.nextInt();
            
            switch (op) {
                case 1:
                    resultado = n1 + n2;
                    break;
                case 2:
                    resultado = n1 - n2;
                    break;
                case 3:
                    resultado = n1 * n2;
                    break;
                case 4:
                    resultado = n1 / n2;
                    break;
                case 5:
                    System.out.println("¿Está seguro/a de que desea salir del programa? s/n");
                    rta = leer.next();
                    break;
            }
            System.out.println("El resultado es: " + resultado);
        } while (!rta.equals("s"));
    }
    
}
