package capitulo1;

import java.util.Scanner;

public class HolaMundoNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nom = scanner.nextLine();
        System.out.println("Hola Mundo: "+nom);
    }
}
