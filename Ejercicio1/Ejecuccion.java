package Ejercicio1;

public class Ejecuccion {
    public static void main(String[] args) {
        Triangle t = new Triangle(12, 3);
        Rectangle r = new Rectangle(10, 5);
        Square s = new Square(20, 3);
        Circle c = new Circle(6, 2);

        System.out.println("Area triangulo: " + t.area());
        System.out.println("Area rectangulo " + r.area());
        System.out.println("Area cuadrado " + s.area());
        System.out.println("Area circulo " + c.area());
    }
}
