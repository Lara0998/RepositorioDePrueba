/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg5.ejerc.extr.pkg11;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro5EjercExtr11 {

    /*
    Escribir un programa que lea un número
    entero y devuelva el número de dígitos
    que componen ese número. Por ejemplo, si
    introducimos el número 12345, el programa
    deberá devolver 5. Calcular la cantidad de
    dígitos matemáticamente utilizando el operador
    de división. Nota: recordar que las variables
    de tipo entero truncan los números o resultados.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        int cont;
        cont = 0;
        while(num >= 1){
            cont++;
            //Dividiremos el número sucesivamente entre 10.
            //En cada división tomaremos la parte entera y 
            //volvemos a dividir. Este proceso se repite hasta
            //que se obtenga un cero como cociente en la división.
            num = num / 10;
        }
        System.out.println("El número tiene " + cont + " dígitos");
    }
    
}
