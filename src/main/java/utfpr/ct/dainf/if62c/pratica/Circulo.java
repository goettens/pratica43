package utfpr.ct.dainf.if62c.pratica;

public class Circulo extends Elipse{

    public Circulo(double x) {
        super(x, x);
    }
    
    @Override
    public double getPerimetro(){
        return 2*Math.PI*(this.x/2);
    }

    @Override
    public double getEixoMenor() {
        return super.getX();
    }

    @Override
    public double getEixoMaior() {
        return super.getY();
    }

    @Override
    public String getNome() {
        return "Circulo";
    }
} 