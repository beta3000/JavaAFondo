package capitulo2;

public class Numero {
    private double valor;
    
    public Numero(double v){
        valor = v;
    }
    
    public Numero sumar(double a){
        valor += a;
        return this;
    }

    public static double sumar(double a, double b){
        return a+b;
    }
    
    public String toString(){
        return Double.toString(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
