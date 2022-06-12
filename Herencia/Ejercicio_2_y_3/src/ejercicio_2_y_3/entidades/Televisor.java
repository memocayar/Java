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
public class Televisor extends Electrodomestico {

    protected Double resolucion;
    protected Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        super.crearElectromestico();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar carga en pulgadas:");
        this.resolucion = leer.nextDouble();
        System.out.println("¿Posee sintonizador TDT? (s/n)");
        String rta = leer.next();
        
        if (rta.equals('s')) {
            this.sintonizadorTDT = true;
        } else {
            this.sintonizadorTDT = false;
        }
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion >= 40) {
            this.precio = this.precio + (this.precio * 30 / 100);
        }
        if (sintonizadorTDT == true) {
            this.precio = this.precio + 500;
        }
    }

}
