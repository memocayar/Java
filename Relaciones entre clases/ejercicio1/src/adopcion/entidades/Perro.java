/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adopcion.entidades;

/**
 *
 * @author Maria Emilia
 */
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamano;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    @Override
    public String toString(){
        return "{ Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + " años, Tamaño: " + tamano + "}";
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
}
