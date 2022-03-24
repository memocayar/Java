/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosFundamentales.ejercicio8;

/**
 *
 * @author Maria Emilia
 */
public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public int mostrarVocales() {
        int vocales = 0; 
        for (int i = 0; i < this.longitud; i++) {
            if (frase.charAt(i) == 'a'|| frase.charAt(i) == 'e'|| frase.charAt(i) == 'i'|| frase.charAt(i) == 'o'|| frase.charAt(i) == 'u') {
                vocales += 1;
            }
        }
        return vocales;
    }
    
    public String invertirFrase() {
        String invertida = "";
        String aux;
        for (int i = longitud-1; i>=0; i--) {
            aux = String.valueOf(frase.charAt(i));
            invertida = invertida.concat(aux);
        }
        return invertida;
    }
    
    public int vecesRepetido(char letra){
        int contador = 0;
        for (int i = 0; i < longitud ; i++) {
            if (frase.charAt(i) == letra) {
                contador += 1;
            }
        }
        return contador;
    }
    
    public void compararLongitud(String frase2) {
        if (frase2.length() == longitud) {
            System.out.println("La frase ingresada es igual de larga.");
        } else if (frase2.length() > longitud) {
            System.out.println("La frase ingresada es más larga.");
        } else {
            System.out.println("La frase ingresada es más corta.");
        }
    }
    
    public String unirFrases(String frase2) {
        String fraseResultante;
        fraseResultante = frase.concat(frase2);
        return fraseResultante;
    }
    
    public String reemplazar(String letra) {
        String frase2 = "";
        String aux;
        
        for (int i = 0; i < longitud; i++) {
            aux = String.valueOf(frase.charAt(i));
            if (frase.charAt(i) == 'a'){
                frase2 = frase2.concat(letra);
            } else {
                frase2 = frase2.concat(aux);
            }
        }
        
        return frase2;
    }
    
    public boolean contiene(char letra){
        boolean contiene = false;
        for (int i = 0; i < longitud; i++) {
            if (frase.charAt(i) == letra) {
                contiene = true;
                break;
            }
        }
        return contiene;
    }
}
