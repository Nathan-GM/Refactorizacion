package Ejercicio3.Original;

public class Ship {
    private int x;
    private int y;
    public Bullet bullet;

    public Ship(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void shoot() {
        this.bullet = new Bullet(x, y);
    }

    public void update() {
        this.bullet.setX(this.bullet.getX() + 1);
    }

    public void moveLeft() {
        this.x--;
    }

    public void moveRigth() {
        this.x++;
    }

    public void moveUp() {
        this.y--;
    }

    public void Down() {
        this.y++;
    }

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

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public String toString(){
    return "X:"+this.x+" Y:"+this.y+
    "Bullet>X:"+this.bullet.getX()+" Y:"+this.bullet.getY();
    }

    public boolean collision(Ship s) {
        if (s.getX() == this.bullet.getX() && s.getY() == this.bullet.getY())
            return true;
        else
            return false;
    }
}