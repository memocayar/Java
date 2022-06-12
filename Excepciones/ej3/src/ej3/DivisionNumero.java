/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

/**
 *
 * @author Maria Emilia
 */
public class DivisionNumero {

    public float dividir(int a, int b) throws Exception {
        float c = (float) a;
        float d = (float) b;
        Float resultado = null;
          
        try {
//            Double n = c / d;
            if (c != 0 || d != 0){
               resultado = c/d;
            }
            return resultado;
        } catch (Exception e) {
            System.out.println(e);
            throw new Exception("eee");
        } 
    }
}
