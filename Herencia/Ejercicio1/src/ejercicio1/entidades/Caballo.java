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
public class Caballo extends Animal{

    public Caballo(String nombre, Integer edad, String raza, String alimento) {
        super(nombre, edad, raza, alimento);
    }
    
    public void Alimentarse(){
        System.out.println("El caballo " + nombre + " come " + alimento);
    }
}
