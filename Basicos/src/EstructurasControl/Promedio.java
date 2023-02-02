package EstructurasControl;

import java.util.Scanner;

/* Solicitar 3 notas al usuario y calcular el promedio, 
   mostrar un mensaje segun el promedio obtenido.

   El promedio menor a 70 esta reprobado
   El promedio mayor a 70 esta aprobado
   El promedio a 80 bueno
   El promedio a 90 sobresaliente
*/

public class Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
                System.out.print("Ingrese la primera nota: ");
                int primera = sc.nextInt(); 
                System.out.print("Ingrese la segunda nota: ");
                int segunda = sc.nextInt();
                System.out.print("Ingrese la tercera nota: ");
                int tercera = sc.nextInt();
                
                int suma = primera + segunda + tercera;
                float promedio = suma/3;
                
                System.out.println("El promedio es de: " + promedio);
                
                if (promedio<70){
                    System.out.println("El alumno esta reprobado");
                }else{
                    System.out.println("El alumno esta aprobado");
                }
                
                if (promedio>=80 && promedio<=90){
                    System.out.println("El promedio es bueno");
                } else if (promedio>=90 && promedio<=100){
                    System.out.println("El promedio es sobresaliente");
                }          
    }
}