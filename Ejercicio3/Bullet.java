package Ejercicio3;

public class Bullet {
    private int x;
    private int y;

    /**
     * Constructor de la bala con sus coordenadas
     * @param x: coordenada X de la bala.
     * @param y: coordenada Y de la bala.
     */
    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Actualiza la posición de la bala actual en la posicion X
     */
    public void update() {
        this.setX(getX() + 1);
    }

    /**
     * Booleano que indicará si un barco esta colisionando con una bala
     * @param s Barco a comprobar colisiones
     * @return devolverá verdadero si la posición de la bala
     *         coincide con la posición actual del barco
     *         y devolverá falso si las balas y el barco no coinciden
     *         en posiciones.
     */
    public boolean collision(Ship s) {
        if (s.getX() == this.getX() && s.getY() == this.getY()) {
            return true;
        } else {
            return false;
        }
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
