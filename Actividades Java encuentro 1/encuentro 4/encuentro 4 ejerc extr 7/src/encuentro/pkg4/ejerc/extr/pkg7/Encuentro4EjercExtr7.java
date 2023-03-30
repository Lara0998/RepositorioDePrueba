/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejerc.extr.pkg7;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4EjercExtr7 {

    /*
    Realice un programa que calcule y visualice
    el valor máximo, el valor mínimo y el promedio 
    de n números (n>0). El valor de n se solicitará al 
    principio del programa y los números serán introducidos por el usuario. 
    Realice dos versiones del programa, una usando el bucle 
    “while” y otra con el bucle “do - while”.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números");
        int num, maxi, mini, suma;
        double prom;
        num = leer.nextInt();
        maxi = 0;
        mini = 0;
        prom = 0;
        suma = 0;
        while(num > 0){
            System.out.println("Ingresa el número");
            num = leer.nextInt();
            suma = suma + num;
            if(num > maxi){
                maxi = num;
            }
            if (num < mini){
                mini = num;
            }
            prom++;
        }
        System.out.println("El maximo es: " + maxi);
        System.out.println("El minimo es: " + mini);
        System.out.println("el promedio es: " + (suma / prom) );
    }
    
}
