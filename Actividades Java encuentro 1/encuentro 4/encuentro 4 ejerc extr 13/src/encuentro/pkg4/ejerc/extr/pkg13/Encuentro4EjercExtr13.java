/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejerc.extr.pkg13;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4EjercExtr13 {

    /*
    Crear un programa que dibuje una 
    escalera de números, donde cada línea
    de números comience en uno y termine en el
    número de la línea.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indica el largo de la escalera de números");
        int num = leer.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
