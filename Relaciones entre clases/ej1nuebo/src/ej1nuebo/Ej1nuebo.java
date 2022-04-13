/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1nuebo;

/**
 *
 * @author Maria Emilia
 */
public class Ej1nuebo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro m1 = new Perro("Leonardo", "Chihuahua", 1, "pequeño");
        Perro m2 = new Perro("Chizzo", "Labrador", 7, "grande");

        Persona p1 = new Persona("Maria Emilia", "Mocayar", 18, 45717366, m2);
        Persona p2 = new Persona("Eliseo", "Aguero", 21, 43282822, m1);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

}
