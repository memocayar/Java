package ejerciciosFundamentales.ejercicio2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria Emilia
 */

public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circunferencia circ1 = new Circunferencia(5); 
        
        circ1.setRadio(8);
        
        Circunferencia circ2 = new Circunferencia();
        circ2.crearCircunferencia();
        
        
        System.out.println("Area: " + circ1.area() + " Perimetro: " + circ1.perimetro());
        System.out.println("Area: " + circ2.area() + " Perimetro: " + circ2.perimetro());
    }
}
