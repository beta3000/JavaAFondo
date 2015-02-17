
package capitulo1;

import java.util.Scanner;

public class EsMayorQue21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su Edad: ");
        Integer edad = scanner.nextInt();
        
        if (edad >= 21) {
            System.out.println("Edad mayor que 21");
        }else{
            System.out.println("Edad no mayor que 21");
        }
    }
}
