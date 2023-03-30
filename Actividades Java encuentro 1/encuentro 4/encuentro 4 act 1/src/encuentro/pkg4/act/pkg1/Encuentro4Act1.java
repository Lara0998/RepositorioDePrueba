/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.act.pkg1;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4Act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = leer.nextInt();
        if (num % 2 != 0){
            System.out.println("El número ingresado es impar " + num);
        } else {
            System.out.println("El número ingresado es par " + num);
        }
    }
    
}
