/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg6.ejerc.pkg4;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro6Ejerc4 {

    /*
    Crea una aplicación que nos pida un
    número por teclado y con una función 
    se lo pasamos por parámetro para que
    nos indique si es o no un número primo,
    debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede
    dividirse entre 1 y sí mismo. Por ejemplo:
    25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número que quisiera saber si es primo: ");
        int num = leer.nextInt();
        if(primo(num)){
            System.out.println("Es primo");
        }else {
            System.out.println("No es primo");
        }
    }
    public static boolean primo(int num){
        boolean resp = true;
        for (int i = 0; i < num; i++){
            if(i != 1 && i != num){
                if(num % i == 0){
                    resp = false;
                    break;
                }
            }
                
            }
        return resp;
    }
}
