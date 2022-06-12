/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

/**
 *
 * @author Maria Emilia
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] alumnos = new String[5];
        
        // ** Probando error ** 
        //System.out.println alumnos[6]);
        
        // ** Try - catch 
        
        try {
            System.out.println (alumnos[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No existe un alumno en esa posición de la lista.");
        }
    }
    
}
