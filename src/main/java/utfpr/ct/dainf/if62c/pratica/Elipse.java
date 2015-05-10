package utfpr.ct.dainf.if62c.pratica;

public class Elipse implements FiguraComEixos{
    protected double x;
    protected double y;

    public Elipse(double x, double y){
        this.x = x;
        this.y = y;
    }   

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    @Override
    public double getArea(){
        double r = this.x/2;
        double s = this.y/2;
            
        return Math.PI*r*s;
    }
    
    @Override
    public double getPerimetro(){
        double r = this.x/2;
        double s = this.y/2;
        
        return Math.PI*(3*(r+s)-Math.sqrt((3*r+s)*(r+3*s)));
    }
    
    @Override
    public double getEixoMenor() {
        if (this.x < this.y){
            return this.getX();
        }
        else{
            return this.getY();
        }
    }

    @Override
    public double getEixoMaior() {
        if (this.x > this.y){
            return this.getX();
        }
        else{
            return this.getY();
        }
    }

    @Override
    public String getNome() {
        return "Elipse";
    }
}
