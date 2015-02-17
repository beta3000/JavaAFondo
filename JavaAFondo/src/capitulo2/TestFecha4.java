package capitulo2;

import java.util.Scanner;

public class TestFecha4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //el usuario ingresa los datos de la fecha
        System.out.println("Ingrese Fecha (dd/mm/aaaa): ");
        
        //leo la fecha (cadena de caracteres) ingresada
        String sFecha = scanner.next();
        
        //creo un objeto de la clase Fecha
        Fecha f = new Fecha(sFecha);
        
        //lo muestro
        System.out.println("La fecha ingresada es: "+f);
        
        //el usuario ingresa una cantidad de dias a sumar
        System.out.println("Ingrese dias a sumar (puede ser negativo): ");
        int diasSum = scanner.nextInt();
        
        //le sumo esos dias a la fecha
        f.addDias(diasSum);
        
        //muestro la nueva fecha con los dias sumados
        System.out.println("Sumando "+diasSum+" dias, queda: "+f);
    }
}
