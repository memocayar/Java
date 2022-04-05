/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;
import ejercicio3.Alumno; 
import java.util.ArrayList;

/**
 *
 * @author Maria Emilia
 */
public class ServicioAlumnos {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Alumno> alumnos = new ArrayList();
    
    public void fabricaAlumnos() {
        Alumno a;
        int rta; 
        
        do {
            a = crearAlumno();
            agregarAlumno(a);
        
            System.out.println("¿Desea ingresar otro alumno?");
            System.out.println("1- SI");
            System.out.println("2- NO");
            rta = leer.nextInt();
        } while (rta == 1);
        
    }
    
    public Alumno crearAlumno(){
        System.out.println("Ingresar nombre del alumno");
        String nombre = leer.next();
        
        ArrayList <Integer> notas = new ArrayList();
        notas = crearNotas();
        

        return new Alumno(nombre, notas);
    }
    
    public ArrayList<Integer> crearNotas() {
        ArrayList <Integer> notas = new ArrayList();
        
        for (int i=0; i<3; i++){
            System.out.println("Ingresar nota " + (i+1));
            int n = leer.nextInt();
            notas.add(n);
        }
        
        return notas;
    }
    
    public void agregarAlumno(Alumno a){
        alumnos.add(a);
    }
    
    public void mostrarLista(){
        for (Alumno var : alumnos) {
            System.out.println(var);
        }   
    }
    
    public void notaFinal(){
        System.out.println("Ingrese el nombre del alumno que desea mostrar su nota final:");
        String nombre = leer.next();
        
        boolean buscar = false; 
        for (Alumno alumno : alumnos) {
            if(alumno.getNombre().equals(nombre)){
                buscar = true;
                System.out.println("La nota final de " + alumno.getNombre() + " es " + alumno.calcularNotaFinal());
                break;
            } 
        }   
        
        if (buscar == false) {
            System.out.println(nombre + " no fue encontrado en la lista de alumnos.");
        }
    }
            
}
