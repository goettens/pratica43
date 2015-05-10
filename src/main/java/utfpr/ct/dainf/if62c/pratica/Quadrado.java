package utfpr.ct.dainf.if62c.pratica;

public class Quadrado extends Retangulo{

    public Quadrado(double b) {
        super(b, b);
    }
    
    @Override
    public String getNome() {
        return "Quadrado";
    }
    
}
