/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejer.ext.pkg4;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4EjerExt4 {

    /*
    Elaborar un algoritmo en el cuál se 
    ingrese un número entre 1 y 10 y se muestre
    su equivalente en romano.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un número entre 1 y 10");
        int num = leer.nextInt();
        if (num >= 1 && num <= 10){
            if(num == 1){
                System.out.println("Su equivalente en romano es: I");
            }else if (num == 2){
                System.out.println("Su equivalente en romano es: II");
            }else if (num == 3){
                System.out.println("Su equivalente en romano es: III");
            }else if (num == 4){
                System.out.println("Su equivalente en romano es: IV");
            }else if (num == 5){
                System.out.println("Su equivalente en romano es: V");
            }else if (num == 6){
                System.out.println("Su equivalente en romano es: VI");
            }else if (num == 7){
                System.out.println("Su equivalente en romano es: VII");
            }else if (num == 8){
                System.out.println("Su equivalente en romano es: VIII");
            }else if (num == 9){
                System.out.println("Su equivalente en romano es: IX");
            }else {
                System.out.println("Su equivalente en romano es: X");
            }
        }
        System.out.println("El número ingresado no esta dentro del rango indicado, volver a intentar");
    }
    
}
