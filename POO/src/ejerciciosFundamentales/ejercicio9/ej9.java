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
public class ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematica m1 = new Matematica();
        m1.setN1(Math.random() * 1000);
        m1.setN2(Math.random() * 1000);
        
        System.out.println("Número 1: " + m1.getN1());
        System.out.println("Número 2: " + m1.getN2());
        System.out.println("Mayor: " + m1.devolverMayor());
        System.out.println("Potencia del mayor elevado al menor: " + m1.calcularPotencia());
        System.out.println("Raíz del menor: " + m1.calcularRaiz());
    }
    
}
