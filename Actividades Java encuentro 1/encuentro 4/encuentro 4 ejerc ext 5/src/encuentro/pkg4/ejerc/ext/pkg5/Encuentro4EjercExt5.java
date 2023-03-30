/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejerc.ext.pkg5;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4EjercExt5 {

    /*
    Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% 
    de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
    descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos 
    sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y 
    luego un valor real que represente el costo del tratamiento 
    (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Socios tipo A"
                + " Socios tipo B "
                + " Socios tipo C "
                + " Seleccionar el tipo de socio");
        String socio;
        double cuota, descuento;
        socio = leer.nextLine();
        System.out.println("Ingrese la cuota a abonar");
        cuota = leer.nextDouble();
        switch(socio){
            case "A":
                descuento = (cuota - ((cuota * 50) / 100));
                System.out.println("El importe en efectivo a pagar con el 50% es :" + descuento);
                break;
            case "B":
                descuento = (cuota - ((cuota * 35) / 100));
                System.out.println("El importe en efectivo a pagar con el 35% es :" + descuento);
                break;
            case "C":
                System.out.println("Este tipo de socio no reciben descuentos sobre dichos tratamientos, su total a pagar es: " + cuota);
                break;
            default:
                System.out.println("El tipo de socio seleccionado no esta habilitado");
                break;
        }
    }
    
}
