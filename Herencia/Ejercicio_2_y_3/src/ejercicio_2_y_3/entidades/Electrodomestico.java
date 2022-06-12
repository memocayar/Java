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
public abstract class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumo;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void precioFinal() {
        switch (consumo) {
            case 'A':
                this.precio = this.precio + 1000;
                break;
            case 'B':
                this.precio = this.precio + 800;
                break;
            case 'C':
                this.precio = this.precio + 600;
                break;
            case 'D':
                this.precio = this.precio + 500;
                break;
            case 'E':
                this.precio = this.precio + 300;
                break;
            case 'F':
                this.precio = this.precio + 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precio = precio + 100;
        } else if (peso >= 20 && peso <= 49) {
            precio = precio + 500;
        } else if (peso >= 50 && peso <= 79) {
            precio = precio + 800;
        } else if (peso >= 80) {
            precio = precio + 1000;
        }
    }

    public void comprobarConsumoEnergetico(char letra) {
        if (letra != 'A' & letra != 'B' & letra != 'C' & letra != 'D' & letra != 'E' & letra != 'F') {
        } else {
            letra = 'F';
        }
    }

    public void comprobarColor(String color) {
        color = color.toLowerCase();
        if (!"blanco".equals(color) & !"negro".equals(color) & !"rojo".equals(color) & !"azul".equals(color) & !"gris".equals(color)) {
        } else {
            this.color = "blanco";
        }
    }

    public void crearElectromestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar color:");
        this.color = leer.next();
        comprobarColor(color);

        System.out.println("Ingresar consumo");
        this.consumo = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumo);

        System.out.println("Ingresar peso en kg");
        this.peso = leer.nextDouble();
        
        this.precio = 1000d;
    }
}
