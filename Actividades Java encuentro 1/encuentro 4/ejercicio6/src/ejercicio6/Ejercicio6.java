/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
       
        if (num1 > 25 && num2 > 25){
            System.out.println("Los números son mayor a 25");   
        } else if (num1 > 25){
            System.out.println("El priemr número es mayor a 25");
        }  else if (num2 > 25){
            System.out.println("El segundo número es mayor a 25");
        } 
        else {
            System.out.println("Los números son menor a 25");
        }
    }
    
}
