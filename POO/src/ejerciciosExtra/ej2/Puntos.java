/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosExtra.ej2;

import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class Puntos {
    private double x1; 
    private double y1; 
    
    private double x2; 
    private double y2;

    public Puntos() {
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos () {
        Scanner leer = new Scanner(System.in);
        System.out.println("PUNTO 1:");
        System.out.println("Ingresar valor en x:");
        this.x1 = leer.nextDouble();
        System.out.println("Ingresar valor en y:");
        this.y1 = leer.nextDouble();
        
        System.out.println("PUNTO 2:");
        System.out.println("Ingresar valor en x:");
        this.x2 = leer.nextDouble();
        System.out.println("Ingresar valor en y:");
        this.y2 = leer.nextDouble();
    }
    
    public double calcularDistancia () {
        double distancia;
        distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        return distancia; 
    }
}
