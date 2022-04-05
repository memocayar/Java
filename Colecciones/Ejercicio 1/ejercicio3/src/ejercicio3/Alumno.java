/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Maria Emilia
 */
public class Alumno {
    private String nombre;
    private ArrayList<Integer> notas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList <Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas= " + notas + "}";
    }
    
    public int calcularNotaFinal(){
        int nf=0;
        for (Integer nota : notas) {
            nf = nf + nota;
        }
        nf = nf / notas.size();

        return nf;
    }
}
