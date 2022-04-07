/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.servicios;

import Tienda.entidades.Producto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Maria Emilia
 */
public class ServicioProducto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> productosTienda = new HashMap();

    public Producto crearProducto() {
        System.out.println("Ingresar nombre del producto");
        String nombre = leer.next();
        System.out.println("Ingresar precio del producto");
        Double precio = leer.nextDouble();

        return new Producto(nombre, precio);
    }

    public void agregarProducto(String nombre, Double precio) {
        productosTienda.put(nombre, precio);
    }

    public void fabricaDeProductos() {
        int rta;

        do {
            Producto p = crearProducto();
            agregarProducto(p.getNombre(), p.getPrecio());

            System.out.println("¿Desea agregar otro producto?");
            System.out.println("1- SI");
            System.out.println("2- NO");
            rta = leer.nextInt();

            if (rta != 1 && rta != 2) {
                System.out.println("La respuesta ingresada no es válida. Inténtelo nuevamente");
            }
        } while (rta != 2);
    }

    public void eliminarProducto() {
        System.out.println("");
        System.out.println("Ingresar nombre del producto que desea eliminar");

        Producto p = new Producto(leer.next());
        int i = 0;

        Iterator<String> it = productosTienda.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().equals(p.getNombre())) {
                it.remove();
                i += 1;
            }
        }

        if (i == 0) {
            System.out.println("El producto ingresado no fue encontrado en la lista.");
        }
    }

    public void mostrarProductos() {
        for (Map.Entry<String, Double> entry : productosTienda.entrySet()) {
            System.out.println(entry.getKey() + ":  $ " + entry.getValue());
        }
    }

    public void modificarPrecio() {
        System.out.println("");
        System.out.println("Ingresar nombre del producto que desea modificar el precio");

        Producto p = new Producto(leer.next());
        int i = 0;
        
        for (Map.Entry<String, Double> var : productosTienda.entrySet()) {
            String key = var.getKey();
            Double value = var.getValue();
            
            if (key.equals(p.getNombre())){
                System.out.println("Ingresar nuevo precio");
                Double np = leer.nextDouble();
                
                productosTienda.put(key, np);
                i += 1;
            }
        }

        if (i == 0) {
            System.out.println("El producto ingresado no fue encontrado en la lista.");
        }
    }
}
