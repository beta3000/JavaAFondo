package capitulo2;

public abstract class FiguraGeometrica {

    //metodo abstracto
    public abstract double area();
    
    public String toString(){
        return "area = "+area();
    }
    
}
