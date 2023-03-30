/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejerc.pkg7;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4Ejerc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra="";
        int correctos=0;
        int incorrectos=0;
        
        do {            
            System.out.println("Ingrese una palabra");
            palabra= leer.nextLine();
            if (palabra.length()==5 && "x".equals(palabra.substring(0,1))&& "o".equals(palabra.substring(4,5))) {
                correctos ++;
            }else{
                incorrectos ++;
            }
        } while (!"&&&&".equals(palabra));
        System.out.println("Cantidad de lecturas correctas: "+correctos);
        System.out.println("Cantidad de lecturas incorrectas: "+incorrectos);
        }
}
    
