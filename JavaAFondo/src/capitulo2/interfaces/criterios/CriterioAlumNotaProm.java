package capitulo2.interfaces.criterios;

import capitulo2.interfaces.Alumno;

/**
 * @author G4m[@]
 */
public class CriterioAlumNotaProm extends Criterio<Alumno>{

    @Override
    public int comparar(Alumno a, Alumno b) {
        double diff = a.getNotaPromedio() - b.getNotaPromedio();
        return diff >0 ? 1 : diff < 0 ? -1 : 0;
    }

}
