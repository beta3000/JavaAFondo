
package capitulo1;

import java.util.Scanner;

public class HolaMundoNombre2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese edad: ");
        String edad = scanner.nextLine();
        
        System.out.println("Ingrese altura: ");
        String altura = scanner.nextLine();
        
        System.out.println("Nombre: "+nombre+"Edad: "+edad+"Altura: "+altura);
    }
}
