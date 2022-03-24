/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio12.entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class ServicioPersona {
    private Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona() {
        System.out.println("Ingresar nombre:");
        String nombre = leer.nextLine();
        
        System.out.println("Fecha de nacimiento");
        System.out.println("Ingresar dia:");
        int dia = leer.nextInt();
        System.out.println("Ingresar mes:");
        int mes = leer.nextInt();
        System.out.println("Ingresar año:");
        int anio = leer.nextInt();
        
        Date fechaDeNacimiento = new Date();
        fechaDeNacimiento.setDate(dia);
        fechaDeNacimiento.setMonth(mes);
        fechaDeNacimiento.setYear(anio - 1900);
        
        return new Persona(nombre, fechaDeNacimiento);
    }
    
    public void mostrarPersona(Persona p1) {
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Fecha de nacimiento: " + p1.getFechaDeNacimiento());
    }
}
