/*

3 - Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
    La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 

*/

package guia3;

import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int num1,num2,opc;
        
        System.out.println("Ingrese dos números: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        System.out.println("\n elegir una opcion para realizar la operacion"
                + "\n 1-sumar"
                + "\n 2-restar"
                + "\n 3-mult"
                + "\n 4-dividir");
        
        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("Su suma es: "+suma(num1,num2));
                break;
                
            case 2:
                System.out.println("Su suma es: "+resta(num1,num2));
                break;
                
            case 3:
                System.out.println("Su suma es: "+mult(num1,num2));
                break;
                
            case 4:
                System.out.println("Su suma es: "+div(num1,num2));
                break;
            
            default:
                System.out.println("Le erraste maestro.");;
        }
    }
    
    public static int suma(int a,int b){ 
        int resultado = a + b; 
        return resultado;
    }
    
    public static int resta(int a,int b){ 
        int resultado = a - b; 
        return resultado;
    }
    
    public static int mult(int a,int b){ 
        int resultado = a * b; 
        return resultado;
    }
    
    public static double div(int a,int b){ 
        int resultado = a * b; 
        return resultado;
    }
}
