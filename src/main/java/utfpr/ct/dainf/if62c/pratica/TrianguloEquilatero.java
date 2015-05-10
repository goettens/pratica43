package utfpr.ct.dainf.if62c.pratica;

public class TrianguloEquilatero extends Quadrado{

    public TrianguloEquilatero(double b) {
        super(b);
    }

    @Override
    public double getPerimetro() {
        return 3*(this.b);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3)*(Math.pow(b, 2)))/2;
    }
    
    @Override
    public String getNome() {
        return "Triângulo Equilátero";
    }
    
}
