/* Desarrolle un programa en donde el usuario debe ingresar dos números y el
programa muestra como resultado la operación (a+b)*(a-b). */

package ejercicios;

import java.util.Scanner;

public class EjercicioB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un primer numero: ");
        int primero = sc.nextInt();
        System.out.print("Ingrese un segundo numero: ");
        int segundo = sc.nextInt();
        
        int suma = primero + segundo;
        int resta = primero - segundo;
        int operacion = suma * resta;
        
        System.out.println("El resultado de los numeros es de: " + operacion);
        
    }
}

