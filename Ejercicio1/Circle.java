package Ejercicio1;

public class Circle extends ShapeRef {
    public Circle(int p1, int p2) {
        super(p1, p2);
    }

    @Override
    public double area() {
        double resultado = 0;
        resultado = 2 * Math.PI * getP1();
        return resultado;
    }
}
