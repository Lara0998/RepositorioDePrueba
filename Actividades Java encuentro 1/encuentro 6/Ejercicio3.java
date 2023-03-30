/*
3-  Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden 
    ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no 
    devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
*/

package guia3;

import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos euros queres convertir: ");
        double euros = leer.nextInt();
        cambio(euros);
    }
    
    public static void cambio(double moneda){
        Scanner leer = new Scanner(System.in);
        int opc;
        System.out.println("A que moneda quiere convertir los euros? ");
        System.out.println(" \n El cambio de divisas es: " +
                                  " \n 1.  0.86 libras es un 1 €\n" +
                                  "\n  2. 1.28611 $ es un 1 €   \n" +
                                  "\n  3.  129.852 yenes es un 1 €");
        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("Su cambio de euros a libras es:" +moneda*0.86 );
                break;
            case 2:
                System.out.println("Su cambio de euros a dolares es:" +moneda*1.28611 );
                break;
            case 3:
                System.out.println("Su cambio de euros a yenes es:" +moneda*129.852);
                break;
            default:
                throw new AssertionError();
        }
    }

}
