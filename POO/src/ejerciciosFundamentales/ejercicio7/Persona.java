/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio7;

import java.util.Scanner;

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
    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar nombre:");
        this.nombre = leer.nextLine();
        System.out.println("Ingresar edad:");
        this.edad = leer.nextInt();
      
        System.out.println("Ingresar inicial correspondiente al sexo Hombre/Mujer/Otro:");
        String rta;
        do {
            rta = leer.next();
            if ("H".equals(rta) || "M".equals(rta) || "O".equals(rta)){
                this.sexo = rta;
            } else {
                System.out.println("La opción ingresada no es válida. Recuerde ingresar únicamente H, M u O.");
                System.out.println("Intentelo nuevamente.");
            }
            
        } while (!"H".equals(rta) || !"M".equals(rta) || !"O".equals(rta));
        
        System.out.println("Ingresar peso en kilogramos:");
        this.peso = leer.nextDouble();
        System.out.println("Ingresar altura en metros:");
        this.altura = leer.nextDouble();
    }
    
    public Double calcularIMC(){
        Double IMC;
        IMC = peso / (altura * altura);
        return IMC;
    }
    
    public boolean esMayorDeEdad(){
        return edad >= 18;                   //refactoring
    }
    
}