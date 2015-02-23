package capitulo2.colecciones;

import java.util.Scanner;
/**
 * @author G4m[@]
 */
public class TestMiColeccion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //creo una coleccion con capacidad inicial = 5
        MiColeccion mc = new MiColeccion(5);
        
        //leo el primer nombre
        System.out.println("Ingrese nombre: ");
        String nom = scanner.next();
        
        while (!nom.equals("FIN")) {            
            //inserto siempre en la posicion 0
            mc.insertar(nom, 0);
            
            //leo el siguiente nombre
            nom = scanner.next();
        }
        
        String aux;
        
        //recorro la coleccion y tomo cada uno de sus elementos
        for (int i = 0; i < mc.cantidad(); i++) {
            //el metodo obtener retorna un object entonces
            //entonces tengo que castear a String
            aux = (String) mc.obtener(i);
            
            System.out.println(aux +" - "+aux.length()+" caracteres");
        }
    }
}
