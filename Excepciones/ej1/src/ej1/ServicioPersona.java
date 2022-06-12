/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import ej1.Persona;
import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("/n");
    
    public Persona crearPersona(){
        System.out.println("Ingresar nombre:");
        String nombre = leer.nextLine();
        System.out.println("Ingresar edad:");
        int edad = leer.nextInt();
      
        System.out.println("Ingresar inicial correspondiente al sexo Hombre/Mujer/Otro:");
        String sexo;
        do {
            sexo = leer.next();
            if ("H".equals(sexo) || "M".equals(sexo) || "O".equals(sexo)){
                
            } else {
                System.out.println("La opción ingresada no es válida. Recuerde ingresar únicamente H, M u O.");
                System.out.println("Intentelo nuevamente.");
            }
            
        } while (!"H".equals(sexo) || !"M".equals(sexo) || !"O".equals(sexo));
        
        System.out.println("Ingresar peso en kilogramos:");
        Double peso = leer.nextDouble();
        System.out.println("Ingresar altura en metros:");
        Double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }
}
