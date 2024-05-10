package Ejercicio1;

public abstract class ShapeRef {
    private int p1;
    private int p2;

    public ShapeRef(int p1, int p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public abstract double area();
    
    public int getP1() {
        return p1;
    }
    public int getP2() {
        return p2;
    }
}


