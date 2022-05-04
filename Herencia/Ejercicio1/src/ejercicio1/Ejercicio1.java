/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ejercicio1.entidades.Animal;
import ejercicio1.entidades.Caballo;
import ejercicio1.entidades.Gato;
import ejercicio1.entidades.Perro;

/**
 *
 * @author Maria Emilia
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro = new Perro("Stich", 2, "Doberman", "carne");
        perro.Alimentarse();
        
        Animal gato = new Gato("Leo", 1, "naranjita", "atún");
        gato.Alimentarse();
        
        Animal caballo = new Caballo("Darcy", 3, "fino", "zanahoria");
        caballo.Alimentarse();
        
    }
    
}
