/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("La nota esta entre 0 y 10?, contestar con N o S");
        int nota = leer.nextInt();

        while (nota < 0 || nota > 10) {

            System.out.println("Nota incorrecta, ingrese la nota de nuevo");
            nota = leer.nextInt();

        }
        
        System.out.println("Nota correcta");
    }
    
}
