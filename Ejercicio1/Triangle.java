package Ejercicio1;

public class Triangle extends ShapeRef {
    public Triangle(int p1, int p2) {
        super(p1, p2);
    }
    @Override
    public double area() {
        double resultado = 0;
        resultado = getP1()*getP2()/2;
        return resultado;
    }
}
