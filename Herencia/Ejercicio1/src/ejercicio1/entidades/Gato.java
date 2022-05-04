/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.entidades;

/**
 *
 * @author Maria Emilia
 */
public class Gato extends Animal{

    public Gato(String nombre, Integer edad, String raza, String alimento) {
        super(nombre, edad, raza, alimento);
    }
    
    public void Alimentarse(){
        System.out.println("El gato " + nombre + " come " + alimento);
    }
}
