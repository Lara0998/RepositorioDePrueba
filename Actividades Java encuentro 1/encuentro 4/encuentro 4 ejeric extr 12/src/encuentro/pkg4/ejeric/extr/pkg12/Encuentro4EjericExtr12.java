/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejeric.extr.pkg12;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro4EjericExtr12 {

    /*
    Necesitamos mostrar un contador con 3 dígitos (X-X-X), 
    que muestre los números del 0-0-0 al 9-9-9, con 
    la particularidad que cada vez que aparezca un 3 lo
    sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= 4; i++){
            String caden = String.valueOf(i = 3);
            for (int j = 0; j <= 4; j++){
                String caden1 = String.valueOf(j = 3);
                for (int a = 0; a <= 4; a++){
                    String caden2 = String.valueOf(a = 3);
                System.out.print(a+"-");
                System.out.print("E".equals(caden2));
            }
                System.out.print(j+"-");
                System.out.print("E".equals(caden1));
            }
            System.out.print("E".equals(caden));
            System.out.println(i);
        }
       
    }
    
}
