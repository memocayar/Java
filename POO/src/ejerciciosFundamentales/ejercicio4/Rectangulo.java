/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class Rectangulo {
    private float base; 
    private float altura; 

    public Rectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar base:");
        base = leer.nextFloat();
        System.out.println("Ingresar altura:");
        altura = leer.nextFloat();
    }
    
    public float superficie(){
        float sup = base * altura;
        return sup;
    }
    
    public float perimetro(){
        float per = (base+altura)*2;
        return per;
    }
    
    public void dibujar(){
        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura-1) {
                for (int j = 0; j < base; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < base; j++) {
                    if (j == 0 || j == base-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    } 
                }
            }
            System.out.println("");
        }
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
