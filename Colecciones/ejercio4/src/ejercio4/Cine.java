/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio4;

/**
 *
 * @author Maria Emilia
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPelicula cine = new ServicioPelicula();
        System.out.println("--CREANDO CINE--");
        
        cine.fabricaPeliculas();
        cine.menuMetodos();
    }
    
}
