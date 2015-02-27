package capitulo2.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

/**
 * @author G4m[@]
 */
public class UNombres {

    public  static Collection<String> obtenerLista(){
       // Vector<String> v = new Vector<String>();
        ArrayList<String> v = new ArrayList<>();
        v.add("Pablo");
        v.add("Juan");
        v.add("Carlos");
        
        return v;
    }
}
