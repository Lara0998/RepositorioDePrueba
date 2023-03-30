/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.act.pkg4;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4Act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra, letra;
        System.out.println("Ingrese una palabra o frase");
        palabra = leer.nextLine();
        letra=palabra.substring(0, 1);///meda la primera letra
        if (letra.equals("A")|| letra.equals("a")) { /*para ver si es igual a la palabra o caracter que se esta comparando*/
            System.out.println("La primera letra es "+letra);
            System.out.println("Correcto");
            
        }else{
            System.out.println("La primera letra es "+letra);
            System.out.println("Incorrecto");
        }
    }
    }
