/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.act.pkg5;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4Act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma, numero, limite;
        suma=0;
        System.out.println("ingrese un limite positivo");
        limite=leer.nextInt();
        System.out.println("Ingrese un numero");
        numero=leer.nextInt();
        suma=suma+numero;
        while (suma<limite) {  
            System.out.println("Ingrese un numero");
        numero=leer.nextInt();
        suma=suma+numero;
        }
        System.out.println("La suma es: "+suma);
    }
    }
    