/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejerc.ext.pkg6;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4EjercExt6 {

    /*
    Leer la altura de N personas y determinar 
    el promedio de estaturas que se encuentran 
    por debajo de 1.60 mts. y el promedio de estaturas en general.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de personas a medir");
        int personas = leer.nextInt();
        int promediodebajo, contadorgeneral;
        double alturas, suma, sumadebajo;
        suma = 0;
        sumadebajo = 0;
        promediodebajo = 0;
        contadorgeneral = 0;
        for(int i = 0; i < personas; i++){
            System.out.println("Ingrese la altura de la persona");
            alturas = leer.nextDouble();
            suma = suma + alturas;
            contadorgeneral++;
            if(alturas <= 1.60){
                sumadebajo = sumadebajo + alturas;
                promediodebajo++;
            }
        }
        System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 mts es: " + (sumadebajo / promediodebajo));
        System.out.println("El promedio de estaturas en general es: " + (suma / contadorgeneral));
    }
    
}
