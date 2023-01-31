package tipos;

import java.util.Scanner;

public class Leer {
    public static void main(String[] args){
        //Declarar variables:
        //Tipo de dato
        // Indicar el nombre de la variable
        // (Opcional) Asignar un valor a la varialble
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("--------------------");
        System.out.println("Hola " + nombre);
        
        
    }
}
