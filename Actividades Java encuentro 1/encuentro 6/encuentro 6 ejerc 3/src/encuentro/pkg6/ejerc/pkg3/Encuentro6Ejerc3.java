/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg6.ejerc.pkg3;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro6Ejerc3 {

    /*
    Crea una aplicación que a través
    de una función nos convierta una
    cantidad de euros introducida por
    teclado a otra moneda, estas pueden
    ser a dólares, yenes o libras. La función
    tendrá como parámetros, la cantidad de euros
    y la moneda a convertir que será una cadena,
    este no devolverá ningún valor y mostrará
    un mensaje indicando el cambio (void).
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos euros queres convertir: ");
        double euros = leer.nextDouble();
        cambio(euros);
    }
    public static void cambio(double moneda){
        int opc;
        System.out.println("A que moneda quiere convertir los euros? "
                + "\n 1.* 0.86 libras es un 1 €\n" +
"2.* 1.28611 $ es un 1 €\n" +
"3.* 129.852 yenes es un 1 €");
        opc = leer.nextInt();
        switch(opc) {
            case 1:
                System.out.println("Se cambio de euros a libras es: " + moneda + 0.86 + " libras");
                break;
            case 2:
                System.out.println("Se cambio de euros a dolar es: " + moneda + 1.28611 + " dolares");
                break;
            case 3:
                System.out.println("Se cambio de euros a yenes es: " + moneda + 129.852 + " yenes");
                break;
            default:
                System.out.println("Selección equivocada");
                break;
        }
    }
}
