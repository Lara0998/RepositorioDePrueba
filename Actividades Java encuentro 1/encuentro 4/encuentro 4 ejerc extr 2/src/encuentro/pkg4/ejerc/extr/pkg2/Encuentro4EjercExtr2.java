/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejerc.extr.pkg2;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4EjercExtr2 {

    /*
    Declarar cuatro variables de tipo entero A, B, C y D 
    y asignarle un valor diferente a cada una. A continuación, 
    realizar las instrucciones necesarias para que: B tome el valor de C,
    C tome el valor de A, A tome el valor de D y D tome el valor de B. 
    Mostrar los valores iniciales y los valores finales de cada variable. 
    Utilizar sólo una variable auxiliar.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar 4 valores difentes");
        int A, B, C, D, aux;
        A = leer.nextInt();
        B = leer.nextInt();
        C = leer.nextInt();
        D = leer.nextInt();
        if (A != B && A != C && B != C && B != D && C != D && D != A){
            System.out.println("Valor inicial de A: " + A);
            System.out.println("Valor inicial de B: " + B);
            System.out.println("Valor inicial de C: " + C);
            System.out.println("Valor inicial de D: " + D);
            aux = B;
            B = C;
            C = A;
            A = D; 
            D = aux;
            System.out.println("Valor final de A: " + A);
            System.out.println("Valor final de B: " + B);
            System.out.println("Valor final de C: " + C);
            System.out.println("Valor final de D: " + D);
        }
    }
    
}
