/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejerc.pkg3;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4Ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar una frase o palabra de 8 letras");
        String frase = leer.nextLine();
        int length = frase.length();
        do {
            if (frase.length()!= 8) {
                System.out.println("INCORRECTO");
                frase = leer.nextLine();
            }
        } while (frase.length() != 8);
        System.out.println("CORRECTO");
    }
    
}
