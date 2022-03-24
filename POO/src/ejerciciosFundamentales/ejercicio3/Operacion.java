/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class Operacion {
    private Double numero1;
    private Double numero2;

    public Operacion(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public Double getNumero1() {
        return numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar número 1");
        numero1 = leer.nextDouble();
        System.out.println("Ingresar número 2");
        numero2 = leer.nextDouble();
    }
    
    public Double sumar() {
        Double suma = numero1 + numero2;
        return suma;
    }
    
    public Double restar() {
        Double resta = numero1 - numero2;
        return resta;
    }
    
    public Double multiplicar() {
        Double multiplicacion = numero1 * numero2;
        return multiplicacion;
    }
    
    public Double dividir() {
        if (numero2 != 0) {
            Double division = numero1 / numero2;
            return division;
        } else {
            System.out.println("Error. No puede realizarse una división por cero");
        }
        return null;
    }
}
