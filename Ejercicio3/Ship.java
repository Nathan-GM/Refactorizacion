package Ejercicio3;

public class Ship {
    private int x;
    private int y;
    public Bullet bullet;


    //Constructor Barco
    public Ship(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Crea Bala
    public void shoot() {
        this.bullet = new Bullet(x, y);
    }

    //actualiza posicion bala
    //sería mejor que estuviera en bullet?
    public void update() {
        this.bullet.setX(this.bullet.getX() + 1);
    }

    //Movimientos Barco
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

    //Getters y Setters de las coordenadas Barco
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

    //Getters y Setters de la bala.
    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    //toString de coordenadas del barco y coordenadas del bullet.
    public String toString(){
    return "X:"+this.x+" Y:"+this.y+"Bullet>X:"+this.bullet.getX()+" Y:"+this.bullet.getY();
    }

    //Método que comprueba la colisión de una bala con el barco.
    public boolean collision(Ship s) {
        if (s.getX() == this.bullet.getX() && s.getY() == this.bullet.getY())
            return true;
        else
            return false;
    }
}
