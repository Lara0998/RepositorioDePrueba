/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejerc.pkg6;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4Ejerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números ");
        int num1, num2, opcion;
        String sali = "N";
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        while ("N".equalsIgnoreCase(sali)){
            System.out.print("MENU"
                + " 1.SUMAR"
                + " 2.RESTAR"
                + " 3.MULTIPLICAR"
                + " 4.DIVIDIR"
                + " 5.SALIR"
                + " Eliga una opción");
        opcion = leer.nextInt();
        
            switch (opcion) {
            case 1:
                System.out.println("La suma de " + num1 + " y de " + num2 + " es : " + (num1 + num2));
                
                break;
            case 2:
                System.out.println("La resta de " + num1 + " y de " + num2 + " es : " + (num1 - num2));
     
                break;
            case 3:
                System.out.println("La multiplicación de " + num1 + " y de " + num2 + " es : " + (num1 * num2));
                
                break;
            case 4:
                System.out.println("La división de " + num1 + " y de " + num2 + " es : " + (num1 / num2));
                
                break;
            case 5:    
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                sali = leer.next();
                if ("N".equalsIgnoreCase(sali)) {
                       continue;
                 } else {
                    System.out.println("Elegiste salir");
                    break;
                }
        }
        }
        
        }
        
    }
    
