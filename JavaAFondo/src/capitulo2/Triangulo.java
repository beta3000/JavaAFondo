package capitulo2;

public class Triangulo extends FiguraGeometrica{
    
    private double base;
    private double altura;
    
    public Triangulo(int b, int h){
        this.base = b;
        this.altura = h;
    }
    
    public double area(){
        return base*altura/2;
    }
}
