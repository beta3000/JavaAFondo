package capitulo2;

import capitulo2.Fecha;

public class FechaDetallada extends Fecha{
    
    private static String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    
    public String toString(){
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
    }
}
