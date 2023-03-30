/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg6.ejerc.pkg2;

import java.util.Scanner;

/**
 *
 * @author larle
 */
public class Encuentro6Ejerc2 {

    /*
    Diseñe una función que pida el nombre
    y la edad de N personas e imprima los 
    datos de las personas ingresadas por teclado
    e indique si son mayores o menores de edad.
    Después de cada persona, el programa debe preguntarle
    al usuario si quiere seguir mostrando personas y frenar
    cuando el usuario ingrese la palabra “No”.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        String nomb = null;
        int edad = 0;
    }
    public static void datos(String a, int b){
        Scanner leer = new Scanner(System.in);
        
        String resp = "si";
        while(resp.equalsIgnoreCase("si")){
            System.out.println("Ingrese el número de las personas a analizar los datos");
            int cantidadPerson = leer.nextInt();
            for(int i = 0; i < cantidadPerson; i++){
                System.out.println("Ingresar el nombre de la person: ");
                a = leer.next();
                System.out.println("Ingrese la edad: ");
                b = leer.nextInt();
                if (b > 18){
                    
                    System.out.println(a + " es mayor de edad, ya que su edad es " + b);
                } else {
                    
                    System.out.println(a + " es menor de edad, ya que su edad es " + b);
                }
            }
            System.out.println("Desea ingresar más personas? (si/no)");
            resp = leer.next();
        }
        leer.close();
    }
    
}
