/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2_y_3.servicios;

import ejercicio_2_y_3.entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class ServicioElectrodomestico {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void comprobarConsumoEnergetico(char letra){
        if (letra != 'A' & letra != 'B' & letra != 'C' & letra != 'D' & letra != 'E' & letra != 'F') {  
        } else {
            letra = 'F';
        }
    }
    
    public void comprobarColor(String color){
        color = color.toLowerCase();
        if (!"blanco".equals(color) & !"negro".equals(color) & !"rojo".equals(color) & !"azul".equals(color) & !"gris".equals(color)){
        } else {
            color = "blanco";
        }
    }
    
    public Electrodomestico crearElectromestico(){
        System.out.println("Ingresar color:");
        String color = leer.next();
        comprobarColor(color);
        
        System.out.println("Ingresar consumo");
        char consumo = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumo);
        
        System.out.println("Ingresar peso en kg");
        Double peso = leer.nextDouble();
        
        return new Electrodomestico(1000d, color, consumo, peso);
    }
    
}
