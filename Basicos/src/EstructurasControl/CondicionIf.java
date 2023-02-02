package EstructurasControl;

import java.util.Scanner;

// Compuertas logicas

// && = And o Y
// || = Or o O



public class CondicionIf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }
        
        if(edad>=16 && edad<=18){
            System.out.println("Puede participar en la con la sub-18");
        }else{
            System.out.println("No puede participar con la sub-18");
        }
                }    
}
