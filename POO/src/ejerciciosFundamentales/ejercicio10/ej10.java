/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio10;

import java.util.Arrays;

/**
 *
 * @author Maria Emilia
 */
public class ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] A = new double[50];
        double[] B = new double[20];
        
        for (int i = 0; i < 50; i++) {
            A[i] = Math.random() * 1000;
        }
        
        System.out.println(Arrays.toString(A));         // imprime array como cadena
        
        Arrays.sort(A);             // ordena de forma ascendente
        
        System.arraycopy(A, 0, B, 0, 10);       // copia los elementos del array (array a copiar, elemento donde inicia, array a pegar, posición donde empieza a pegar, numero de componentes a copiar)
        
        Arrays.fill(B, 10, 20, 0.5);        // rellena array desde una posicion inicial hasta posición final con una variable (0.5)
        
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
    
}
