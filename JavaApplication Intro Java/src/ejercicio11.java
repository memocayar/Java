
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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int tipoMotor; 
        System.out.println("Ingrese el número de motor");
        tipoMotor = leer.nextInt();
        
        switch (tipoMotor){
            case 1:
                System.out.println("“La bomba es una bomba de agua");
               break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
               break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
               break;   
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
               break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
    
}
