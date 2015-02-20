package capitulo2;

public class Circulo extends FiguraGeometrica{

    private int radio;
    
    public Circulo(int r){
        super("Circulo");
        this.radio = r;
    }
    
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
}
