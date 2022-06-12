/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero division = new DivisionNumero();
        
        System.out.println("DIVIDIR");
        System.out.println("");
        
        System.out.println("Ingrese primer número");
        String a = leer.next();
        System.out.println("Ingrese segundo número");
        String b = leer.next();
        
        Integer c=0; 
        Integer d=0;
        try {
            c = Integer.parseInt(a);
            d = Integer.parseInt(b);
        } catch (NumberFormatException e) {
            System.out.println("Error. No ha ingresado dos números.");
        } 
        
        try {
            Float f = division.dividir(c,d);
            System.out.println(f);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }        
    }
    
}
