package estructurasControl;

import java.util.Scanner;

public class ListarNumero03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        do {            
            System.out.println("Listar numero hasta: ");
            System.out.println("----------------------\n");
        
            System.out.println("Ingrese un numero");
            int limite =sc.nextInt();
            
            int i = 1;
            while (i <= limite) {            
                System.out.println(i);
                i++;
        }
            System.out.println("Desea continuar(Si=1/No=2)");
            opcion = sc.nextInt(); 
        } while (opcion==1);
        
    }
}
