/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int [3][3];
        int [] sumas = new int [8];
        Scanner leer = new Scanner(System.in);
        int n = 0;
        boolean magic = false;
        
        //rellenar matriz
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++) {
                do {
                    System.out.println("Ingrese el valor para la posición (" + i + "," + j + ")");
                    n = leer.nextInt();
                
                    if (n<1 || n>9){
                        System.out.println("");
                        System.out.println("El valor debe ser mayor o igual a 1 y menor o igual a 9");
                        System.out.println("Inténtelo nuevamente");
                        System.out.println("");
                    } else {
                        matriz[i][j] = n;
                    }
                } while(n<1 || n>9);
                
                n = 0;
            }
        }
        
        System.out.println("");
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }
        
        for (int i=0; i<8; i++){
            sumas[i] = 0;
        }
        
        //filas 
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++){
                sumas[i] = sumas[i] + matriz[i][j];
            }
        }
        
        //columnas
        for (int j=0; j<matriz.length; j++){
            for (int i=0; i<matriz.length; i++){
                sumas[j+3] = sumas[j+3] + matriz[i][j];
            }
        }
        
        //diagonales
        for (int i=0; i<matriz.length; i++){
            sumas[6] = sumas[6] + matriz[i][i];
        }
        
        for (int i=0; i<matriz.length; i++){
            sumas[7] = sumas[7] + matriz[i][3-1];
        }
        
        //vector sumas
        System.out.println("");
        for (int i=0; i<matriz.length; i++){
            System.out.print(sumas[i] + ", ");     
        }
        
        for (int i=0; i<8; i++) {
            if (sumas[0] == sumas[i]){
                magic = true;
            } else {
                magic = false;
                break; // esto está bien??
            }
        }
        
        System.out.println("");
        System.out.println("");
        
        if (magic == true) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }
    }
}
