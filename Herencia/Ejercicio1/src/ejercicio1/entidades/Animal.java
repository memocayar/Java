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
public abstract class Animal {
    protected String nombre; 
    protected Integer edad; 
    protected String raza;
    protected String alimento;

    public Animal(String nombre, Integer edad, String raza, String alimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.alimento = alimento;
    }
   
    public void Alimentarse(){
        // System.out.println(nombre + " come " + alimento);
    };
}
