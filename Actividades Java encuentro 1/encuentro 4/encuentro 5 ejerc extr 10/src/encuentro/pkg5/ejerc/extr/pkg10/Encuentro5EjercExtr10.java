/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg5.ejerc.extr.pkg10;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro5EjercExtr10 {

    /*
    Realice un programa para que el usuario
    adivine el resultado de una multiplicación
    entre dos números generados aleatoriamente
    entre 0 y 10. El programa debe indicar al
    usuario si su respuesta es o no correcta.
    En caso que la respuesta sea incorrecta se
    debe permitir al usuario ingresar su respuesta
    nuevamente. Para realizar este ejercicio investigue
    como utilizar la función Math.random() de Java.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Adivine el resultado de una multiplicación aleatoria");
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int result1, result;
        do{
            result1 = num1 * num2;
            result = leer.nextInt();
            if(result != result1){
                System.out.println("Su respuesta " + result + " es incorrecta, vuelva a intentar ");
                result = leer.nextInt();
            } else {
                System.out.println("Su respuesta " + result + " es correcta");
            }
        } while(result == 0);
        
    }
    
}
