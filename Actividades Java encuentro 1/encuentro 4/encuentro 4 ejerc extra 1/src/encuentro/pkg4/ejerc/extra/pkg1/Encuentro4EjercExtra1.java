/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejerc.extra.pkg1;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4EjercExtra1 {

    /*
    Dado un tiempo en minutos, calcular su equivalente
    en días y horas. Por ejemplo, si el usuario ingresa
    1600 minutos, el sistema debe calcular su equivalente:
    1 día, 2 horas.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de minutos");
        int tiempo, minut, hora, dia;
        tiempo = leer.nextInt();
        //minut = 0;
        hora = 0;
        dia = 0;
        while (tiempo > 0){
            //tiempo mayor a 1140 pasa los días
            if (tiempo >= 1140){
                dia++;
                tiempo = tiempo - 1140;
            }else if (tiempo >= 60){
                hora++;
                tiempo = tiempo - 60;
            } else {
                //minut++;
                tiempo--;
            }
        }
        System.out.println("Dias: " + dia);
        System.out.println("horas: " + hora);
        //System.out.println("minutos: " + minut);
    }
    
}
