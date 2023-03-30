/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar 20 números distintos a 0");
        int num, suma;
        suma = 0;
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            if(num != 0){
                System.out.println("Continua ingresando números");
            }
            suma = suma + num;
        } while (num != 0);
        System.out.println("se capturo el número 0");
        System.out.println("La suma de los números leídos son: " + suma);
    }
    
}
