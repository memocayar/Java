/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio12.entidades;

import java.util.Date;

/**
 *
 * @author Maria Emilia
 */
public class Persona {
    private String nombre; 
    private Date fechaDeNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public int calcularEdad() {
        int edad;
        Date fechaAct = new Date();
               
        edad = fechaAct.getYear() - fechaDeNacimiento.getYear();
        
        return edad;
    }
    
    public boolean menorQue(int edad){
        return calcularEdad() <= edad;
    }
    
    
}
