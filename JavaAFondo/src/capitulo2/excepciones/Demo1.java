package capitulo2.excepciones;

/**
 * @author G4m[@]
 */
public class Demo1 {

    public static void main(String[] args) {
        try{
            System.out.println("Hola, Chau!");
        }
        catch(Exception ex){
            System.out.println("Entre al catch...");
        }
        finally{
            System.out.println("Esto sale siempre!..");
        }
    }
}
