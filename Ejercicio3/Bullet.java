package Ejercicio3;

public class Bullet {
    private int x;
    private int y;

    //Constructor Bala
    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getters y Setters de posicion de balas.
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
