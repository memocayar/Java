
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
public class ejercicio16 {
    // dispositivo RS232
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String cadena; 
        int correcto = 0, incorrecto = 0;
        String FDE = "&&&&&";
        
        do {
            System.out.println("Ingresar cadena");
            cadena = leer.nextLine();
            
            System.out.println(cadena.length() + ", " + cadena.substring(0,1) + ", " + cadena.substring(cadena.length()-1,cadena.length()).equals("O"));
            
               // correcto: 5 caracteres, primer X, ultimo O.
            if (cadena.length() <= 5 && "X".equals(cadena.substring(0,1)) && cadena.substring(cadena.length()-1,cadena.length()).equals("O")){
                correcto = correcto + 1;
                System.out.println("correcto");
            } else if (cadena.equals(FDE)){
                continue;
            } else {
                incorrecto = incorrecto + 1;
                System.out.println("incorrecto");
            }
        } while (!cadena.equals(FDE));
        
        System.out.println("");
        System.out.println("Cantidad de lecturas correctas: " + correcto);
        System.out.println("Cantidad de lecturas incorrectas: " + incorrecto);
    }
}
//"O".equals(cadena.charAt(cadena.length()-1))