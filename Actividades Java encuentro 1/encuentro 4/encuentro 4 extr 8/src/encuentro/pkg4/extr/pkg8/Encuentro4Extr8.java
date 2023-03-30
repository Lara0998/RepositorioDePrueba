/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.extr.pkg8;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4Extr8 {

    /*
    Escriba un programa que lea números 
    enteros. Si el número es múltiplo de cinco 
    debe detener la lectura y mostrar la cantidad de
    números leídos, la cantidad de números pares 
    y la cantidad de números impares. Al igual que en 
    el ejercicio anterior los números negativos no 
    deben sumarse. Nota: recordar el uso de la sentencia break.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese números");
        int num, par, impar, cant;
        par = 0;
        impar = 0;
        cant = 0;
        num = leer.nextInt();
        do{
           System.out.println("Ingresa otro número"); 
           num = leer.nextInt();
           if (num % 2 == 0){
               par++;
           } else {
               impar++;
           }
           cant++;
        } while(!(num % 5 == 0 || num % 5 == 5));
        System.out.println("La cantidad de números pares es: " + par);
        System.out.println("La cantidad de números impares es: " + impar);
        System.out.println("La cantidad total ingresada es:" + cant);
    }
    
}
