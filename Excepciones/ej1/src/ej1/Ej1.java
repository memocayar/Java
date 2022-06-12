/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.ArrayList;

/**
 *
 * @author Maria Emilia
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> Personas = new ArrayList();
//
//        Persona p1 = new Persona("Elias", 15, "H", 65.0, 1.77);
//        Persona p2 = new Persona("Maria Emilia", 18, "M", 46.5, 1.59);
//        Persona p3 = new Persona("Neva", 19, "O", 53.0, 1.65);
//        Persona p4 = new Persona("Adriel", 23, "H", 65.0, 1.53);
        Persona p5 = new Persona();

//        Personas.add(p1);
//        Personas.add(p2);
//        Personas.add(p3);
//        Personas.add(p4);
        Personas.add(p5);

        ArrayList<Double> IMCs = new ArrayList();
        for (Persona p : Personas) {
            try {
                Double aux = p.calcularIMC();
                IMCs.add(aux);
            } catch (NullPointerException e) {
                System.out.println("No se pudo calcular el IMC");
            }
        }

        ArrayList<Boolean> Mayores = new ArrayList();
        for (Persona p : Personas) {
            Boolean aux = p.esMayorDeEdad();
            Mayores.add(aux);
        }

        int bajo = 0, ideal = 0, sobre = 0, mayor = 0, menor = 0;

        for (Double aux : IMCs) {
            if (aux < 20) {
                bajo += 1;
            } else if (aux >= 20 && aux >= 25) {
                ideal += 1;
            } else {
                sobre += 1;
            }
        }

        for (Boolean aux : Mayores) {
            if (aux == true) {
                mayor += 1;
            } else {
                menor += 1;
            }
        }

        bajo = bajo * 100 / (IMCs.size() + 1);
        ideal = ideal * 100 / (IMCs.size() + 1);
        sobre = sobre * 100 / (IMCs.size() + 1);
        mayor = mayor * 100 / (IMCs.size() + 1);
        menor = menor * 100 / (Mayores.size() + 1);

        System.out.println("Cantidad de personas: " + Personas.size());
        System.out.println(bajo + "% de las personas están por debajo de su peso ideal.");
        System.out.println(ideal + "% de las personas están en su peso ideal.");
        System.out.println(sobre + "% de las personas están por encima de su peso ideal.");
        System.out.println("");
        System.out.println(mayor + "% de las personas son mayores de edad.");
        System.out.println(menor + "% de las personas son menores de edad.");
        System.out.println("");
    }

}
