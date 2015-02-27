package capitulo2.interfaces.criterios;

import capitulo2.interfaces.Alumno;

/**
 * @author G4m[@]
 */
public class CriterioAlumNombre extends Criterio<Alumno>{

    @Override
    public int comparar(Alumno a, Alumno b) {
        return a.getNombre().compareTo(b.getNombre());
    }

    
}
