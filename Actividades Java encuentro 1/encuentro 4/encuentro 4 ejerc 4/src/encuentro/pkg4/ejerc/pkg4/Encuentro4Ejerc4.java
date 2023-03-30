/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejerc.pkg4;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4Ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar una frase o palabra que inicie con A");
        String palabra, letra;
        palabra = leer.nextLine();
        letra = palabra.substring(0, 1);
        
            if (letra.equals("A")||letra.equals("a")){
                System.out.println("La primero letra es: " + letra);
                System.out.println("CORRECTO");
            } else {
                System.out.println("INCORRECTO");
                System.out.println("La primero letra es: " + letra);
            }
        
    }
}
