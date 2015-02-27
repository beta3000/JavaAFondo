package capitulo2.interfaces.criterios;

/**
 * @author G4m[@]
 */
public class Util {

    public static void ordenar(Comparable arr[], Criterio cr){
        
        boolean ordenado = false;
        
        while (!ordenado) {            
            ordenado = true;
            for (int i = 0; i < arr.length-1; i++) {
                //ahora la decision sobre quien procede a
                //quien la toma la instancio Criterio cr
                if (cr.comparar(arr[i+1], arr[i]) < 0) {
                    Comparable aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    ordenado = false;
                }
            }
        }
    }
    
    public static void imprimir(Object arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
