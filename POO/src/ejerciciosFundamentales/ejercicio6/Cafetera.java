/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class Cafetera {
    private float capacidadMaxima;
    public float cantidadActual;

    public Cafetera() {
    }

    public Cafetera(float capacidadMaxima, float cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public float getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public float getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(float capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(float cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }
    
    public void servirTaza() {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingresar tamaño de la taza:");
        float taza = leer.nextFloat();
        
        if (cantidadActual < taza) {
            System.out.println("No hay suficiente café en la cafetera para llenar la taza. Se sirvió " + cantidadActual);
            cantidadActual = 0;
        } else {
            cantidadActual -= taza;
        }
    }
    
    public void vaciarCafetera() {
        cantidadActual = 0;
    }
    
    public void agregarCafe() {
        Scanner leer = new Scanner(System.in); 
        System.out.println("¿Cuánto café desea agregar?");
        float agregar = leer.nextFloat();
        
        cantidadActual += agregar;
    }
}
