/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Emilia
 */
public class ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        //NO FUNCA!! 
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
        cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
        
        int n, unDig=0, dosDig=0, tresDig=0, cuatroDig=0, cincoDig=0, digitos, x;
        n = (int) (Math.random() * 10 + 1); 
        int [] vector; 
        vector = new int[n];
        
        for (int i=0; i<n; i++) {
            vector[i] = (int) (Math.random() * 1000 + 1); 
        }
        System.out.println(n);
        
        for (int i=0; i<n; i++) {
            System.out.print(vector[i]);
            
            if (i != n-1) {
                System.out.print(", ");
            }
            
        }
        
        for (int i=0; i<n; i++) {
            digitos = 0;
            x = vector[i];
                 
            do {
                x = x / 10; 
                digitos = digitos + 1;
            } while (x>=1);

            switch (digitos) {
                case 1: 
                    unDig = unDig + 1;
                    break; 
                case 2: 
                    dosDig = dosDig + 1;
                    break;
                case 3:
                    tresDig = tresDig + 1;
                    break;
                case 4:
                    cuatroDig = cuatroDig + 1;
                    break;
                case 5:
                    cincoDig = cincoDig + 1;
                    break;
            }
        }
        
        System.out.println("");
        System.out.println("INFORME");
        System.out.println(unDig + " números de un dígito.");
        System.out.println(dosDig + " números de dos dígitos.");
        System.out.println(tresDig + " números de tres dígitos.");
        System.out.println(cuatroDig + " números de cuatro dígitos.");
        System.out.println(cincoDig + " números de cinco dígitos.");
    }
    
    
}
