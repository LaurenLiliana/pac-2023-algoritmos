/* Declare dos variables numéricas, solicite al usuario que ingrese los valores 
para las variables y muestre por salida del programa la suma, resta,
multiplicación, división. */

package ejercicios;

import java.util.Scanner;

public class EjercicioA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el valor del primer numero: ");
        int primer  = sc.nextInt();
        System.out.print("Ingrese el valor del segundo numero: ");
        int segundo = sc.nextInt();
        
        int suma = primer + segundo;
        int resta = primer - segundo;
        int multiplicacion = primer * segundo;
        float division = primer/segundo;
        
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("La division de los numeros es: " + division);
                
    }
}
