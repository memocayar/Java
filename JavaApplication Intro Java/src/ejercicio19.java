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
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int euros;
        String moneda;
        
        System.out.println("Ingrese cantidad de euros a convertir");
        euros = leer.nextInt();
        System.out.println("Ingrese a qué moneda desea convertir (dolares/yenes/libras)");
        moneda = leer.next();
        
        conversion(euros, moneda);
    }
    
    public static void conversion(int euros, String moneda){
        System.out.print("El cambio es ");
        switch (moneda){
            case "dolares": 
                System.out.print(euros * 0.86);
                break;
            case "yenes":
                System.out.print(euros * 1.28611);
                break;
            case "libras":
                System.out.print(euros * 129.852);
                break;        
        }
        System.out.print(" " + moneda);
    }
}
