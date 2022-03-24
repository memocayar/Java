/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar una frase:");
        String frase = leer.nextLine();
        
        Cadena cad1 = new Cadena();
        cad1.setFrase(frase);
        cad1.setLongitud(frase.length());
        
        System.out.println("Cantidad de vocales: " + cad1.mostrarVocales());
        System.out.println("Frase invertida: " + cad1.invertirFrase());
        System.out.println("Veces repetida la letra a: " + cad1.vecesRepetido('a'));
        cad1.compararLongitud("Hola, cómo estás?");
        System.out.println( cad1.unirFrases(" ¿Cómo estás?") );
        System.out.println( cad1.reemplazar("@") );
        System.out.println(cad1.contiene('o'));
    }
    
}
