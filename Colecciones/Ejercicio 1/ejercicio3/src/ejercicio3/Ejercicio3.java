/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Maria Emilia
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioAlumnos curso1 = new ServicioAlumnos();
        
        curso1.fabricaAlumnos();
        curso1.mostrarLista();
        curso1.notaFinal();
    }
    
}
