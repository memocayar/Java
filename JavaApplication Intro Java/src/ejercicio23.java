
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Emilia
 */
public class ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
        la traspuesta de la matriz*/
        
        int[][] matriz = new int[4][4];
        int[][] traspuesta = new int[4][4];
        Random rand = new Random();
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++){
                matriz[i][j] = rand.nextInt(9);
            }
        }
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++){
                traspuesta[j][i] = matriz[i][j];
            }
        }
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        System.out.println("");
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++){
                System.out.print(traspuesta[i][j] + " ");
            }
            System.out.println(" ");
        }  
    }
}
