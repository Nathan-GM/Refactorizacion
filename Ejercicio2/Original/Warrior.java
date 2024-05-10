package Ejercicio2.Original;

public class Warrior {
    private double life;
    private String name;
    private double swordpower = 1.0d;
    private String swordname = "apprentice sword";
    private String shieldname = "apprentice shield";
    private double shieldpower = 0.25d;

    /**
     * Constructor Guerrero
     */
    public Warrior() {
        this.life = 100d;
        this.name = "Undefined";
    }

    /**
     * Constructor Guerrero cargado
     * Al hacer uso de este se carga sin vida.
     * @param name Nombre que recibirá el guerrero
     */
    public Warrior(String name) {
        this.name = name;
    }

    /**
     * Método para obtener el ataque del guerrero
     * @return el poder de la espada actual
     */
    public double attack() {
        return this.swordpower;
    }

    /**
     * Método para hacer que un guerrero se defienda siguiendo la siguiente lógica
     * La vida del guerrero es igual a su vida actual - su ataque por el poder del escudo
     * Inconvenientes si el escudo nos permite curarnos.
     * @param w Guerrero que vamos a hacer que se defienda
     */
    public void defense(Warrior w) {
        this.life -= w.attack() * shieldpower;
    }

    /**
     * Método toString de la clase.
     */
    public String toString() {
        return "Name:" + this.name + " life:" + this.life +
                "Shield:" + shieldname + " Sword:" + swordname;
    }
}
