package estructurasControl;

import java.util.Scanner;

public class ListarNumero02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        boolean continuar = true;
                
        while(continua){
            
            System.out.println("Listar numero hasta: ");
            System.out.println("----------------------\n");
        
            System.out.println("Ingrese un numero");
            int limite =sc.nextInt();
            int i = 1;
        
            while (i <= limite) {            
                System.out.println(i);
                i++;
        }
               System.out.println("Desea continuar (s/n)");
               String respuesta=sc.next().toLowerCase(); /* Lo convierte en minuscula */
               continuar = respuesta.equals("s"); 
             
        }
            
            
    }
}
