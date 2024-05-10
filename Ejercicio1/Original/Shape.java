package Ejercicio1.Original;

public class Shape {
    public enum ShapeType {
        Circle,
        Rectangle,
        Square,
        Triangle
    }

    private ShapeType type;
    private int p1;
    private int p2;

    public Shape(ShapeType type, int p1, int p2) {
        this.type = type;
        this.p1 = p1;
        this.p2 = p2;
    }

    public double area() {
        double resultado = 0.0d;
        switch (type) {
            case Circle:
                resultado = 2 * Math.PI * p1;
                break;
            case Rectangle:
            case Square:
                resultado = p1 * p2;
                break;
            case Triangle:
                resultado = p1 * p2 / 2;
            default:
                break;
        }
        return resultado;
    }
}