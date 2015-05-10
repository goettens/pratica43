package utfpr.ct.dainf.if62c.pratica;

public class Retangulo implements FiguraComLados{
    
    protected double b;
    protected double h;

    public Retangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getLadoMenor() {
        if (this.b < this.h){
            return this.b;
        }
        else{
            return this.h;
        }
    }

    @Override
    public double getLadoMaior() {
        if (this.b > this.h){
            return this.b;
        }
        else{
            return this.h;
        }            
    }

    @Override
    public String getNome() {
        return "Retângulo";
    }

    @Override
    public double getPerimetro() {
        return 2*(b+h);
    }

    @Override
    public double getArea() {
        return b*h;
    }
    
    
    
    
}
