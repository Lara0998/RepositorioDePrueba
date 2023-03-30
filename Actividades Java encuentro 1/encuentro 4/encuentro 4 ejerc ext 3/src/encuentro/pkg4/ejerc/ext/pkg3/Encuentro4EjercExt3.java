/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejerc.ext.pkg3;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4EjercExt3 {

    /*
    Elaborar un algoritmo en el cuál se ingrese 
    una letra y se detecte si se trata de una vocal. 
    Caso contrario mostrar un mensaje. Nota: investigar 
    la función equals() de la clase String
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra;
        letra = leer.nextLine();
        if ("a".equals(letra) || "A".equals(letra) || "e".equals(letra )|| "E".equals(letra)|| "i".equals(letra)|| "I".equals(letra)|| "o".equals(letra)|| "O".equals(letra)|| "u".equals(letra)|| "U".equals(letra)){
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
    
}
