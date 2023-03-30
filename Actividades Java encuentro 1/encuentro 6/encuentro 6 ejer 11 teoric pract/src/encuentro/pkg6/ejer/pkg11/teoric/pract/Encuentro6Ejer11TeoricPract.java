/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg6.ejer.pkg11.teoric.pract;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro6Ejer11TeoricPract {

    /*
    Crea una aplicación que le pida dos números
    al usuario y este pueda elegir entre sumar,
    restar, multiplicar y dividir. La aplicación
    debe tener una función para cada operación
    matemática y deben devolver sus resultados
    para imprimirlos en el main. 
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1, num2;
         System.out.println("elegir una opci+on para realizar la operación"
                 + "");
    }
    public static int suma(int a, int b) {
        int c = a + b;
       return c; 
    }
    public static int resta(int d, int f) {
        int c = d - f;
        return c;
    }
    public static int multipl(int e, int r) {
        int c = e * r;
        return c;
    }
    public static int divic(int t, int y) {
        int c = t / y;
        return c;
    }
    
}
