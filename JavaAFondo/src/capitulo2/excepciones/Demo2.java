package capitulo2.excepciones;

/**
 * @author G4m[@]
 */
public class Demo2 {

    public static void main(String[] args) throws Exception{
        
        try {
            int i = Integer.parseInt("no es una cadena numerica...");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Entre en el catch...");
        }
        finally{
            System.out.println("Esto sale siempre");
        }
    }
}
