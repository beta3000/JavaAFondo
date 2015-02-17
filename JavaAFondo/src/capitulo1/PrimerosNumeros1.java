
package capitulo1;

import java.util.Scanner;

public class PrimerosNumeros1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el limite superior");
        Integer numero = scanner.nextInt();
        int i = 1;
        while (i <= numero) {            
            System.out.println(i);
            i++;
        }
    }
}
