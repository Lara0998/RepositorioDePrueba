/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una serie de caracteres que tenga como "
                + "caracteristicas: "
                + " un máximo de 5 caracteres de largo,"
                + " el primer carácter tiene que ser X y "
                + "el último tiene que ser una O.");
        String caract = null;
        int correct, incorrect;
        correct = 0;
        incorrect = 0;
        System.out.println("la secuencia especial “&&&&&” marca el final de los envíos ");
         do {
             System.out.println("Ingresar una palabra");
             caract = leer.nextLine();
             if (caract.length() == 5 && "x".equals(caract.substring(0, 1)) && "o".equals(caract.substring(4, 5))){
                 System.out.println("CORRECTO");
                 correct ++;
             } else {
                 System.out.println("INCORRECTO");
                 incorrect ++;
             }
         } while (!"&&&&&".equals(caract));
         System.out.println("La cantidad de palabras correctas son: " + correct);
         System.out.println("La cantidad de palabras incorrectas son: " + incorrect);
    }
    
}
