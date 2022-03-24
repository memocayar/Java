/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio4;

/**
 *
 * @author Maria Emilia
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo rect1 = new Rectangulo();
        
        System.out.println("Superficie: " + rect1.superficie());
        System.out.println("Perímetro: " + rect1.perimetro());
        
        rect1.dibujar();
    }
}
