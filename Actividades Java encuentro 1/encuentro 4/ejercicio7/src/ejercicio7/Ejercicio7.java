/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indicar el tipo de motor entre 1 al 4");
        int motor = leer.nextInt();
        switch (motor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:  
                System.out.println("No existe un valor válido para tipo de bomba");
                break;
            default:
                System.out.println("El valor ingresado en la variable opcion es diferente" + "a todos los casos analizados por el switch");
        }
    }
    
}
