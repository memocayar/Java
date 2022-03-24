/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio12;

import ejerciciosFundamentales.ejercicio12.entidades.Persona;
import ejerciciosFundamentales.ejercicio12.entidades.ServicioPersona;

/**
 *
 * @author Maria Emilia
 */
public class ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPersona sp = new ServicioPersona();
        
        Persona p1 = sp.crearPersona();
        
        sp.mostrarPersona(p1);
        
        System.out.println("Edad: " + p1.calcularEdad());
        
        System.out.println(p1.menorQue(20));
    }
    
}
