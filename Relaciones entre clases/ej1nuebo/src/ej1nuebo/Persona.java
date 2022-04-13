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
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private long DNI;
    private 

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
    }

    public Persona(String nombre, String apellido, int edad, long DNI, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public long getDNI() {
        return DNI;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{ Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", DNI: " + DNI + ", Perro: " + perro + "}";
    }
}
