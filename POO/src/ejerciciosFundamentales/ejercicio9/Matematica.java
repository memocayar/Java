/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio9;

/**
 *
 * @author Maria Emilia
 */
public class Matematica {
    private double n1;
    private double n2;

    public Matematica() {
    }

    public Matematica(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public double devolverMayor() {
        double mayor; 
        
        mayor = Math.max(n1, n2);
        
        return mayor;
    }
    
    public double calcularPotencia() {
        double potencia;
        
        potencia = Math.pow(Math.max(n1, n2), Math.min(n1, n2));

        return potencia;
    }
    
    public double calcularRaiz() {
        double raiz; 
        
        raiz = Math.sqrt(Math.abs(Math.min(n1, n2)));
    
        return raiz;
    }
}
