package capitulo2;

public class TestPolimorfismo {

    public static void main(String[] args) {
        //a fec (de tipo Fecha) le asigno un objeto FechaDetallada
        Fecha fec = new FechaDetallada("25/02/2009");
        
        //a obj (de tipo Object) le asignamos un objeto FechaDetallada
        Object obj = new FechaDetallada("3/12/2008");
        
        //imprimo los dos objetod
        System.out.println("fec = "+fec);
        System.out.println("obj = "+obj);
    }
}
