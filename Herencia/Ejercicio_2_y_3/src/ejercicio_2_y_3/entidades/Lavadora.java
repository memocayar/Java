/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2_y_3.entidades;

import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class Lavadora extends Electrodomestico {

    protected Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga) {
        this.carga = carga;
    }

    public Lavadora(Double carga, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectromestico();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar carga en kg:");
        this.carga = leer.nextDouble();
        
        System.out.println(toString());
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            this.precio = this.precio + 500;
        }
    }
    
    @Override
    public String toString() {
        return "Lavadora{ Carga: " + this.carga + ", Precio: " + this.precio + ", Color: " + this.color + ", Consumo: " + this.consumo + ", Peso: " + this.peso + "}";
    }
}
