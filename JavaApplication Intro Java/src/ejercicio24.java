
import java.util.Random;
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
public class ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matriz = new int[3][3];
        int[][] traspuesta = new int[3][3];
        boolean rta = false; 
        Random rand = new Random();
        Scanner leer = new Scanner(System.in);
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++){
                System.out.println("Ingrese el valor para la posición (" + i + "," + j + ")");
                matriz[i][j] = leer.nextInt();
            }
        }
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++){
                traspuesta[j][i] = matriz[i][j];
            }
        }
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++){
                if (matriz[i][j] == (-1 * traspuesta[i][j])) {
                    rta = true;
                } else {
                    break;
                }
            }
        }
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }
        
        System.out.println("");
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++){
                System.out.print(traspuesta[i][j] + "  ");
            }
            System.out.println(" ");
        }
        
        System.out.println("");
        
        if (rta == true){
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
    
}
