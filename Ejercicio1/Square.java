package Ejercicio1;

public class Square extends ShapeRef {

    public Square(int p1, int p2) {
        super(p1, p2);
    }

    @Override
    public double area() {
        double resultado = 0;
        resultado = getP1() * getP2();
        return resultado;
    }
}
