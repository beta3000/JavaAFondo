package capitulo2;

public class Rectangulo extends FiguraGeometrica{
    
    private double base;
    private double altura;
    
    public Rectangulo(double b, double h){
        super("Rectangulo");
        this.base = b;
        this.altura = h;
        
    }
    
    public double area(){
        return base * altura;
    }
}
