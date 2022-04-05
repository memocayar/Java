/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class ServicioRazas {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<String> razas = new ArrayList();

    public ServicioRazas() {
    }

    public ServicioRazas(ArrayList<String> razas) {
        this.razas = razas;
    }
    
    public void mostrarRazas() {
        System.out.println("");
        System.out.println("Las razas ingresadas son:");
        for (String var : razas) {
            System.out.println(var);
        }
        System.out.println("");
    }
    
    public void ingresarRaza() {
        int rta = 1;
        String aux = "";
        do {
            System.out.println("Ingresar raza del perro:");
            aux = leer.nextLine();
            razas.add(aux);

            System.out.println("La raza fue agregada correctamente. ¿Desea agregar otra raza de perro?");
            System.out.println("1- SI");
            System.out.println("2- NO");
            rta = leer.nextInt();

            leer.nextLine();
        } while (rta == 1);
        
        mostrarRazas();
    }

    public void eliminarRaza() {
        String r = "";
        System.out.println("Ingrese qué raza desea eliminar");
        r = leer.next();

        for (int i = 0; i < razas.size(); i++) {
            if (razas.get(i).equals(r)) {
                razas.remove(i);
            }
        }
        
        mostrarRazas();
    }
}
