/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar radio");
        this.radio = leer.nextDouble();
    }
    
    public Double area() {
       Double area = 3.14 * radio * radio;
       return area;
    }
    
    public Double perimetro(){
       Double perimetro = 2 * 3.14 * radio;
       return perimetro;
    }
}
