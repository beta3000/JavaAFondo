
package capitulo1;

import java.util.Scanner;

public class EsParOImpar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero: ");
        Integer numero = scanner.nextInt();
        
        String mensaje = (numero % 2 ==0) ? "Es Par" : "Es Impar";
        
        System.out.println(mensaje);
    }
}
