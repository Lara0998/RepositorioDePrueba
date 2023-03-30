/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejercic.pkg8;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4Ejercic8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de elementos que quieras "
                + "para hacer un dibujo con *");
        int element = leer.nextInt();
        //Línea superio
        for (int i = 0; i < element; i++ ){
            System.out.print("*");
        }
        //Salto de línea
        System.out.println();
        //Centro de la forma, menos la parte superior e inferior, por eso es n-2
        for (int i = 0; i < element - 2; i++ ){
            System.out.print("*");
            for (int j = 0; j < element - 2; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //Línea inferior
        for (int i = 0; i < element; i++ ){
            System.out.print("*");
        }
    }
    
}
