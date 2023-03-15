/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraactividad;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class PrimeraActividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que pida dos números enteros
        por teclado y calcule la suma de los dos. El programa
        deberá después mostrar el resultado de la suma
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar dos números enteros");
        int numEntero = leer.nextInt();
        int num2Entero = leer.nextInt();
        int suma = numEntero + num2Entero;
        System.out.println("La suma es: " + suma);
    }
    
}
