/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class ServicioPelicula {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> cine = new ArrayList();

    public Pelicula crearPelicula() {
        System.out.println("Ingresar nombre de la pelicula");
        String titulo = leer.next();

        System.out.println("Ingresar director/a");
        String director = leer.next();

        System.out.println("Ingresar duracion de la pelicula en horas");
        Integer duracion = leer.nextInt();

        return new Pelicula(titulo, director, duracion);
    }

    public void fabricaPeliculas() {
        Pelicula p;
        int rta;

        do {
            p = crearPelicula();
            agregarPelicula(p);

            System.out.println("¿Desea agregar otra película?");
            System.out.println("1- SI");
            System.out.println("2- NO");
            rta = leer.nextInt();
        } while (rta == 1);
    }

    public void agregarPelicula(Pelicula p) {
        cine.add(p);
    }
    
    public void mostrarPeliculas() {
        System.out.println("");
        for (Pelicula pelicula : cine) {
            System.out.println(pelicula);
        }
    }
    
    public void mostrarPeliculasMasUnaH() {
        for (Pelicula pelicula : cine) {
            if (pelicula.getDuracion() >= 1){
                System.out.println(pelicula);
            }
        }
    }
    
    public void menuMetodos() {
        int rta;

        do {
            System.out.println("¿QUÉ DESEA REALIZAR?");
            System.out.println("1- Mostrar");
            System.out.println("2- Ordenar");
            rta = leer.nextInt();
            
            switch (rta) {
                case 1:
                    System.out.println("1- Mostrar todas las películas");
                    System.out.println("2- Mostrar las películas que duran más de 1 hora");

                    rta = leer.nextInt();
                    switch (rta) {
                        case 1:
                            mostrarPeliculas();
                            break;
                        case 2:
                            mostrarPeliculasMasUnaH();
                            break;
                    }
                    break;

                case 2:
                    System.out.println("1- Ordenar películas por duración en orden ascendente");
                    System.out.println("2- Ordenar películas por duración en orden descendente");
                    System.out.println("3- Ordenar las películas por título alfabéticamente");
                    System.out.println("4- Ordenar las películas por director alfabéticamente");

                    rta = leer.nextInt();
                    switch (rta) {
                        case 1:
                            Collections.sort(cine, Comparadores.ordenarDuracionAsc);
                            break;
                        case 2:
                            Collections.sort(cine, Comparadores.ordenarDuracionDesc);
                            break;
                        case 3:
                            Collections.sort(cine, Comparadores.ordenarTitulo);
                            break;
                        case 4:
                            Collections.sort(cine, Comparadores.ordenarDirector);
                            break;
                    }

                    mostrarPeliculas();
            }
            
            System.out.println("");
            System.out.println("¿Desea realizar otra acción?");
            System.out.println("1- SI");
            System.out.println("2- NO");
            rta = leer.nextInt();
        } while (rta == 1);
    }
}
