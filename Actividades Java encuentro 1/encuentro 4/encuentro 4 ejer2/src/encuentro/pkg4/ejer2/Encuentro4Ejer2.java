/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejer2;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la frase Eureka");
        String frase = leer.nextLine();
        
        do {
            if (!"Eureka".equals(frase)) {
            System.out.println("Incorrecto vuelve a intentarlo");
            frase = leer.nextLine();
            }
        } while (!"Eureka".equals(frase));
         System.out.println("Correcto");
    }
    
}
