/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Operacion op1 = new Operacion();
        Operacion op2 = new Operacion();
        op2.crearOperacion();
        int rta = 0;
        do {
            System.out.println("¿QUÉ OPERACIÓN DESEA REALIZAR?");
            System.out.println("1- Asignar número 1");
            System.out.println("2- Asignar número 2");
            System.out.println("3- Ver número 1");
            System.out.println("4- Ver número 2");
            System.out.println("5- Sumar" );
            System.out.println("6- Restar");
            System.out.println("7- Multiplicar");
            System.out.println("8- Dividir");
            System.out.println("9- Salir");
        } while (rta != 0);
        
        switch (rta) {
            case 1: 
                Double x; 
                System.out.println("Ingresar numero:");
                x = leer.nextDouble();
                op1.setNumero1(x);
                break;
            case 2: 
                break;
            case 3: 
                break;
            case 4: 
                break;
            case 5: 
                break;
            case 6: 
                break;
            case 7: 
                break;
            case 8: 
                break;
            case 9: 
                break;
            case 10: 
                break;
            
            default: System.out.println("La respuesta ingresada no es válida");
                
        }
    }
}
