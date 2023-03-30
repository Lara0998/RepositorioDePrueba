/*
2 - Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
    ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa 
    debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

*/

package guia3;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       String nombre = null;
       int edad = 0;
       
       datos(nombre,edad);
               
       
    }
    
    public static void datos (String nombre,int edad){
      Scanner leer = new Scanner(System.in); 
      // int contadorMen = 0,contadorMay = 0;
      String respuesta = "si";
              
              
      while(respuesta.equalsIgnoreCase("si")){
          System.out.println("Ingrese el número de las personas a analizar los datos: ");
          int cantidadPersonas = leer.nextInt();
          for (int i = 0; i < cantidadPersonas; i++) {
              System.out.println("Ingresar el nombre de la persona: ");
              nombre = leer.next();
              System.out.println("Ingrese la edad: ");
              edad = leer.nextInt();
              if(edad > 18){
                  // contadorMay++;
                  System.out.println(nombre+" es mayor de edad ya que su edad es "+edad);
              } else {
                  // contadorMen++;
                  System.out.println(nombre+" es menor de edad ya que su edad es "+edad);
              }
          }
          System.out.println("Desea ingresar mas personas? (si/no)");
          
          respuesta = leer.next();
      }
        System.out.println("Chau loko");
        leer.close();
    }

}
