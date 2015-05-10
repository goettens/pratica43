import utfpr.ct.dainf.if62c.pratica.*;

public class Pratica43 {
    public static void main(String[] args) {
        Elipse elip = new Elipse (10,10);
        Circulo circ = new Circulo(10);
        Retangulo ret = new Retangulo (10,20);
        Quadrado quad = new Quadrado(10);
        TrianguloEquilatero tria = new TrianguloEquilatero(3);
        
        System.out.println(elip.getArea());
        System.out.println(elip.getPerimetro());
        System.out.println(circ.getArea());
        System.out.println(circ.getPerimetro());
        System.out.println(ret.getArea());
        System.out.println(ret.getPerimetro());
        System.out.println(quad.getArea());
        System.out.println(quad.getPerimetro());
        System.out.println(tria.getPerimetro());
        System.out.println(tria.getArea());
        
    }
}