
package capitulo1;

import java.util.Scanner;

public class DemoArray {
    
    public static void main(String[] args) {
        int arreglo[] = new int[10];

        System.out.println("Registro de numeros");
        
        Scanner scanner = new Scanner(System.in);
        
        Integer n=10 ;
        
        int i = 0;
        
        while (n > 0 && i<10) {            
            
            System.out.println("Ingrese el numero:"+i);
            n = scanner.nextInt();
            arreglo[i++]=n;

        }
        
        System.out.println("El arreglo tiene los siguientes numeros");
        for (int j = 0; j < 10; j++) {
            System.out.println(arreglo[j]);
        }
        
    }
}
