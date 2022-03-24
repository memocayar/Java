/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio7;

/**
 *
 * @author Maria Emilia
 */
public class ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1 = new Persona("Elias", 15, "H", 65.0, 1.77);
        Persona p2 = new Persona("Maria Emilia", 18, "M", 46.5, 1.59);
        Persona p3 = new Persona("Neva", 19, "O", 53.0, 1.65);
        Persona p4 = new Persona("Adriel", 23, "H", 65.0, 1.53);
        
        Double IMCs[] = new Double [4];
        boolean mayores[] = new boolean [4];
        
        IMCs[0] = p1.calcularIMC();
        IMCs[1] = p2.calcularIMC();
        IMCs[2] = p3.calcularIMC();
        IMCs[3] = p4.calcularIMC();
        
        mayores[0] = p1.esMayorDeEdad();
        mayores[1] = p2.esMayorDeEdad();
        mayores[2] = p3.esMayorDeEdad();
        mayores[3] = p4.esMayorDeEdad();
        
        int bajo=0, ideal=0, sobre=0, mayor=0, menor=0;
        
        for (int i = 0; i < 4; i++) {
            if (IMCs[i] < 20) {
                bajo += 1;
            } else if (IMCs[i] >= 20 && IMCs[i] >= 25){
                ideal += 1;
            } else {
                sobre += 1;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            if (mayores[i] == true) {
                mayor += 1;
            } else {
                menor += 1;
            }
        }
        
        bajo = bajo*100/4;
        ideal = ideal*100/4;
        sobre = sobre*100/4;
        mayor = mayor*100/4;
        menor = menor*100/4;
        
        System.out.println(bajo + "% de las personas están por debajo de su peso ideal.");
        System.out.println(ideal + "% de las personas están en su peso ideal.");
        System.out.println(sobre + "% de las personas están por encima de su peso ideal.");
        System.out.println("");
        System.out.println(mayor + "% de las personas son mayores de edad.");
        System.out.println(menor + "% de las personas son menores de edad.");
        System.out.println("");
    }
    
}
