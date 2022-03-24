/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio11;

import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Maria Emilia
 */
public class ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int dia, mes, anio, dif;
        System.out.println("Ingresar día:");
        dia = leer.nextInt();
        System.out.println("Ingresar mes:");
        mes = leer.nextInt();
        System.out.println("Ingresar año:");
        anio = leer.nextInt();
        
        Date fecha = new Date();
        fecha.setDate(dia);
        fecha.setMonth(mes);
        fecha.setYear(anio - 1900);
        Date fechaActual = new Date();
        
        System.out.println(fecha.toString());
        System.out.println(fechaActual.toString());
        
        dif = fechaActual.getYear() - fecha.getYear();
        System.out.println("Entre la fecha ingresada y la fecha actual hay " + dif + " años.");
    }
    
}
