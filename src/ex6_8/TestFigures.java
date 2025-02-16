package ex6_8;

public class TestFigures {
    public static void main(String[] args) {
        Figura f = new Figura() {
            @Override
            void dibuixar() {
                System.out.println("Dibuixar figura abstracta");
            }
        };

        Cercle c = new Cercle();
        c.dibuixar();

        Rectangle r = new Rectangle();
        r.dibuixar();

        Figura f1 = new Cercle();
        Figura f2 = new Rectangle();

        f1.dibuixar();
        f2.dibuixar();
    }
}
