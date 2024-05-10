package Ejercicio2;

public class Warrior {
    private double life;
    private String name;
    private Sword sword;
    private Shield shield;

    /**
     * Constructor del Guerrero vacio.
     */
    public Warrior() {
        this.life = 100d;
        this.name = "Undefined";
        this.sword = new Sword();
        this.shield = new Shield();
    }

    /**
     * Constructor del guerrero sobrecargado
     * 
     * @param name Nombre de nuestro guerrero.
     */
    public Warrior(String name) {
        this.name = name;
        this.life = 100d;
        this.sword = new Sword();
        this.shield = new Shield();
    }

    /**
     * Método que nos muestra el ataque de la espada actual
     * 
     * @return Poder de ataque de nuestra espada actual.
     */
    public double attack() {
        return this.sword.getSwordpower();
    }

    /**
     * Método que hará que nuestro guerrero se defienda
     * Si su espada perm
     * 
     * @param w Guerrero que va a defenderse de un ataque.
     */
    public void defense(Warrior w) {
        /*
         * this.life -= w.attack() * this.shield.getShieldpower();
         */
        if (shield.isCurativo()) {
            shield.defense(w);
        } else if (sword.getSworddefense() > 0) {
            sword.defensa(w);
        } else {
            shield.defense(w);
        }
    }

    public String toString() {
        return "Name: " + this.name + " life: " + this.life +
                " Shield: " + shield.getShieldname() + " Sword: " + sword.getSwordname();
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }
}
