/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejerc.pkg5;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4Ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un valor límite");
        System.out.println("Ingresa números");
        int limit, num, suma;
        limit = leer.nextInt();
        num = leer.nextInt();
        suma = 0;
        do {
            suma = suma + num;
            if (suma < limit){
               System.out.println("Continuar ingresando números ");
               num = leer.nextInt();
            }
        } while (suma < limit);
        System.out.println("La suma es " + suma + " supero al limite : " + limit);
    }
    
}
