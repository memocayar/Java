/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adopcion.servicios;

import adopcion.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Persona> lista = new ArrayList();
    
    public Persona crearPersona() {

        return new Persona("Maria Emilia", "Mocayar", 18, 45717366);
    }

}
