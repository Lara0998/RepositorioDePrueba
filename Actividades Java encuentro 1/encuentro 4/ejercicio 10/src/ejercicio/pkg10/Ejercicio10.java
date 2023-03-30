/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar 4 números entre 1 y 20");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();
        if (num1 > 1 && num1 < 20){
            System.out.print(num1);
            for (int i = 1; i <= num1; i++){
                System.out.print("*");
            }
        } else {
            System.out.println("El número ingresado es invalido");
            num1 = leer.nextInt();
        } System.out.println(" ");
        if (num2 > 1 && num2 < 20){
            System.out.print(num2);
            for (int i = 0; i < num2; i++){
                System.out.print("*"); 
            }
        } else {
            System.out.println("El número ingresado es invalido");
            num2 = leer.nextInt();
        } System.out.println(" ");
        if (num3 > 1 && num3 < 20){
            System.out.print(num3);
            for (int i = 0; i < num3; i++){
                System.out.print("*");
            }
        } else {
            System.out.println("El número ingresado es invalido");
            num3 = leer.nextInt();
        } System.out.println(" ");
        if (num4 > 1 && num4 < 20){
            System.out.print(num4);
            for (int i = 0; i < num4; i++){
                System.out.print("*");
            }
        } else {
            System.out.println("El número ingresado es invalido");
            num4 = leer.nextInt();
        } System.out.println(" ");
    }
}
