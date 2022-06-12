/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author Maria Emilia
 */
public class Persona {
    private String nombre; 
    private int edad; 
    private String sexo;
    private Double peso;
    private Double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public Double calcularIMC(){
        Double IMC;
        IMC = peso / (altura * altura);
        return IMC;
    }
    
    public boolean esMayorDeEdad(){
        return edad >= 18;                   //refactoring
    }
    
    @Override
    public String toString(){
        return "Persona{ Nombre" + this.nombre + ", Edad: " + this.edad + ", Sexo: " + this.sexo + ", Peso: " + this.peso + "kg, Altura: " + this. altura; 
    }
}