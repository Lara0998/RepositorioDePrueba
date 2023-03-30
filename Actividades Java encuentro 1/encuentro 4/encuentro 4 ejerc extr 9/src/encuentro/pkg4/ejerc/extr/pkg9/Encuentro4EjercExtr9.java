/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejerc.extr.pkg9;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4EjercExtr9 {

    /*
    Simular la división usando solamente restas. 
    Dados dos números enteros mayores que uno, realizar
    un algoritmo que calcule el cociente y el residuo
    usando sólo restas. Método: Restar el dividendo del
    divisor hasta obtener un resultado menor que el divisor,
    este resultado es el residuo, y el número de restas
    realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números que desee dividir");
        int num1, num2, cont, resto;
        cont = 0;
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        //el módulo del primer num y el segundo num
        resto = num1 % num2;
        while (num1 > resto){
            num1 = num1 - num2;
            cont++;
        }
        System.out.println("Dado que " + num1 + " es menor que " + num2 + ", entonces: el residuo es " + num1 + " y el cociente es: " + cont);
    }
    
}
