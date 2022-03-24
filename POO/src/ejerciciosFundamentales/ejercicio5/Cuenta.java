/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class Cuenta {
    private int numeroCuenta;
    private long DNI;
    private Double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, Double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(Double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void crearCuenta() {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingresar número de cuenta:");
       numeroCuenta = leer.nextInt();
       System.out.println("Ingresar DNI sin puntos:");
       DNI = leer.nextLong();
       System.out.println("Ingresar saldo actual:");
       saldoActual = leer.nextDouble();
    }
    
    public void ingresar(Double ingreso) {
        saldoActual += ingreso;
    }
    
    public void retirar(Double retiro) {
        if (retiro > saldoActual) {
            saldoActual = 0.0;
            System.out.println("Fondos insuficientes.");
        } else {
            saldoActual -= retiro;
        }
    }
    
    public void extraccionRapida(Double extraccion) {
        if (extraccion <= (saldoActual * 20 / 100)) {
            saldoActual -= extraccion;
        } else {
            System.out.println("La extracción no pudo ser realizada ya que supera el limite del 20% del saldo actual.");
        }
    }
    
    public void consultarSaldo() {
        System.out.println("El saldo actual es: $" + this.saldoActual);
    }
    
    public void consultarDatos() {
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("DNI: " + this.DNI);
        System.out.println("Saldo actual: $" + this.saldoActual);
    }
}
